package apppages.applicationforms.pages;

import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.web.*;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;


public class DirectResearchCosts extends BasePage {



	private Frame frame;
	private Frame frame1;

	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public DirectResearchCosts(DriverObj driverObj) {
		super(driverObj);
	}


	public void enterData(String positionFunction, String salaryPackage) throws Exception
	{
		frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("")
				.index(0).build());

		frame1 = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// openTab
		Link directResearchCostsLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Direct Research Costs")
				.tagName("A").build());
		click(directResearchCostsLink, "");
		reportManager.logPass("The tab is opened");

		// Enter Position Function
		setPositionFunction(positionFunction);

		// Enter Salary Package
		setSalaryLevel(salaryPackage);

		// Enter Salary Reason
		EditField responseEditField = frame1.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*0_Response"))
				.tagName("TEXTAREA")
				.type("textarea").build());
		setValue(responseEditField, "Reason for Salary Text box","Reason for salary 1");

		// Enter Year Values
		enterYearValues();

//		frame = browser.describe(Frame.class, new FrameDescription.Builder()
//				.id("FormFrame")
//				.name("").build());
//		Link otherResearchCostsLink = frame.describe(Link.class, new LinkDescription.Builder()
//				.innerText("Other Research Costs")
//				.tagName("A").build());
//		click(otherResearchCostsLink, "");
//
//		Button AddButton = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("submit")
//				.role("")
//				.tagName("INPUT")
//				.index(1).build());
//		click(AddButton, "");
//		waitForElement(AddButton);
//
//		Link equipmentLink = frame.describe(Link.class, new LinkDescription.Builder()
//				.innerText("Equipment")
//				.tagName("A").build());
//		click(equipmentLink, "");
//
//		click(AddButton, "");
//		waitForElement(AddButton);

	}

	private void setPositionFunction(String positionFunction) throws Exception {

		waitForPageToLoad();

		WebElement pageTitleWebElement = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build())
				.describe(WebElement.class, new WebElementDescription.Builder()
						.innerText("Direct Research Costs")
						.tagName("H2").build());
		waitForElement(pageTitleWebElement);

		EditField positionFunctionEditField = frame1.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q1698_0")
				.tagName("INPUT")
				.type("text").build());

		if (isNotPresent(positionFunctionEditField))
			positionFunctionEditField = frame1.describe(EditField.class, new EditFieldDescription.Builder()
					.name("Q1612_0")
					.tagName("INPUT")
					.type("text").build());

		if (isNotPresent(positionFunctionEditField))
				positionFunctionEditField = frame1.describe(EditField.class, new EditFieldDescription.Builder()
						.name("Q1952_0")
						.tagName("INPUT")
						.type("text").build());

		setValue(positionFunctionEditField,"Position function Text box", positionFunction);

	}

	private void setSalaryLevel(String salaryPackage) throws Exception {

		ListBox salaryPackageListBox = getSalaryPackageListBox("Q453_0");

		if (isNotPresent(salaryPackageListBox))
		{

			salaryPackageListBox = getSalaryPackageListBox("Q1610_0");

			if (isNotPresent(salaryPackageListBox))
			{
				salaryPackageListBox = getSalaryPackageListBox("Q1953_0");
			}
		}
	
		selectText(salaryPackageListBox, "Salary package List box", salaryPackage);
	}

	private ListBox getSalaryPackageListBox(String nameValue) throws Exception
	{
		return frame1.describe(ListBox.class, new ListBoxDescription.Builder()
				.name(nameValue)
				.tagName("SELECT").build());
	}


	// Enter the year values if they are available
	private void enterYearValues() throws Exception
	{

		// Set Year1 Value
		setYearValue("Q454_0", "Year 1", "100");

		// Set Year1 Value
		setYearValue("Q1957_0", "Year 1", "75");

		// Set Year2 Value
		setYearValue("Q460_0", "Year 2", "50");

		// Set Year3 Value
		setYearValue("Q464_0", "Year 3", "25");

		// Set Year4 Value
		setYearValue("Q468_0", "Year 4", "10");

		// Set Year5 Value
		setYearValue("Q472_0", "Year 5", "5");

	}

	private void setYearValue(String identifier, String fieldDescription, String textValue) throws Exception
	{
		EditField yearField =  frame1.describe(EditField.class, new EditFieldDescription.Builder()
				.name(identifier)
				.tagName("INPUT")
				.type("text").build());
		if (isPresent(yearField))
			setValue(yearField, fieldDescription, textValue);
	}

	public void fillData() throws Exception {
		enterData("Position function 1", "Personnel Support Package 1");
	}
}