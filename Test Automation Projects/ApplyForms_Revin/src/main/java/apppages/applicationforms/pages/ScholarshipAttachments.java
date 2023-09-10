package apppages.applicationforms.pages;


import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ScholarshipAttachments extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ScholarshipAttachments(DriverObj driverObj) {
        super(driverObj);
    }

    public ScholarshipAttachments enterData(String fileName) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("")
                .index(0).build());

        //Open Tab
        Link scholarshipAttachmentsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Scholarship Attachments")
                .tagName("A").build());
        click(scholarshipAttachmentsLink, "Scholarship Attachments tab link");

        //click upload new button
        Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
                .buttonType("button")
                .name("Upload New")
                .role("")
                .tagName("INPUT")
                .index(0).build());
        click(uploadNewButton, "Upload New Button");

        // Upload File
        browser.getPage().sync();
        new AppFormsUtils(driverObj).uploadFile(fileName)
                                                         .verifyFileUploaded();
        return this;
    }

    public ScholarshipAttachments enterAcademicTranscriptData(String fileName) throws Exception
    {
        Frame frame2 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("")
                .index(0).build());

        // Click Upload New Button
        Button uploadNewButton1 = frame2.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("Upload New")
                .tagName("INPUT").build());
        click(uploadNewButton1, "Upload New Button");

        browser.getPage().sync();
        new AppFormsUtils(driverObj).uploadFile(fileName)
                .verifyFileUploaded();
        return this;
    }

    public void fillData() throws Exception
    {
        enterData("C:\\Users\\Tahneia\\Desktop\\GrantProposal.pdf");
        enterAcademicTranscriptData("C:\\Users\\Tahneia\\Desktop\\AcademicTranscript.pdf");
    }
}