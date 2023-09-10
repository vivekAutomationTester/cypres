package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class SynergyTrackRecordTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public SynergyTrackRecordTab(DriverObj driverObj) {
        super(driverObj);
    }

    public SynergyTrackRecordTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("")
                .name("                        Yes        ")
                .tagName("LABEL").build());
        click(yesButton, "Yes button");

        EditField q15740EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1574_.*"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q15740EditField, "date", "01/02/2020");

        Button yesButton1 = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("")
                .name("                        Yes        ")
                .role("")
                .tagName("LABEL")
                .index(1).build());
        click(yesButton1, "yes button");

        EditField q149600ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1496_0_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q149600ResponseEditField, "Publication 1", "Publication 1 CI");

        EditField q149610ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1496_1_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q149610ResponseEditField, "Publication 2", "Publication 2 CI");

        EditField q149620ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1496_2_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q149620ResponseEditField, "Publication 3", "Publication 3 CI");

        EditField q149630ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1496_3_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q149630ResponseEditField, "Publication 4", "Publication 4 CI");

        EditField q149640ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1496_4_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q149640ResponseEditField, "Publication 5", "Publication 5 CI");

        EditField q16740ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1674_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q16740ResponseEditField, "Explain why publications have been selected", "Explain why publications have been selected CI");

        CheckBox q15140A2096CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*-A2096"))
                .tagName("INPUT")
                .type("checkbox").build());
        check(q15140A2096CheckBox,  "Check Box", true);


        CheckBox q15140A2098CheckBox = frame.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name(new RegExpProperty(".*-A2098"))
                .tagName("INPUT")
                .type("checkbox").build());
        check(q15140A2098CheckBox,  "Check Box", true);

        EditField q14990ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1499_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q14990ResponseEditField, "Reach and significance of research impact", "Reach and significance of research impact CI");

        EditField q15000ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1500_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q15000ResponseEditField, "Research program's contribution to research impact", "Research program's contribution to research impact CI");

        EditField q15010ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1501_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q15010ResponseEditField, "Applicant's contribution to the research program", "Applicant's contribution to the research program CI");

        EditField q15020ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1502_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q15020ResponseEditField, "Research Mentoring", "Research Mentoring CI");

        EditField q15030ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1503_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q15030ResponseEditField, "Research policy and professional leadership", "Research policy and professional leadership CI");

        EditField q15040ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1504_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q15040ResponseEditField, "Institutional leadership", "Institutional leadership CI");

        EditField q15050ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q1505_.*"))
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q15050ResponseEditField, "Research programs and team leadership", "Research programs and team leadership CI");

        return this;
    }

    public SynergyTrackRecordTab ciaData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link trackRecordForCIALink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(1) Track Record for CIA")
                .tagName("A").build());
        click(trackRecordForCIALink, "Link");

        enterData();

        return this;
    }

    public SynergyTrackRecordTab cibData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link trackRecordForCIBLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(2) Track Record for CIB")
                .tagName("A").build());
        click(trackRecordForCIBLink, "Link");
        enterData();

        return this;
    }

    public SynergyTrackRecordTab cicData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link trackRecordForCICLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(3) Track Record for CIC")
                .tagName("A").build());
        click(trackRecordForCICLink, "Link");

        enterData();

        return this;
    }

    public SynergyTrackRecordTab cidData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link trackRecordForCIDLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(4) Track Record for CID")
                .tagName("A").build());
        click(trackRecordForCIDLink, "Link");

        enterData();

        return this;
    }

    public SynergyTrackRecordTab cieData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link trackRecordForCIELink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(5) Track Record for CIE")
                .tagName("A").build());
        click(trackRecordForCIELink, "Link");

        enterData();

        return this;
    }

    public SynergyTrackRecordTab cifData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link trackRecordForCIFLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("(6) Track Record for CIF")
                .tagName("A").build());
        click(trackRecordForCIFLink, "Link");

        enterData();

        return this;
    }

//    public SynergyTrackRecordTab cigData() throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//        Link trackRecordForCIGLink = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText("(7) Track Record for CIG")
//                .tagName("A").build());
//        click(trackRecordForCIGLink, "Link");
//
//        enterData();
//
//        return this;
//    }

//    public SynergyTrackRecordTab cihData() throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//        Link trackRecordForCIHLink = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText("(8) Track Record for CIH")
//                .tagName("A").build());
//        click(trackRecordForCIHLink, "Link");
//
//        enterData();
//
//        return this;
//    }

//    public SynergyTrackRecordTab ciiData() throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//        Link trackRecordForCIILink = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText("(9) Track Record for CII")
//                .tagName("A").build());
//        click(trackRecordForCIILink, "Link");
//
//        enterData();
//
//        return this;
//    }

//    public SynergyTrackRecordTab cijData() throws Exception
//    {
//        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
//                .id("FormFrame")
//                .name("").build());
//        Link trackRecordForCIJLink = frame.describe(Link.class, new LinkDescription.Builder()
//                .innerText("(10) Track Record for CIJ")
//                .tagName("A").build());
//        click(trackRecordForCIJLink, "Link");
//
//        enterData();
//
//        return this;
//    }

    public SynergyTrackRecordTab fillData() throws Exception
    {
        ciaData();
        cibData();
        cicData();
        cidData();
        cieData();
        cifData();
//        cigData();
//        cihData();
//        ciiData();
//        cijData();

        return this;
    }

}