package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ResearchAndCareerInformationTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ResearchAndCareerInformationTab(DriverObj driverObj) {
        super(driverObj);
    }

    public ResearchAndCareerInformationTab enterData(String primarySupervisorEmail, String knowledgeAndSkill, String futureCareerAspirations,
                                                     String currentAndFutureProfessionalPathway, String intendedCareer) throws Exception
    {

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Research and Career Information Link
        Link researchAndCareerInformationLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Research and Career Information")
                .tagName("A").build());
        click(researchAndCareerInformationLink, "Research and Career Information tab button");

        //Primary Supervisor email
        EditField q1431ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1431_ContactEmail")
                .tagName("INPUT")
                .type("text").build());
        setValue(q1431ContactEmailEditField, "Primary supervisor email", primarySupervisorEmail);

        // Secondary Supervisor email
//        EditField q14330ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name("Q1433_0_ContactEmail")
//                .tagName("INPUT")
//                .type("text").build());
//        setValue(q14330ContactEmailEditField, "Secondary supervisor email",secondarySupervisorEmail);
        waitForElement(q1431ContactEmailEditField);
        CheckBox deleteCheckbox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("L98e9c4b7-cb96-4446-a2fd-f6de97b2c22c_chkSelect")
                .tagName("INPUT")
                .type("checkbox").build());
        check(deleteCheckbox, "Delete checkbox", true);

        waitForElement(deleteCheckbox);
        Button deleteButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(3).build());
        click(deleteButton, "Delete Button");

        // Enter Knowledge and Skills
        EditField q1387ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1387_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1387ResponseEditField, "Knowledge and skill text field", knowledgeAndSkill);

        // Enter future career aspirations
        EditField q1326ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1326_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1326ResponseEditField, "future career aspirations text field", futureCareerAspirations);

        // Enter Current and Future professional Pathway
        EditField q1327ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1327_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1327ResponseEditField, " current and future professional pathway text field", currentAndFutureProfessionalPathway);

        // enter Intended career
        EditField q1328ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1328_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1328ResponseEditField, "Intended career text field", intendedCareer);

        return this;
    }

    public ResearchAndCareerInformationTab fillData() throws Exception
    {
        enterData("Test2@test.com.au","Knowledge and Skill", "Future Career Aspirations",
                "Current and future professional pathway","Intended Career");

        return this;
    }
}