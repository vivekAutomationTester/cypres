package apppages.applicationforms.pages;

import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class AlternativeCallSpecificInformationTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AlternativeCallSpecificInformationTab(DriverObj driverObj) {
        super(driverObj);
    }

    public AlternativeCallSpecificInformationTab enterData(String internationalApplication) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Research Classification Tab Link
        Link callSpecificInformationLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Call Specific Information")
                .tagName("A").build());
        click(callSpecificInformationLink, "Call Specific Information Link");

        // Call topic List box
        ListBox q1864ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name("Q1864")
                .tagName("SELECT").build());
        if(isPresent(q1864ListBox))
            selectIndex(q1864ListBox, "Call Topic", 1);

        //Project Budget
        EditField q1919EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1919")
                .tagName("INPUT")
                .type("text").build());
        setValue(q1919EditField, " Project Budget", "1000");

        //Project Title
        EditField q1869ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1869_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1869ResponseEditField, "Project Title", "Project Title");

        //Benefit to Australia
        EditField q1923ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1923_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q1923ResponseEditField, "Benefit to Australia", "Benefit to Australia");

        // Upload new file
        Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("button")
                .name("Upload New")
                .role("")
                .tagName("INPUT")
                .index(0).build());
        click(uploadNewButton, "upload new file button");

        new AppFormsUtils(driverObj).uploadFile(internationalApplication)
                .verifyFileUploaded();

//        filesFileField.setValue("LetterOfInvitation.pdf");

        return this;
    }
    public AlternativeCallSpecificInformationTab enterFileData(String invitationLetter) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        // Upload new file
        Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("button")
                .name("Upload New")
                .role("")
                .tagName("INPUT")
                .index(0).build());
        click(uploadNewButton, "upload new file button");

        new AppFormsUtils(driverObj).uploadFile(invitationLetter)
                .verifyFileUploaded();
        return this;
    }

    public AlternativeCallSpecificInformationTab fillData() throws Exception
    {
        enterData("C:\\Users\\Tahneia\\Desktop\\CallSpecificInformation_InternationalApplication.pdf");
        enterFileData("C:\\Users\\Tahneia\\Desktop\\CallSpecificInformation_LetterOfInvitation.pdf");

        return this;
    }
}