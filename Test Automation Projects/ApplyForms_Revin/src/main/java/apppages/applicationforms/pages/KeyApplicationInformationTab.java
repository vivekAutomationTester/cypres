package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class KeyApplicationInformationTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public KeyApplicationInformationTab(DriverObj driverObj) {
        super(driverObj);
    }

    // Parameterised method
    // Needs to be called for a data driven test
    public KeyApplicationInformationTab enterData(String researchStream, String stipendCategory,   String academicQualificationsDate, String timeCommitment, String useOfFunds ) throws Exception{

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Click Key application tab =
        Link keyApplicationInformationLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Key Application Information")
                .tagName("A").build());
        click(keyApplicationInformationLink, "Key Application Information tab");

        // Research Stream List box
        ListBox q1286ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*_Q18"))
                .tagName("SELECT").build());
        selectText(q1286ListBox, "Research Stream List box", researchStream);

        // Stipend Category
        WebElement combinedMBBSPhDStipendWebElement = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build())
                .describe(WebElement.class, new WebElementDescription.Builder()
                        .innerText(stipendCategory + "")
                        .tagName("LABEL").build());
        click(combinedMBBSPhDStipendWebElement, "Stipend Category Radio Button");

        // Date of most recent academic qualification
        EditField q1486EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1486"))
                .tagName("INPUT")
                .type("text").build());
        if (isPresent(q1486EditField))
            setValue(q1486EditField, "Academic Qualification Date", academicQualificationsDate);

        // Time Commitment
        ListBox q1290ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1290"))
                .tagName("SELECT").build());
        selectText(q1290ListBox, "Time Commitment", timeCommitment);

        // Are you in receipt of any type of Australian Government-funded stipend, for example, a Research Training Program stipend (RTP)?
        Button noButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        No        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
        click(noButton, "No Button");

        // Do you wish to be considered for partner funding?
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        click(yesButton, "yes Button");

        // Funding Partners
        // Cerebral Palsy Alliance Research Foundation
        CheckBox q1300A1842CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*A1842"))
                .tagName("INPUT")
                .type("checkbox").build());
        check(q1300A1842CheckBox, "Cerebral Palsy Alliance Research Foundation check box", true);

        // Australian Academy of Science
        CheckBox q1300A1850CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*A1850"))
                // change to reg exp
                .tagName("INPUT")
                .type("checkbox").build());
        if (isPresent(q1300A1850CheckBox))
            check(q1300A1850CheckBox, "Australian Academy of Science checkbox", true);

        // For applicants in the Aboriginal or Torres Strait Islander Health Research Postgraduate Scholarship – do you want to be considered for
        // the Australian Academy of Science Douglas and Lola Douglas Award for Indigenous Health Research? *
        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(2).build());
        if(isPresent(yesButton1))
            click(yesButton1, "yes button 1");

        // If you are a person of Aboriginal and Torres Strait Islander descent, do you wish to be considered for FIIRN funding? *
        Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(3).build());
        if (isPresent(yesButton2))
            click(yesButton2, "yes button 2");

        // Indicate below how you intend to use the funds
        EditField q1305ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1305_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1305ResponseEditField, "Use of Funds", useOfFunds);

        //I confirm that my Administering Institution holds evidence of my Aboriginal and/or Torres Strait Islander descent and is able to provide it to NHMRC if requested
        CheckBox q1306A1863CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1306.*")) //-A1863
                .tagName("INPUT")
                .type("checkbox").build());
        check(q1306A1863CheckBox, "confirm check box", true);

        return this;
    }

    // default method that we call in tests
    public KeyApplicationInformationTab fillData() throws Exception{

        enterData("Aboriginal and Torres Strait Islander Health Research", "Combined MBBS/PhD Stipend", "01/05/2020",
                "Full-time","test");

        return this;
    }
}