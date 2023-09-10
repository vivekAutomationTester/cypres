package apppages.common;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Menu;
import com.hp.lft.sdk.web.MenuDescription;

public class HomePage extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public HomePage(DriverObj driverObj) {
		super(driverObj);
	}

	public HomePage openApplicationsPage() throws GeneralLeanFtException
	{
		Menu siteMenuMenu = browser.describe(Menu.class, new MenuDescription.Builder()
				.tagName("UL").build());
		siteMenuMenu.select("Applications");
		return this;
	}

	public HomePage openAssessmentsPage() throws Exception
	{
		String url = "https://pre-prod.sensuris.com/assessments";
		driver.navigate().to(url);
		waitForPageToLoad();
		return this;
	}

	public void openProfilePage() throws Exception {

		waitForPageToLoad();
		Menu siteMenuMenu = browser.describe(Menu.class, new MenuDescription.Builder()
				.tagName("UL").build());
		siteMenuMenu.select("Profile");
		waitForPageToLoad();
	}

}