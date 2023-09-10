package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class DevGrantsApplicationDetailsTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public DevGrantsApplicationDetailsTab(DriverObj driverObj) {
        super(driverObj);
    }

    public DevGrantsApplicationDetailsTab enterData() throws Exception
    {

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("")
                .index(0).build());

        EditField administeringInstitution = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q93"))
                .tagName("INPUT")
                .type("text").build());
        waitForElement(administeringInstitution);
        setValue(administeringInstitution, "Administering Institution", "Baker Heart and Diabetes Institute");

        ListBox grantDuration = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q789.*"))
                .tagName("SELECT").build());
        waitForElement(grantDuration);
        selectIndex(grantDuration, "Grant duration", 5);

        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
        waitForElement(yesButton);
        click(yesButton, "Yes button");

        EditField projectSynopsis = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q617_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        waitForElement(projectSynopsis);
        setValue(projectSynopsis, "Project synopsis", "Project synopsis lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum");

        EditField plainEnglishSummary = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q618_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        waitForElement(plainEnglishSummary);
        setValue(plainEnglishSummary, "Plain English Summary", "Plain English Summary");

        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        waitForElement(yesButton1);
        click(yesButton1, "Yes button 1");

        Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(2).build());
        waitForElement(yesButton2);
        click(yesButton2, "yes Button");

        Button yesButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(3).build());
        waitForElement(yesButton3);
        click(yesButton3, "yes Button");

        return this;
    }
    //Set IREC as no
    public DevGrantsApplicationDetailsTab setIrecAsNo() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Button noButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        No        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
        waitForElement(noButton);
        click(noButton,"No Button");
        return this;
    }
}
