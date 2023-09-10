package apppages.common;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ProfileLogoutPage extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ProfileLogoutPage(DriverObj driverObj) {
        super(driverObj);
    }

    public void logout() throws Exception {


        waitForPageToLoad();
        WebElement accountCircleWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("account_circle")
                .tagName("MD-ICON").build());
        accountCircleWebElement.click();
        reportManager.logPass("Click on the logout button");

        waitForPageToLoad();
        Button logOutButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("                     power_settings_new                     Log out                  ")
                .tagName("BUTTON").build());

        waitForElement(logOutButton);
        logOutButton.click();
        reportManager.logPass("The user is logged out");
        waitForPageToLoad();
    }


}
