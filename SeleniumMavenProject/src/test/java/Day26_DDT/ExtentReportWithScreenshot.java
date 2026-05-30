package Day26_DDT;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportWithScreenshot {

    public static void main(String[] args)
            throws IOException, InterruptedException {

        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/ExtentReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        ExtentTest test =
                extent.createTest("SauceDemo Login Test");

        WebDriver driver = new ChromeDriver();

        test.info("Chrome Browser Launched");

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com");

        test.info("SauceDemo Website Opened");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        test.pass("Username Entered");

        driver.findElement(By.id("password")).sendKeys("wrongpassword");

        test.pass("Password Entered");

        driver.findElement(By.id("login-button"))
                .click();

        test.info("Login Button Clicked");

        Thread.sleep(3000);

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory")) {

            test.pass("TEST PASSED : Login Successful");

        } else {

            test.fail("TEST FAILED : Login Failed");

            TakesScreenshot ts =(TakesScreenshot) driver;

            File src =
                    ts.getScreenshotAs(OutputType.FILE);

            File dest = new File( System.getProperty("user.dir")+ "/Screenshots/LoginFailed.png");

            FileUtils.copyFile(src, dest);

            test.addScreenCaptureFromPath(
                    dest.getAbsolutePath());
        }

        driver.quit();

        test.info("Browser Closed");

        extent.flush();

        System.out.println("Extent Report Generated Successfully");
    }
}
