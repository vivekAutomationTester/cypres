package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.Browser;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;


// Recipe for a new page/tab
// Extend BasePage
public class TemplateTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public TemplateTab(DriverObj driverObj) {
        super(driverObj);
    }

    // This method fills data using the data provided by the user
    // This is the preferred method for data driven testing
    public TemplateTab enterData()
    {

        return this;
    }

    // This method fills information using sample data
    // No args are used
    public TemplateTab fillData()
    {

        return this;
    }

}