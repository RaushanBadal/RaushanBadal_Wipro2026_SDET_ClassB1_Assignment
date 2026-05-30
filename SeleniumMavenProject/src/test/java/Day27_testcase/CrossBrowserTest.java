package Day27_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    WebDriver driver;

    @Parameters("browser")
    @Test
    public void launchBrowser(String browser)
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

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        System.out.println("Browser Launched: " + browser);

        Thread.sleep(3000);

        driver.quit();
    }
}
