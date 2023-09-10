package apppages.applicationforms.pages;


import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {


    /**
     * Instantiates a new Base page.
     *
     * @param driverObj the driver obj
     */
    public Login(DriverObj driverObj) {
        super(driverObj);
    }

    public Login enterData(String username, String password) throws Exception {

        Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
                .name("")
                .index(0).build());
        // Enter username
        EditField userNameEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("UserName")
                .tagName("INPUT")
                .type("text").build());
        setValue(userNameEditField, "Username", username);

        // "Test2@test.com.au"
        // enter password
        EditField passwordEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
                .name("Password")
                .tagName("INPUT")
                .type("password").build());
        setValue(passwordEditField, "Password", password);

        // click login button
        Button logInButton = frame.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("                Log in       ")
                .tagName("BUTTON").build());
        click(logInButton, "Login Button");

        // Click agree button
        Button agreeButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("                                Agree            ")
                .tagName("BUTTON").build());
        click(agreeButton, "Agree Button");

        return this;

    }

    // enter sample information
    public Login fillData() throws Exception {

        enterData("Test2@test.com.au", "Abc123!!!!");
        return this;

    }
}