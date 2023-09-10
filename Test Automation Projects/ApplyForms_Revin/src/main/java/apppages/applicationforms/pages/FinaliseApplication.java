package apppages.applicationforms.pages;


import com.hp.lft.sdk.RegExpProperty;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.CheckBox;
import com.hp.lft.sdk.web.CheckBoxDescription;
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;


public class FinaliseApplication extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public FinaliseApplication(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData() throws Exception
	{
		Frame frame2 = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Click on the download checkbox
		CheckBox webCheckBoxCheckBox = browser.describe(CheckBox.class, new CheckBoxDescription.Builder()
				.accessibilityName("")
				.name("")
				.role("")
				.tagName("INPUT")
				.type("checkbox")
				.index(0).build());
		check(webCheckBoxCheckBox, "accept download checkbox", true);

		// Click on the Next button
		Button nextButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("button")
				.name(new RegExpProperty(".*Next"))
				.tagName("BUTTON").build());

		if(isNotPresent(nextButton))
			nextButton = browser.describe(Button.class, new ButtonDescription.Builder()
					.buttonType("button")
					.name(" Next")
					.tagName("BUTTON").build());
		click(nextButton, "Next Button");

		// Click on the Close button
		Button closeButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("button")
				.name(new RegExpProperty(".*Close"))
				.role("")
				.tagName("BUTTON")
				.index(0).build());
		if(isNotPresent(closeButton))
			closeButton = browser.describe(Button.class, new ButtonDescription.Builder()
					.accessibilityName("")
					.buttonType("button")
					.index(0)
					.name("Close")
					.role("")
					.tagName("BUTTON").build());
		click(closeButton, "Close Button");
	}

}