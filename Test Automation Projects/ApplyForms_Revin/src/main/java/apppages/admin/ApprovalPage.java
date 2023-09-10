package apppages.admin;

import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;

public class ApprovalPage extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ApprovalPage(DriverObj driverObj) {
		super(driverObj);
	}

	public ApprovalPage filterByStatus_SubmittedToRAO(String filterText) throws Exception {
		Button showAdvancedFilterButton = browser.describe(Button.class, new ButtonDescription.Builder()
				.buttonType("submit")
				.className("btn btn-primary advanced-filter")
				.id(new RegExpProperty("showAdvancedFilter.*"))
				.index(0)
				.tagName("BUTTON").build());
		showAdvancedFilterButton.click();
		click(showAdvancedFilterButton, "showAdvancedFilterButton");

		EditField webEditEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
				.accessibilityName("")
				.name("WebEdit")
				.placeholder("")
				.tagName("INPUT")
				.type("text")
				.index(0).build());
		setValue(webEditEditField, "webEditEditField", filterText);
		return this;
	}
	
	

	
	public ApprovalPage approveApplications() throws Exception {
		
		Link certifyApplicationRAOLink = browser.describe(Link.class, new LinkDescription.Builder()
				.accessibilityName("")
				.innerText("Certify Application - RAO")
				.role("")
				.tagName("A")
				.index(0).build());

			if (isPresent(certifyApplicationRAOLink))
			{
				click(certifyApplicationRAOLink, "certifyApplicationRAOLink");
				new ApprovalDetails(driverObj).finalise();
			}
	

		return this;

	}
	
	



}
