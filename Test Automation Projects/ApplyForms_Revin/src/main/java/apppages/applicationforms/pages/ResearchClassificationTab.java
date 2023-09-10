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
import com.hp.lft.sdk.web.ListBox;
import com.hp.lft.sdk.web.ListBoxDescription;

public class ResearchClassificationTab extends BasePage {


	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ResearchClassificationTab(DriverObj driverObj) {
		super(driverObj);
	}

	//Bump researchClassTab
	public void enterData(String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
			String researchKeyword4, String researchKeyword5) throws Exception {

		Frame frame = browser.describe(Frame.class, new FrameDescription.Builder()
				.id("FormFrame")
				.name("").build());

		// Open Research Classification Tab
		Link researchClassificationLink = frame.describe(Link.class, new LinkDescription.Builder()
				.innerText("Research Classification")
				.tagName("A").build());
		click(researchClassificationLink, "Research Classification Tab Link");
		waitForPageToLoad();

		// Enter Broad Research
		ListBox broadResearchListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name(new RegExpProperty(".*_Q2"))
				.tagName("SELECT").build());
		selectText(broadResearchListBox, "Broad Research List box", broadResearchArea);
		waitForPageToLoad();
		//.name(new RegExpProperty(".*_Q2"))
		//.name(new RegExpProperty(".*Q1074.*"))

		ListBox researchFieldListBox = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name(new RegExpProperty(".*Q7_0")) //
				.tagName("SELECT").build());
		// Enter Fields of research
		if(isPresent(researchFieldListBox))
		{
			selectText(researchFieldListBox, "Fields of research text box", researchField);
			waitForPageToLoad();
		}

		EditField q206EditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name("Q206")
				.tagName("INPUT")
				.type("text").build());

		if(isPresent(q206EditField))
		{
			setValue(q206EditField, "Field of Research", researchField);
		}

		// Select Peer Review List Box 1
		ListBox peerReviewListBox1 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name(new RegExpProperty(".*Q1_0"))
				.tagName("SELECT").build());
		selectText(peerReviewListBox1, "Peer Review ListBox1", peerReviewArea1);
		//.name(new RegExpProperty(".*Q1_0"))
		//.name(new RegExpProperty(".*Q896_.*"))

		// Select Peer Review List Box 2
		ListBox peerReviewListBox2 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
				.name(new RegExpProperty(".*Q1_1")) //
				.tagName("SELECT").build());

		if (isPresent(peerReviewListBox2)) {
			selectText(peerReviewListBox2, "Peer Review ListBox2", peerReviewArea2);

			// Select Peer Review List Box 3
			ListBox peerReviewListBox3 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
					.name(new RegExpProperty(".*Q1_2")) //
					.tagName("SELECT").build());
			selectText(peerReviewListBox3, "Peer Review ListBox3", peerReviewArea3);
		}

		waitForPageToLoad();
		// Research Keyword Text box1
		EditField researchKeywordEditField1 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q719.*"))
				.tagName("INPUT")
				.type("text").build());
		setValue(researchKeywordEditField1, "Research Keyword Text box 1", researchKeyword1);
		waitForPageToLoad();

		// Research Keyword Text box2
		EditField researchKeywordEditField2 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q716.*"))
				.tagName("INPUT")
				.type("text").build());
		setValue(researchKeywordEditField2, "Research Keyword Text box 2", researchKeyword2);
		waitForPageToLoad();

		// Research Keyword Text box3
		EditField researchKeywordEditField3 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q713.*"))
				.tagName("INPUT")
				.type("text").build());
		setValue(researchKeywordEditField3, "Research Keyword Text box 3", researchKeyword3);
		waitForPageToLoad();

		// Research Keyword Text box4
		EditField researchKeywordEditField4 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q710.*"))
				.tagName("INPUT")
				.type("text").build());
		setValue(researchKeywordEditField4, "Research Keyword Text box 4", researchKeyword4);
		waitForPageToLoad();

		// Research Keyword Text box5
		EditField researchKeywordEditField5 = frame.describe(EditField.class, new EditFieldDescription.Builder()
				.name(new RegExpProperty(".*Q97.*"))
				.tagName("INPUT")
				.type("text").build());
		setValue(researchKeywordEditField5, "Research Keyword Text box 5", researchKeyword5);
		waitForPageToLoad();

		// Add Burden Of Disease
//		Button addButton = frame.describe(Button.class, new ButtonDescription.Builder()
//				.accessibilityName("")
//				.buttonType("submit")
//				.index(1)
//				.role("")
//				.title("Add Row").build());
//		click(addButton, "Add button");
//
//		EditField allocationEditField = frame.describe(EditField.class, new EditFieldDescription.Builder()
//				.name(new RegExpProperty(".*_Q2_0")) //
//				.tagName("INPUT")
//				.type("text").build());

			// Click on Add Burden of Disease
//		if (isPresent(allocationEditField))
//			{

//			else if (isNotPresent(allocationEditField)) {
//				click(addButton, "Add Burden of Disease");
//				waitForPageToLoad();
//				// Allocation Text box
//				setValue(allocationEditField, "Allocation Text box1", burdenOfDiseases);
//				waitForPageToLoad();
//
//				// Level1 Text box
//				ListBox leveListBox1 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//						.name(new RegExpProperty(".*_Q3_.*")) //
//						.tagName("SELECT").build());
//				selectText(leveListBox1, "Level1 Text box", level1);
//				waitForPageToLoad();
//
//				// Level2 Text box
//				ListBox leveListBox2 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//						.name(new RegExpProperty(".*_Q4_.*"))  //
//						.tagName("SELECT").build());
//				selectText(leveListBox2, "Level2 Text box", level2);
//				waitForPageToLoad();
//
//				// Level3 Text box
//				ListBox leveListBox3 = frame.describe(ListBox.class, new ListBoxDescription.Builder()
//						.name(new RegExpProperty(".*_Q5_.*")) //
//						.tagName("SELECT").build());
//				selectText(leveListBox3, "Level3 Text box", level3);
//				waitForPageToLoad();
//			}
		}
}