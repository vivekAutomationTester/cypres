package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class ResearcherTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public ResearcherTab(DriverObj driverObj) {
        super(driverObj);
    }

    public ResearcherTab enterData(String emailAddress, String categoryJustification,
                                   String workload, String salaryPreference) throws Exception
    {
        // Open Tab
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link researcherLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Researcher")
                .tagName("A").build());
        click(researcherLink, " Researcher Tab Link");

        // Email Address
        waitForPageToLoad();
        EditField contactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*ContactEmail"))
                .tagName("INPUT")
                .type("text").build());
        setValue(contactEmailEditField, "Email Address", emailAddress);

        // Set Category Level
        waitForPageToLoad();
        ListBox categoryLevelListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name("Q1157")
                .tagName("SELECT").build());
        selectIndex(categoryLevelListBox, "Category Level",1);

        // Set Category and Level applied justification
        waitForPageToLoad();
        EditField justificationEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1328_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(justificationEditField, "Category and Level applied justification", categoryJustification);
        waitForPageToLoad();

        //Is the Chief Investigator an Australian Citizen, a permanent resident of Australia, or a
        // New Zealand citizen with Special Category Visa status at the time of acceptance
        // and for the duration of the grant? *
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
        click(yesButton, "Yes Button");
        waitForPageToLoad();

        //I certify that should I spend time overseas, it will be in accordance with the guidelines
        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        click(yesButton1, "Yes Button");

        waitForPageToLoad();
        // By making this application, including the declarations in relation to salary you consent to your Administering Institution
        // providing independent evidence of this, at the request of NHMRC
        Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(2).build());
        click(yesButton2, "Yes Button");

        waitForPageToLoad();
        // Workload
        ListBox workloadListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name("Q1158")
                .tagName("SELECT").build());
        selectText(workloadListBox, "Workload ListBox",workload );

        waitForPageToLoad();
        // In accordance with Section 3.3.4 of the Investigator Grants 2021 Guidelines:
        ListBox salaryListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name("Q1271")
                .tagName("SELECT").build());
        selectText(salaryListBox, "salary ListBox",salaryPreference );
        return this;
    }

    public void fillData() throws Exception
    {
        enterData("Test2@test.com.au", "Category and Level justification", "Full time", "I am not requesting a salary.");
    }
}