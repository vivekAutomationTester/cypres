package library.useractions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.internal.web.WebButton;
import com.hp.lft.sdk.web.*;
import config.GlobalVars;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.utility.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import com.hp.lft.verifications.Verify;
import com.paulhammant.ngwebdriver.NgWebDriver;

/**
 * The type Base page
 * This page provides the keyword library
 *
 */
public abstract class BasePage {

	/**
	 * The Report manager.
	 */
	protected ReportManager reportManager;
	/**
	 * The Driver.
	 */
	protected WebDriver driver;
	/**
	 * The Browser.
	 */
	protected Browser browser;
	/**
	 * The Angular driver.
	 */
	protected NgWebDriver angularDriver;
	/**
	 * The Driver obj.
	 */
	protected DriverObj driverObj;

	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
// Constructor
	// browser represents UFT Browser
	// driver represents Selenium Browser
	// angularDriver represents Angular Browser
	public BasePage(DriverObj driverObj)
	{
		this.driverObj = driverObj;
		this.browser = driverObj.getBrowser();
		this.driver = driverObj.getDriver();
		this.reportManager = driverObj.getReportManager();
		this.angularDriver = new NgWebDriver((JavascriptExecutor) driverObj.getDriver());
	}

	/**
	 * Wait for page to load.
	 *
	 * @throws Exception the exception
	 */
// Page Synchornisation
	protected void waitForPageToLoad() throws Exception
	{
		// Controlled by the Config file
		waitForPageToLoadComplete();
		new WaitForPageToLoad().setTimeToWait((int) GlobalVars.currentDelay/4);
		browser.waitUntilExists();
		browser.getPage().waitUntilExists();

		browser.getPage().runJavaScript("$(window).load(function() {\n" +
								"    //code\n" + "});");
		browser.sync();
		browser.getPage().sync();
	}

	/**
	 * Reload page.
	 *
	 * @throws Exception the exception
	 */
// reloads page
	// When the page is not loaded properly, you can use this method to reload the page
	protected void reloadPage() throws Exception
	{
		Thread.sleep(1000);
		browser.refresh();
		waitForPageToLoad();
		Thread.sleep(1000);
	}

	/**
	 * Selenium field selenium field.
	 *
	 * @param by               the by
	 * @param fieldDescription the field description
	 * @return the selenium field
	 */
// Allow automation of Selenium fields
	// At the moment, UFT is preferred choice to create automation code
	// Selenium only presents an opportunity to automated controls that
	// couldn't be automated by UFT
	protected SeleniumField seleniumField(By by, String fieldDescription)
	{
		return new SeleniumField(driver, reportManager, by, fieldDescription );
	}

	/**
	 * Angular field angular field.
	 *
	 * @param by               the by
	 * @param fieldDescription the field description
	 * @return the angular field
	 */
// Allows automation of Angular fields
	// At the moment, UFT is preferred choice to create automation code
	// Angular only presents an opportunity to automated controls that
	// couldn't be automated by UFT
	protected AngularField angularField(By by, String fieldDescription)
	{
		return new AngularField(driver, reportManager, by, fieldDescription );
	}

	/**
	 * Wait for element.
	 *
	 * @param <T>      the type parameter
	 * @param webField - Refers to any field object in the web application
	 * @return nothing
	 * @throws Exception usage - Waits for the fields to be present on the page, visible and enabled
	 */
	protected <T> void waitForElement(T webField) throws Exception
	{
			waitForPageToLoad();
			((TestObject) webField).waitUntilExists();
			((WaitUntilVisibleProvider) webField).waitUntilVisible();

		if((webField instanceof Button) || (webField instanceof ListBox) ||
				(webField instanceof CheckBox) || (webField instanceof EditField)
				|| (webField instanceof WebElement) )
			{
				if (!(webField instanceof WebElement))
						((WaitUntilEnabledProvider) webField).waitUntilEnabled();
				((WaitUntilVisibleProvider) webField).waitUntilVisible();
			}

			Verify.isTrue(((VisibleProvider) webField).isVisible(),
					"Verification", "Verify property: isVisible");
	}

	/**
	 * Wait and click.
	 *
	 * @param <T>      the type parameter
	 * @param webField - Refers to any field object in the web application
	 * @return nothing
	 * @throws Exception usage - Waits for the fields to be present on the page, visible and enabled and clicks on it
	 */
	protected <T> void waitAndClick(T webField) throws Exception
	{
		waitForElement(webField);
		if((webField instanceof Button))
		{
			((Button) webField).click();
			return;
		}
		if((webField instanceof ListBox))
		{
			((ListBox) webField).click();
			return;
		}

		if((webField instanceof CheckBox))
		{
			((CheckBox) webField).click();
			return;
		}

		if((webField instanceof EditField))
		{
			((EditField) webField).click();
			return;
		}

		if((webField instanceof WebElement))
		{
			((WebElement) webField).click();
			return;
		}

		if((webField instanceof Link))
		{
			((Link) webField).click();
			return;
		}
	}


	/**
	 * Click.
	 *
	 * @param <T>              the type parameter
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @throws Exception the exception
	 */
	protected <T> void click(T webField, String fieldDescription) throws Exception
	{
		waitAndClick(webField);
		reportManager.logPass("Click on " + fieldDescription);
	}

	/**
	 * Open url.
	 *
	 * @param url the url
	 * @throws Exception the exception
	 */
	protected void openUrl(String url) throws Exception {
		waitForPageToLoad();
		driver.navigate().to(url);;

		waitForPageToLoad();
	}

	/**
	 * Is not present boolean.
	 *
	 * @param <T>      the type parameter
	 * @param webField - Refers to any field object in the web application
	 * @return boolean value
	 * @throws Exception usage - returns true if the field is not present and vice versa
	 */
	protected <T> boolean isNotPresent(T webField) throws Exception {
		return isNotPresent(webField,1);
	}

	/**
	 * Is not present boolean.
	 *
	 * @param <T>           the type parameter
	 * @param webField      the web field
	 * @param secondsToWait the seconds to wait
	 * @return the boolean
	 * @throws Exception the exception
	 */
	protected <T> boolean isNotPresent(T webField, int secondsToWait) throws Exception {
		return !isPresent(webField, secondsToWait);
	}

	/**
	 * Is present boolean.
	 *
	 * @param <T>      the type parameter
	 * @param webField - Refers to any field object in the web application
	 * @return boolean value
	 * @throws Exception usage - returns true if the field is present and vice versa
	 */
	protected <T> boolean isPresent(T webField) throws Exception {
		return isPresent(webField, 1);
	}

	/**
	 * Is present boolean.
	 *
	 * @param <T>           the type parameter
	 * @param webField      the web field
	 * @param secondsToWait the seconds to wait
	 * @return the boolean
	 * @throws Exception the exception
	 */
	protected <T> boolean isPresent(T webField, int secondsToWait) throws Exception {
		waitForPageToLoad();

		for(int i=0; i<secondsToWait;i++)
			if (((TestObject) webField).exists(secondsToWait))
				return true;
			else
				Thread.sleep(1000);

		return false;
	}


	/**
	 * Is enabled boolean.
	 *
	 * @param webField - Refers to any field object in the web application
	 * @return boolean value
	 * @throws Exception usage - returns true if the field is enabled and vice versa
	 */
	protected  boolean isEnabled(WebButton webField) throws Exception {
		waitForPageToLoad();

		return webField.isEnabled();
	}

	/**
	 * Is enabled boolean.
	 *
	 * @param webField the web field
	 * @return the boolean
	 * @throws Exception the exception
	 */
	protected  boolean isEnabled(EditField webField) throws Exception {
		waitForPageToLoad();

		return webField.isEnabled();
	}


	/**
	 * Is disabled boolean.
	 *
	 * @param webField - Refers to any field object in the web application
	 * @return boolean value
	 * @throws Exception usage - returns true if the field is disabled and vice versa
	 */
// Check if the field is present
	protected boolean isDisabled(WebButton webField) throws Exception {
		waitForPageToLoad();
		return !(isEnabled(webField));
	}

	/**
	 * Is disabled boolean.
	 *
	 * @param webField the web field
	 * @return the boolean
	 * @throws Exception the exception
	 */
	protected boolean isDisabled(EditField webField) throws Exception {
		waitForPageToLoad();
		return !(isEnabled(webField));
	}


	/**
	 * Verify text.
	 *
	 * @param fieldDescription the field description
	 * @param fieldValue       the field value
	 * @param expectedValue    the expected value
	 * @return boolean value
	 * @throws Exception usage - returns true if the field contains the expected value and vice versa
	 */
	protected void verifyText(String fieldDescription, String fieldValue, String expectedValue) throws Exception
	{
		waitForPageToLoad();

			if((fieldValue.equalsIgnoreCase(expectedValue)) ||
					(fieldValue.equalsIgnoreCase(expectedValue.substring(0, fieldValue.length()))))
				reportManager.logPass("As expected, The field " + fieldDescription +
						" contains value " + fieldDescription + "as expected");
			else
				throwException_verificationFailed(fieldDescription, fieldValue, expectedValue);
	}

	// Throws Exception and reports that the field's text doesn't match the expected text
	private void throwException_verificationFailed(String fieldDescription, String fieldValue,
												   String expectedValue) throws Exception {
		throw new Exception("The field " + fieldDescription +
				" contains value " + fieldValue + " instead of " + expectedValue);
	}

	/**
	 * Verify text.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param expectedValue    the expected value
	 * @throws Exception the exception
	 */
// Verifies the value present in the field of type EditField against the expected value
	protected  void verifyText(EditField webField, String fieldDescription, String expectedValue) throws Exception {
		waitForElement(webField);

		if (webField.getValue().equalsIgnoreCase(expectedValue))
			reportManager.logPass("As expected, the " + fieldDescription + " contains the value: " +  expectedValue );
		else
			throwException_verificationFailed(fieldDescription, webField.getValue(), expectedValue);
	}


	/**
	 * Verify text.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Verifies the value present in the field of type WebElement against the expected value
	protected void verifyText(WebElement webField, String fieldDescription, String textValue) throws Exception {
		// TODO Auto-generated method stub
		waitForElement(webField);

		if (webField.getVisibleText().trim().equalsIgnoreCase(textValue.trim()))
			reportManager.logPass("As expected, the " + fieldDescription + " contains the value: " +  textValue );
		else
			throwException_verificationFailed(fieldDescription, webField.getInnerText(), textValue);
	}

	/**
	 * Verify text.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Verifies the value present in the field of type NumericField against the expected value
	protected  void verifyText(NumericField webField, String fieldDescription, String textValue) throws Exception
	{
		waitForElement(webField);

		if (webField.getValue().equals(textValue))
			reportManager.logPass("As expected, the " + fieldDescription + " contains the value: " +  textValue );
		else
			throwException_verificationFailed(fieldDescription, webField.getValue(), textValue);
	}

	/**
	 * Verify text.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Verifies the value present in the selected radio button against the expected value
	protected  void verifyText(RadioGroup webField, String fieldDescription, String textValue) throws Exception
	{
		waitForElement(webField);

		if (webField.getSelectedItem().toLowerCase().equals(textValue.toLowerCase()))
			reportManager.logPass("As expected, the " + fieldDescription + " contains the value: " +  textValue );
		else
			throwException_verificationFailed(fieldDescription, webField.getSelectedItem(), textValue);

	}

	/**
	 * Verify text.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Verifies the value present in the selected radio button against the expected value
	protected  void verifyText(ListBox webField, String fieldDescription, String textValue) throws Exception
	{
		waitForElement(webField);
		if ( webField.getVisibleText().toLowerCase().equals(textValue.toLowerCase()))
			reportManager.logPass("As expected, the " + fieldDescription + " contains the value: " +  textValue );
		else
			throwException_verificationFailed(fieldDescription, webField.getVisibleText(), textValue);

	}

	/**
	 * Verify if present.
	 *
	 * @param webElement       the web element
	 * @param fieldDescription the field description
	 * @throws Exception the exception
	 */
// Verify if the field is present
	protected void verifyIfPresent(WebElement webElement, String fieldDescription) throws Exception
	{
		waitForElement(webElement);

		if (webElement.isVisible())
			reportManager.logPass("As expected, the " + fieldDescription + " is present" );
		else
			throw new Exception("The " + fieldDescription + " is not present in the page");
	}

	/**
	 * Verify checked.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param isFieldChecked   the is field checked
	 * @throws Exception the exception
	 */
// Checks if the checkbox is checked
	protected  void verifyChecked(CheckBox webField, String fieldDescription, String isFieldChecked) throws Exception {
		waitForElement(webField);
		boolean	isChecked = Boolean.parseBoolean(isFieldChecked);
		if (webField.isChecked() == isChecked)
			if(isChecked)
				reportManager.logPass("As expected, the " + fieldDescription + " is checked ");
			else
				reportManager.logPass("As expected, the " + fieldDescription + " is unchecked ");
		else
			if(isChecked)
				throw new Exception(" The " + fieldDescription + " is unchecked instead of checked");
			else
				throw new Exception(" The " + fieldDescription + " is checked instead of unchecked");

	}

	// Checks if text value is blank
	private boolean isNotBlank(String textValue)
	{
		return !textValue.equals("");
	}

	/**
	 * Sets value.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Types the value into the text field
	protected void setValue(EditField webField, String fieldDescription, String textValue) throws Exception {
		// Add Text Box as Suffix if the fieldDescription doesn't contain textbox
		if(!(fieldDescription.toLowerCase().contains("textbox") || fieldDescription.toLowerCase().contains("text box")))
			fieldDescription = fieldDescription + " Text Box";

		if (isNotBlank(textValue))
		{
			waitForPageToLoad();
			waitForElement(webField);

			webField.setValue(textValue);
			reportManager.logPass("Enter " + textValue + " in the " +fieldDescription);
		}
	}

	/**
	 * Sets value.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param keys             the keys
	 * @throws Exception the exception
	 */
// Types the value into the text field
	protected void setValue(EditField webField, String fieldDescription, Keys keys) throws Exception {
		// Add Text Box as Suffix if the fieldDescription doesn't contain textbox
		if(!(fieldDescription.toLowerCase().contains("textbox") || fieldDescription.toLowerCase().contains("text box")))
			fieldDescription = fieldDescription + " Text Box";

			waitForPageToLoad();
			waitForElement(webField);
			webField.setValue(String.valueOf(keys));
			reportManager.logPass("Press " + keys + " in the " +fieldDescription);

	}


	/**
	 * Sets value.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Types the value into the text field
	protected void setValue(NumericField webField, String fieldDescription, String textValue) throws Exception {
		if (isNotBlank(textValue))
		{
			waitForPageToLoad();
			waitForElement(webField);
			webField.setValue(textValue);
			reportManager.logPass("Enter " + textValue + " in the " +fieldDescription );
		}
	}

	/**
	 * Check.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param booleanFlag      the boolean flag
	 * @throws Exception the exception
	 */
// checks the field
	protected void check(CheckBox webField, String fieldDescription, String booleanFlag) throws Exception {
		check(webField, fieldDescription, Boolean.parseBoolean(booleanFlag));
	}

	/**
	 * Check.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param booleanFlag      the boolean flag
	 * @throws Exception the exception
	 */
// checks the field
	protected void check(CheckBox webField, String fieldDescription, Boolean booleanFlag) throws Exception {
		waitForElement(webField);
		if(!(fieldDescription.toLowerCase().contains("checkbox") || fieldDescription.toLowerCase().contains("check box")))
			fieldDescription = fieldDescription + " Check box";
		if (booleanFlag)
		{
			if (!webField.isChecked())
					webField.click();

			reportManager.logPass("Check the " + fieldDescription);
		}
		else{
			if (webField.isChecked())
				webField.click();
			reportManager.logPass("Uncheck the " + fieldDescription);
		}
	}

	/**
	 * Select index.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param indexValue       the index value
	 * @throws Exception the exception
	 */
// Select value based on the position of text
	protected void selectIndex(ListBox webField, String fieldDescription, int indexValue) throws Exception {
			waitForElement(webField);
			webField.select(indexValue);
			reportManager.logPass("Select "+ webField.getVisibleText()
					+ " in the " +fieldDescription + "Listbox" );
	}

	/**
	 * Select text.
	 *
	 * @param webField         the web field
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Selects the provided text
	protected void selectText(ListBox webField, String fieldDescription, String textValue) throws Exception {
			waitForElement(webField);
			webField.select(textValue);
			reportManager.logPass("Select "+ textValue + " in the " +fieldDescription + "Listbox" );
	}

	/**
	 * Select random value.
	 *
	 * @param listBox          the list box
	 * @param fieldDescription the field description
	 * @throws Exception the exception
	 */
// Select a random Text
	public void selectRandomValue(ListBox listBox, String fieldDescription) throws Exception
	{
		// Find information present in the listbox
		waitForElement(listBox);
		int max = listBox.getVisibleItemsCount();
		int min = 1;
		int listIndex = (int)(Math.random() * (max - min + 1) + min);

		// Select a random value
		selectIndex(listBox,fieldDescription,  listIndex);
	}

	/**
	 * Select some text.
	 *
	 * @param listBox          the list box
	 * @param fieldDescription the field description
	 * @param textValue        the text value
	 * @throws Exception the exception
	 */
// Selects the provided text
	// If the text is present
	// If not, select the first value
	protected void selectSomeText(ListBox listBox, String fieldDescription, String textValue) throws Exception {
		waitForElement(listBox);
		if(listBox.getItems().contains(textValue))
			selectText(listBox, fieldDescription, textValue);
		else
			selectIndex(listBox, fieldDescription, 1);
	}


	/**
	 * Paste from clipboard.
	 *
	 * @param textValueString the text value string
	 * @throws AWTException the awt exception
	 */
// Experimental Feature - not tested properly
	// sends key strokes using information from clipboard
	protected void pasteFromClipboard(String textValueString) throws AWTException {

		StringSelection stringSelection = new StringSelection(textValueString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

	// Selenium
	// Implements Non Synchronous wait - Experimental Feature
	// Wait for page to complete
	private void waitForPageToLoadComplete()
	{

		WebDriverWait wait = new WebDriverWait(driver, GlobalVars.currentTimeout);

		Predicate<WebDriver> pageLoaded =
				input -> ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
		pageLoaded.apply(driver);
		wait.until(pageLoaded);
		angularDriver.waitForAngularRequestsToFinish();


	}


	// Experimental Feature
	// Send the text as key strokes
	private void typeText(String textValue) throws AWTException
	{
		Robot robot = new Robot();
		robot.delay(250);
		switch (textValue.toLowerCase()) {
			case "d":
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				break;
			case "e":
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				break;
			case "f":
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				break;
			case "p":
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				break;
			case "R":
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				break;
			case "s":
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				break;
			case "T":
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				break;
			case ".":
				robot.keyPress(KeyEvent.VK_PERIOD);
				robot.keyRelease(KeyEvent.VK_PERIOD);
				break;

			default:
				break;
		}
	}

	/**
	 * Take screenshot string.
	 *
	 * @return the string
	 */
// Takes screenshot
	// Use Selenium to take screenshot
	protected String takeScreenshot()
	{
		return new Screenshot(driver).takeScreenshot((reportManager.getExtentReportDirectory()+"\\"),
				"Pass ");
	}




}
