package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.RegExpProperty;


public class StrategicPrioritiesTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public StrategicPrioritiesTab(DriverObj driverObj) {
		super(driverObj);
	}

	// Perform Data Entry
	public void enterData(String nhmrcFlag, String cancerAustraliaFlag, String flag3, String proposedUse) throws Exception {
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Open Strategic Priorities Tab
		Link strategicPrioritiesAndFundingPartnersLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText(new RegExpProperty("Strategic Priorities.*"))
				.tagName("A").build());
		waitForElement(strategicPrioritiesAndFundingPartnersLink);
		click(strategicPrioritiesAndFundingPartnersLink, "Strategic priorities and funding partners tab link");

		// Click on National Health and Medical Research Council Checkbox
		CheckBox NHMRCCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
					.name(new RegExpProperty(".*Q1-A1"))
					.tagName("INPUT")
					.type("checkbox").build());
		if (isPresent(NHMRCCheckBox))
			check(NHMRCCheckBox, "National Health and Medical Research Council Checkbox", nhmrcFlag);

		// Click on Cancer Australia and Funding Partners Checkbox
		CheckBox CAFPCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
					.name(new RegExpProperty(".*Q1-A2"))
					.tagName("INPUT")
					.type("checkbox").build());
		if (isPresent(CAFPCheckBox))
			check(CAFPCheckBox, "Cancer Australia and Funding Partners Checkbox", cancerAustraliaFlag);

		// Does the Research Proposal include a one page modified
//		if(Boolean.parseBoolean(flag3))
//		{
			// Click on Yes Button
		Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("")
				.name("                        Yes        ")
				.index(0)
				.tagName("LABEL").build());
		if(isPresent(yesButton))
			click(yesButton, "Yes Button");

		Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("")
				.name("                        Yes        ")
				.index(1)
				.tagName("LABEL").build());
		if(isPresent(yesButton1))
			click(yesButton1, "Yes Button");

		Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("")
				.name("                        Yes        ")
				.index(2)
				.tagName("LABEL").build());
		if(isPresent(yesButton2))
			click(yesButton2, "Yes Button");
//		}
//		// Outline your proposed use of the funds for travel
//		EditField proposedUseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//				.name("Q1193_Response")
//				.tagName("TEXTAREA")
//				.type("textarea").build());
//		if(isPresent(proposedUseEditField))
//			setValue(proposedUseEditField, "Proposed Use", proposedUse);


	}
	//Calls enterData method
	public void fillData() throws Exception
	{
		enterData("TRUE", "TRUE", "TRUE", "Proposed Use");
	}





















}