package apppages.common;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;

public class LoginPage extends BasePage {




	private Frame frame;
	private EditField userNameEditField;
	private EditField passwordEditField;
	private Button logInButton;
	private Button agreeButton;

	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public LoginPage(DriverObj driverObj) throws Exception {
		super(driverObj);
		initialiseFields();
	}

	private void initialiseFields() throws Exception
	{
		frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.name("")
				.index(0).build());

		userNameEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("UserName")
				.tagName("INPUT")
				.type("text").build());

		passwordEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Password")
				.tagName("INPUT")
				.type("password").build());

		logInButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.name("                Log in       ")
				.tagName("BUTTON").build());

		agreeButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.name("                                Agree            ")
				.tagName("BUTTON").build());
	}

	public LoginPage login(String username) throws Exception
	{
		return login(username, "Testing123!");//Abc123!!!!//Testing123!
	}
	
	public LoginPage login(String username, String password) throws Exception
	{
		waitForPageToLoad();
		waitForElement(userNameEditField);
		setValue(userNameEditField, "Username Textbox", username);
		waitForElement(passwordEditField);
		passwordEditField.setSecure(password);
		reportManager.logPass("Enter " + password + " in the Password Textbox");
		click(logInButton, "Login Button");

		waitForPageToLoad();
		waitForElement(agreeButton);
		reportManager.logPass("Click on the Agree Button" );
		agreeButton.click();
		return this;
	}
	

	

}
