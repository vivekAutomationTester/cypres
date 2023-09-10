package apppages.applicationforms.pages;


import apppages.applicationforms.utility.AppFormsUtils;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;
import com.hp.lft.sdk.web.ListBox;
import com.hp.lft.sdk.web.ListBoxDescription;
import com.hp.lft.sdk.web.RadioGroup;
import com.hp.lft.sdk.web.RadioGroupDescription;


public class EAsiaSpecificInfo extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public EAsiaSpecificInfo(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData(String healthResearch, String item2, String item3, String item4, String fileName) throws Exception {

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Enter Health Research
		ListBox q1864ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name("Q1864")
				.tagName("SELECT").build());
		selectText(q1864ListBox,"Health Research",  healthResearch);

		// Enter ??
		RadioGroup q1866RadioGroup = frame.describe(RadioGroup.class, new RadioGroupDescription.Builder()
				.name("Q1866")
				.tagName("INPUT").build());
		waitForElement(q1866RadioGroup);
		q1866RadioGroup.select(item2);

		// Enter ??
		ListBox q1867ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name("Q1867")
				.tagName("SELECT").build());
		waitForElement(q1867ListBox);
		q1867ListBox.select(item3);

		// Enter ??
		EditField q1869ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q1869_Response")
				.tagName("TEXTAREA")
				.type("textarea").build());
		waitForElement(q1869ResponseEditField);
		q1869ResponseEditField.setValue(item4);

		//upload file
		Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("Upload New")
				.tagName("INPUT").build());
		uploadNewButton.click();

		// Call the util class to upload file
		new AppFormsUtils(driverObj).uploadFile(fileName).verifyFileUploaded();

	}

	public void fillData() throws Exception
	{
		enterData("Health Research", "2600", "New", "test",
				"apply/BudgetProposal.pdf" );
	}

}