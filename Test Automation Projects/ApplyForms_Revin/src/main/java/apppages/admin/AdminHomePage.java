package apppages.admin;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;
import com.hp.lft.sdk.web.Menu;
import com.hp.lft.sdk.web.MenuDescription;

public class AdminHomePage extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public AdminHomePage(DriverObj driverObj) {
		super(driverObj);
	}

	public void openApprovalsPage() throws Exception {



		Menu siteMenuMenu = browser.describe(Menu.class, new MenuDescription.Builder()
				.tagName("UL").build());
		Link approvalsLink = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("Approvals ")
				.name("Approvals ")
				.tagName("A").build());
		click(approvalsLink, "");

	}
}
