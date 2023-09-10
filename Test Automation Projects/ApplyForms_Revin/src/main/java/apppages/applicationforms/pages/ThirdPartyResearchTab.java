package apppages.applicationforms.pages;

import apppages.applicationforms.utility.AppFormsUtils;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ThirdPartyResearchTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ThirdPartyResearchTab(DriverObj driverObj) {
		super(driverObj);
	}

	public ThirdPartyResearchTab enterData(String fileName) throws Exception
	{

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		//Open Tab
		Link thirdPartyResearchFacilitiesLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Third Party Research Facilities")
				.tagName("A").build());
		click(thirdPartyResearchFacilitiesLink, "Third Party Research Facilities link");

		// Click on the Yes button
		Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("")
				.name("                        Yes        ")
				.tagName("LABEL").build());
		if (isPresent(yesButton))
			click(yesButton, "yes button");

		// Upload File
		browser.getPage().sync();
		Button uploadNewButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("Upload New")
				.tagName("INPUT").build());
		click(uploadNewButton, "Upload New button");

		// Call utils class to upload file
		new AppFormsUtils(driverObj).uploadFile(fileName)
														 .verifyFileUploaded();
		return this;
	}

	public void fillData() throws Exception {
		enterData("C:\\Users\\Tahneia\\Desktop\\ThirdPartyResearchFacilities.pdf");
//		apply/ThirdPartyResearchFacilities.pdf
	}
}