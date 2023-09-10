//package tests.applicationform.apply.preprod;
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import testbase.basetestclass.BaseTest;
//import testbase.testdata.ApplyTestData;
//import testbase.testscenario.ApplyScenario;
//
//public class AdditionalTests extends BaseTest {
//
//
//	private ApplyScenario applyScenario;
//
//	@BeforeMethod(alwaysRun=true)
//	public void beforeMethod() throws Exception
//	{
//		applyScenario = new ApplyScenario(browser, driver, extentManager);
//		super.beforeMethod();
//	}
//
//	//2020 National Network for Aboriginal and Torres Strait Islander Health Researchers
//	@Test(groups= {"Golden Path_Application Form"}, dataProvider = "National Network for Aboriginal and Torres Strait Islander Health Researchers", dataProviderClass= ApplyTestData.class)
//	public void createApplication_National_Network_for_Aboriginal_and_Torres_Strait_Islander_Health_Researchers(String username, String applicationName, String administeringInstitution,
//																												String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
//																												String participatingInstitution2, String researchEffort2, String department2,
//																												String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
//																												String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
//																												String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
//																												String level3, String ciaEmail, String associateInvestigatorPosition,
//																												String grantProposalFile, String salaryPackage, String budgetProposalFile, String positionFunction, String year1, String year2,
//																												String relevantBackground) throws Exception {
//
//		extentManager.startTest("National Network for Aboriginal and Torres Strait Islander Health Researchers", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//
//		applyScenario.loginPage().login(username);
//		applyScenario.homePage().openApplicationsPage();
//		applyScenario.applicationsPage().createNewApplication("National Network for Aboriginal and Torres Strait Islander Health Researchers")
//				.setApplicationName(applicationName);
//		applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration);
//		applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1, researchEffort1, department1,
//				participatingInstitution2, researchEffort2, department2);
//		applyScenario.researchClassificationTab().enterData(broadResearchArea, researchField, peerReviewArea1,
//				peerReviewArea2, peerReviewArea3, researchKeyword1,
//				researchKeyword2, researchKeyword3, researchKeyword4,
//				researchKeyword5, burdenOfDiseases, level1, level2, level3);
//		applyScenario.researchTeamChiefInvestigatorTab().enterData(relevantBackground);
//		applyScenario.researchTeamAssociateInvestigatorTab().enterData(associateInvestigatorPosition, relevantBackground);
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().enterData(grantProposalFile);
//
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//	}
//
//
//
//
//
//	//MRFF Year 2
//	@Test (groups= {"Golden Path_Application Form"}, dataProvider = "NHMRC MRFF Single Year ATSI Non Mandatory", dataProviderClass= ApplyTestData.class)
//	public void createApplication_MRFF_Single_Year(String username, String applicationName, String administeringInstitution,
//												   String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
//												   String participatingInstitution2, String researchEffort2, String department2,
//												   String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
//												   String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
//												   String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
//												   String level3,
//												   String ciaEmail, String relevantBackground, String grantProposalFile,
//												   String budgetProposalFile, String declarationOfInterestFile, String positionFunction, String salayPackage,
//												   String year1Value, String year2Value ) throws Exception
//
//	{
//		extentManager.startTest("NHMRC MRFF Single Year ATSI Non Mandatory", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//		applyScenario.loginPage().login(username);
//
//		applyScenario.homePage().openApplicationsPage();
//		applyScenario.applicationsPage().createNewApplication("NHMRC MRFF Single Year ATSI Non Mandatory")
//				.setApplicationName(applicationName);
//
//		applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration);
//		applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1,
//				researchEffort1, department1, participatingInstitution2, researchEffort2, department2);
//		applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,
//				peerReviewArea1,  peerReviewArea2, peerReviewArea3,  researchKeyword1,
//				researchKeyword2,  researchKeyword3, researchKeyword4,  researchKeyword5,
//				burdenOfDiseases,  level1,  level2, level3);
//
//		applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().enterData(grantProposalFile);
//		applyScenario.declarationOfInterest().enterData(declarationOfInterestFile);
//
//		applyScenario.budgetProposalTab().enterData(budgetProposalFile);
//		applyScenario.directResearchCosts().enterData(positionFunction, salayPackage);
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//	}
//
//
//	@Test (groups= {"Golden Path_Application Form"}, dataProvider = "2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates", dataProviderClass= ApplyTestData.class)
//	public void createApplication_2020_MRFF_EPCDRI_Improving_Diagnosis_in_Cancers_with_Low_Survival_Rates(String username, String applicationName, String administeringInstitution, String grantDuration, String participatingInstitution1,
//																										  String researchEffort1, String department1, String participatingInstitution2,
//																										  String researchEffort2, String department2, String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
//																										  String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
//																										  String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
//																										  String level3,
//																										  String ciaEmail, String relevantBackground, String salaryPackage, String grantProposalFile,
//																										  String budgetProposalFile, String declarationOfInterestFile,
//																										  String positionFunction, String salaryLevel, String year1, String year2) throws Exception {
//		extentManager.startTest("2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//
//		applyScenario.loginPage().login(username);
//		applyScenario.homePage().openApplicationsPage();
//		applyScenario.applicationsPage().createNewApplication("2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates")
//				.setApplicationName(applicationName);
//
//		applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration);
//
//		applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1,
//				researchEffort1, department1, participatingInstitution2, researchEffort2, department2);
//		applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,
//				peerReviewArea1,  peerReviewArea2, peerReviewArea3,  researchKeyword1,
//				researchKeyword2,  researchKeyword3, researchKeyword4,  researchKeyword5,
//				burdenOfDiseases,  level1,  level2, level3);
//		applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().enterData(grantProposalFile);
//		applyScenario.declarationOfInterest().enterData(declarationOfInterestFile);
//		applyScenario.budgetProposalTab().enterData(budgetProposalFile);
//		applyScenario.directResearchCosts().enterData(positionFunction, salaryPackage);
//
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//	}
//
//	//TODO: Currently doesnt work due to inconsistency in research team CI tab. Find recorded video in documents
//	@Test (groups= {"Golden Path_Application Form"}, dataProvider = "2020 Special Initiative in Human Health and Environmental Change", dataProviderClass= ApplyTestData.class)
//	public void createApplication_2020_Special_Initiative_in_Human_Health_and_Environmental_Change(String username, String applicationName, String administeringInstitution,
//																								   String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
//																								   String participatingInstitution2, String researchEffort2, String department2,
//																								   String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
//																								   String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
//																								   String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
//																								   String level3, String ciaEmail, String associateInvestigatorPosition,
//																								   String grantProposalFile, String salaryPackage, String budgetProposalFile, String positionFunction, String year1, String year2,
//																								   String relevantBackground) throws Exception {
//		grantDuration = "5";
//		extentManager.startTest("2020 Special Initiative in Human Health and Environmental Change", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//
//		applyScenario.loginPage().login(username);
//		applyScenario.homePage().openApplicationsPage();
//		applyScenario.applicationsPage().createNewApplication("2020 Special Initiative in Human Health and Environmental Change")
//				.setApplicationName(applicationName);
//
//		applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration);
//
//		applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1,
//				researchEffort1, department1, participatingInstitution2, researchEffort2, department2);
//		applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,
//				peerReviewArea1,  peerReviewArea2, peerReviewArea3,  researchKeyword1,
//				researchKeyword2,  researchKeyword3, researchKeyword4,  researchKeyword5,
//				burdenOfDiseases,  level1,  level2, level3);
//		applyScenario.researchTeamChiefInvestigatorTab().enterData(relevantBackground);
//		applyScenario.researchTeamAssociateInvestigatorTab().enterData(associateInvestigatorPosition, relevantBackground);
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().enterData(grantProposalFile);
//		applyScenario.thirdPartyResearchTab().enterData(grantProposalFile); //TODO: Change to third party research file
//		applyScenario.directResearchCosts().enterData(positionFunction, salaryPackage);
//
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//	}
//
//
//	//2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation
//	@Test
//	public void createApplication_2020CovidVaccine_CandidateResearch_Round_2_Stage_2_by_Invitation(String username, String applicationName, String administeringInstitution,
//																	 String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
//																	 String participatingInstitution2, String researchEffort2, String department2,
//																	 String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
//																	 String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
//																	 String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
//																	 String level3, String researchStream, String stipendCategory, String recentQualificationDate, String timeCommitment,
//																	 String ciaEmail, String relevantBackground, String salaryPackage, String grantProposalFile,
//																	 String budgetProposalFile, String positionFunction, String salaryLevel, String year1Value, String year2Value, String proposedDegree,
//																	 String primarySupervisorEmail  ) throws Exception
//
//	{
//		extentManager.startTest("2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//		applyScenario.loginPage().login(username);
//		applyScenario.homePage().openApplicationsPage();
//
//		applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
//				.setApplicationName("My Application");
//		applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration);
//		applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1,
//				researchEffort1, department1, participatingInstitution2, researchEffort2, department2);
//		applyScenario.researchClassificationTab().enterData(broadResearchArea,
//				researchField, peerReviewArea1, peerReviewArea2, peerReviewArea3, researchKeyword1,
//				researchKeyword2, researchKeyword3, researchKeyword4, researchKeyword5, burdenOfDiseases, level1, level2, level3);
//
//		applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().enterData(grantProposalFile);
//		applyScenario.declarationOfInterest().enterData(budgetProposalFile);
//		applyScenario.budgetProposalTab().enterData(budgetProposalFile);
//		applyScenario.directResearchCosts().enterData(positionFunction, salaryPackage);
//
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//
//	}
//
//
//
//	//COVID-19 Vaccine Candidate Research - Round 3 EOI
//	@Test
//	public void createApplication_Covid_Candidate_Research_Round3_EOI () throws Exception
//
//	{
//		extentManager.startTest("COVID-19 Vaccine Candidate Research - Round 3 EOI", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//
//
//		applyScenario.loginPage().login("Test2@test.com.au");
//		applyScenario.homePage().openApplicationsPage();
//
//		applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research - Round 3 EOI")
//				.setApplicationName("My Application");
//
//		// Call the tabs from here
//		applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "");
//
//		applyScenario.participatingInstitutionsTab().fillData();
//
//		applyScenario.researchClassificationTab().enterData("Basic Science",
//				"MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
//				"Gastroenterology",
//				"Epidemiology", "allergy testing",
//				"amniocentesis", "ascites", "adipocytes", "astrocytes", "100",
//				"Diseases of the Digestive",
//				"Liver disease", "Fatty Liver");
//
//		applyScenario.researchTeamTab().fillData();
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().fillData();
//
//		// default
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//
//	}
//
//
//	//COVID-19 Vaccine Candidate Research - Round 3 EOI
//	@Test
//	public void createApplication_Covid_Candidate_Research_Round3_EOI () throws Exception
//
//	{
//		extentManager.startTest("COVID-19 Vaccine Candidate Research - Round 3 EOI", "Golden Path Test Case");
//		extentManager.logPass("The application is opened in the browser");
//
//
//		applyScenario.loginPage().login("Test2@test.com.au");
//		applyScenario.homePage().openApplicationsPage();
//
//		applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research - Round 3 EOI")
//				.setApplicationName("My Application");
//
//		// Call the tabs from here
//		applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "");
//
//		applyScenario.participatingInstitutionsTab().fillData();
//
//		applyScenario.researchClassificationTab().enterData("Basic Science",
//				"MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
//				"Gastroenterology",
//				"Epidemiology", "allergy testing",
//				"amniocentesis", "ascites", "adipocytes", "astrocytes", "100",
//				"Diseases of the Digestive",
//				"Liver disease", "Fatty Liver");
//
//		applyScenario.researchTeamTab().fillData();
//		applyScenario.ethicsTab().enterData();
//		applyScenario.grantProposalTab().fillData();
//
//		// default
//		applyScenario.certifyTab().enterData();
//		applyScenario.finaliseApplication().enterData();
//		applyScenario.logoutPage().signout();
//
//	}
//
//
//}
//
//
