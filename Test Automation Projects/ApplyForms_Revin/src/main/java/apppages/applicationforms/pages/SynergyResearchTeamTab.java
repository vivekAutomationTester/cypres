package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class SynergyResearchTeamTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public SynergyResearchTeamTab(DriverObj driverObj) {
        super(driverObj);
    }

    //AI data
    public SynergyResearchTeamTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Research Team Tab Link
        Link researchTeamLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Research Team")
                .tagName("A").build());
        waitForElement(researchTeamLink);
        waitForPageToLoad();
        click(researchTeamLink, "Research Team Link");

        // Associate Investigator Link
//        Link associateInvestigatorsLink = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText("Associate Investigators")
//                .tagName("A").build());
//        waitForElement(associateInvestigatorsLink);
//        click(associateInvestigatorsLink, "Associate Investigator Link");
//
//        //+ button
//        Button addButton = frame.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
//                .buttonType("submit")
//                .role("")
//                .tagName("INPUT")
//                .index(2).build());
////        waitForElement(addButton);
////        click(addButton, "+ Button");
//
//        //Enter email
//        EditField contactEmail1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name("Q1588_0_ContactEmail")
//                .tagName("INPUT")
//                .type("text").build());
//        waitForElement(contactEmail1);
//        setValue(contactEmail1, "Contact Email", "Harvey.Mcintyre.9165@testdata.email");
//
//        //Enter position
//        EditField testerPosition = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*Q844_0"))
//                .tagName("INPUT")
//                .type("text").build());
//        waitForElement(testerPosition);
//        setValue(testerPosition, "Position", "Tester");
//
//        //+ Button
//        click(addButton, "+ button");
//
//        //Enter Email
//        EditField contactEmail2 = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name("Q1588_1_ContactEmail")
//                .tagName("INPUT")
//                .type("text").build());
//        waitForElement(contactEmail2);
//        setValue(contactEmail2, "Email", "Gabriel.Bishop.249@testdata.email");
//
//        // Enter Position
//        EditField researcherPosition = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*Q844_1"))
//                .tagName("INPUT")
//                .type("text").build());
//        waitForElement(researcherPosition);
//        setValue(researcherPosition, "Position", "Researcher");
//
//        Link chiefInvestigatorLink = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText("Chief Investigator")
//                .tagName("A").build());
//        waitForElement(chiefInvestigatorLink);
//        click(chiefInvestigatorLink, "CI Link");
        return this;
    }

    // data for CIs...just the role list boxes
    public SynergyResearchTeamTab enterCIData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //CIA Role list box
        ListBox q8010ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_0"))
                .tagName("SELECT").build());
        waitForElement(q8010ListBox);
        waitForPageToLoad();
        selectText(q8010ListBox, "Role", "Chief Investigator A");

        //yes button for based in Australia
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .tagName("LABEL").build());
        waitForElement(yesButton);
        waitForPageToLoad();
        click(yesButton, "yes button");

        //CIB Role list box
        ListBox q8011ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_1"))
                .tagName("SELECT").build());
        waitForElement(q8011ListBox);
        waitForPageToLoad();
        selectText(q8011ListBox, "Role", "Chief Investigator B");

        //CIC Role list box
        ListBox q8012ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_2"))
                .tagName("SELECT").build());
        waitForElement(q8012ListBox);
        waitForPageToLoad();
        selectText(q8012ListBox, "Role", "Chief Investigator C");

        //CID Role list box
        ListBox q8013ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_3"))
                .tagName("SELECT").build());
        waitForElement(q8013ListBox);
        waitForPageToLoad();
        selectText(q8013ListBox, "Role", "Chief Investigator D");

        Button addButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());

        click(addButton, "add button");
        ListBox q8014ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_4"))
                .tagName("SELECT").build());
        waitForElement(q8014ListBox);
        waitForPageToLoad();
        selectText(q8014ListBox, "Role", "Chief Investigator E");

        click(addButton, "add button");
        ListBox q8015ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q801_5"))
                .tagName("SELECT").build());
        waitForElement(q8015ListBox);
        waitForPageToLoad();
        selectText(q8015ListBox, "Role", "Chief Investigator F");

//        click(addButton, "add button");
//        ListBox q8016ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*Q801_6"))
//                .tagName("SELECT").build());
//        waitForElement(q8016ListBox);
//        waitForPageToLoad();
//        selectText(q8016ListBox, "Role", "Chief Investigator G");

//        click(addButton, "add button");
//        ListBox q8017ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*Q801_7"))
//                .tagName("SELECT").build());
//        waitForElement(q8017ListBox);
//        waitForPageToLoad();
//        selectText(q8017ListBox, "Role", "Chief Investigator H");

//        click(addButton, "add button");
//        ListBox q8018ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*Q801_8"))
//                .tagName("SELECT").build());
//        waitForElement(q8018ListBox);
//        waitForPageToLoad();
//        selectText(q8018ListBox, "Role", "Chief Investigator I");

//        click(addButton, "add button");
//        ListBox q8019ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*Q801_9"))
//                .tagName("SELECT").build());
//        waitForElement(q8019ListBox);
//        waitForPageToLoad();
//        selectText(q8019ListBox, "Role", "Chief Investigator J");

        return this;
    }

    //email for CIA
    public SynergyResearchTeamTab enterCIAEmailData(String ciaEmail) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        //CIA Email
        EditField q15760ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_0_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
        waitForElement(q15760ContactEmailEditField);
        setValue(q15760ContactEmailEditField, "Email", ciaEmail);
        waitForPageToLoad();
        return this;
    }

    //email for CIB
    public SynergyResearchTeamTab enterCIBEmailData(String cibEmail) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //CIA Email
        EditField q15761ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*1_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
        waitForElement(q15761ContactEmailEditField);
        setValue(q15761ContactEmailEditField, "Email", cibEmail);
        waitForPageToLoad();
        return this;
    }

    //email for CIC
    public SynergyResearchTeamTab enterCICEmailData(String cicEmail) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //CIA Email
        EditField q15762ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*2_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
        waitForElement(q15762ContactEmailEditField);
        setValue(q15762ContactEmailEditField, "Email", cicEmail);
//        waitForPageToLoad();
        return this;
    }

    //email for CID
    public SynergyResearchTeamTab enterCIDEmailData(String cidEmail) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //CIA Email
        EditField q15763ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*3_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        waitForElement(q15763ContactEmailEditField);
        setValue(q15763ContactEmailEditField, "Email", cidEmail);
//        waitForPageToLoad();

        return this;
    }

    //email for CIE
    public SynergyResearchTeamTab enterCIEEmailData(String cieEmail) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //CIA Email
        EditField q15764ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*4_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        waitForElement(q15764ContactEmailEditField);
        setValue(q15764ContactEmailEditField, "Email", cieEmail);
//        waitForPageToLoad();

        return this;
    }

    //email for CIF
    public SynergyResearchTeamTab enterCIFEmailData(String cifEmail) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //CIA Email
        EditField q15765ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*5_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        waitForElement(q15765ContactEmailEditField);
        setValue(q15765ContactEmailEditField, "Email", cifEmail);
//        waitForPageToLoad();

        return this;
    }

    //email for CIG
//    public SynergyResearchTeamTab enterCIGEmailData(String cigEmail) throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//
//        //CIG Email
//        EditField q15766ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*6_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        waitForElement(q15766ContactEmailEditField);
//        setValue(q15766ContactEmailEditField, "Email", cigEmail);
////        waitForPageToLoad();
//
//        return this;
//    }

//    public SynergyResearchTeamTab enterCIHEmailData(String cihEmail) throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//
//        //CIA Email
//        EditField q15767ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*7_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        waitForElement(q15767ContactEmailEditField);
////        waitForPageToLoad();
//        setValue(q15767ContactEmailEditField, "Email", cihEmail);
//
//        return this;
//    }

//    public SynergyResearchTeamTab enterCIIEmailData(String ciiEmail) throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//
//        //CIA Email
//        EditField q15768ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*8_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        waitForElement(q15768ContactEmailEditField);
////        waitForPageToLoad();
//        setValue(q15768ContactEmailEditField, "Email", ciiEmail);
//
//        return this;
//    }

//    public SynergyResearchTeamTab enterCIJEmailData(String cijEmail) throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//
//        //CIA Email
//        EditField q15769ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*9_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        waitForElement(q15769ContactEmailEditField);
////        waitForPageToLoad();
//        setValue(q15769ContactEmailEditField, "Email", cijEmail);
//
//        return this;
//    }

    // Call all methods
    public SynergyResearchTeamTab fillData() throws Exception
    {
        enterData();
        enterCIData();
        enterCIAEmailData("Test2@test.com.au");
        enterCIBEmailData("Daniel.Murphy.2940@testdata.email");
        enterCICEmailData("Megan.Krol.7946@testdata.email");
        enterCIDEmailData("Nina.Devlin.7010@testdata.email");
        enterCIEEmailData("Harvey.Mcintyre.9165@testdata.email");
        enterCIFEmailData("Gabriel.Bishop.249@testdata.email");
//        enterCIGEmailData("Julia.Faulkner.4960@testdata.email");
//        enterCIHEmailData("Katelyn.Willson.9458@testdata.email");
//        enterCIIEmailData("Alicia.Monro.6540@testdata.email");
//        enterCIJEmailData("Brian.Martin.1296@testdata.email");

        return this;
    }
}