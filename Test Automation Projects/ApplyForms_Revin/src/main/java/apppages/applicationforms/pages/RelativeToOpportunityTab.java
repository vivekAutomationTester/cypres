package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class RelativeToOpportunityTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public RelativeToOpportunityTab(DriverObj driverObj) {
        super(driverObj);
    }

    public RelativeToOpportunityTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //relative to Opportunity Tab Link
        Link relativeToOpportunityLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Relative to Opportunity")
                .tagName("A").build());
        click(relativeToOpportunityLink, "Tab Link");

        // Yes button
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
//        if(isPresent(yesButton))
        click(yesButton, "Yes Button");

        // PhD thesis pass date
        EditField phdPassData = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1290")
                .tagName("INPUT")
                .type("text").build());
        if(isPresent(phdPassData))
        setValue(phdPassData, "PhD thesis pass date", "01/01/2020");

        //Yes button
        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        if(isPresent(yesButton1))
            click(yesButton1, "Yes Button");

        //Career Start Date
        EditField startDate = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q1_0"))
                .tagName("INPUT")
                .type("text").build());
        setValue(startDate, "Career End date", "01/02/2020");


        // Career End Date
        EditField endDate = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q3_0"))
                .tagName("INPUT")
                .type("text").build());
        if(isPresent(endDate))
            setValue(endDate, "Career End date", "01/03/2020");

        // Career Job Title
        EditField jobTitle = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q5_0"))
                .tagName("INPUT")
                .type("text").build());
        if(isPresent(jobTitle))
            setValue(jobTitle, "Career Start date", "Researcher");

        //Yes button
        Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(2).build());
        if(isPresent(yesButton2))
            click(yesButton2, "Yes Button");

        //Approximate Full-Time Equivalent Research Active Period
        EditField fullTimePeriod = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q15_0"))
                .tagName("INPUT")
                .type("text").build());
        setValue(fullTimePeriod, "Approximate Full-Time Equivalent Research Active Period", "1");

        //Research Checkbox
        CheckBox researchCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*_0-A12"))
                .tagName("INPUT")
                .type("checkbox").build());
        check(researchCheckBox, " Research Check box", true);

        //Personal Circumstances checkbox
        CheckBox personalCircumstancesCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*_0-A15"))
                .tagName("INPUT")
                .type("checkbox").build());
        check(personalCircumstancesCheckBox, " Personal Circumstances Check box", true);

        //Career context edit box
        EditField careerContext = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1352_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        if(isPresent(careerContext))
            setValue(careerContext, "Career Context","Career Context");

        //Career disruption start date
        EditField careerDisruptionStartDate = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q2_0"))
                .tagName("INPUT")
                .type("text").build());
        setValue(careerDisruptionStartDate, "Career Disruption start date", "02/04/2020");

        //Career disruption end date
        EditField careerDisruptionEndDate = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("F413e2498_4608_4f13_9e9b_c32ff726d5b4_Q3_0")
                .tagName("INPUT")
                .type("text").build());
        if(isPresent(careerDisruptionEndDate))
            setValue(careerDisruptionEndDate, "Career Disruption end date", "02/05/2020");

        //Career Disruption
        ListBox careerDisruption = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*_Q9_0"))
                .tagName("SELECT").build());
        selectIndex(careerDisruption, "Career Disruption", 1);

        //Full time equivalent of the career disruption
        EditField fullTimeEquivalent = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q12_0"))
                .tagName("INPUT")
                .type("text").build());
        setValue(fullTimeEquivalent, "Full time equivalent of the career disruption", "1");

        //Impact
        EditField impactTextBox = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q18_0_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(impactTextBox, "Impact", "Impact");

        //Additional Publication Outputs
        EditField additionalPublicationsOutput = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*_Q21_0_Response"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(additionalPublicationsOutput, "Additional Publication Outputs", "Additional Publication Outputs");

        //Yes button
        Button yesButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(3).build());
        click(yesButton3, "Yes Button");

        //Confirm eligibility checkbox
        CheckBox confirmEligibilityCheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1386-A1928"))
                .tagName("INPUT")
                .type("checkbox").build());

        if(isPresent(confirmEligibilityCheckBox))
            check(confirmEligibilityCheckBox, "Confirm eligibility check box", true);

        return this;
    }
}