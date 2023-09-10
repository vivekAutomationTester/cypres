package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import javax.xml.crypto.Data;


public class ResearchTeamTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ResearchTeamTab(DriverObj driverObj) {
		super(driverObj);
	}

	public void enterData(String ciaEmail, String relevantBackground) throws Exception {

		// Open Tab
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		Link researchTeamLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText(new RegExpProperty("Research Team.*"))
				.tagName("A").build());
		click(researchTeamLink, "Open Research Team Tab");
		waitForPageToLoad();

		// Enter Role List box as Chief Investigator A
		ListBox roleListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name(new RegExpProperty(".*Q801_.*"))
				.tagName("SELECT").build());
		if (isPresent(roleListBox)) {
			selectIndex(roleListBox, "Role Listbox", 1);
			waitForPageToLoad();
		}

		// Enter Email Address
		EditField contactEmailEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*_0_ContactEmail"))
				.tagName("INPUT")
				.type("text").build());
		setValue(contactEmailEditField, "Email Textbox", ciaEmail);
		waitForPageToLoad();

		// Click on Yes button
		Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.index(0)
				.name("                        Yes        ")
				.role("")
				.tagName("LABEL").build());
		click(yesButton, "Yes Button");

		// Click on Second Yes button, if it is present
		Button yesButton2 = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.index(1)
				.name("                        Yes        ")
				.role("")
				.tagName("LABEL").build());
		if (isPresent(yesButton2)) {
			click(yesButton2, "Second Yes button");
		}
		waitForPageToLoad();

		// Enter Relevant background and expertise text box
		EditField relevantBackgroundEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*_0_Response"))
				.tagName("TEXTAREA")
				.type("textarea").build());
		setValue(relevantBackgroundEditField, "Relevant background and expertise textbox", relevantBackground);
		waitForPageToLoad();

		// If the following information is present
		// I confirm that no Chief Investigator is a named CI on another application for the same Stream within this Grant Opportunity
		// Click on Yes button
		WebElement q1907TextWebElement = browser
				.describe(WebElement.class, new WebElementDescription.Builder()
						.className("qtdiv")
						.innerText("I confirm that no Chief Investigator is a named CI on another application for the same Stream within this Grant Opportunity. *")
						.tagName("DIV").build());

		if(isPresent(q1907TextWebElement))
		{
			Button yesButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
					.accessibilityName("")
					.buttonType("")
					.index(0)
					.name("                        Yes        ")
					.role("")
					.tagName("LABEL").build());
			click(yesButton3, "yes button to no Chief Investigator is a named CI on" +
					"another application ");
		}

	}

	public ResearchTeamTab enterAssociateInvestigatorData() throws Exception
	{
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());
		//Associate Investigator Link
		Link associateInvestigatorsLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Associate Investigators")
				.tagName("A").build());
		click(associateInvestigatorsLink, "Associate Investigator tab link");

		// Add button
		Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("submit")
				.role("")
				.tagName("INPUT")
				.index(2).build());
		click(AddButton, "+ Button");

		//Email
		EditField q16040ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*_ContactEmail"))
				.tagName("INPUT")
				.type("text").build());
		setValue(q16040ContactEmailEditField, "Email", "test3@test.com.au");

		//Position
		EditField q8440EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q844_.*"))
				.tagName("INPUT")
				.index(0)
				.type("text").build());
		setValue(q8440EditField, "Position", "Tester");

		//Relevant background and expertise text box
		EditField q6200ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q620_0_Response"))
				.tagName("TEXTAREA")
				.type("textarea").build());
		if(isPresent(q6200ResponseEditField))
			setValue(q6200ResponseEditField, "Relevant background and expertise", "Relevant Background and Expertise");

		//add button
		click(AddButton, "+ button");

		//Email
		EditField q16041ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*1_ContactEmail"))
				.tagName("INPUT")
				.type("text").build());
		setValue(q16041ContactEmailEditField, "Email", "test1@test.com.au");

		//Position
		EditField q8441EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q844_.*"))
				.tagName("INPUT")
				.index(1)
				.type("text").build());
		setValue(q8441EditField, "Position","Researcher");

		//Relevant background and expertise text box
		EditField q6201ResponseEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q620_1_Response")
				.tagName("TEXTAREA")
				.type("textarea").build());
		if(isPresent(q6201ResponseEditField))
			setValue(q6201ResponseEditField, "Relevant background and expertise", "Relevant Background and Expertise");

		return this;
	}

	public void fillData() throws Exception
	{
		enterData("Chief.Investigator@testdata.email", "CI - RELEVANT BACKGROUND & EXPERTISE Lorem ipsum dolor psum dofflor sit amet, " +
				"consectetuer adipiscing elit. Aenean massa Aenean massa.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
				"Aenean massa. Cum sociis natoque penatibus et magis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
				"Nulla consequa Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, impeet a, vvgvitae, justo. Nullam dictum felis eu pede mollis " +
				"pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, poritor eu, consequat vitae, eleifend ac, enim. " +
				"Aliquam lorem ante, dapibus in, viverra quis, feut a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue." +
				" Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed" +
				" ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus." +
				" Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. " +
				"Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, " +
				"mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices " +
				"posuere cubilia Curae; In ac dui quis mi consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. " +
				"Sed aliquam ultrices mauris. Integer ante arcu, accumsan a, consectetuer eget, posuere.");
//		enterAssociateInvestigatorData();
	}
}