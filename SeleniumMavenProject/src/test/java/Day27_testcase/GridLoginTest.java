package Day27_testcase;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridLoginTest {

    WebDriver driver;

    @Parameters({"browser", "username", "password"})
    @Test
    public void loginTest(String browser,
                          String uname,
                          String pass)
            throws Exception {

        if(browser.equalsIgnoreCase("chrome")) {

            driver = new RemoteWebDriver(

                    new URL("http://localhost:4444"),

                    new ChromeOptions());
        }

        else if(browser.equalsIgnoreCase("edge")) {

            driver = new RemoteWebDriver(

                    new URL("http://localhost:4444"),

                    new EdgeOptions());
        }

        else if(browser.equalsIgnoreCase("firefox")) {

            driver = new RemoteWebDriver(

                    new URL("http://localhost:4444"),

                    new FirefoxOptions());
        }

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();


        driver.findElement(By.id("user-name"))
                .sendKeys(uname);

        driver.findElement(By.id("password"))
                .sendKeys(pass);


        driver.findElement(By.id("login-button"))
                .click();


        Thread.sleep(5000);

        System.out.println("Browser : " + browser);

        System.out.println("Thread ID : "
                + Thread.currentThread().threadId());

        System.out.println("Login Successful");

        // Close Browser
        Thread.sleep(30000);
        driver.quit();
    }
}
