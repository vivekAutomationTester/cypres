package apppages.admin.adminSystemSettings;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class GrantOpportunityEditPage extends BasePage {




    private Button editGOButton;
    private EditField startDateBox;
    private EditField endDateBox;
    private WebElement minimumDataWebElement;
    private EditField warningDateBox;
    private EditField minDataEndDateBox;
    private Button saveButton;
    private WebElement saveWholeGOButton;
    private Button confirmSaveButton;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public GrantOpportunityEditPage(DriverObj driverObj) {
        super(driverObj);
    }


    private void initialiseFields() throws Exception {

        startDateBox = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .accessibilityName("")
                .name("WebEdit")
                .placeholder("")
                .tagName("INPUT")
                .type("date")
                .index(0).build());

        endDateBox = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .accessibilityName("")
                .name("WebEdit")
                .placeholder("")
                .tagName("INPUT")
                .type("date")
                .index(1).build());

        minimumDataWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("MinimumData")
                .tagName("DIV").build());

        warningDateBox = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .accessibilityName("")
                .name("WebEdit")
                .placeholder("")
                .tagName("INPUT")
                .type("date")
                .index(2).build());

        minDataEndDateBox = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .accessibilityName("")
                .name("WebEdit")
                .placeholder("")
                .tagName("INPUT")
                .type("date")
                .index(3).build());

        saveButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("                                                                        Save                                ")
                .tagName("BUTTON").build());

        editGOButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .name("                                                                                                    ")
                .role("")
                .tagName("BUTTON")
                .index(0).build());

        saveWholeGOButton = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("slideout_inner")
                .innerText("Save ")
                .tagName("DIV").build());

        confirmSaveButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("Yes")
                .tagName("BUTTON").build());

    }

    public GrantOpportunityEditPage configureMinDataDates(String minDataWarningDate, String minDataDeadlineDate) throws Exception {
        // TODO: replace static values with params
        click(editGOButton, "edit GO button");
        click(minimumDataWebElement, "Minimum Data button");
        setValue(warningDateBox, "Warning Date", "2020-01-01");
        setValue(minDataEndDateBox, "End Date", "2020-01-02");
        click(saveButton, "Save changes");

        return this;
    }


    public GrantOpportunityEditPage configureStartEndDate(String startDate, String endDate) throws Exception {
        // TODO: replace static values with params
        click(editGOButton, "edit GO button");
        setValue(startDateBox, "GO start Date", "2020-01-01");
        setValue(endDateBox, "GO end dat box", "2024-01-01");
        click(saveButton, "Save button");
        return this;
    }

    public GrantOpportunityEditPage saveGOChanges() throws Exception {
        click(saveWholeGOButton, "Save entire GO button");
        click(confirmSaveButton, "Confirmation button");
        return this;
    }



}




























