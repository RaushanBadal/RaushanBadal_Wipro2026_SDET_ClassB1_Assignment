package Day22_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BankingFundTransfer {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("username"))
              .sendKeys("Raushan12345");

        driver.findElement(By.name("password"))
              .sendKeys("Raushan@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Transfer Funds"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.id("amount"))
              .sendKeys("500");

        Thread.sleep(1000);

        Select fromAccount =
                new Select(driver.findElement(By.id("fromAccountId")));

        fromAccount.selectByIndex(0);

        Thread.sleep(1000);

        Select toAccount =
                new Select(driver.findElement(By.id("toAccountId")));

        toAccount.selectByIndex(0);

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Transfer']"))
              .click();

        Thread.sleep(3000);

        String successMessage =
                driver.findElement(By.className("title"))
                      .getText();

        if(successMessage.contains("Transfer Complete")) {

            System.out.println("Fund Transfer Successful");

        } else {

            System.out.println("Fund Transfer Failed");
        }

        Thread.sleep(2000);

        driver.findElement(By.linkText("Log Out"))
              .click();

        System.out.println("Logout Successful");

        Thread.sleep(2000);

        driver.quit();
    }
}
