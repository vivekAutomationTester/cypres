package apppages.common;

import com.hp.lft.sdk.RegExpProperty;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;

public class ApplicationsPage extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ApplicationsPage(DriverObj driverObj) {
		super(driverObj);
	}

	public ApplicationsPage createNewApplication(String applicationType) throws Exception
	{
		clickOnNewApplicationButton();
		reportManager.logPass("Click on the Link to create new application");

		clickNewApplicationLink(applicationType);
		return this;
		
	}
	
	public ApplicationsPage setApplicationName(String applicationName) throws GeneralLeanFtException
	{
		
		EditField titleEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Title")
				.placeholder("")
				.tagName("INPUT")
				.type("text").build());
		titleEditField.setValue(applicationName);
		
		Button doneButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.name("Done")
				.tagName("BUTTON").build());
		doneButton.click();
		return this;
		
	}

	private void clickOnNewApplicationButton() throws Exception
	{
		Button newApplicationButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("button")
				.name("New application")
				.role("")
				.tagName("BUTTON")
				.index(0).build());
		waitForElement(newApplicationButton);
		newApplicationButton.click();
	}
	
	private void clickNewApplicationLink(String goName) throws Exception
	{
		Link appLink = getApplicationLink(goName);
		if(isPresent(appLink))
			click(appLink, goName + " link");
		else
			throw new Exception("The " + goName +
					" is not present in the list of options");
	}

	private Link getApplicationLink(String goName) throws Exception
	{
		Link applicationLink =  browser.describe(Link.class, new LinkDescription.Builder()
				.innerText(new RegExpProperty(".*" + goName + ".*"))
				.tagName("A").build());
		return applicationLink;
	}

	public void highlightApplication(String applicationName) throws Exception
	{
		clickOnNewApplicationButton();
		Link appLink = getApplicationLink(applicationName);
		waitForElement(appLink);
		for(int i=0; i<=3; i++)
			appLink.highlight();

	}

}