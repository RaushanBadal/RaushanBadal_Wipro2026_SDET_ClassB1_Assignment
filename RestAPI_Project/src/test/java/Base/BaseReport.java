package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentManager;

public class BaseReport extends BaseTest {

    public static ExtentReports extent;

    public static ExtentTest test;

    @BeforeSuite

    public void setupReport() {

        extent =
                ExtentManager.getReportObject();
    }

    @AfterSuite

    public void flushReport() {

        extent.flush();
    }
}