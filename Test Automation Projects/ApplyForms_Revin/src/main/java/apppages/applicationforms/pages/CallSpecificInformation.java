package apppages.applicationforms.pages;


import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.GeneralReplayException;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;


public class CallSpecificInformation extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public CallSpecificInformation(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData(String projectTitle, String invitationLetter) throws Exception {

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
						.id("FormFrame")
						.name("").build());

		// Click on Call Specific Information Link
		Link callSpecificInformationLink = browser.describe(Link.class, new LinkDescription.Builder()
						.innerText("Call Specific Information")
						.tagName("A").build());
		click(callSpecificInformationLink, "Open Call Specific Information Tab");

		// Select value in Call Topic List box
		ListBox callTopicListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
						.name(new RegExpProperty(".*_Q8"))
						.tagName("SELECT").build());
		selectIndex(callTopicListBox, "Call Topic List box", 1);

		// Click on Cancer Research Radio Button
		RadioGroup cancerResearchRadioButton = browser
						.describe(RadioGroup.class, new RadioGroupDescription.Builder()
						.name(new RegExpProperty(".*_Q3.*"))
						.tagName("INPUT").build());
		if (isPresent(cancerResearchRadioButton))
			click(cancerResearchRadioButton, "Cancer Research Radio Button");

		// Enter Funding Modality
		ListBox q1867ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
						.name(new RegExpProperty(".*Q1867"))
						.tagName("SELECT").build());
//		try
//		{if
			selectIndex(q1867ListBox, "Funding Modality List box", 2);
//		}
//		catch(GeneralReplayException exception)
//		{
//			// Do nothing
//			// I am not sure that this is necessarily an error
//			// Other exceptions will break the script
//		}

		waitForPageToLoad();
		// Enter Project Title
		EditField projectTitleEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
						.name(new RegExpProperty(".*Q1869_Response"))
						.tagName("TEXTAREA")
						.type("textarea").build());
		setValue(projectTitleEditField, "Project Title", projectTitle);

		waitForPageToLoad();

		// Upload File
		Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
						.buttonType("button")
						.name("Upload New")
						.tagName("INPUT").build());
		click(uploadNewButton, "Upload New Button");

		new AppFormsUtils(driverObj).uploadFile(invitationLetter)
				                                            .verifyFileUploaded();
	}


	// Fills the form with default information
    public void fillData() throws Exception
	{
//		enterData("Project Title", "src/main/resources/apply/CallSpecificInformation_CommonApplication.pdf");
		enterData("Project Title", "C:\\Users\\Tahneia\\Desktop\\CallSpecificInformation_CommonApplication.pdf");
	}

}