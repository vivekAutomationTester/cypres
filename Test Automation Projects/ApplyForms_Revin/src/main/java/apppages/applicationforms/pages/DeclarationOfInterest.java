package apppages.applicationforms.pages;


import apppages.applicationforms.utility.AppFormsUtils;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;



public class DeclarationOfInterest extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public DeclarationOfInterest(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData(String fileName) throws Exception
	{

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Open Declaration of Interest Tab
		Link declarationOfInterestLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Declaration of Interest")
				.tagName("A").build());
		click(declarationOfInterestLink, "declarationOfInterestLink");
		waitForPageToLoad();

		// Click on Yes Button
		Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("")
				.name("                        Yes        ")
				.tagName("LABEL").build());
		click(yesButton, "yesButton");
		waitForPageToLoad();

		// Click on Upload New Button
		Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("Upload New")
				.tagName("INPUT").build());
		click(uploadNewButton, "uploadNewButton");

		//Upload File
		new AppFormsUtils(driverObj)
				                                         .uploadFile(fileName)
				                                         .verifyFileUploaded(0);
		reportManager.logPass("The following file is uploaded: " + fileName );
	}
	public void fillData() throws Exception
	{
		enterData("C:\\Users\\Tahneia\\Desktop\\DeclarationOfInterest.pdf");
	}
}