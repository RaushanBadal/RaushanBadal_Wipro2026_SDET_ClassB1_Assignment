package Utilities;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReportObject() {

        String path =
                System.getProperty("user.dir")
                + "/reports/APIReport.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config()
                .setReportName("DummyJSON Report");

        reporter.config()
                .setDocumentTitle("API Automation");

        extent =
                new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester",
                "Raushan");

        return extent;
    }
}