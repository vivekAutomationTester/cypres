package apppages.applicationforms.pages;


import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class PartnerOrganisationsTab extends BasePage {



    private Frame frame;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public PartnerOrganisationsTab(DriverObj driverObj) {
        super(driverObj);
    }

    // This method fills data using the data provided by the user
    // This is the preferred method for data driven testing
    public PartnerOrganisationsTab enterData(String partnerLong1, String partnerShort1) throws Exception {

        frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Open Tab
        Link partnerOrganisationSLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Partner Organisation(s)")
                .tagName("A").build());
        click(partnerOrganisationSLink, "Partner Organisations Link");

        // Enter Partner 1 Field
        EditField partnerName = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .index(0)
                .tagName("INPUT")
                .type("text").build());
        setValue(partnerName, "Partner 1 Field", partnerLong1);

        // Enter Shortened Name of Partner 1
        EditField partnerShortName = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .index(1)
                .tagName("INPUT")
                .type("text").build());
        setValue(partnerShortName, "Shortened Name of Partner 1", partnerShort1);

        return this;
    }

    // This method fills information using sample data
    public void fillData() throws Exception{
        enterData("Thomas and Associates", "Test");
    }
}