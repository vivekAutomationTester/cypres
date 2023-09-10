package library.utility;

import config.ReportConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

/**
 * The type Screenshot.
 */
public class Screenshot {

    // Take Screenshot
    // Uses Selenium Web driver to take screenshots
    private WebDriver driver;

    /**
     * Instantiates a new Screenshot.
     *
     * @param driver the driver
     */
    public Screenshot(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     * Take screenshot string.
     *
     * @param relativePath the relative path
     * @param fileName     the file name
     * @return the string
     */
    public String takeScreenshot(String relativePath, String fileName)
    {
        // Get project storage/directory
        //  String projectPath = System.getProperty("user.dir");

        // remove spaces from the file name
        // space doesn't seem to work with extent report
        fileName = fileName.replace(" ", "");

        // Convert web driver object to TakeScreenshot
        // Call getScreenshotAs method to create image file
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationFile = fileName + new Utility().getTimeStamp() + ".jpg";
        System.out.println(destinationFile);

        // Copy file to Desired Location
        try {
            FileUtils.copyFile(screenshotFile, new File(relativePath+destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("The path not found");
        }
        return destinationFile;
    }

}