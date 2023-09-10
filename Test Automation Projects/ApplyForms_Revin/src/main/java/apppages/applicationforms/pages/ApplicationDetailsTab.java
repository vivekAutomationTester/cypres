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
import com.hp.lft.sdk.web.ListBox;
import com.hp.lft.sdk.web.ListBoxDescription;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;


public class ApplicationDetailsTab extends BasePage {




	private Frame frame;

	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ApplicationDetailsTab(DriverObj driverObj) {
		super(driverObj);
	}


	public ApplicationDetailsTab enterData( String administeringInstitution, String grantDuration, String stream, String subStream)
			throws Exception
	{
		frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		EditField q1411ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q1411_ContactEmail")
				.tagName("INPUT")
				.type("text").build());

		Button yesButton3 = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                      " +
						"  Yes        ")
				.role("")
				.tagName("LABEL")
				.index(0).build());
		if(isPresent(yesButton3)) {
			yesButton3.click();
		click(yesButton3, "Yes button");
		}

		Button yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                        Yes        ")
				.role("")
				.tagName("LABEL")
				.index(0).build());
		if (isPresent(yesButton)) {
			click(yesButton, "yes Button");
		}

		ListBox q1388ListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name("Q1388")
				.tagName("SELECT").build());
		if (isPresent(q1388ListBox))
			selectIndex(q1388ListBox, "Centre of Research excellence Type", 1);

		WebElement grantDurationLabel = frame.describe(WebElement.class, new WebElementDescription.Builder()
				.innerText("Grant duration - in years *")
				.tagName("LABEL").build());

		WebElement chiefInvestigatorWebElement = frame.describe(WebElement.class, new WebElementDescription.Builder()
				.className("qtdiv")
				.innerText("Chief Investigator ")
				.tagName("DIV").build());
		waitForPageToLoad();
		// Wait for Label
		WebElement administeringInstitutionLabel = frame.describe(WebElement.class, new WebElementDescription.Builder()
				.innerText("Administering institution *")
				.tagName("LABEL").build());
		waitForElement(administeringInstitutionLabel);

		//Administering institution Textbox
		EditField administeringInstitutionTextBox = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q93")
				.tagName("INPUT")
				.type("text").build());
		if(isPresent(q1411ContactEmailEditField)) {
			setValue(q1411ContactEmailEditField, "Email", "Test2@test.com.au");
		}
		setValue(administeringInstitutionTextBox, "Administering institution Textbox", administeringInstitution);

		// Verify that Institution name appears on the screen
		WebElement institutionNameWebElement = frame.describe(WebElement.class, new WebElementDescription.Builder()
				.className("qtdiv")
				.innerText("Institution name")
				.tagName("DIV").build());
		waitForElement(institutionNameWebElement);
		
		// Wait for the value to be displayed as a label
		isPresent(grantDurationLabel);
		if (isPresent(chiefInvestigatorWebElement)){
			setValue(q1411ContactEmailEditField, "chief investigator box", "test2@test.com.au"); //TODO: Make data driven
		}

		ListBox grantDurationListBox = browser.describe(Frame.class, new FrameDescription.Builder()
					.id("FormFrame")
					.name("").build())
					.describe(ListBox.class, new ListBoxDescription.Builder()
							.name("Q789")
							.tagName("SELECT").build());

		if (!grantDuration.equals(""))
		{
			if(isPresent(grantDurationListBox))
			{
				if(grantDurationListBox.isEnabled())
				{
					selectIndex(grantDurationListBox,"Grant duration - in years List box",  5);
				}
			}
		}
		else
		{
			setRandom_GrantDurationListBox();
		}

		// Enter Stream and Substream
		enterStream(stream, subStream);
		clickOnYesButtons();

		// Enter Lorem Ipsum in all of the free text fields
		enterFreeText();
		waitForPageToLoad();
		return this;
	}

	public ApplicationDetailsTab enterCIAEmail(String ciaEmail) throws Exception
	{
		EditField q1411ContactEmailEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q1411_ContactEmail")
				.tagName("INPUT")
				.type("text").build());
		waitForElement(q1411ContactEmailEditField);
		setValue(q1411ContactEmailEditField, "CIA Email Textbox", ciaEmail);
		return this;
	}

	public ApplicationDetailsTab fillData() throws Exception {
		enterData("Test Automation Administering Institution", "5", "","");
		//Stream 3 - Targeted Call for Research ; Stream 1 – Incubator ; Stream 1 - Targeted Call for Research ; Stream 1 – Cancer in children ; Stream 1 – Ovarian Cancer
		return this;
	}

	private void enterFreeText() throws Exception {

		EditField communityEngagementTextbox = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*4_Response"))
				.tagName("TEXTAREA")
				.type("textarea").build());

		if (isPresent(communityEngagementTextbox))
		{
			setValue(communityEngagementTextbox,"Community Engagement Text box", "Community Engagement");

			EditField benefitTextbox = frame.describe(EditField.class, new EditFieldDescription.Builder()
					.name(new RegExpProperty(".*5_Response"))
					.tagName("TEXTAREA")
					.type("textarea").build());
			setValue(benefitTextbox,"Benefit Text box", "Benefit");

			EditField sustainabilityTransferabilityTextbox = frame.describe(EditField.class, new EditFieldDescription.Builder()
					.name(new RegExpProperty(".*6_Response"))
					.tagName("TEXTAREA")
					.type("textarea").build());
			setValue(sustainabilityTransferabilityTextbox,"Sustainability and Transferability Text box" , "Sustainability and Transferability");

			EditField buildCapacityTextbox = frame.describe(EditField.class, new EditFieldDescription.Builder()
					.name(new RegExpProperty(".*7_Response"))
					.tagName("TEXTAREA")
					.type("textarea").build());
			setValue(buildCapacityTextbox,"Build Capability Text box", "Build Capability");
		}

		EditField projectSynopsisTextbox = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*3_Response"))
				.tagName("TEXTAREA")
				.type("textarea").index(0).build());
		setValue(projectSynopsisTextbox,"Project synopsis Textbox",
				"PROJECT SYNOPSIS Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean massa Aenean massa.Lorem ipsum dolor sit amet," +
						" consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magis dis parturient " +
						"montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. " +
						"Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu " +
						"pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, " +
						"consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. " +
						"Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, " +
						"tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. " +
						"Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. " +
						"Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida " +
						"magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. " +
						"Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In ac dui quis mi " +
						"consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris. " +
						"Integer ante arcu, accumsan a, consectetuer eget, posuere.");

		EditField plainEnglishSummaryTextbox = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*3_Response"))
				.tagName("TEXTAREA")
				.type("textarea").index(1).build());
		setValue(plainEnglishSummaryTextbox,"Plain English summary Textbox",
				"PLAIN ENGLISH SUMMARY Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
						"Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam fis, ultricies nec, pellentesque eu, " +
						"pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, " +
						"imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer ti");
	}

	private void enterStream(String stream, String subStream) throws Exception
	{
		ListBox streamListBox = getStreamListBox(new String[]{"Q1895", "Q1905","Q2165"});//

		if (streamListBox !=null) // If the streams listbox exists
		{
			if (stream.trim().equals(""))
				// if stream is not blank,select the value
				selectIndex(streamListBox, "Streams listbox", 1);
			else
				// if stream is blank, select first element
				selectText(streamListBox, "Streams listbox", stream);
		}
		ListBox subStreamListbox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name("Q1905")
				.tagName("SELECT").build());

		// If Sub stream listbox is present, enter value
		if(isPresent(subStreamListbox))
		{
			if (!subStream.equals(""))
				// if subStream is not blank,select the value
				selectText(subStreamListbox, "Substream listbox", subStream);
			else
				// if subStream is blank, select first element
				selectIndex(subStreamListbox, "Substream listbox", 1);
		}
	}

	// If the streamListBox is present, it returns the control
	private ListBox getStreamListBox(String[] values) throws Exception
	{
		for (String value : values)
		{
			ListBox streamListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
					.name(value)
					.tagName("SELECT").build());
			if(isPresent(streamListBox))
				return streamListBox;
		}
		return null;
	}

  	// Click on all Yes Buttons
	private void clickOnYesButtons() throws Exception
	{
		Button yesButton;

		for(int i=0; i<=6; i++)
		{
			waitForPageToLoad();

				 yesButton = frame.describe(Button.class, new ButtonDescription.Builder()
					.accessibilityName("")
					.buttonType("")
					.name("                        Yes        ")
					.role("")
					.tagName("LABEL")
					.index(i).build());
			if(isPresent(yesButton))
			{
				waitForElement(yesButton);
				click(yesButton, "Yes Button");
			}
		}
	}

	public ApplicationDetailsTab setIrecAsNo() throws Exception
	{
		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());
		Button noButton = frame.describe(Button.class, new ButtonDescription.Builder()
				.accessibilityName("")
				.buttonType("")
				.name("                        No        ")
				.role("")
				.tagName("LABEL")
				.index(0).build());
		waitForElement(noButton);
		click(noButton,"No Button");
		return this;
	}

	public ApplicationDetailsTab setRandom_GrantDurationListBox() throws Exception
	{
		ListBox grantDurationListBox = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build())
				.describe(ListBox.class, new ListBoxDescription.Builder()
						.name(new RegExpProperty(".*Q789"))
						.tagName("SELECT").build());
		if(isPresent(grantDurationListBox))
		{
			if(grantDurationListBox.isEnabled())
			{
				// Pick Random number between 1 and the number of items in the list
//				int max = grantDurationListBox.getVisibleItemsCount();
//				int min = 1;
//				int listIndex = (int)(Math.random() * (max - min + 1) + min);

				// Select the random value
				selectIndex(grantDurationListBox,"Grant duration - in years Listbox",  5);
			}
		}
		return this;
	}
}