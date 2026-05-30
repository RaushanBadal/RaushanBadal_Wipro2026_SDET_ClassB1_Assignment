package Day23_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    // Launch Browser and Open Website
    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    // Login Test Case
    @Test
    public void loginTest() {

        // Enter Username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Click Login Button
        driver.findElement(By.id("login-button"))
              .click();

        System.out.println("Login Successful");
    }

    // Close Browser
    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }
}