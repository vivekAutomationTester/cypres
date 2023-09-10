package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class SupervisorFormYourDetailsTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public SupervisorFormYourDetailsTab(DriverObj driverObj) {
        super(driverObj);
    }

    public SupervisorFormYourDetailsTab enterYourDetailsData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        Link yourDetailsLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Your details")
                .tagName("A").build());
        click(yourDetailsLink, "Your details Tab link");

        EditField q64ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q64_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q64ResponseEditField, "Current appointment", "Current appointment");

        EditField q390ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q39_0_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q390ResponseEditField, "Details 1", "Details 1");

        EditField q410ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q41_0_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q410ResponseEditField, "Contribution to science 1", "Contribution to science 1");

        EditField q391ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q39_1_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q391ResponseEditField, "Details 2", "Details 2");

        EditField q411ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q41_1_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q411ResponseEditField, "Contribution to science 2", "Contribution to science 2");

        EditField q392ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q39_2_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q392ResponseEditField, "Details 3", "Details 3");

        EditField q412ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q41_2_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q412ResponseEditField, "Contribution 3", "Contribution 3");

        EditField q35ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q35_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q35ResponseEditField, "Applicants research project", "Applicants research project");

        EditField q36ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q36_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q36ResponseEditField, "Funding, equipment, space, research assistance, other laboratory support, and institutional facilities", "Funding, equipment, space, research assistance, other laboratory support, and institutional facilities");

        EditField q43ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q43_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q43ResponseEditField, "Mentoring arrangements", "Mentoring arrangements");

        EditField q45ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q45_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q45ResponseEditField, "Key strengths as a supervisor", "Key strengths as a supervisor");

        EditField q46ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q46_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q46ResponseEditField, "Supervisor support a junior researcher's future career development", "Supervisor support a junior researcher's future career development");

        EditField q47ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q47_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q47ResponseEditField, "Ethics guidelines", "Ethics guidelines");

        EditField q48ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q48_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q48ResponseEditField, "Responsible conduct of research", "Responsible conduct of research");

        EditField q49ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q49_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q49ResponseEditField, "Research quality", "Research quality");

        EditField q50ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q50_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q50ResponseEditField, "Occupational health and safety", "Occupational health and safety");

        EditField q52ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q52_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q52ResponseEditField, "Three practical steps to ensure you are a good role model to junior researchers", "Three practical steps to ensure you are a good role model to junior researchers");

        Button submitButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("Submit")
                .tagName("INPUT").build());
        click(submitButton, "Submit Button");

        return this;
    }
    public SupervisorFormYourDetailsTab fillData() throws Exception
    {
        enterYourDetailsData();
        return this;
    }
}