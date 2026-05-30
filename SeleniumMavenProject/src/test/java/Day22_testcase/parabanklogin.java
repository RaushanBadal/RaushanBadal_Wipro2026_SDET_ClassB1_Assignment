package Day22_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabanklogin {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Raushan");

        driver.findElement(By.id("customer.lastName")).sendKeys("Badal");

        driver.findElement(By.id("customer.address.street")).sendKeys("Patna");

        driver.findElement(By.id("customer.address.city")).sendKeys("Patna");

        driver.findElement(By.id("customer.address.state")).sendKeys("Bihar");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("800001");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9304266829");

        driver.findElement(By.id("customer.ssn")).sendKeys("123456");

        driver.findElement(By.id("customer.username")).sendKeys("Raushan12345");

        driver.findElement(By.id("customer.password")).sendKeys("Raushan@123");

        driver.findElement(By.id("repeatedPassword")).sendKeys("Raushan@123");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Register']"))
              .click();

        Thread.sleep(3000);

        System.out.println("Registration Completed Successfully");

        driver.quit();
    }
}
