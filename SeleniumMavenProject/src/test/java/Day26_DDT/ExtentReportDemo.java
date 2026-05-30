package Day26_DDT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

    public static void main(String[] args)
            throws InterruptedException {

        // Create HTML Report
        ExtentSparkReporter reporter =
                new ExtentSparkReporter(
                        "reports/ExtentReport.html");

        // Create Extent Report Engine
        ExtentReports extent = new ExtentReports();

        // Attach Reporter
        extent.attachReporter(reporter);

        // Create Test
        ExtentTest test =
                extent.createTest("SauceDemo Login Test");

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        test.info("Browser Launched");

        driver.manage().window().maximize();

        // Open Website
        driver.get("https://www.saucedemo.com");

        test.info("Opened SauceDemo Website");

        // Enter Username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        test.pass("Username Entered");

        // Enter Password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        test.pass("Password Entered");

        // Click Login
        driver.findElement(By.id("login-button"))
                .click();

        test.pass("Login Button Clicked");

        Thread.sleep(3000);

        // Validation
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory")) {

            test.pass("Login Successful");

        } else {

            test.fail("Login Failed");
        }

        // Close Browser
        driver.quit();

        test.info("Browser Closed");

        // Generate Report
        extent.flush();

        System.out.println("Extent Report Generated");
    }
}
