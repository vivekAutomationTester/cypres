package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class StrategicPrioritiesAndFundingPartnersTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public StrategicPrioritiesAndFundingPartnersTab(DriverObj driverObj) {
        super(driverObj);
    }

    public StrategicPrioritiesAndFundingPartnersTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Strategic Priorities abd Funding Partners tab Link
        Link strategicPrioritiesAndFundingPartnersLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Strategic Priorities and Funding Partners")
                .tagName("A").build());
        click(strategicPrioritiesAndFundingPartnersLink, "Tab link");

        //Yes button
        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(0).build());
        click(yesButton, "yes button");

        //Yes button
        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        click(yesButton1, "yes button1");

        //Yes button
        Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(2).build());
        click(yesButton2, "yes button2");

        //Yes button
        Button yesButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(3).build());
        click(yesButton3, "yes button3");

        //Yes button
        Button yesButton4 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(4).build());
        click(yesButton4, "yes button4");

        //Yes button
        Button yesButton5 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(5).build());
        click(yesButton5, "yes button5");

        //Yes button
        Button yesButton6 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(6).build());
        click(yesButton6, "yes button6");

        //Yes button
        Button yesButton7 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(7).build());
        if(isPresent(yesButton7))
            click(yesButton7, "yes button7");

        //Use of Funds
        EditField q1193ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1193_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        if(isPresent(q1193ResponseEditField))
        setValue(q1193ResponseEditField, "Use of funds", "Use of Funds");

        //Australian Brain Cancer mission checkbox
        CheckBox q1229A1694CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("Q1229-A1694")
                .tagName("INPUT")
                .type("checkbox").build());
        if(isPresent(q1229A1694CheckBox))
            check(q1229A1694CheckBox, "Australian Brain Cancer Mission",true);

        //Australian Brain Cancer Mission checkbox
        CheckBox q1229A1695CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("Q1229-A1695")
                .tagName("INPUT")
                .type("checkbox").build());
        if(isPresent(q1229A1695CheckBox))
            check(q1229A1695CheckBox, "Australian Brain Cancer Mission",true);

        // checkbox
        CheckBox q1229A1834CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("Q1229-A1834")
                .tagName("INPUT")
                .type("checkbox").build());
        if(isPresent(q1229A1834CheckBox))
            check(q1229A1834CheckBox, "",true);

        //Proposed research aligns
        EditField q1255ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q1255_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        if(isPresent(q1255ResponseEditField))
            setValue(q1255ResponseEditField, "Proposed research aligns", "Proposed Research Aligns");

        //yes button
        Button yesButton8 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(8).build());
        if(isPresent(yesButton8))
            click(yesButton8, "yes button8");
        return this;
    }

}