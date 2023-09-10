package apppages.assessment;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssessmentsPage extends BasePage {





    private WebElement openWebElement;
    private WebElement editabilityColumnHeader;
    private Button downloadAllApplicationsButton;
    private AssessmentEditPage assessmentEditPage;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AssessmentsPage(DriverObj driverObj) throws Exception {
        super(driverObj);
        initialiseFields();
    }

    private void sortByStatus() throws Exception
    {
        waitForPageToLoad();
        seleniumField(By.xpath("//div[@title='Editability']"), "Editablity Column Header").click();
        waitForPageToLoad();
    }

    private void initialiseFields() throws Exception
    {
        editabilityColumnHeader = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("Editability ")
                .tagName("SPAN").build());
        openWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("value-with-info-cell-renderer")
                .innerText("Open ")
                .tagName("DIV").build());
        downloadAllApplicationsButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("Download All Applications")
                .tagName("BUTTON").build());
        assessmentEditPage = new AssessmentEditPage(driverObj);
    }

    private boolean isAnyOpenRecordPresent() throws Exception
    {
        for (int i = 0; i<4; i++)
        {
            if (!isPresent(openWebElement))
                sortByStatus();
            else
                return true;
        }
        return false;
    }

    public void processApplications() throws Exception
    {
        downloadAllApplications();
        while (isAnyOpenRecordPresent())
        {
            click(openWebElement, "Record Link in Assessments Home Page");
            assessmentEditPage.enterData();
        }

    }

    private void downloadAllApplications() throws Exception
   {
       click(downloadAllApplicationsButton, "Download All Applications Button");
       waitForPageToLoad();
   }


}
