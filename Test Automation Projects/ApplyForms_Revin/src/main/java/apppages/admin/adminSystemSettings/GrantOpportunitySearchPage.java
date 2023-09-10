package apppages.admin.adminSystemSettings;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class GrantOpportunitySearchPage extends BasePage {



    private EditField searchBox;
    private Button searchButton;
    private Button editGOButton;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public GrantOpportunitySearchPage(DriverObj driverObj) {
        super(driverObj);
    }

    private void initialiseFields() throws GeneralLeanFtException {
        searchBox = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("WebEdit")
                .tagName("INPUT")
                .type("text").build());

        searchButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("                                                        Search                        ")
                .tagName("BUTTON").build());

        editGOButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .name("                                                                                    ")
                .role("")
                .tagName("BUTTON")
                .index(2).build());
    }


    public GrantOpportunitySearchPage enterData() throws Exception {
        // PREPROD Link: https://nhmrcomnistar3uat.f1solutions.com.au/OmniBase#system/round
        initialiseFields();

        setValue(searchBox, "Go search field", "2020 Primary Health Care Research");
        click(searchButton, "Search button");
        click(editGOButton, "edit GO button");


        return this;
    }


}









