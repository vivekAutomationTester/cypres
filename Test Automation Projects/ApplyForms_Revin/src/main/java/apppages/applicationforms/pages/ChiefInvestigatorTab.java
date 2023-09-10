package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;

public class ChiefInvestigatorTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ChiefInvestigatorTab(DriverObj driverObj) {
        super(driverObj);
    }

    public ChiefInvestigatorTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link researchTeamChiefInvestigatorsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Research Team - Chief Investigators")
                .tagName("A").build());
        click(researchTeamChiefInvestigatorsLink, "Link");

        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
//        waitForElement(yesButton);
        click(yesButton, "Yes button");

        EditField q15990ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
//        waitForElement(q15990ContactEmailEditField);
        setValue(q15990ContactEmailEditField,"CIA Email", "Test2@test.com.au");

        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
//        waitForElement(yesButton1);
        click(yesButton1, "Yes button 1");

        EditField q6190ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*__Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        if (isPresent(q6190ResponseEditField))
//            waitForElement(q6190ResponseEditField);
            setValue(q6190ResponseEditField, "Relevant background and expertise", "Good worker" );

        return this;
    }

    public ChiefInvestigatorTab enter2_11Data() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link chiefInvestigator211Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Chief Investigator 2-11")
                .tagName("A").build());
        click(chiefInvestigator211Link, "2-11 link");

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
//        waitForElement(AddButton);
        click(AddButton, "add button");

        EditField q18990ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
//        waitForElement(q18990ContactEmailEditField);
        setValue(q18990ContactEmailEditField, "Email", "Megan.Krol.7946@testdata.email\n");

        EditField q19240ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
//        waitForElement(q19240ResponseEditField);
        setValue(q19240ResponseEditField, "Relevant background and expertise", "Good worker");
        return this;
    }

    public ChiefInvestigatorTab enter12_21Data() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link chiefInvestigator1221Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Chief Investigator 12-21")
                .tagName("A").build());
        click(chiefInvestigator1221Link, "link");

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
//        waitForElement(AddButton);
        click(AddButton, "add button");

        EditField q19510ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
//        waitForElement(q19510ContactEmailEditField);
        setValue(q19510ContactEmailEditField, "Email", "Nina.Devlin.7010@testdata.email\n");

        EditField q19590ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
//        waitForElement(q19590ResponseEditField);
        setValue(q19590ResponseEditField, "relevant background and expertise", "Good worker");

        return this;
    }

    public ChiefInvestigatorTab enter22_31Data() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link chiefInvestigator2231Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Chief Investigator 22-31")
                .tagName("A").build());
//        waitForElement(chiefInvestigator2231Link);
        click(chiefInvestigator2231Link, "link");

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
//        waitForElement(AddButton);
        click(AddButton, "Add button");

        EditField q19690ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
//        waitForElement(q19690ContactEmailEditField);
        setValue(q19690ContactEmailEditField, "", "Julia.Faulkner.4960@testdata.email\n");

        EditField q19770ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
//        waitForElement(q19770ResponseEditField);
        setValue(q19770ResponseEditField, "relevant background and expertise", "Good worker");

        return this;
    }

    public ChiefInvestigatorTab enter32_41Data() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link chiefInvestigator3241Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Chief Investigator 32-41")
                .tagName("A").build());
        click(chiefInvestigator3241Link, "");

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
//        waitForElement(AddButton);
        click(AddButton, "add button");

        EditField q19860ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
//        waitForElement(q19860ContactEmailEditField);
        setValue(q19860ContactEmailEditField, "Email", "Katelyn.Willson.9458@testdata.email\n");

        EditField q19940ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
//        waitForElement(q19940ResponseEditField);
        setValue(q19940ResponseEditField, "relevant background and expertise", "Good worker");

        return this;
    }
    public ChiefInvestigatorTab enter42_50Data() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link chiefInvestigator4250Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Chief Investigator 42-50")
                .tagName("A").build());
        click(chiefInvestigator4250Link, "link");

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());
//        waitForElement(AddButton);
        click(AddButton, "add button");

        EditField q20030ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q2003_0_ContactEmail")
                .tagName("INPUT")
                .type("text").build());
//        waitForElement(q20030ContactEmailEditField);
        setValue(q20030ContactEmailEditField, "Email", "Daniel.Murphy.2940@testdata.email\n");

        EditField q20110ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q2011_0_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
//        waitForElement(q20110ResponseEditField);
        setValue(q20110ResponseEditField, "Relevant background and expertise", "Good worker");

        return this;
    }

    public ChiefInvestigatorTab fillData() throws Exception
    {
        enterData();
        enter2_11Data();
        enter12_21Data();
        enter22_31Data();
        enter32_41Data();
        enter42_50Data();
        return this;
    }
}