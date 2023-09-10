package apppages.applicationforms.pages;


import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.RegExpProperty;

import java.lang.annotation.Documented;
import java.sql.Connection;

// updated check boxes to only check if present, as some forms do not include check boxes


public class EthicsTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public EthicsTab(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData() throws Exception {

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Click on Ethics Tab Link
		Link ethicsLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Ethics")
				.tagName("A").build());
		click(ethicsLink, "Ethics Tab Link");

		// Does this research proposal require submission to a human research ethics committee or other ethics review process for human research? *
		// Click on No Button
		waitForPageToLoad();

		// No button
		Button noButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                        No        ")
				.role("")
				.tagName("LABEL")
				.index(0).build());
		click(noButton, "no button");

		// No button 1
		Button noButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                        No        ")
				.role("")
				.tagName("LABEL")
				.index(1).build());
		click(noButton1, "no button");

		// No button 2
		Button noButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                        No        ")
				.role("")
				.tagName("LABEL")
				.index(2).build());
		click(noButton2, "no button");

		// No button 3
		Button noButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                        No        ")
				.role("")
				.tagName("LABEL")
				.index(3).build());
		click(noButton3, "no button");


//		Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("")
//				.name("                        Yes        ")
//				.role("")
//				.tagName("LABEL")
//				.index(0).build());
//		click(yesButton1, "Yes Button");
//
//		//Research Involving Stem Cells
//		// Click on Yes Button
//		waitForPageToLoad();
//		Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("")
//				.name("                        Yes        ")
//				.role("")
//				.tagName("LABEL")
//				.index(1).build());
//		click(yesButton2, "No Button");
//		waitForPageToLoad();
//
//		// Human stem cells used
//		// The Adult stem cells checkbox is checked
//
//		CheckBox adultStemCellsCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
//				.name(new RegExpProperty(".*Q22-A33"))
//				.tagName("INPUT")
//				.type("checkbox").build());
//
//		if(isPresent(adultStemCellsCheckBox)) {
////			waitForElement(adultStemCellsCheckBox);
//			adultStemCellsCheckBox.set(true);
//			reportManager.logPass("The Adult stem cells checkbox is checked");
//		}
//
//		// The Embryonic stem cells checkbox is checked
//		waitForPageToLoad();
//		CheckBox embryonicStemCellsCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
//				.name(new RegExpProperty(".*Q22-A34"))
//				.tagName("INPUT")
//				.type("checkbox").build());
//
//		if(isPresent(embryonicStemCellsCheckBox))
//		{
//			embryonicStemCellsCheckBox.set(true);
//			reportManager.logPass("The Embryonic stem cells checkbox is checked");
//		}
//
//		// Does this research proposal require submission to an animal ethics committee? *
//		// Click on No Button
//		waitForPageToLoad();
//		Button noButton = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("")
//				.name("                        No        ")
//				.role("")
//				.tagName("LABEL")
//				.index(2).build());
//		click(noButton, "No Button");
//		waitForPageToLoad();
//
//		// Does this program involve organisms being genetically manipulated such that they fall under current guidelines issued by the Office of the Gene Technology Regulator? *
//		// Click on Yes Button
//		Button yesButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("")
//				.name("                        Yes        ")
//				.role("")
//				.tagName("LABEL")
//				.index(3).build());
//		click(yesButton3, "Yes Button");
//		waitForPageToLoad();
//
//		// Does this program require submission to an institutional biosafety committee?
//		// Click on Yes Button
//		Button yesButton4 = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("")
//				.name("                        Yes        ")
//				.role("")
//				.tagName("LABEL")
//				.index(4).build());
//		click(yesButton4, "Yes Button");
	}
}