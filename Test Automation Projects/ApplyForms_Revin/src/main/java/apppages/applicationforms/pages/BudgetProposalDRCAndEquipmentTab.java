package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class BudgetProposalDRCAndEquipmentTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public BudgetProposalDRCAndEquipmentTab(DriverObj driverObj) {
        super(driverObj);
    }

    public BudgetProposalDRCAndEquipmentTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        // Budget Proposal - DRC and Equipment Link
        Link budgetProposalDRCAndEquipmentLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Budget Proposal - DRC and Equipment")
                .tagName("A").build());
        click(budgetProposalDRCAndEquipmentLink, "Tab Link");

        int itemTypeIndex =0;
        int indexNum =0;
        int addOne =0;

        for(int i=0;i<=1;i++)
        {
            // + button
            Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                    .accessibilityName("")
                    .buttonType("submit")
                    .role("")
                    .tagName("INPUT")
                    .index(0).build());
            click(AddButton, "plus(+) button");

            itemTypeIndex++;
            //Item type list Box
            ListBox q8000ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                    .name(new RegExpProperty(".*Q800_.*"))
                    .index(indexNum)
                    .tagName("SELECT").build());
            selectIndex(q8000ListBox, "Item type List Box", itemTypeIndex);

            addOne++;
            //Item Name
            EditField q710EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q71_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            setValue(q710EditField, "Item Name", "Item " + addOne);

            //Justification
            EditField q6260ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*_Response.*"))
                    .tagName("TEXTAREA")
                    .index(indexNum)
                    .type("textarea").build());
            setValue(q6260ResponseEditField, "Justification", "Justification " + addOne);

            indexNum++;
        }

        EditField item1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q73_.*"))
                .tagName("INPUT")
                .index(0)
                .type("text").build());
        if (isPresent(item1))
            setValue(item1, "Year 2", "40000");

        EditField item2 = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name(new RegExpProperty(".*Q75_.*"))
                .tagName("INPUT")
                .index(1)
                .type("text").build());
        if (isPresent(item2))
            setValue(item2, "Year 4", "20000");

        return this;
    }

    public BudgetProposalDRCAndEquipmentTab fillData() throws Exception
    {
        enterData();

        return this;
    }
}