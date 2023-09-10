package apppages.applicationforms.pages;


import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.web.*;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class PartnerDetailsTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public PartnerDetailsTab(DriverObj driverObj) {
        super(driverObj);
    }

    public PartnerDetailsTab enterData(String abn, String name1, String email1, String phone1, String url1,
                                       String letterOfSupport, String annualReport, String partnerShort1 ) throws Exception {


        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Open Tab
        Link firstPartnerLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(1) Partner Details - " + partnerShort1)
                .tagName("A").build());
        click(firstPartnerLink, "First partner link");

        // Set ABN
        EditField abnEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q2115_0_Value")
                .tagName("INPUT")
                .type("text").build());
        if(isPresent(abnEditField))
              setValue(abnEditField, "abn", abn); //45004189708

        // Set Contact Name
        EditField q19140EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1914_0")
                .tagName("INPUT")
                .type("text").build());
        if(isNotPresent(q19140EditField))
            q19140EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q1688_0")
                    .tagName("INPUT")
                    .type("text").build());
        setValue(q19140EditField, "Contact Name", name1);

        // Set Email Address
        EditField q19150EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1915_0")
                .tagName("INPUT")
                .type("email").build());
        // Email
        if(isNotPresent(q19150EditField))
            q19150EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q1690_0")
                    .tagName("INPUT")
                    .type("email").build());
        setValue(q19150EditField, "Email Address", email1);

        // Set Phone
        EditField q19160EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1916_0")
                .tagName("INPUT")
                .type("text").build());

        //Phone number
        if(isNotPresent(q19160EditField))
            q19160EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q1691_0")
                    .tagName("INPUT")
                    .type("text").build());
        setValue(q19160EditField, "Phone", phone1);

        // Enter Personal Details
        EditField q213100EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q2131_0_0")
                .tagName("INPUT")
                .type("text").build());
        if(isPresent(q213100EditField))
        {
            //
            q213100EditField.setValue("Mr");

            //First name
            EditField q212800EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q2128_0_0")
                    .tagName("INPUT")
                    .type("text").build());
            q212800EditField.setValue("George");

            //Last name
            EditField q212900EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q2129_0_0")
                    .tagName("INPUT")
                    .type("text").build());
            q212900EditField.setValue("Smith");

            //Position?
            ListBox q213000ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                    .name("Q2130_0_0")
                    .tagName("SELECT").build());
            q213000ListBox.select("CI");

            //
            EditField q16570ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q1657_0_Response")
                    .tagName("TEXTAREA")
                    .type("textarea").build());
            q16570ResponseEditField.setValue("Test");

            //
            EditField q16580ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q1658_0_Response")
                    .tagName("TEXTAREA")
                    .type("textarea").build());
            q16580ResponseEditField.setValue("test");
        }

//         Upload Letter of Support
//        Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
//                .buttonType("button")
//                .name("Upload New")
//                .role("")
//                .tagName("INPUT")
//                .index(0).build());
//        waitForElement(uploadNewButton);
//        click(uploadNewButton, "letter of support");
//
//        // Call the utility class to upload file
//        AppFormsUtils appFormsUtils = new AppFormsUtils(browser, driver, reportManager);
//        appFormsUtils.uploadFile(letterOfSupport).verifyFileUploaded(0);

        // Enter Annual Report
        // Include the URL (Web link) for the Partner's most recent Annual Report
        Frame frame1 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("")
                .index(0).build());

        EditField q19200EditField = frame1.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1920_0")
                .tagName("INPUT")
                .type("text").build());

        if(isNotPresent(q19200EditField))
            q19200EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("Q1672_0")
                    .tagName("INPUT")
                    .type("text").build());
        setValue(q19200EditField, "URL for Annual Report", url1);

        // Upload Attachment
//        Button uploadNewButton1 = frame1.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
//                .buttonType("button")
//                .name("Upload New")
//                .role("")
//                .tagName("INPUT")
//                .index(1).build());
//        waitForElement(uploadNewButton1);
//        uploadNewButton1.click();

        // Call the utility class to upload file
//        appFormsUtils.uploadFile(annualReport).verifyFileUploaded(1);

        Button yesButton = getYesButton(0);
        if(isPresent(yesButton))
            click(yesButton, "Yes Button");

        Button yesButton1 = getYesButton(1);
        if(isPresent(yesButton1))
            click(getYesButton(1), "Yes Button");

        return this;
    }

    // Fill with default values
    public void fillData() throws Exception{
        enterData("45004189708", "Partner1",
                "Partner1@test.com.au", "0262345678",  "www.google.com.au",
                "", "Partner2",
                "Test");
    }

    // returns Yes Button
    private Button getYesButton(int index) throws Exception
    {
        return  browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .accessibilityName("")
                        .buttonType("")
                        .index(index)
                        .name("                        Yes        ")
                        .role("")
                        .tagName("LABEL").build());
    }
}