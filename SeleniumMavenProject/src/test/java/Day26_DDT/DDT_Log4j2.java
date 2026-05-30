package Day26_DDT;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DDT_Log4j2{

    // Logger Object
    static Logger log = LogManager.getLogger(DDT.class);

    public static void main(String[] args)
            throws EncryptedDocumentException,
                   IOException,
                   InterruptedException {

        log.info("===== TEST EXECUTION STARTED =====");

        // Excel File
        FileInputStream fis = new FileInputStream(
                "C:\\\\Users\\\\badal\\\\Downloads\\\\LoginData.xlsx");

        log.info("Excel File Opened");

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sh = wb.getSheet("Sheet1");

        int rows = sh.getLastRowNum();

        log.info("Total Rows Found : " + rows);

        // Loop Through Excel Rows
        for (int i = 1; i <= rows; i++) {

            String username =
                    sh.getRow(i).getCell(0).getStringCellValue();

            String password =
                    sh.getRow(i).getCell(1).getStringCellValue();

            log.info("--------------------------------");
            log.info("Testing User : " + username);

            // Launch Browser
            WebDriver driver = new ChromeDriver();

            log.info("Chrome Browser Launched");

            driver.manage().window().maximize();

            driver.manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));

            // Open Website
            driver.get("https://www.saucedemo.com/");

            log.info("Website Opened");

            // Enter Username
            driver.findElement(By.id("user-name"))
                    .sendKeys(username);

            log.info("Username Entered");

            // Enter Password
            driver.findElement(By.id("password"))
                    .sendKeys(password);

            log.info("Password Entered");

            // Click Login
            driver.findElement(By.id("login-button"))
                    .click();

            log.info("Login Button Clicked");

            Thread.sleep(3000);

            // Validation
            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.contains("inventory")) {

                log.info("TEST PASSED : Login Successful");

            } else {

                log.error("TEST FAILED : Login Failed");
            }

            // Close Browser
            driver.quit();

            log.info("Browser Closed");
        }

        wb.close();
        fis.close();

        log.info("Excel Closed");

        log.info("===== TEST EXECUTION COMPLETED =====");
    }
}