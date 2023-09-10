package apppages.applicationforms.pages;

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


public class CertifyTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public CertifyTab(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData() throws Exception
	{
		// Open Certification Tab
		Frame frame2 = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		Link certificationLink = frame2.describe(Link.class, new LinkDescription.Builder()
				.innerText("Certification")
				.tagName("A").build());
		click(certificationLink, "Certification Link");
		waitForPageToLoad();

		// Click on Certify and submit to RAO
		Button certifyAndSubmitToRAOButton = frame2.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.name("Certify and submit to RAO")
				.tagName("INPUT").build());
		click(certifyAndSubmitToRAOButton, "Submit To RAO Button");
	}
}