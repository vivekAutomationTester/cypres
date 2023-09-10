package library.useractions;

import com.paulhammant.ngwebdriver.NgWebDriver;
import library.reports.ReportManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * The type Angular field.
 */
public class AngularField {

    private WebDriver driver;
    private NgWebDriver angularDriver;
    private SeleniumField seleniumField;

    /**
     * Instantiates a new Angular field.
     *
     * @param driver           the driver
     * @param ExtentManager    the extent manager
     * @param by               the by
     * @param fieldDescription the field description
     */
    public AngularField(WebDriver driver, ReportManager ExtentManager, By by, String fieldDescription )
    {
        this.driver = driver;
        this.angularDriver = new NgWebDriver((JavascriptExecutor) driver);
        seleniumField = new SeleniumField(driver, ExtentManager, by, fieldDescription);
    }

    // Angular is used only for synchronisation and a possible option for future development
    // Angular is used to take care of asynchronous wait
    // As UFT is the preferred choice to create automation code, angular is not used

}
