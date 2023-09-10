package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class FundingOrganisationsTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public FundingOrganisationsTab(DriverObj driverObj) {
        super(driverObj);
    }

    public FundingOrganisationsTab enterData() throws  Exception
    {

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Funding Organisations Tab Link
        Link fundingOrganisationsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Funding Organisations")
                .tagName("A").build());
        click(fundingOrganisationsLink, "Funding Organisations Tab Link");

        //Yes button
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .tagName("LABEL").build());
        click(yesButton, "Yes Button");


        return this;
    }
}
