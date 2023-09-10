package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class SynergyAssociateInvestigators extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public SynergyAssociateInvestigators(DriverObj driverObj) {
        super(driverObj);
    }

    public SynergyAssociateInvestigators enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        //Associate Investigator Link
        Link associateInvestigatorsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Associate Investigators")
                .tagName("A").build());
        click(associateInvestigatorsLink, "Associate Investigator tab link");

        // Add button
        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
        click(AddButton, "+ Button");

        //Email
        EditField q16040ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1604_0_ContactEmail")
                .tagName("INPUT")
                .type("text").build());
        setValue(q16040ContactEmailEditField, "Email", "Alicia.Monro.6540@testdata.email");

        //Position
        EditField q8440EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q844_0")
                .tagName("INPUT")
                .type("text").build());
        setValue(q8440EditField, "Position", "Researcher");

        //Relevant background and expertise text box
        EditField q6200ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q620_0_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        if(isPresent(q6200ResponseEditField))
            setValue(q6200ResponseEditField, "Relevant background and expertise", "Relevant Background and Expertise");

        //add button
        click(AddButton, "+ button");

        //Email
        EditField q16041ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1604_1_ContactEmail")
                .tagName("INPUT")
                .type("text").build());
        setValue(q16041ContactEmailEditField, "Email", "Brian.Martin.1296@testdata.email");

        //Position
        EditField q8441EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q844_1")
                .tagName("INPUT")
                .type("text").build());
        setValue(q8441EditField, "Position","Researcher");

        //Relevant background and expertise text box
        EditField q6201ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q620_1_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        if(isPresent(q6201ResponseEditField))
            setValue(q6201ResponseEditField, "Relevant background and expertise", "Relevant Background and Expertise");

        return this;
    }
    public SynergyAssociateInvestigators fillData() throws Exception
    {

        return this;
    }
}