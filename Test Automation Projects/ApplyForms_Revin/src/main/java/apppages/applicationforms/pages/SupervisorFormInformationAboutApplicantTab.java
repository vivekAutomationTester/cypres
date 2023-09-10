package apppages.applicationforms.pages;

import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class SupervisorFormInformationAboutApplicantTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public SupervisorFormInformationAboutApplicantTab(DriverObj driverObj) {
        super(driverObj);
    }

    public SupervisorFormInformationAboutApplicantTab enterData() throws Exception
    {
        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());

        Link informationAboutTheApplicantLink = frame.describe(Link.class, new LinkDescription.Builder()
                .innerText("Information about the applicant")
                .tagName("A").build());
        click(informationAboutTheApplicantLink, "Information about the applicant");

        EditField q11ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q11_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q11ResponseEditField, "Applicant strength", "Major strength of applicant");

        EditField q12ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q12_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q12ResponseEditField, "Additional development for applicant", "Additional development for applicant");

        EditField q13ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q13_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q13ResponseEditField, "Research project contribution to the applicant's future career aspirations", "Research project contribution to the applicant's future career aspirations");

        ListBox q19ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name("Q19")
                .tagName("SELECT").build());
        selectIndex(q19ListBox, "Do you support the scholar undertaking their studies part-time? list box", 1);
        return this;
    }
    public SupervisorFormInformationAboutApplicantTab fillData() throws Exception
    {
        enterData();
        return this;
    }
}