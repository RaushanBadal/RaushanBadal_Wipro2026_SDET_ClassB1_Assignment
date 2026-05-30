package Day27_testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserLoginTest {

    WebDriver driver;

    @Parameters({"browser", "username", "password"})
    @Test
    public void loginTest(String browser,
                          String uname,
                          String pass)
            throws InterruptedException {


        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        }


        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();


        driver.findElement(By.id("user-name"))
                .sendKeys(uname);


        driver.findElement(By.id("password"))
                .sendKeys(pass);


        driver.findElement(By.id("login-button"))
                .click();


        Thread.sleep(3000);


        System.out.println("Browser : " + browser);

        System.out.println("Username : " + uname);

        System.out.println("Login Successful");


        driver.quit();
    }
}

