package apppages.applicationforms.utility;


import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import library.utility.Utility;
import org.openqa.selenium.WebDriver;


public class AppFormsUtils extends BasePage {

    private String fileName = "";

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AppFormsUtils(DriverObj driverObj) {
        super(driverObj);
    }

    // This functionality is deisgned only for the application forms
    // This can't be

    public AppFormsUtils uploadFile(String fileName) throws Exception
    {

        browser.getPage().sync();
        getFilePath(fileName);
        uploadThis(getFilePath(fileName));
        reportManager.logPass("The file: " +fileName + " has been uploaded" );
        clickStartUploadButton();
        return this;
    }

    private void uploadThis(String fileName) throws Exception {

        Frame frame1 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("")
                .name("")
                .index(0).build());


        FileField filesFileField = frame1.describe(FileField.class, new FileFieldDescription.Builder()
                .name("files[]")
                .tagName("INPUT").build());
        try {
            filesFileField.setValue(fileName);
        } catch (Exception e) {
            Dialog openDialog = Desktop.describe(Dialog.class, new DialogDescription.Builder()
                    .childWindow(false)
                    .ownedWindow(true)
                    .nativeClass("#32770")
                    .text("Open").build());

            // Button type from UFT Win class
            com.hp.lft.sdk.stdwin.EditField
                    fileNameEditField =
                    openDialog.describe(com.hp.lft.sdk.stdwin.EditField.class, new com.hp.lft.sdk.stdwin.EditFieldDescription.Builder()
                            .attachedText("File &name:")
                            .nativeClass("Edit").build());
            fileNameEditField.setText(fileName);

            com.hp.lft.sdk.stdwin.Button
                    openButton =
                    openDialog.describe(com.hp.lft.sdk.stdwin.Button.class, new com.hp.lft.sdk.stdwin.ButtonDescription.Builder()
                            .nativeClass("Button")
                            .text("&Open").build());
            openButton.click();

            reportManager.logPass(" The file " + fileName + " has been uploaded successfully");

        }
    }

    // The default method verifies that the file has been modified
    // If there is only one upload functionality in that page, use this
    public void verifyFileUploaded() throws Exception
    {
        verifyFileUploaded(0);
    }

    // If there is multiple upload functionalities in that page, use this
    // Specify the number by using index
    public void verifyFileUploaded(int messageIndexInPage) throws Exception
    {
        Frame frame1 = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link clearContentSelectionLink = frame1.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .index(messageIndexInPage)
                .innerText("Clear content selection")
                .role("")
                .tagName("A").build());
        waitForElement(clearContentSelectionLink);
    }


    private	void clickStartUploadButton() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("")
                .name("")
                .index(0).build());
        Button startUploadButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("Start upload")
                .tagName("BUTTON").build());
        waitForElement(startUploadButton);
        startUploadButton.click();
    }


    // If the file is found, upload it
    // If not, upload the test.pdf file from desktop
    private String getFilePath(String fileName) {
        this.fileName = fileName;
        if (new Utility().isFound(fileName))
            return fileName;
        else
            return "apply/GrantProposal.pdf";
    }

}
