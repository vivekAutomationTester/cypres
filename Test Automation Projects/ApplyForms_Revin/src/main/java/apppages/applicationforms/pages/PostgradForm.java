package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class PostgradForm extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public PostgradForm(DriverObj driverObj) {
        super(driverObj);
    }

    public PostgradForm postgradForm() throws Exception{

        Menu siteMenuMenu = browser.describe(Menu.class, new MenuDescription.Builder()
                .tagName("UL").build());
        siteMenuMenu.select("Forms");

//        Button showAdvancedFilterButton = browser.describe(Button.class, new ButtonDescription.Builder()
//                .accessibilityName("")
//                .buttonType("submit")
//                .name("")
//                .role("")
//                .tagName("BUTTON")
//                .index(0).build());
//        click(showAdvancedFilterButton, "click");
//
//        EditField webEditEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
//                .accessibilityName("")
//                .name("WebEdit")
//                .placeholder("")
//                .tagName("INPUT")
//                .type("text")
//                .index(2).build());
//        setValue(webEditEditField, "", "In Progress");

        Button showAdvancedFilter56a2dcab67c49a875de3F5ecb14763deButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .name("")
                .role("")
                .tagName("BUTTON")
                .index(0).build());
        click(showAdvancedFilter56a2dcab67c49a875de3F5ecb14763deButton, "");

//        WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
//                .className("chosen-choices")
//                .innerText("")
//                .tagName("UL").build());
//        click(webElement, "");

        WebElement inProgressWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("chosen-choices")//result-selected
                .innerText("In Progress")
                .tagName("LI").build());
        click(inProgressWebElement, "");


        return this;
    }

    public PostgradForm deleteFormPage() throws Exception
    {
        Button optionsPostgraduateScholarshipsSupervisorReportButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("      Options Postgraduate Scholarships - Supervisor Report  ")
                .tagName("BUTTON").build());
        click(optionsPostgraduateScholarshipsSupervisorReportButton, "");

        Button deleteFormDeleteFormPostgraduateScholarshipsSupervisorButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("          Delete form     Delete form Postgraduate Scholarships - Supervisor Report    ")
                .tagName("BUTTON").build());
        click(deleteFormDeleteFormPostgraduateScholarshipsSupervisorButton, "");

        Button deleteFormButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name(" Delete form")
                .tagName("BUTTON").build());
        click(deleteFormButton, "");
        return this;
    }

    public PostgradForm openFormPage() throws Exception
    {

//        webEditEditField.setValue("");

        // Click form link
        Link postgraduateScholarshipsSupervisorReportLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty(".* - Postgraduate Scholarships - Supervisor Report"))
                .tagName("A").build());
        click(postgraduateScholarshipsSupervisorReportLink, "");
        return this;
    }
}