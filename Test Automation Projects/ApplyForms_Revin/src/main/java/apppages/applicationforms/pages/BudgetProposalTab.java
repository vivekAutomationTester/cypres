package apppages.applicationforms.pages;

import apppages.applicationforms.utility.AppFormsUtils;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;


public class BudgetProposalTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public BudgetProposalTab(DriverObj driverObj) {
		super(driverObj);
	}

	// This method fills data using the data provided by the user
	// This is the preferred method for data driven testing
	public void enterData(String budgetProposalFile) throws Exception
	{

		// Open Link
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("")
				.index(0).build());

		Link budgetProposalThirdPartyResearchFacilitiesLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText(new RegExpProperty(".*Third Party Research Facilities"))
				.tagName("A").build());
		click(budgetProposalThirdPartyResearchFacilitiesLink, "Budget Proposal - Third Party Research Facilities Link");
		waitForPageToLoad();

		// Is this application using services provided by a research facility?
		Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("")
				.name("                        Yes        ")
				.tagName("LABEL").build());
		click(yesButton, "Yes Button");
		waitForPageToLoad();

		// Click on Upload Button
		Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("Upload New")
				.tagName("INPUT").build());
		click(uploadNewButton, "Upload Button");


		// Upload File
		waitForPageToLoad();
		new AppFormsUtils(driverObj).uploadFile(budgetProposalFile)
															.verifyFileUploaded();
		reportManager.logPass("The file: " +budgetProposalFile + " has been uploaded" );
	}

	// This method fills information using sample data
	public void fillData() throws Exception
	{
		enterData("C:\\Users\\Tahneia\\Desktop\\BudgetProposal.pdf");
	}
}