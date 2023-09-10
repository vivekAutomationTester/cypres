package apppages.admin.adminApplicationSearch;


import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ApplicationSearchPage extends BasePage {


    private EditField webEditEditField;
    private Button findButton;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ApplicationSearchPage(DriverObj driverObj) {
        super(driverObj);
    }

    private void initialiseFields() throws GeneralLeanFtException {
        webEditEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .accessibilityName("")
                .name("WebEdit")
                .placeholder("")
                .tagName("INPUT")
                .type("text")
                .index(0).build());

        findButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("                                                                                Find                                    ")
                .tagName("BUTTON").build());

    }

    public ApplicationSearchPage searchForApplication(String applicationId) throws Exception {
        setValue(webEditEditField, "Search Field", applicationId); //TODO: replace with applicationId passed from first part of test
        click(findButton, "CLick the search button");
        return this;
    }


    //Type of status: Cancelled,
    public ApplicationSearchPage verifyApplicationStatus(String groundTruthStatus) throws Exception {

        WebElement statusWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText(groundTruthStatus)
                .tagName("TD").build());

        if (isPresent(statusWebElement)){
            reportManager.logPass("Application status is " + groundTruthStatus + " as expected");
        } else{
            reportManager.logFail("Application status was not as expected", "applicationStatusFail");
        }

        return this;
    }


}









