package apppages.applicationforms.pages;


import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ResearchTeamAssociateInvestigatorTab extends BasePage {





    private Frame frame;
    private Link researchTeamAssociateInvestigatorsLink;
    private EditField q16040ContactEmailEditField;
    private EditField q8440EditField;
    private EditField q6200ResponseEditField;
    private Link associateInvestigators1120Link;
    private Link associateInvestigators1120LinkAlt;
    private Button lf53836b247ed40d49f07A9aa15f97a2fAddButton;
    private EditField q22980ContactEmailEditField;
    private EditField q23070EditField;
    private EditField q23080ResponseEditField;
    private Link associateInvestigators2130Link;
    private Link associateInvestigators2130LinkAlt;
    private EditField q23100ContactEmailEditField;
    private EditField q23190EditField;
    private EditField q23200ResponseEditField;
    private Link associateInvestigators3140Link;
    private Link associateInvestigators3140LinkAlt;
    private EditField q23220ContactEmailEditField;
    private EditField q23310EditField;
    private EditField q23320ResponseEditField;
    private Link associateInvestigators4150Link;
    private Link associateInvestigators4150LinkAlt;
    private EditField q23340ContactEmailEditField;
    private EditField q23430EditField;
    private EditField q23440ResponseEditField;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ResearchTeamAssociateInvestigatorTab(DriverObj driverObj) throws Exception {
        super(driverObj);
        initialiseFields();
    }


    private void initialiseFields() throws GeneralLeanFtException {
        frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        researchTeamAssociateInvestigatorsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Research Team - Associate Investigators")
                .tagName("A").build());

        q16040ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        q8440EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty("Q.*_0"))
                .tagName("INPUT")
                .type("text").build());

        q6200ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());

        associateInvestigators1120Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty("Associate Investigators 11.*20"))
                .tagName("A").build());

        lf53836b247ed40d49f07A9aa15f97a2fAddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(2).build());

        q22980ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        q23070EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty("Q.*_0"))
                .tagName("INPUT")
                .type("text").build());

        q23080ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());

        associateInvestigators2130Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty("Associate Investigators 21.*30"))
                .tagName("A").build());

        q23100ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        q23190EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty("Q.*_0"))
                .tagName("INPUT")
                .type("text").build());

        q23200ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());

        associateInvestigators3140Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty("Associate Investigators 31.*40"))
                .tagName("A").build());

        q23220ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        q23310EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty("Q.*_0"))
                .tagName("INPUT")
                .type("text").build());

        q23320ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());

        associateInvestigators4150Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty("Associate Investigators 41.*50"))
                .tagName("A").build());

        q23340ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        q23430EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty("Q.*_0"))
                .tagName("INPUT")
                .type("text").build());

        q23440ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
    }

    public ResearchTeamAssociateInvestigatorTab enterData(String associateInvestigatorPosition, String relevantBackground) throws Exception {
        researchTeamAssociateInvestigatorsLink.click();
        enterAssociateInvestigator1_10("Tester", relevantBackground);

        if (isPresent(associateInvestigators1120Link)){
            enterAssociateInvestigator11_20(associateInvestigatorPosition, relevantBackground);
        }

        if (isPresent(associateInvestigators2130Link)){
            enterAssociateInvestigator21_30(associateInvestigatorPosition, relevantBackground);
        }

        if (isPresent(associateInvestigators3140Link)){
            enterAssociateInvestigator31_40(associateInvestigatorPosition, relevantBackground);
        }

        if (isPresent(associateInvestigators4150Link)){
            enterAssociateInvestigator41_50(associateInvestigatorPosition, relevantBackground);
        }
        return this;
    }

        //TODO: Make the AI email data driven. Ask Vivek!
    private void enterAssociateInvestigator1_10(String associateInvestigatorPosition, String relevantBackground) throws Exception {
        Link associateInvestigators110Link = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty("Associate Investigators 1.*10"))
                .tagName("A").build());
        waitForElement(associateInvestigators110Link); //Necessary for next check not picking up on the previous page's entry

        if (isNotPresent(q16040ContactEmailEditField)){
            waitForElement(lf53836b247ed40d49f07A9aa15f97a2fAddButton);
            click(lf53836b247ed40d49f07A9aa15f97a2fAddButton, "Click Add button");
        }
        waitForElement(q16040ContactEmailEditField);
        setValue(q16040ContactEmailEditField, "Set AI email", "haydn.sutton.44791@testdata.email"); //test1@test.com.au, haydn.sutton.44791@testdata.email
        waitForElement(q8440EditField);
        setValue(q8440EditField, "Set AI position", "Tester");
        //associateInvestigatorPosition
    }

    private void enterAssociateInvestigator11_20(String associateInvestigatorPosition, String relevantBackground) throws Exception {
        waitForElement(associateInvestigators1120Link);
        click(associateInvestigators1120Link, "Click AI 11-20 Tab");

        waitForElement(lf53836b247ed40d49f07A9aa15f97a2fAddButton);
        click(lf53836b247ed40d49f07A9aa15f97a2fAddButton, "Click Add button");

        waitForElement(q22980ContactEmailEditField);
        setValue(q22980ContactEmailEditField, "Set AI email", "chaya.sutton.0008@testdata.email"); //chaya.sutton.0008@testdata.email, Harvey.Mcintyre.9165@testdata.email

        waitForElement(q23070EditField);
        setValue(q23070EditField, "Set AI position", "Tester");
    }

    private void enterAssociateInvestigator21_30(String associateInvestigatorPosition, String relevantBackground) throws Exception {
        waitForElement(associateInvestigators2130Link);
        click(associateInvestigators2130Link, "Click AI 21-30 Tab");

        waitForElement(lf53836b247ed40d49f07A9aa15f97a2fAddButton);
        click(lf53836b247ed40d49f07A9aa15f97a2fAddButton, "Click Add button");

        waitForElement(q23100ContactEmailEditField);
        setValue(q23100ContactEmailEditField, "Set AI email", "ashleigh.sutton.3134@testdata.email"); //test3@test.com.au,

        waitForElement(q23190EditField);
        setValue(q23190EditField, "Set AI position", "Tester");
    }

    private void enterAssociateInvestigator31_40(String associateInvestigatorPosition, String relevantBackground) throws Exception {
        waitForElement(associateInvestigators3140Link);
        click(associateInvestigators3140Link, "Click AI 31-40 Tab");

        waitForElement(lf53836b247ed40d49f07A9aa15f97a2fAddButton);
        click(lf53836b247ed40d49f07A9aa15f97a2fAddButton, "Click Add button");

        waitForElement(q23220ContactEmailEditField);
        setValue(q23220ContactEmailEditField, "Set AI email", "rylan.summers.8578@testdata.email"); //test1@test.com.au, rylan.summers.8578@testdata.email
        waitForElement(q23310EditField);
        setValue(q23310EditField, "Set AI position", "Tester");
    }

    private void enterAssociateInvestigator41_50(String associateInvestigatorPosition, String relevantBackground) throws Exception {
        waitForElement(associateInvestigators4150Link);
        click(associateInvestigators4150Link, "Click AI 41-50 Tab");

        waitForElement(lf53836b247ed40d49f07A9aa15f97a2fAddButton);
        click(lf53836b247ed40d49f07A9aa15f97a2fAddButton, "Click Add button");

        waitForElement(q23340ContactEmailEditField);
        setValue(q23340ContactEmailEditField, "Set AI email", "martin.summers.58951@testdata.email"); //test3@test.com.au, martin.summers.58951@testdata.email

        waitForElement(q23430EditField);
        setValue(q23430EditField, "Set AI position", "Tester");
    }

    public ResearchTeamAssociateInvestigatorTab fillData() throws Exception
    {
        enterData("Tester", "Good worker");
        enterAssociateInvestigator1_10("Researcher", "Good worker");
        enterAssociateInvestigator11_20("Tester", "Good worker");
        enterAssociateInvestigator21_30("Researcher", "Good worker");
        enterAssociateInvestigator31_40("Tester", "Good worker");
        enterAssociateInvestigator41_50("Researcher", "Good worker");
        return this;
    }
}