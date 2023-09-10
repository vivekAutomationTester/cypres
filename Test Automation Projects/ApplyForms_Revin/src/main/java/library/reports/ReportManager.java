package library.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import config.AppConfig;

import java.io.File;
import java.util.Date;
import java.sql.Timestamp;
import java.io.IOException;

/**
 * The type Report manager.
 */
public class ReportManager {

    private ExtentReports extent;
    private ExtentTest extentTest;
    /**
     * The Extent report directory.
     */
    public String extentReportDirectory;

    // Refer to https://extentreports.com/
    // http://extentreports.com/docs/versions/3/java/#basic-usage

    /**
     * Instantiates a new Report manager.
     *
     * @throws IOException the io exception
     */
// This implements the ExtentManager interface
    // This implementation is done using the Extent Report Manager v3.0
    public ReportManager() throws IOException {

        String extentReportDirectory =setExtentReportDirectory();
        File extentReportFile = new File(extentReportDirectory+"\\extent.html");

        extentReportFile.getParentFile().mkdirs();
        extentReportFile.createNewFile();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(extentReportFile);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
    private String getTimeForFileName(){
        long time = new Date().getTime();
        return new Timestamp(time).toString().substring(0,19);
    }

    /**
     * Sets extent report directory.
     *
     * @return the extent report directory
     */
    public String setExtentReportDirectory()
    {
        String newDirectory = ("extent-reports/"+getTimeForFileName())
                .replace(":", "_")
                .replace(" ", "_");
        return AppConfig.reportFolder +newDirectory;
    }

    /**
     * Get extent report directory string.
     *
     * @return the string
     */
    public String getExtentReportDirectory(){
        return this.extentReportDirectory;
    }


    /**
     * Start test.
     *
     * @param testName the test name
     */
// Starts the test
    public void startTest(String testName)
    {
        startTest(testName, "");
    }

    /**
     * Start test.
     *
     * @param testName        the test name
     * @param testDescription the test description
     */
// Starts the test
    public void startTest(String testName, String testDescription)
    {
        extentTest = extent.createTest(testName,testDescription);
    }

    /**
     * Publish.
     */
// Prints the content in the report
    public void publish()
    {
        extent.flush();
    }

    /**
     * Log pass.
     *
     * @param infoToPrint the info to print
     */
    public void logPass(String infoToPrint)
    {
        extentTest.pass(infoToPrint);
    }

    /**
     * Log pass.
     *
     * @param infoToPrint    the info to print
     * @param screenShotName the screen shot name
     * @throws IOException the io exception
     */
//Passes the current test step
    public void logPass(String infoToPrint, String screenShotName) throws IOException {
        extentTest.pass(infoToPrint,  MediaEntityBuilder.createScreenCaptureFromPath(screenShotName).build());
    }

    /**
     * Log fail.
     *
     * @param infoToPrint    the info to print
     * @param screenshotName the screenshot name
     * @throws IOException the io exception
     */
// Fails the current test step and the test
    public void logFail(String infoToPrint, String screenshotName) throws IOException
    {
        extentTest.fail("The test failed. The exception found during the test is" +
                infoToPrint, MediaEntityBuilder.createScreenCaptureFromPath(screenshotName).build());
    }

}