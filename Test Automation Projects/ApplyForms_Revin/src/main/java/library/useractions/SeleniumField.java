package library.useractions;

import config.GlobalVars;
import library.reports.ReportManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * The type Selenium field.
 */
public class SeleniumField {
    private WebElement webElement;
    private ReportManager report;
    private String fieldDescription;
    private Wait<WebDriver> wait;
    private By by;
    private Actions action;
    private JavascriptExecutor executor;

    /**
     * Instantiates a new Selenium field.
     *
     * @param driver           the driver
     * @param report           the report
     * @param webElement       the web element
     * @param fieldDescription the field description
     */
    public SeleniumField(WebDriver driver, ReportManager report, WebElement webElement, String fieldDescription) {

        this.report = report;
        wait = new WebDriverWait(driver, GlobalVars.currentTimeout);
        this.webElement = webElement;
        this.fieldDescription = fieldDescription;
         action = new Actions(driver);
    }

    // This is supporting class only
    // Won't be used at the moment
    // UFT is the preferred choice to create automation code
    // Selenium is used only for synchronisation and a possible option for future development

    /**
     * Instantiates a new Selenium field.
     *
     * @param driver           the driver
     * @param report           the report
     * @param by               the by
     * @param fieldDescription the field description
     */
    public SeleniumField(WebDriver driver, ReportManager report, By by, String fieldDescription) {

        this.report = report;
        wait = new WebDriverWait(driver, GlobalVars.currentTimeout);
        this.webElement = driver.findElement(by);
        this.fieldDescription = fieldDescription;
        action = new Actions(driver);
        executor = (JavascriptExecutor)driver;
        this.by = by;
    }

    /**
     * Send keys selenium field.
     *
     * @param textValue the text value
     * @return the selenium field
     */
    public SeleniumField sendKeys(String textValue) {
        waitToBeEnabled().clear();
        webElement.sendKeys(textValue);
        report.logPass("Select " + textValue + " in the \"" + fieldDescription + "\" field");
        return this;
    }

    /**
     * Gets element.
     *
     * @param textValue the text value
     * @return the element
     */
    public WebElement getElement(String textValue) {
        return webElement;
    }

    /**
     * Clear selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField clear() {
        webElement.sendKeys("");
        return this;
    }

    /**
     * Click selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField click() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        report.logPass("Click on the \"" + fieldDescription + "\" field");
        waitToBeEnabled();
        webElement.click();
        return this;
    }

    /**
     * Js click selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField jsClick()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        report.logPass("Click on the \"" + fieldDescription + "\" field");
        waitToBeEnabled();
        executor.executeScript("arguments[0].click();", webElement);
        System.out.println("Click on the button");
        return this;
    }

    /**
     * Check selenium field.
     *
     * @param
     * @return SeleniumField Class Will check if the checkbox is checked
     */
    public SeleniumField check() {
        waitToBeEnabled();
        if (!webElement.isSelected()) {
            webElement.click();
        }
        report.logPass("Click on the \"" + fieldDescription + "\" field");
        return this;
    }


    /**
     * Select by visible text selenium field.
     *
     * @param textValue the text value
     * @return SeleniumField Class Will select the textValue in the list box
     */
    public SeleniumField selectByVisibleText(String textValue) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        report.logPass("Select " + textValue + " in the \"" + fieldDescription + "\" field");
        // shouldBeSelectable();
        new Select(webElement).selectByVisibleText(textValue);
        return this;
    }

    /**
     * Hover mouse over selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField hoverMouseOver()
    {
        action.moveToElement(webElement).perform();
        report.logPass("Hover the mouse over the " + fieldDescription + "\" field");
        return this;
    }

    /**
     * Submit form selenium field.
     *
     * @return SeleniumField class Submits the form without having to click on any button
     */
    public SeleniumField submitForm() {
        webElement.submit();
        return this;
    }

    /**
     * Wait to be visible selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField waitToBeVisible() {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return this;
    }

    /**
     * Wait to be invisible selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField waitToBeInvisible() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        return this;
    }

    /**
     * Wait to be enabled selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField waitToBeEnabled() {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return this;
    }

    /**
     * Wait to be selectable selenium field.
     *
     * @return the selenium field
     */
    public SeleniumField waitToBeSelectable() {
        wait.until(ExpectedConditions.elementToBeSelected(webElement));
        return this;
    }

    /**
     * Check if enabled boolean.
     *
     * @return the boolean
     */
    public boolean CheckIfEnabled() {
        return webElement.isEnabled();
    }

    /**
     * Check if disabled boolean.
     *
     * @return the boolean
     */
    public boolean CheckIfDisabled() {
        return !CheckIfEnabled();
    }

    /**
     * Check if present boolean.
     *
     * @return the boolean
     */
    public boolean CheckIfPresent() {
        return webElement.isDisplayed();
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return webElement.getText();
    }

    /**
     * Gets attribute.
     *
     * @param webElement    the web element
     * @param attributeName the attribute name
     * @return the attribute
     */
    public String getAttribute(WebElement webElement, String attributeName) {
        return webElement.getAttribute(attributeName);
    }

    /**
     * Should contain text selenium field.
     *
     * @param textValue the text value
     * @return the selenium field
     */
    public SeleniumField shouldContainText(String textValue) {
        wait.until(ExpectedConditions.textToBePresentInElement(by, textValue));
        return this;
    }

    /**
     * Should contain value selenium field.
     *
     * @param textValue the text value
     * @return the selenium field
     */
    public SeleniumField shouldContainValue(String textValue) {
        wait.until(ExpectedConditions.textToBePresentInElementValue(by, textValue));
        return this;
    }

}



