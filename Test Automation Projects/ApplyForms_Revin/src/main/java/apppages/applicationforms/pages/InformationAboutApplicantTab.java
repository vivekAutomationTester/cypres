package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

public class InformationAboutApplicantTab extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public InformationAboutApplicantTab(DriverObj driverObj) {
        super(driverObj);
    }

    public InformationAboutApplicantTab enterData() throws Exception{


        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .id("FormFrame")
                .name("").build());
        EditField q11ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q11_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q11ResponseEditField, "", "Major Strengths");

        EditField q12ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q12_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q12ResponseEditField, "", "Additional development of application");

        EditField q13ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Q13_Response")
                .tagName("TEXTAREA")
                .type("textarea").build());
        setValue(q13ResponseEditField, "", "Application future career aspirations");

        ListBox q19ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
                .name("Q19")
                .tagName("SELECT").build());
        selectText(q19ListBox, "", "Yes");


        return this;
    }
}