package apppages.applicationforms.pages;

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
import com.hp.lft.sdk.web.Frame;
import com.hp.lft.sdk.web.FrameDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;


public class ParticipatingInstitutionsTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ParticipatingInstitutionsTab(DriverObj driverObj) {
		super(driverObj);
	}

	public ParticipatingInstitutionsTab enterData(String participatingInstitution1, String researchEffort1, String department1) throws Exception
	{
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Participating Institutions Tab Link
		Link participatingInstitutionsLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Participating Institutions")
				.tagName("A").build());
		click(participatingInstitutionsLink, "Participating Institutions Tab Link");

		// Research institution Text box
		waitForPageToLoad();
		EditField researchInstitutionEditField1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q92_0.*"))
				.tagName("INPUT")
				.index(0)
				.type("text").build());
		if(isPresent(researchInstitutionEditField1))
			setValue(researchInstitutionEditField1, "Research institution Textbox", participatingInstitution1);

		//Research effort Text box
		waitForPageToLoad();
		EditField researchEffortEditField1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*2_Q1_0.*"))
				.tagName("INPUT")
				.index(0)
				.type("text").build());
		if(isPresent(researchEffortEditField1))
			setValue(researchEffortEditField1, "Research effort Textbox", researchEffort1);
		//.name(new RegExpProperty(".*Q21_0.*"))
		//.name(new RegExpProperty(".*Fc62f3d1d_c269_4e84_a993_80d27a6f10d1_Q1_0.*"))
		//.name(new RegExpProperty(".*Ffa4aedbc_9173_459b_9714_912899d904ac_Q1_0.*"))

		//Department Text box
		waitForPageToLoad();
		EditField departmentEditField1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*_Q1_0"))
				.tagName("INPUT")
				.index(0)
				.type("text").build());
		if(isPresent(departmentEditField1))
			setValue(departmentEditField1, "Department Textbox", department1);
		//.name(new RegExpProperty(".*Q20_0.*"))
		//.name(new RegExpProperty(".*Fce48ad7b_1386_417e_a6a9_3c7d53084ab1_Q1_0.*"))
		//.name(new RegExpProperty(".*F988196ba_7d7c_45c4_9326_fd057da16569_Q1_0.*"))



		return this;
	}

	public ParticipatingInstitutionsTab fillData() throws Exception
	{
		return enterData("Test Automation Participating Institution",
				"100", "NRMA");
	}
}