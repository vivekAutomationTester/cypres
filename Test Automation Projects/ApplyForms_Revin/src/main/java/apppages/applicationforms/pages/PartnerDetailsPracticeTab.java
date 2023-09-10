package apppages.applicationforms.pages;

import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.web.*;
import groovy.transform.Undefined;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class PartnerDetailsPracticeTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public PartnerDetailsPracticeTab(DriverObj driverObj) {
        super(driverObj);
    }

    public PartnerDetailsPracticeTab enterData(String partnerShort1, String contactName, String email, String phoneNumber, String annualReportURL) throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        Link partnerDetailsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(1) Partner Details - " + partnerShort1)
                .tagName("A").build());
//        partnerDetailsLink.click();
        click(partnerDetailsLink, "Partner Details Link");

        //Contact Name
        EditField q19140EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1914_0")
                .tagName("INPUT")
                .type("text").build());
        setValue(q19140EditField, "Contact Name", contactName);

        //Email
        EditField q19150EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1915_0")
                .tagName("INPUT")
                .type("email").build());
        setValue(q19150EditField, "Email", email);

        //Phone Number
        EditField q19160EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1916_0")
                .tagName("INPUT")
                .type("text").build());
        setValue(q19160EditField, "Phone Number", phoneNumber);

        Frame frame2 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("")
                .index(0).build());

        //Annual Report URL
        EditField q19200EditField = frame2.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1920_0")
                .tagName("INPUT")
                .type("text").build());
        setValue(q19200EditField, "Annual Report URL", annualReportURL);

//        filesFileField.setValue("PartnerDetailsAnnualReport.pdf");
//
//        startUploadButton.click();

        Button yesButton = frame2.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .tagName("LABEL").build());
        click(yesButton, "yes Button");


        return this;
    }

    public PartnerDetailsPracticeTab enterLetterOfSupportData(String fileName) throws Exception
    {
        Frame frame1 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("")
                .name("")
                .index(0).build());

        //Upload new button
        Button uploadNewButton = frame1.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
                .buttonType("button")
                .name("Upload New")
                .role("")
                .tagName("INPUT")
                .index(0).build());
        click(uploadNewButton, "Upload New Button");
//        startUploadButton.click();

        browser.getPage().sync();
        new AppFormsUtils(driverObj).uploadFile(fileName)
                .verifyFileUploaded();

        return this;
    }

    public PartnerDetailsPracticeTab enterAnnualReportData(String fileName) throws Exception
    {
        Frame frame2 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("")
                .index(0).build());

        //Upload new button
        Button uploadNewButton1 = frame2.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("Upload New")
                .tagName("INPUT").build());
        click(uploadNewButton1, "Upload new button");

        browser.getPage().sync();
        new AppFormsUtils(driverObj).uploadFile(fileName)
                .verifyFileUploaded();

        return this;
    }

    public PartnerDetailsPracticeTab fillData() throws Exception
    {
        enterData("Test","Partner1", "test2@test.com.au", "0412345678", "www.google.com.au");
        enterLetterOfSupportData("PartnerDetailsLetterOfSupport.pdf");
        enterAnnualReportData("PartnerDetailsAnnualReport.pdf");
        return this;
    }
}