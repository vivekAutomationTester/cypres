package apppages.applicationforms.pages;

import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;


public class FundingPartners extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public FundingPartners(DriverObj driverObj) {
		super(driverObj);
	}

	public FundingPartners enterData(String healthAboriginalDeptInitiative, String fileName) throws Exception
	{

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Open Funding Partners Tab
		Link fundingPartnersLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Funding Partners")
				.tagName("A").build());
		click(fundingPartnersLink, "Funding Partners Link");

		// Department of Health Aboriginal and Torres Strait Islander Special Initiative FASD and Obesity Prevention
		// if yes, click on yes button
		if(Boolean.parseBoolean(healthAboriginalDeptInitiative))
		{
			// Click on Yes Button
			Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
					.buttonType("")
					.name("                        Yes        ")
					.tagName("LABEL").build());
			click(yesButton, "Yes Button");

			// Click Upload New Button
			Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
					.buttonType("button")
					.name("Upload New")
					.tagName("INPUT").build());
			click(uploadNewButton, "Upload new button");

			// Upload File
			new AppFormsUtils(driverObj)
															 .uploadFile(fileName)
															 .verifyFileUploaded();
		}
		else
			// Click on No Button
		{
			Button noButton = frame.describe(Button.class, new ButtonDescription.Builder()
					.buttonType("")
					.name("                        No        ")
					.tagName("LABEL").build());
			click(noButton, "No Button");
		}

		return this;
	}

	public void fillData() throws Exception
	{
		enterData("TRUE", "C:\\Users\\Tahneia\\Desktop\\FundingPartners.pdf");
	}
}