package tests.applicationform.apply.preprod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testbase.TestData;
import testbase.basetestclass.BaseTest;
import testbase.testscenario.ApplyScenario;


public class TestClass  extends BaseTest {


    private ApplyScenario applyScenario;

    @BeforeMethod(alwaysRun=true)
    public void beforeMethod() throws Exception
    {
        applyScenario = new ApplyScenario(driverObj);
        super.beforeMethod();
    }


    //MRFF Year 2
    @Test (groups= {"Golden Path_Application Form"}, dataProvider = "MRFF Year 2", dataProviderClass= TestData.class)
    public void createApplication_MRFF_Year_2(String username, String applicationName, String administeringInstitution,
                                              String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
                                              String participatingInstitution2, String researchEffort2, String department2,
                                              String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
                                              String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
                                              String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
                                              String level3, String researchStream, String stipendCategory, String recentQualificationDate, String timeCommitment,
                                              String ciaEmail, String relevantBackground, String salaryPackage, String grantProposalFile,
                                              String budgetProposalFile, String positionFunction, String salaryLevel, String year1, String year2, String proposedDegree,
                                              String primarySupervisorEmail  ) throws Exception

    {
        reportManager.startTest("MRFF Year 2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");
        applyScenario.loginPage().login(username);
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("MRFF Year 2")
                .setApplicationName(applicationName);

        applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration, "", "");
        applyScenario.participatingInstitutionsTab().fillData();
        applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,
                peerReviewArea1,  peerReviewArea2, peerReviewArea3,  researchKeyword1,
                researchKeyword2,  researchKeyword3, researchKeyword4,  researchKeyword5);

        applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().enterData(grantProposalFile);
        applyScenario.declarationOfInterest().enterData(grantProposalFile);

        applyScenario.budgetProposalTab().enterData(budgetProposalFile);
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }
	
//	//2020 Ideas Grant
//	@Test (dataProvider = "2020 Idea Grants", dataProviderClass= TestData.class)
//	public void createApplication_2020IdeasGrant(String username, String applicationName, String administeringInstitution,
//			String grantDuration, String participatingInstitution1, String researchEffort1, String department1, 
//			String participatingInstitution2, String researchEffort2, String department2,
//			String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
//			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
//			String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2, 
//			String level3, String ciaEmail, String relevantBackground, String grantProposalFile, 
//			String budgetProposalFile, String positionFunction, String salaryLevel, String year1Value, String year2Value) throws Exception
//	{
//		new LoginPage(browser, driver, ExtentManager).login(username);
//		new HomePage(browser, driver, ExtentManager).openApplicationsPage();
////		new ApplicationsPage(browser, driver, ExtentManager).createNewApplication("2020 Ideas Grant")
////		   .setApplicationName(applicationName);
////
////		new ApplicationDetailsTab(browser, driver, ExtentManager).enterData(administeringInstitution, grantDuration);
////
////		new ParticipatingInstitutionsTab(browser, driver, ExtentManager).enterData(participatingInstitution1, researchEffort1, department1,
////																	participatingInstitution2, researchEffort2, department2);
////		
////		new ResearchClassificationTab(browser, driver, ExtentManager).enterData(broadResearchArea,  researchField,  peerReviewArea1,  peerReviewArea2,
////				 peerReviewArea3,  researchKeyword1,  researchKeyword2,  researchKeyword3, 
////				 researchKeyword4,  researchKeyword5,  burdenOfDiseases,  level1,  level2, 
////				 level3);
////		
////		new ResearchTeamTab(browser, driver, ExtentManager).enterData(ciaEmail, relevantBackground);
////		new EthicsTab(browser, driver, ExtentManager).enterData();
//		
////		new GrantProposalTab(browser, driver, ExtentManager).enterData(grantProposalFile);
////		new StrategicPrioritiesTab(browser, driver, ExtentManager).enterData();
////		new BudgetProposalTab(browser, driver, ExtentManager).enterData(budgetProposalFile);
////		new DirectResearchCosts(browser, driver, ExtentManager).enterData(positionFunction, salaryLevel, year1Value, year2Value);
//	
////		new CertifyTab(browser, driver, ExtentManager).enterData();
////		new FinaliseApplication(browser, driver, ExtentManager).enterData();
//		new LogoutPage(browser, driver, ExtentManager).signout();
//	
//	}
//	
//	
//	//MRFF Year 2
//	@Test (dataProvider = "MRFF Year 2", dataProviderClass= TestData.class)
//	public void createApplication_MRFF_Year_2(String username, String applicationName, String administeringInstitution,
//			String grantDuration, String participatingInstitution1, String researchEffort1, String department1, 
//			String participatingInstitution2, String researchEffort2, String department2,
//			String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
//			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
//			String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2, 
//			String level3, String researchStream, String stipendCategory, String recentQualificationDate, String timeCommitment,
//			String ciaEmail, String relevantBackground, String salaryPackage, String grantProposalFile, 
//			String budgetProposalFile, String positionFunction, String salaryLevel, String year1, String year2, String proposedDegree, 
//			String primarySupervisorEmail  ) throws Exception
//	
//	{
//		new LoginPage(browser, driver).login(username);
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("MRFF Year 2")
//		   .setApplicationName(applicationName);
//
//		new ApplicationDetailsTab(browser, driver).enterData(administeringInstitution, grantDuration);
////		new CallSpecificInformation(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData(participatingInstitution1, researchEffort1, department1, participatingInstitution2, researchEffort2, department2);
//		new ResearchClassificationTab(browser, driver).enterData(broadResearchArea,  researchField,  peerReviewArea1,  peerReviewArea2, 
//				 peerReviewArea3,  researchKeyword1,  researchKeyword2,  researchKeyword3, 
//				 researchKeyword4,  researchKeyword5,  burdenOfDiseases,  level1,  level2, 
//				 level3);
//		
//		new ResearchTeamTab(browser, driver).enterData(ciaEmail, relevantBackground);
//		new EthicsTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData(budgetProposalFile);
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	
//	//2020 E-Asia Joint Research Program
//	@Test (dataProvider = "2020 E-Asia Joint Research Program", dataProviderClass= TestData.class)
//	public void createApplication_2020_EAsia(String username, String applicationName, String administeringInstitution,
//			String grantDuration, String aboriginalResearch, String callTopic, String fundingModality, String applicationUploadFile, 
//			String participatingInstitution1, String researchEffort1, String department1, 
//			String participatingInstitution2, String researchEffort2, String department2,
//			String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2, 
//			String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3, 
//			String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2, 
//			String level3, 
//			String ciaEmail, String relevantBackground, String salaryPackage, String grantProposalFile, 
//			String budgetProposalFile, String positionFunction, String salaryLevel, String year1, String year2 ) throws Exception
//	
//	{
//		new LoginPage(browser, driver).login(username);
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 E-Asia Joint Research Program")
//		   .setApplicationName("My Application");
//		
//		new ApplicationDetailsTab(browser, driver).enterData(administeringInstitution, grantDuration);
//		new ParticipatingInstitutionsTab(browser, driver).enterData(participatingInstitution1, researchEffort1, department1, participatingInstitution2, researchEffort2, department2);
//		new ResearchClassificationTab(browser, driver).enterData( broadResearchArea,  researchField,  peerReviewArea1,   
//				 peerReviewArea2, peerReviewArea3,  researchKeyword1,  researchKeyword2,  researchKeyword3, 
//				 researchKeyword4,  researchKeyword5,  burdenOfDiseases,  level1,  level2, level3);
//		
//		new ResearchTeamTab(browser, driver).enterData(ciaEmail, relevantBackground);
//		new EthicsTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData(budgetProposalFile);
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	
//	//2020 Ideas Grant
////	@Test
//	public void createApplication_2020IdeasGrant() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 Ideas Grant")
//		   .setApplicationName("My Application");
//
////		new ApplicationDetailsTab(browser, driver).enterData();
////		new ParticipatingInstitutionsTab(browser, driver).enterData();
////		new ResearchClassificationTab(browser, driver).enterData();
////		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
////
////		new GrantProposalTab(browser, driver).enterData();
////	
////		new StrategicPrioritiesTab(browser, driver).enterData();
////		new BudgetProposalTab(browser, driver).enterData();
////		new DirectResearchCosts(browser, driver).enterData();
////		new CertifyTab(browser, driver).enterData();
////		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//
//	//2020 CTCS BAU
//	@Test
//	public void createApplication_CtcsBau() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 CTCS BAU")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//
//		new GrantProposalTab(browser, driver).enterData();
//	
//		new StrategicPrioritiesTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//
//	
//	//2020 Development Grants PRD
//	//TBD
//	@Test
//	public void createApplication_2020DevGrants() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 Development Grants PRD")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	
//	//2019 NHMRC-NIHR Collaborative Research Grant Scheme Round 3 - November Submission
//	//TBD
//	@Test
//	public void createApplication_Round3NovemberSubmission() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2019 NHMRC-NIHR Collaborative Research Grant Scheme Round 3 - November Submission")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new CallSpecificInformation(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	
//	//2020 Clinical Trials and Cohort Studies Grants commencing 2021
//	//TBD
//	@Test
//	public void createApplication_2020ClinicalTrials() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 Clinical Trials")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		new StrategicPrioritiesTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//
//	//2020 Clinical Trials and Cohort Studies Grants commencing 2021
//	//TBD
//	@Test
//	public void createApplication_2020CovidVaccine() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 COVID-19 Vaccine")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//
//	//2020 COVID-19 Vaccine Candidate Research - Round 2  EOI
//	//TBD
//	@Test
//	public void createApplication_2020COVIDVaccine_Round2() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 EOI")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	//2020 E-Asia Joint Research
//	//TBD
//	@Test
//	public void createApplication_eAsia() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 E-Asia Joint Research")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new EAsiaSpecificInfo(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	//2020 Ideas Grants
//	//TBD
//	@Test
//	public void createApplication_2020IdeasGrants() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 Ideas Grants")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		
//		new StrategicPrioritiesTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	
//	//2020 Maternal Health GO
//	//TBD
//	@Test
//	public void createApplication_2020MaternalHealthGo() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 Maternal Health GO")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new DeclarationOfInterest(browser, driver).enterData();
//		
//		new GrantProposalTab(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	//2020 Million Minds Mission Mental Health Research
//	//TBD
//	@Test
//	public void createApplication_2020MillionMindsMission() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 Million Minds Mission")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		new DeclarationOfInterest(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//	
//	
//	//2020 MRFF - EPCDRI - Childhood Cancer Research
//	//TBD
//	@Test
//	public void createApplication_2020MrffEpcdri() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//	
//	{
//		new LoginPage(browser, driver).login("test2@test.com.au");
//		new HomePage(browser, driver).openApplicationsPage();
//		new ApplicationsPage(browser, driver).createNewApplication("2020 MRFF - EPCDRI - Childhood Cancer Research")
//		   .setApplicationName("My Application");
//
//		new ApplicationDetailsTab(browser, driver).enterData();
//		new ParticipatingInstitutionsTab(browser, driver).enterData();
//		new ResearchClassificationTab(browser, driver).enterData();
//		
//		new ResearchTeamTab(browser, driver).enterData();
//		new EthicsTab(browser, driver).enterData();
//		new GrantProposalTab(browser, driver).enterData();
//		
//		new DeclarationOfInterest(browser, driver).enterData();
//		new BudgetProposalTab(browser, driver).enterData();
//		new DirectResearchCosts(browser, driver).enterData();
//		
//		new CertifyTab(browser, driver).enterData();
//		new FinaliseApplication(browser, driver).enterData();
//		new LogoutPage(browser, driver).signout();
//	
//	}
//
//	
//	//2020 Parnership Projects Rollover Round-A
//		//TBD
//		@Test
//		public void createApplication_2020PartnershipProjects() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//		
//		{
//			new LoginPage(browser, driver).login("test2@test.com.au");
//			new HomePage(browser, driver).openApplicationsPage();
//			new ApplicationsPage(browser, driver).createNewApplication("2020 Parnership Projects Rollover")
//			   .setApplicationName("My Application");
//
//			new ApplicationDetailsTab(browser, driver).enterData();
//			new ParticipatingInstitutionsTab(browser, driver).enterData();
//			new ResearchClassificationTab(browser, driver).enterData();
//			
//			new ResearchTeamTab(browser, driver).enterData();
//			new EthicsTab(browser, driver).enterData();
//			new GrantProposalTab(browser, driver).enterData();
//			
//			new FundingParters(browser, driver).enterData();
//			new PartnerDetails(browser, driver).enterData();
//			
//			new BudgetProposalTab(browser, driver).enterData();
//			new DirectResearchCosts(browser, driver).enterData();
//			
//			new CertifyTab(browser, driver).enterData();
//			new FinaliseApplication(browser, driver).enterData();
//			new LogoutPage(browser, driver).signout();
//		
//		}
//
//
//		
//		//2020 NHMRC-EU Collaborative Research Grant Scheme
//			//TBD
//			@Test
//			public void createApplication_2020CollaborativeResearchGrant() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//			
//			{
//				new LoginPage(browser, driver).login("test2@test.com.au");
//				new HomePage(browser, driver).openApplicationsPage();
//				new ApplicationsPage(browser, driver).createNewApplication("2020 NHMRC-EU Collaborative Research Grant Scheme")
//				   .setApplicationName("My Application");
//
//				new ApplicationDetailsTab(browser, driver).enterData();
//				new CallSpecificInformation(browser, driver).enterData();
//				new ParticipatingInstitutionsTab(browser, driver).enterData();
//				new ResearchClassificationTab(browser, driver).enterData();
//				
//				new ResearchTeamTab(browser, driver).enterData();
//				new EthicsTab(browser, driver).enterData();
//				new PartnerDetailsWithoutCountry(browser, driver).enterData();
//				
//				new FundingParters(browser, driver).enterData();
//				new PartnerDetails(browser, driver).enterData();
//				
//				new BudgetProposalTab(browser, driver).enterData();
//				new DirectResearchCosts(browser, driver).enterData();
//				
//				new CertifyTab(browser, driver).enterData();
//				new FinaliseApplication(browser, driver).enterData();
//				new LogoutPage(browser, driver).signout();
//			
//			}
//
//
//			//NHMRC MRFF Single Year ATSI Non Mandatory
//			//TBD
//			@Test
//			public void createApplication_MRFFSingleYear() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//			{
//				new LoginPage(browser, driver).login("test2@test.com.au");
//				new HomePage(browser, driver).openApplicationsPage();
//				new ApplicationsPage(browser, driver).createNewApplication("NHMRC MRFF Single Year")
//				   .setApplicationName("My Application");
//
//				new ApplicationDetailsTab(browser, driver).enterData();
//				new ParticipatingInstitutionsTab(browser, driver).enterData();
//				new ResearchClassificationTab(browser, driver).enterData();
//				
//				new ResearchTeamTab(browser, driver).enterData();
//				new EthicsTab(browser, driver).enterData();
//				new GrantProposalTab(browser, driver).enterData();
//				
//				new DeclarationOfInterest(browser, driver).enterData();
//				new BudgetProposalTab(browser, driver).enterData();
//				new DirectResearchCosts(browser, driver).enterData();
//				
//				new CertifyTab(browser, driver).enterData();
//				new FinaliseApplication(browser, driver).enterData();
//				new LogoutPage(browser, driver).signout();
//			
//			}
//
//			//NHMRC MRFF EPCDRI - Medical Cannabis Clinical Trials
//			//TBD
//			@Test
//			public void createApplication_MRFF_EPCDRI() throws GeneralLeanFtException, InterruptedException, ReportException, AWTException
//			{
//				new LoginPage(browser, driver).login("test2@test.com.au");
//				new HomePage(browser, driver).openApplicationsPage();
//				new ApplicationsPage(browser, driver).createNewApplication("2020 MRFF - EPCDRI - Medicinal")
//				   .setApplicationName("My Application");
//
//				new ApplicationDetailsTab(browser, driver).enterData();
//				new ParticipatingInstitutionsTab(browser, driver).enterData();
//				new ResearchClassificationTab(browser, driver).enterData();
//				
//				new ResearchTeamTab(browser, driver).enterData();
//				new EthicsTab(browser, driver).enterData();
//				new GrantProposalTab(browser, driver).enterData();
//				
//				new DeclarationOfInterest(browser, driver).enterData();
//				new BudgetProposalTab(browser, driver).enterData();
//				new DirectResearchCosts(browser, driver).enterData();
//				
//				new CertifyTab(browser, driver).enterData();
//				new FinaliseApplication(browser, driver).enterData();
//				new LogoutPage(browser, driver).signout();
//			
//			}
//			

	
	



	
	

	

}
