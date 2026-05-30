package Day23_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankingFundTransferTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test(priority = 1)
    public void verifyLoginPageTitle() {

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,
                "ParaBank | Welcome | Online Banking");

        System.out.println("Title Validation Passed");
    }

    @Test(priority = 2)
    public void loginTest() throws InterruptedException {

        driver.findElement(By.name("username"))
              .sendKeys("Raushan12345");

        driver.findElement(By.name("password"))
              .sendKeys("Raushan@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(3000);

        String currentURL = driver.getCurrentUrl();

        Assert.assertTrue(currentURL.contains("overview"));

        System.out.println("Login Successful");
    }

    @Test(priority = 3)
    public void fundTransferTest() throws InterruptedException {

        driver.findElement(By.name("username"))
              .sendKeys("Raushan12345");

        driver.findElement(By.name("password"))
              .sendKeys("Raushan@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Transfer Funds"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.id("amount"))
              .sendKeys("500");
        Thread.sleep(2000);
      
        Select fromAccount =
                new Select(driver.findElement(By.id("fromAccountId")));

        fromAccount.selectByIndex(0);

        Select toAccount =
                new Select(driver.findElement(By.id("toAccountId")));

        toAccount.selectByIndex(0);

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Transfer']"))
              .click();

        Thread.sleep(3000);

        String pageSource = driver.getPageSource();

        Assert.assertTrue(
                pageSource.contains("Transfer Complete"));
        System.out.println("Fund Transfer Successful");
    }

    @Test(priority = 4)
    public void logoutTest() throws InterruptedException {

        driver.findElement(By.name("username"))
              .sendKeys("Raushan12345");

        driver.findElement(By.name("password"))
              .sendKeys("Raushan@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Log Out"))
              .click();

        System.out.println("Logout Successful");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
