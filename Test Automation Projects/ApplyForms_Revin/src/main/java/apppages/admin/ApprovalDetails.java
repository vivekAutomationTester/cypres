package apppages.admin;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;
import com.hp.lft.sdk.web.ListBox;
import com.hp.lft.sdk.web.ListBoxDescription;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;

public class ApprovalDetails extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ApprovalDetails(DriverObj driverObj) {
		super(driverObj);
	}

	public void finalise() throws Exception {
		ListBox detailsDecisionListBox = browser.describe(ListBox.class, new ListBoxDescription.Builder()
				.name("Details.Decision")
				.tagName("SELECT").build());
		selectText(detailsDecisionListBox, "detailsDecisionListBox", "Proceed with certification");

		Button saveButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name("                    Save         ")
				.tagName("BUTTON").build());
		click(saveButton, "saveButton");
		
		WebElement decisionWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.innerHTML(" Decision")
				.innerText("Decision")
				.tagName("H2").build());
		waitForElement(decisionWebElement);
		Thread.sleep(1000);
		Link approvalsLink = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("Approvals ")
				.name("Approvals ")
				.tagName("A").build());
		click(approvalsLink, "");
		
		}
	}

