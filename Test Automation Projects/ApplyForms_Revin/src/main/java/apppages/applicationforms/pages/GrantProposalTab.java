package apppages.applicationforms.pages;

import apppages.applicationforms.utility.AppFormsUtils;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;


public class GrantProposalTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public GrantProposalTab(DriverObj driverObj) {
		super(driverObj);
	}

	public GrantProposalTab enterData(String fileName) throws Exception {
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("")
				.index(0).build());

		// Open Tab
		Link grantProposalLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Grant Proposal")
				.tagName("A").build());
		click(grantProposalLink, "Grant Proposal Tab Link");

		// Click Upload New Button
		Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("Upload New")
				.tagName("INPUT").build());
		click(uploadNewButton, "Upload New Button");


		// Upload File
		browser.getPage().sync();
		new AppFormsUtils(driverObj).uploadFile(fileName)
				.verifyFileUploaded();
		return this;
	}

	public void fillData() throws Exception {
//		enterData("src/main/resources/apply/GrantProposal.pdf");
		enterData("C:\\Users\\Tahneia\\Desktop\\GrantProposal.pdf");
	}

}