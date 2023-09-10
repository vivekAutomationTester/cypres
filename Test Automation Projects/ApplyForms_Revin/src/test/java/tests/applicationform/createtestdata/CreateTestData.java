package tests.applicationform.createtestdata;

import org.testng.annotations.Test;

import testbase.basetestclass.BaseTest;
import testbase.testdata.ApplyTestData;
import testbase.testscenario.ApplyScenario;

public class CreateTestData extends BaseTest{
	
	//2020 CTCS BAU
	@Test (groups= {"Golden Path_Application Form"}, dataProvider = "2020 CTCS BAU", dataProviderClass= ApplyTestData.class)
	public void createApplication_2020IdeasGrant(String username, String applicationName, String administeringInstitution,
			String grantDuration, String participatingInstitution1, String researchEffort1, String department1, 
			String participatingInstitution2, String researchEffort2, String department2,
			String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
			String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2, 
			String level3, String ciaEmail, String relevantBackground, String grantProposalFile, 
			String budgetProposalFile, String positionFunction, String salaryLevel, String year1Value, String year2Value) throws Exception
	{
		reportManager.startTest("2020 CTCS BAU", "Golden Path Test Case");
		reportManager.logPass("The application is opened in the browser");
		ApplyScenario applyScenario = new ApplyScenario(driverObj);
					
		applyScenario.loginPage().login(username);
		applyScenario.homePage().openApplicationsPage();
		applyScenario.applicationsPage().createNewApplication("2020 CTCS BAU")
		   .setApplicationName(applicationName);

		applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", administeringInstitution, grantDuration, "");
		applyScenario.participatingInstitutionsTab().fillData();
		applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,  peerReviewArea1,  peerReviewArea2,
				 peerReviewArea3,  researchKeyword1,  researchKeyword2,  researchKeyword3, 
				 researchKeyword4,  researchKeyword5);
		applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
		applyScenario.ethicsTab().enterData();
		applyScenario.grantProposalTab().enterData(grantProposalFile);
		applyScenario.strategicPrioritiesTab().fillData();
		applyScenario.budgetProposalTab().enterData(budgetProposalFile);
		applyScenario.directResearchCosts().enterData(positionFunction, salaryLevel);
		applyScenario.certifyTab().enterData();
		applyScenario.finaliseApplication().enterData();
		applyScenario.logoutPage().signout();
	}
	
	//NHMRC Special Initiative in Mental Health - National Centre
	@Test (groups= {"Golden Path_Application Form"}, dataProvider = "NHMRC Special Initiative in Mental Health - National Centre", dataProviderClass= ApplyTestData.class)
	public void createApplication_NHMRC_Special_Initiative_in_Mental_Health_National_Centre(String username, String applicationName, String administeringInstitution,
			String grantDuration, String participatingInstitution1, String researchEffort1, String department1, 
			String participatingInstitution2, String researchEffort2, String department2,
			String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
			String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2, 
			String level3, String ciaEmail, String grantProposalFile, String budgetProposalFile) throws Exception
	{
		reportManager.startTest("NHMRC Special Initiative in Mental Health - National Centre", "Golden Path Test Case");
		reportManager.logPass("The application is opened in the browser");
		ApplyScenario applyScenario = new ApplyScenario(driverObj);

		applyScenario.loginPage().login(username);
		applyScenario.homePage().openApplicationsPage();
		applyScenario.applicationsPage().createNewApplication("NHMRC Special Initiative in Mental Health - National Centre")
									   .setApplicationName(applicationName);
		applyScenario.applicationDetailsTab().fillData();
		applyScenario.participatingInstitutionsTab().fillData();
		applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,  peerReviewArea1,  peerReviewArea2,
				 peerReviewArea3,  researchKeyword1,  researchKeyword2,  researchKeyword3, 
				 researchKeyword4,  researchKeyword5);
		applyScenario.ethicsTab().enterData();
		applyScenario.grantProposalTab().enterData(grantProposalFile);
		applyScenario.budgetProposalTab().enterData(budgetProposalFile);
		applyScenario.certifyTab().enterData();
		applyScenario.finaliseApplication().enterData();
		applyScenario.logoutPage().signout();
	}
	
	@Test (groups= {"Golden Path_Application Form"}, dataProvider = "2020 MRFF COVID 19 Private Signle Year", dataProviderClass= ApplyTestData.class)
	public void createApplication_2020_MRFF_COVID_19_Private_Signle_Year(String username, String applicationName, String administeringInstitution,
			String grantDuration, String participatingInstitution1, String researchEffort1, String department1, 
			String participatingInstitution2, String researchEffort2, String department2,
			String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
			String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2, 
			String level3, String ciaEmail, String relevantBackground, String grantProposalFile, 
			String budgetProposalFile, String positionFunction, String salaryLevel, String year1Value, String year2Value) throws Exception
	{
		reportManager.startTest("2020 MRFF COVID 19 Private Signle Year", "Golden Path Test Case");
		reportManager.logPass("The application is opened in the browser");
		ApplyScenario applyScenario = new ApplyScenario(driverObj);
				
		applyScenario.loginPage().login(username);
		applyScenario.homePage().openApplicationsPage();
		applyScenario.applicationsPage().createNewApplication("2020 MRFF COVID 19 Private Signle Year")
		   .setApplicationName(applicationName);
//		applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration, "", "");
		applyScenario.participatingInstitutionsTab().fillData();
		applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,  peerReviewArea1,  peerReviewArea2,
				 peerReviewArea3,  researchKeyword1,  researchKeyword2,  researchKeyword3, 
				 researchKeyword4,  researchKeyword5);
		applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
		applyScenario.ethicsTab().enterData();
		applyScenario.grantProposalTab().enterData(grantProposalFile);
		applyScenario.declarationOfInterest().enterData(grantProposalFile);
		applyScenario.budgetProposalTab().enterData(budgetProposalFile);
		applyScenario.directResearchCosts().enterData(positionFunction, salaryLevel);
		applyScenario.certifyTab().enterData();
		applyScenario.finaliseApplication().enterData();
		applyScenario.logoutPage().signout();
	}
		    
}
