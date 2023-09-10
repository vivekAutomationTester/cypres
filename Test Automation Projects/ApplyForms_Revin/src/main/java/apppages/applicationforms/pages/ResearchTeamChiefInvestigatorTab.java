package apppages.applicationforms.pages;


import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ResearchTeamChiefInvestigatorTab extends BasePage {


    private Frame frame;

    private EditField q15990ContactEmailEditField;
    private Button yesButton;
    private EditField q6190ResponseEditField;
//    private Link chiefInvestigator211Link;
//    private Link chiefInvestigator211LinkAlt;
//    private Button AddButton;
//    private EditField q19300ContactEmailEditField;
//    private EditField q19540ResponseEditField;
//    private Link chiefInvestigator1221Link;
//    private Link chiefInvestigator1221LinkAlt;
//    private EditField q22310ContactEmailEditField;
//    private EditField q22390ResponseEditField;
//    private Link chiefInvestigator2231Link;
//    private Link chiefInvestigator2231LinkAlt;
//    private EditField q22480ContactEmailEditField;
//    private EditField q22560ResponseEditField;
//    private Link chiefInvestigator3241Link;
//    private Link chiefInvestigator3241LinkAlt;
//    private EditField q22650ContactEmailEditField;
//    private EditField q22730ResponseEditField;
//    private Link chiefInvestigator4250Link;
//    private Link chiefInvestigator4250LinkAlt;
//    private EditField q22820ContactEmailEditField;
//    private EditField q22900ResponseEditField;
    private Button yesButton2;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ResearchTeamChiefInvestigatorTab(DriverObj driverObj) {
        super(driverObj);
    }

    //Initialise all fields
    //No data entered
    private void initialiseFields() throws Exception
    {
        frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        q15990ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*0_ContactEmail"))
                .tagName("INPUT")
                .type("text").build());

        yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .index(0)
                .tagName("LABEL").build());

        yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .index(1)
                .tagName("LABEL").build());

        q6190ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
//        chiefInvestigator211Link = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText(new RegExpProperty("Chief Investigator 2.*11"))
//                .tagName("A").build());
//
//        AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
//                .buttonType("submit")
//                .role("")
//                .tagName("INPUT")
//                .index(2).build());
//
//        q19300ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        q19540ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_Response"))
//                .tagName("TEXTAREA")
//                .type("textarea").build());
//
//        chiefInvestigator1221Link = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText(new RegExpProperty("Chief Investigator 12.*21"))
//                .tagName("A").build());
//
//        q22310ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        q22390ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_Response"))
//                .tagName("TEXTAREA")
//                .type("textarea").build());
//
//        chiefInvestigator2231Link = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText(new RegExpProperty("Chief Investigator 22.*31"))
//                .tagName("A").build());
//
//        q22480ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        q22560ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_Response"))
//                .tagName("TEXTAREA")
//                .type("textarea").build());
//
//        chiefInvestigator3241Link = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText(new RegExpProperty("Chief Investigator 32.*41"))
//                .tagName("A").build());
//
//        q22650ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        q22730ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_Response"))
//                .tagName("TEXTAREA")
//                .type("textarea").build());

//        chiefInvestigator4250Link = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText(new RegExpProperty("Chief Investigator 42.*50"))
//                .tagName("A").build());
//
//        q22820ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_ContactEmail"))
//                .tagName("INPUT")
//                .type("text").build());
//
//        q22900ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//                .name(new RegExpProperty(".*_Response"))
//                .tagName("TEXTAREA")
//                .type("textarea").build());
    }

    //Open Research Team CI Link
    private void openLink() throws Exception
    {
        waitForPageToLoad();
        WebElement researchTeamChiefInvestigatorsLink = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build())
                .describe(WebElement.class, new WebElementDescription.Builder()
                        .innerText("Research Team - Chief Investigators")
                        .tagName("SPAN").build());
        click(researchTeamChiefInvestigatorsLink, "Research Team Chief Investigators Link");
    }

    //Input all data
    public ResearchTeamChiefInvestigatorTab enterData(String relevantBackground) throws Exception {
        String CIEmail = "";
        initialiseFields();
        openLink();
        waitForPageToLoad();

//        click(yesButton, "");

        //Data for CIA
        enterChiefInvestigatorA(relevantBackground);
        waitForPageToLoad();


//        enterChiefInvestigator2_11(relevantBackground, CIEmail);
//        waitForPageToLoad();
//
//
//        enterChiefInvestigator12_21(relevantBackground, CIEmail);
//        waitForPageToLoad();
//
//
//        enterChiefInvestigator22_31(relevantBackground, CIEmail);
//        waitForPageToLoad();
//
//
//        enterChiefInvestigator32_41(relevantBackground, CIEmail);
//        waitForPageToLoad();
//
//
//        enterChiefInvestigator42_50(relevantBackground, CIEmail);
        return this;
    }

    //TODO: Change each CI contact to something data driven. Ask Vivek
    private void enterChiefInvestigatorA(String relevantBackground) throws Exception {

        waitForPageToLoad();
        if(isPresent(yesButton))
            click(yesButton, "Click the yes button");

        setValue(q15990ContactEmailEditField, "Set CIA email", "Test2@test.com.au");

        if (isPresent(yesButton2)){
            click(yesButton2, "Click the second yes button");
        }
        waitForPageToLoad();
        setValue(q6190ResponseEditField, "Set relevant background", relevantBackground);
    }

    //Data for CI 2-11
//    private void enterChiefInvestigator2_11(String relevantBackground, String CIEmail) throws Exception {
//        click(chiefInvestigator211Link, "Click CI 2-11 tab");
//        click(AddButton, "Click Add button");
//        setValue(q19300ContactEmailEditField, "Set CI email", "bushra.swanson.66601@testdata.email"); //bushra.swanson.66601@testdata.email, test3@test.com.au
//        setValue(q19540ResponseEditField, "Set relevant background", relevantBackground);
//    }
//
//    //Data for CI 12-21
//    private void enterChiefInvestigator12_21(String relevantBackground, String CIEmail) throws Exception {
//        click(chiefInvestigator1221Link, "Click CI 12-21 tab");
//        click(AddButton, "Click Add button");
//        setValue(q22310ContactEmailEditField, "Set CI email", "tomasz.sutton.1628@testdata.email"); //test4@test.com.au, tomasz.sutton.1628@testdata.email
//        setValue(q22390ResponseEditField, "Set relevant background", relevantBackground);
//    }
//
//    //Data for CI 22-31
//    private void enterChiefInvestigator22_31(String relevantBackground, String CIEmail) throws Exception {
//        click(chiefInvestigator2231Link, "Click CI 22-31 tab");
//        click(AddButton, "Click Add button");
//        setValue(q22480ContactEmailEditField, "Set CI email", "asma.swanson.7054@testdata.email");//test5@test.com.au, asma.swanson.7054@testdata.email
//        setValue(q22560ResponseEditField, "Set relevant background", relevantBackground);
//    }
//
//    //Data for CI 32-41
//    private void enterChiefInvestigator32_41(String relevantBackground, String CIEmail) throws Exception {
//        click(chiefInvestigator3241Link, "Click CI 32-41 tab");
//        click(AddButton, "Click Add button");
//        setValue(q22650ContactEmailEditField, "Set CI email", "raja.sutton.2219@testdata.email"); //raja.sutton.2219@testdata.email, test6@test.com.au
//        setValue(q22730ResponseEditField, "Set relevant background", relevantBackground);
//    }
//
//    //Data for CI 42-50
//    private void enterChiefInvestigator42_50(String relevantBackground, String CIEmail) throws Exception {
//        click(chiefInvestigator4250Link, "Click CI 242-50 tab");
//        click(AddButton, "Click Add button");
//        setValue(q22820ContactEmailEditField, "Set CI email", "kevin.sutton.86081@testdata.email"); //test7@test.com.au
//        setValue(q22900ResponseEditField, "Set relevant background", relevantBackground);
//    }

    //Call methods
//    public void fillData() throws Exception {
//        fillData("Test2@test.com.au");
//    }
//
//    // To enter only one CI
//    // This simply uses the Research Team Tab
//    public void fillData(String emailAddress) throws Exception {
//        openLink();
//        new ResearchTeamTab(driverObj).enterData(emailAddress, "Good Worker");
//    }
}