package apppages.assessment;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class AssessmentEditPage extends BasePage {




    private EditField commentTextField;
    private WebElement nextWebElement;
    private Link submitLink;
    private Link backLink;

    private Link page1Link;
    private Link page2Link;
    private Link page3Link;
    private Link page4Link;
    private Button confirmButton;

    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AssessmentEditPage(DriverObj driverObj) throws GeneralLeanFtException {
        super(driverObj);
        initialiseFields();
    }


    private void initialiseFields() throws GeneralLeanFtException {

        page1Link = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("1")
                .tagName("A").build());

        page2Link = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("2")
                .tagName("A").build());

        page3Link = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("3")
                .tagName("A").build());

        page4Link = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("4")
                .tagName("A").build());

        commentTextField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("WebEdit")
                .tagName("TEXTAREA")
                .type("textarea").build());

        nextWebElement = browser.describe(WebElement.class,
                new XPathDescription("//DIV/A/SPAN[normalize-space()=\"Next\"]"));

        submitLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Submit")
                .tagName("A").build());

        backLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Back")
                .tagName("A").build());

        confirmButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("Confirm")
                .tagName("BUTTON").build());


    }

    public void enterData() throws Exception {

        do {
            enterCommentText("Lorem Ipsum");
        }
        while (isNextButtonAvailable());
    }

    private void enterCommentText(String textValue) throws Exception
    {
        setValue(commentTextField, "Comment Textbox", textValue);
    }

    private boolean isNextButtonAvailable() throws Exception
    {
        if(isPresent(nextWebElement) )
        {
            click(nextWebElement, "Next Button");
            return true;
        }
        else
        {
            click(submitLink, "Submit Button");
            click(confirmButton, "Confirm Button in the Confirmation Window");
            return false;
        }
    }


    private void openPage1() throws Exception
    {
        if(isPresent(page1Link))
              click(page1Link, "Page 1 link");
     }

    private void openPage2() throws Exception
    {
        if(isPresent(page2Link));
            click(page2Link, "Page 2 link");
    }

    private void openPage3() throws Exception
    {

        if(isPresent(page3Link))
            click(page3Link, "Page 3 link");
    }

    private void openPage4() throws Exception
    {
        if(isPresent(page4Link))
            click(page4Link, "Page 4 link");
    }


}