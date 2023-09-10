package library.browsers;

import com.hp.lft.sdk.web.Browser;
import library.reports.ReportManager;
import org.openqa.selenium.WebDriver;

/**
 * The type Driver obj.
 */
public class DriverObj {

    private Browser browser;
    private WebDriver driver;
    private ReportManager reportManager;

    /**
     * Instantiates a new Driver obj.
     *
     * @param browser       the browser
     * @param driver        the driver
     * @param reportManager the report manager
     */
    public DriverObj(Browser browser, WebDriver driver, ReportManager reportManager)
    {
        this.browser = browser;
        this.driver = driver;
        this.reportManager = reportManager;
    }

    /**
     * Instantiates a new Driver obj.
     */
    public DriverObj() {

    }

    /**
     * Gets browser.
     *
     * @return the browser
     */
    public Browser getBrowser() {
        return browser;
    }

    /**
     * Sets browser.
     *
     * @param browser the browser
     */
    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    /**
     * Gets driver.
     *
     * @return the driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Sets driver.
     *
     * @param driver the driver
     */
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Gets report manager.
     *
     * @return the report manager
     */
    public ReportManager getReportManager() {
        return reportManager;
    }

    /**
     * Sets report manager.
     *
     * @param reportManager the report manager
     */
    public void setReportManager(ReportManager reportManager) {
        this.reportManager = reportManager;
    }
}
