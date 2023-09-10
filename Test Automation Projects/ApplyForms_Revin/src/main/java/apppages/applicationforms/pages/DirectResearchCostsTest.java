package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebDriver;

public class DirectResearchCostsTest extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public DirectResearchCostsTest(DriverObj driverObj) {
        super(driverObj);
    }

    public DirectResearchCostsTest enterData() throws Exception
    {

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link directResearchCostsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Direct Research Costs")
                .tagName("A").build());
        click(directResearchCostsLink, "Link");

        int addOne = 0;
        int pspUpdate = 5;
        int indexNum = 0;

        Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("submit")
                .role("")
                .tagName("INPUT")
                .index(1).build());
//        waitForPageToLoad();
        if(isPresent(AddButton))
            click(AddButton, "Add Button");
//        waitForElement(AddButton);

        // indexes 0-4
        for(int i=0; i<=1; i++)
        {
            addOne++;
            indexNum++;

            EditField positionFunctionEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q1612_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            if(isNotPresent(positionFunctionEditField))
                positionFunctionEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1952_.*"))
                        .tagName("INPUT")
                        .index(indexNum)
                        .type("text").build());
            if(isNotPresent(positionFunctionEditField))
                positionFunctionEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1698_.*"))
                        .tagName("INPUT")
                        .index(indexNum)
                        .type("text").build());
            waitForPageToLoad();
            if(isPresent(positionFunctionEditField))
                setValue(positionFunctionEditField,"Position function Text box", "Researcher " + addOne);
//            waitForElement(positionFunctionEditField);

            ListBox pspField = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                    .name(new RegExpProperty(".*Q1610_.*"))
                    .index(indexNum)
                    .tagName("SELECT").build());
            if (isNotPresent(pspField))
                pspField = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                        .name(new RegExpProperty(".*Q1953_.*"))
                        .index(indexNum)
                        .tagName("SELECT").build());
            if (isNotPresent(pspField))
                pspField = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                        .name(new RegExpProperty(".*Q453_.*"))
                        .index(indexNum)
                        .tagName("SELECT").build());
            waitForElement(pspField);
            if(isPresent(pspField))
                selectIndex(pspField, "PSP", pspUpdate);


            EditField q19570EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q1957_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            if (isNotPresent(q19570EditField))
                q19570EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q454_.*"))
                        .index(indexNum)
                        .type("text").build());
            waitForElement(q19570EditField);
            setValue(q19570EditField, "Year 1", "100");


            EditField q19610EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q460_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            if (isNotPresent(q19610EditField))
                q19610EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1961_.*"))
                        .index(indexNum)
                        .type("text").build());
            waitForElement(q19610EditField);
            if(isPresent(q19610EditField))
                setValue(q19610EditField, " Year 2", "100");


            EditField q19650EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q464_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            if (isNotPresent(q19650EditField))
                q19650EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1965_.*"))
                        .index(indexNum)
                        .type("text").build());
//            waitForElement(q19650EditField);
            if(isPresent(q19650EditField))
                setValue(q19650EditField, " Year 3", "100");


            EditField q19690EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q468_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            if (isNotPresent(q19690EditField))
                q19690EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1969_.*"))
                        .index(indexNum)
                        .type("text").build());
//            waitForElement(q19690EditField);
            if (isPresent(q19690EditField))
                setValue(q19690EditField, " Year 4", "100");


            EditField q19730EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q472_.*"))
                    .tagName("INPUT")
                    .index(indexNum)
                    .type("text").build());
            if (isNotPresent(q19730EditField))
                q19730EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1973_.*"))
                        .index(indexNum)
                        .type("text").build());
//           waitForElement(q19730EditField);
            if (isPresent(q19730EditField))
                setValue(q19730EditField, " Year 5", "100");


            EditField q19890ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                    .name(new RegExpProperty(".*Q621_.*"))
                    .tagName("TEXTAREA")
                    .index(indexNum)
                    .type("textarea").build());
            if (isNotPresent(q19890ResponseEditField))
                q19890ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                        .name(new RegExpProperty(".*Q1989_.*"))
                        .index(indexNum)
                        .type("text").build());

                waitForElement(q19890ResponseEditField);
                if(isPresent(q19890ResponseEditField))
                setValue(q19890ResponseEditField, "Reason for Salary", "REASON FOR SALARY "+ addOne + " Lorem ipsum dolor psum dofflor sit" +
                        " amet, consectetuer adipiscing elit. Aenean massa Aenean massa.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean " +
                        "commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magis dis parturient montes, nascetur ridiculus mus. " +
                        "Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequa Donec pede justo, fringilla vel, aliquet nec, " +
                        "vulputate eget, arcu. In enim justo, rhoncus ut, impeet a, vvgvitae, justo. Nullam dictum felis eu pede mollis pretium. Integer " +
                        "tincidunt. Cras dapibus. vitae sapien ut libero venenatis. Etiam sit amet orci eget eros fbus orci luctus et ultrices posuere " +
                        "cubilia Curae; In ac dui quis mi consectetuer lacinia.  suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices" +
                        " mauris.Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris.  Integer ante arcu," +
                        " accumsan a, consectetuer eget,  posueresuere.");
        }
        return this;
    }
}