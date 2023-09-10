package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class EnrolmentQualificationsAndExperienceTab  extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public EnrolmentQualificationsAndExperienceTab(DriverObj driverObj) {
        super(driverObj);
    }

    public EnrolmentQualificationsAndExperienceTab enterData(String academicPerformance, String previousExperienceFieldOfResearch, String previousExperienceResearchProposal, String priorExperienceToIndigenousHealth) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Enrolment Qualifications and experiment Link
        Link enrolmentQualificationsAndExperienceLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Enrolment, Qualifications and Experience")
                .tagName("A").build());
        click(enrolmentQualificationsAndExperienceLink, "Enrolment, Qualifications, and Experience");

        //Proposed degree
        ListBox q1307ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1307"))
                .tagName("SELECT").build());
        selectIndex(q1307ListBox, "Proposed Degree List Box", 1);

        //Are you currently enrolled for the award or will you enrol for the award prior to 31 December in the year of application?
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("            Yes         ")
                .tagName("LABEL").build());
        click(yesButton, "yes Button");

        //Initial Date of Enrolment
        EditField q1310EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1310"))
                .tagName("INPUT")
                .type("text").build());
        if (isPresent(q1310EditField))
            setValue(q1310EditField, "Initial Date of Enrolment", "01/02/2020");

        // Period of FTE enrolment
        EditField q1312EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1312")
                .tagName("INPUT")
                .type("text").build());
        if (isPresent(q1312EditField))
            setValue(q1312EditField, " Period of FTE enrolment", "1");

//        Outline your academic performance. Do not repeat your academic transcript or provide a full CV, but describe the directions you have taken
//        in your academic career and any special highlights to which you wish to draw attention to.
        EditField q1315ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1315_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1315ResponseEditField, "Academic performance", academicPerformance);

//        Provide brief details of your previous experience highlighting the most significant contributions you have made to your field of research.
        EditField q1316ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1316_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1316ResponseEditField, "Previous Experience Field Of Research", previousExperienceFieldOfResearch);

//      Provide brief details from your previous experience that most significantly affect your research proposal.
        EditField q1317ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1317_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1317ResponseEditField, "Previous Experience Research Proposal", previousExperienceResearchProposal);

//        Outline any prior experience relevant to Indigenous Health if applicable to your research proposal.
        EditField q1320ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1320_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1320ResponseEditField, "Prior Experience To Indigenous Health", priorExperienceToIndigenousHealth);

        return this;
    }

    public EnrolmentQualificationsAndExperienceTab fillData() throws Exception
    {
        enterData("Academic Performance", "Previous Experience Field of research",
                "Previous Experience Research Proposal", "Prior Experience To Indigenous Health");
        return this;
    }
}