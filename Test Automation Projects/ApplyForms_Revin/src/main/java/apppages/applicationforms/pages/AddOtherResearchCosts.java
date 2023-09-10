package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
//import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;

public class AddOtherResearchCosts extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public AddOtherResearchCosts(DriverObj driverObj) {
        super(driverObj);
    }

    public AddOtherResearchCosts enterData(String itemName, String department, String equipmentItemName, String equipmentJustification) throws Exception {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        //Other research cost link
        Link otherResearchCostsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Other Research Costs")
                .tagName("A").build());
        waitForElement(otherResearchCostsLink);
        click(otherResearchCostsLink, "Other Research Costs tab link");


        int addOne = 0;

        // run though 2 times
        for (int i = 0; i <= 1; i++) {
            // add button
            Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                    .accessibilityName("")
                    .buttonType("submit")
                    .role("")
                    .tagName("INPUT")
                    .index(1).build());
            waitForPageToLoad();
            click(AddButton, "Plus button");
            waitForElement(AddButton);
            addOne++;
            //so addOne now equals 1

            // Item name
            EditField q17270EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q71_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(q17270EditField))
                q17270EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1727_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(q17270EditField))
                q17270EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1756_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(q17270EditField);
            if(isPresent(q17270EditField))
                setValue(q17270EditField, "Item Name", itemName + addOne);

            //Justification Text Box
            EditField q17510ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q626_.*"))
                    .tagName("TEXTAREA")
                    .index(i)
                    .type("textarea").build());
            if (isNotPresent(q17510ResponseEditField))
                q17510ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1780_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(q17510ResponseEditField))
                q17510ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1751_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(q17510ResponseEditField);
            setValue(q17510ResponseEditField, "Justification", department + addOne);
        }

        for (int i = 0; i <= 1; i++) {

            //Item 1
            EditField year1Item1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q72_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year1Item1))
                year1Item1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1757_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(year1Item1))
                year1Item1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1728_.*")) //1725??
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year1Item1);
            if (isPresent(year1Item1))
                setValue(year1Item1, "Year 1 - 10000", "10000");


            //Item 2
            EditField year2Item2 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q73_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year2Item2))
                year2Item2 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1728_.*"))
                        .tagName("INPUT")
                        .index(1)
                        .type("text").build());
            if (isNotPresent(year2Item2))
                year2Item2 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1760_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year2Item2);
            if (isPresent(year2Item2))
                setValue(year2Item2, "Year 2 - 10000", "10000");

            //Item 3
            EditField year3Item3 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q74_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year3Item3))
                year3Item3 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1731_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(year3Item3))
                year3Item3 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1763_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year3Item3);
            if (isPresent(year3Item3))
                setValue(year3Item3, "Year 3 - 10000", "10000");

            //Item 4
            EditField year4Item4 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q75_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year4Item4))
                year4Item4 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1766_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(year4Item4))
                year4Item4 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1734_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year4Item4);
            if (isPresent(year4Item4))
                setValue(year4Item4, "Year 4 - 10000", "10000");


            //Item 5
            EditField year5Item5 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q76_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year5Item5))
                year5Item5 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1737_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(year5Item5))
                year5Item5 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1769_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year5Item5);
            if (isPresent(year5Item5))
                setValue(year5Item5, "Year 5 - 5000", "5000");
        }

        //Equipment Link

        Link equipmentLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Equipment")
                .tagName("A").build());
        click(equipmentLink, "Equipment Link");

        // reset addOne to 0
        addOne = 0;

        // run through 2 times
        for (int i = 0; i <= 1; i++) {
            // + button
            Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                    .accessibilityName("")
                    .buttonType("submit")
                    .role("")
                    .tagName("INPUT")
                    .index(1).build());
            waitForElement(AddButton);
            click(AddButton, "+ button");

            // increase by 1
            addOne++;

            //Item name
            EditField q710EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty("Q1722_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(q710EditField))
                q710EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q71_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(q710EditField);
            if(isPresent(q710EditField))
                setValue(q710EditField, "Item Name", equipmentItemName + addOne);


            //Justification
            EditField q6260ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q1745_.*"))
                    .tagName("TEXTAREA")
                    .index(i)
                    .type("textarea").build());
            if (isNotPresent(q6260ResponseEditField))
                q6260ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1780_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            if (isNotPresent(q6260ResponseEditField))
                q6260ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q626_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(q6260ResponseEditField);
            if(isPresent(q6260ResponseEditField))
                setValue(q6260ResponseEditField, "Justification", equipmentJustification + addOne + "  Lorem ipsum dolor psum dofflor sit amet, " +
                    "consectetuer adipiscing elit. Aenean massa Aenean massa.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget" +
                    " dolor. Aenean massa. Cum sociis natoque penatibus et magis dis parturient montes, nascetur ridiculus mus. Doneceribhtg quam felis, ultricies" +
                    " nec, pellentesque eu, pretium quis, sem. Nulla consequa Donec pede justo, fridfngilla vel, aliquet nec, vulputate eget, arcu. In enim justo," +
                    " rhoncus ut, impeet.");
        }
        //year
//        addOne++;

        for (int i = 0; i <= 1; i++) {

            EditField year1Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q1723_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year1Equipment))
                year1Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q72_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year1Equipment);
            if (isPresent(year1Equipment))
                setValue(year1Equipment, "Year 2", "10000");

            EditField year2Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q1726_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year2Equipment))
                year2Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q73_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year2Equipment);
            if (isPresent(year2Equipment))
                setValue(year2Equipment, "Year 2", "10000");


            EditField year3Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q74_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year3Equipment))
                year3Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1729_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year3Equipment);
            if (isPresent(year3Equipment))
                setValue(year3Equipment, "", "10000");

            EditField year4Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q75_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year4Equipment))
                year4Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1732_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year4Equipment);
            if (isPresent(year4Equipment))
                setValue(year4Equipment, "Year 4", "10000");

            EditField year5Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q76_.*"))
                    .tagName("INPUT")
                    .index(i)
                    .type("text").build());
            if (isNotPresent(year5Equipment))
                year5Equipment = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1735_.*"))
                        .tagName("INPUT")
                        .index(i)
                        .type("text").build());
            waitForElement(year5Equipment);
            if (isPresent(year5Equipment))
                setValue(year5Equipment, "Year 5", "0");
        }

            return this;
    }


    public AddOtherResearchCosts fillData() throws Exception
    {
        enterData("ORC Item Name ", "Justification ", "Equipment item name ", "Justification ");
        return this;
    }
}