package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ParticipatingOrganisationsTab  extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ParticipatingOrganisationsTab(DriverObj driverObj) {
        super(driverObj);
    }

    public ParticipatingOrganisationsTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        EditField partnerOrganisation = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1930_.*"))
                .tagName("INPUT")
                .index(0)
                .type("text").build());
        partnerOrganisation.setValue("Australian Diabetes Society");
        setValue(partnerOrganisation, "Partner Organisation", "Australian Diabetes Society");

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
        click(AddButton,"Add Button");

        EditField partnerOrganisation1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1930_1"))
                .tagName("INPUT")
                .index(1)
                .type("text").build());
        partnerOrganisation1.setValue("Australian Diabetes Society");
        setValue(partnerOrganisation1, "Partner Organisation", "American Diabetes Association");

        return this;
    }
}
