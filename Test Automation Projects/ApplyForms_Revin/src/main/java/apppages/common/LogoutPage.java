package apppages.common;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;
import com.hp.lft.sdk.web.Menu;
import com.hp.lft.sdk.web.MenuDescription;
import com.hp.lft.verifications.Verify;

public class LogoutPage extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public LogoutPage(DriverObj driverObj) {
		super(driverObj);
	}

	public void signout() throws Exception {
		Frame frame2 = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());
		Menu siteMenuMenu = browser.describe(Menu.class, new MenuDescription.Builder()
				.tagName("UL").build());
		Link signOutLink = browser.describe(Link.class, new LinkDescription.Builder()
				.innerText("Sign out")
				.role("menuitem")
				.tagName("A").build());
		click(signOutLink, "Sign out link");

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.name("").build());
		EditField userNameEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("UserName")
				.tagName("INPUT")
				.type("text").build());
		Verify.isTrue(userNameEditField.isVisible(), "Verification", "Verify property: isVisible");

		browser.closeAllTabs();

	}
}