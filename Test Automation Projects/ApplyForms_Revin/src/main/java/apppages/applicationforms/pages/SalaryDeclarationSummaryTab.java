package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class SalaryDeclarationSummaryTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public SalaryDeclarationSummaryTab(DriverObj driverObj) {
        super(driverObj);
    }

    public SalaryDeclarationSummaryTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Open Salary Declaration Summary Tab
        Link salaryDeclarationSummaryLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Salary Declaration Summary")
                .tagName("A").build());
        click(salaryDeclarationSummaryLink, "Salary Declaration Link");

        // Click yes button
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .tagName("LABEL").build());
        click(yesButton, "yes button");
        return this;
    }

}