package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class AddPartnerContribution extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AddPartnerContribution(DriverObj driverObj) {
        super(driverObj);
    }

    // This method fills data using the data provided by the user
    // This is the preferred method for data driven testing
    public void enterData(String itemName, String yearValue) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Open the tab
        Link contributionsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Contributions")
                .tagName("A").build());
        waitForElement(contributionsLink);
        click(contributionsLink, "Link");
        reportManager.logPass("Open the Contributions Tab");

        // Click on add Cash Contribution Button
        Button addCashContributionButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
        waitForElement(addCashContributionButton);
        click(addCashContributionButton, "Add Cash Contribution Button");

        // Set contributions item name
        EditField itemNameEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1655_0_0")
                .tagName("INPUT")
                .type("text").build());
        setValue(itemNameEditField, "contributions item name", itemName);

        // Set Year Value
        EditField yearValueEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q2161_0_0")
                .tagName("INPUT")
                .type("text").build());
        setValue(yearValueEditField, "Year Value", yearValue);
    }

    // This method fills information using sample data
    public void fillData() throws Exception
    {
        enterData("Test", "600000");
    }
}