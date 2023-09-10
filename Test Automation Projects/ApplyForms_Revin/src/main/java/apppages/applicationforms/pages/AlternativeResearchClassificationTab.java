package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class AlternativeResearchClassificationTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AlternativeResearchClassificationTab(DriverObj driverObj) {
        super(driverObj);
    }

    public AlternativeResearchClassificationTab enterData(String broadResearchArea, String researchField, String peerReviewArea1, String researchKeyword1, String researchKeyword2, String researchKeyword3,
                                                          String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
                                                          String level3) throws Exception{

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Open Research Classification Tab
        Link researchClassificationLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Research Classification")
                .tagName("A").build());
        click(researchClassificationLink, "Research Classification Tab Link");
        waitForPageToLoad();

        // Enter Broad Research
//        ListBox broadResearchListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*_Q2")) //
//                .tagName("SELECT").build());
//        selectText(broadResearchListBox, "Broad Research List box", broadResearchArea);
//        waitForPageToLoad();
//
//        //Fields of research
//        ListBox researchFieldListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*Q7_0")) //
//                .tagName("SELECT").build());
//        selectText(researchFieldListBox, "Fields of research text box", researchField);
//        waitForPageToLoad();
//
//        // Select Peer Review ListBox1
//        ListBox peerReviewListBox1 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//                .name(new RegExpProperty(".*Q1_0")) //
//                .tagName("SELECT").build());
//        selectText(peerReviewListBox1, "Peer Review ListBox1", peerReviewArea1);

//        waitForPageToLoad();

        //Broad research area
        ListBox q1371ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1371"))
                .tagName("SELECT").build());
//        selectText(q1371ListBox,"Broad research area", "Basic Science");
        selectIndex(q1371ListBox,"Broad research area",1);
        waitForPageToLoad();

        //Field of research
        ListBox q206ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q206"))
                .tagName("SELECT").build());
        selectText(q206ListBox, "Field of research", "BIOCHEMISTRY AND CELL BIOLOGY | Bioinformatics");

        //PRA
        ListBox q9050ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q905_.*"))
                .tagName("SELECT").build());
        selectText(q9050ListBox, "PRA", "Developmental Biology");

        //Research keyword 1
        EditField q719EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q719"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q719EditField, "Research keyword 1", researchKeyword1);

        //Research keyword 2
        EditField q716EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q716"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q716EditField, "Research keyword 2", researchKeyword2);

        //Research keyword 3
        EditField q713EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q713"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q713EditField, "Research keyword 3",researchKeyword3 );

        //Research keyword 4
        EditField q710EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q710"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q710EditField, "Research keyword 4", researchKeyword4);

        //Research keyword 5
        EditField q97EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q97"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q97EditField, "Research keyword 5", researchKeyword5);

        // burden of disease
        EditField q830EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q83_0"))
                .tagName("INPUT")
                .type("text").build());
        setValue(q830EditField, "burden of disease", burdenOfDiseases);

        // level 1
        ListBox q15080ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1508_0"))
                .tagName("SELECT").build());
        selectText(q15080ListBox, "Level 1", level1 );

        // level 2
        ListBox q15090ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1509_0"))
                .tagName("SELECT").build());
        selectText(q15090ListBox, "Level 2", level2);

        // level 3
        ListBox q15110ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name(new RegExpProperty(".*Q1511_0"))
                .tagName("SELECT").build());
        selectText(q15110ListBox, "Level 3", level3);
        return this;
    }

}