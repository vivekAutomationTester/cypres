package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class AlternativeResearchTeamTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AlternativeResearchTeamTab(DriverObj driverObj) {
        super(driverObj);
    }

    public AlternativeResearchTeamTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Research team Tab Link
        Link researchTeamLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Research Team")
                .tagName("A").build());
        click(researchTeamLink, "research team tab link");

        // CIA listbox
        ListBox q8010ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_0"))
                .tagName("SELECT").build());
        selectText(q8010ListBox, "CIA", "Chief Investigator A");

        // Email
        EditField q1580EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q158_0"))
                .tagName("INPUT")
                .type("text").build());
        if (isPresent(q1580EditField))
            setValue(q1580EditField, "email", "Test Account 2 (Test2@test.com.au)");

        EditField q15990ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1599_0_ContactEmail")
                .tagName("INPUT")
                .type("text").build());
        if (isPresent(q15990ContactEmailEditField))
            q15990ContactEmailEditField.setValue("test2@test.com.au");

        // Yes button
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
        click(yesButton, "yes button 1");

        //Qualifications
        EditField q6190ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*0_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q6190ResponseEditField, "Qualifications", "Good worker");

        // Yes button
        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        click(yesButton1, "yes button 1");

        return this;
    }

}