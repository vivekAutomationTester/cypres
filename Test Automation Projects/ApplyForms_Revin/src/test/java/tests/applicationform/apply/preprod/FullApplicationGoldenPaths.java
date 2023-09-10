package tests.applicationform.apply.preprod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.basetestclass.BaseTest;
import testbase.testdata.ApplyTestData;
import testbase.testscenario.ApplyScenario;

public class FullApplicationGoldenPaths extends BaseTest {

    private ApplyScenario applyScenario;

    @BeforeMethod(alwaysRun=true)
    public void beforeMethod() throws Exception
    {
        applyScenario = new ApplyScenario(driverObj);
        super.beforeMethod();
    }

    //Primary Health Care Research is being used for GO
    @Test(groups= {"Golden Path_Full_Apply"}, dataProvider = "NHMRC MRFF Single Year ATSI Non Mandatory", dataProviderClass= ApplyTestData.class)
    public void test_Apply_Golden_Path(String username, String password, String applicationName, String administeringInstitution,
                                                   String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
                                                   String participatingInstitution2, String researchEffort2, String department2,
                                                   String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
                                                   String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
                                                   String researchKeyword4, String researchKeyword5, String burdenOfDiseases,
                                                   String level1, String level2, String level3,
                                                   String ciaEmail, String relevantBackground, String grantProposalFile,
                                                   String budgetProposalFile, String declarationOfInterestFile, String positionFunction, String salaryPackage,
                                                   String year1Value, String year2Value, String minDataWarningDate, String minDataDeadlineDate,
                                                   String startDate, String endDate) throws Exception

    {

        createNonMinDataApplication(username, password, applicationName);
        createNoSubmitApplication(username, password, applicationName, administeringInstitution, grantDuration,
                                  participatingInstitution1, researchEffort1, department1, participatingInstitution2,
                                  researchEffort2, department2, broadResearchArea, researchField, peerReviewArea1, peerReviewArea2,
                                  peerReviewArea3, researchKeyword1, researchKeyword2, researchKeyword3, researchKeyword4,
                                  researchKeyword5, burdenOfDiseases, level1, level2, level3, ciaEmail, relevantBackground,
                                  grantProposalFile, budgetProposalFile, declarationOfInterestFile, positionFunction,
                                  salaryPackage, year1Value, year2Value);
        createMinDataApplication(username, password, applicationName, administeringInstitution, grantDuration,
                                 participatingInstitution1, researchEffort1, department1, participatingInstitution2,
                                 researchEffort2, department2, broadResearchArea, researchField, peerReviewArea1, peerReviewArea2,
                                 peerReviewArea3, researchKeyword1, researchKeyword2, researchKeyword3, researchKeyword4,
                                 researchKeyword5, burdenOfDiseases, level1, level2, level3, ciaEmail, relevantBackground,
                                 grantProposalFile, budgetProposalFile, declarationOfInterestFile, positionFunction,
                                 salaryPackage, year1Value, year2Value);




    }

    public void createNonMinDataApplication(String username, String password, String applicationName) throws Exception {
        // Create an application that is non min-data compliant
        reportManager.logPass("Started non min-data compliant application");

        applyScenario.loginPage().login(username, password);
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2020 Primary Health Care Research")
                .setApplicationName(applicationName);

        applyScenario.logoutPage().signout();

    }

    public void createNoSubmitApplication(String username, String password, String applicationName, String administeringInstitution,
                                          String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
                                          String participatingInstitution2, String researchEffort2, String department2,
                                          String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
                                          String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
                                          String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
                                          String level3, String ciaEmail, String relevantBackground, String grantProposalFile, String declarationOfInterestFile,
                                          String budgetProposalFile, String positionFunction, String salaryPackage, String year1Value, String year2Value) throws Exception {
        // Create an application that is min-data compliant but is not submitted
        reportManager.startTest("2020 Primary Health Care Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");
        applyScenario.loginPage().login(username, password);

        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2020 Primary Health Care Research")
                .setApplicationName(applicationName);

//        applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration, "", "");
        applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1,
                researchEffort1, department1);
        applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,
                peerReviewArea1,  peerReviewArea2, peerReviewArea3,  researchKeyword1,
                researchKeyword2,  researchKeyword3, researchKeyword4,  researchKeyword5);

        applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().enterData(grantProposalFile);
        applyScenario.declarationOfInterest().enterData(declarationOfInterestFile);

        applyScenario.budgetProposalTab().enterData(budgetProposalFile);
        applyScenario.directResearchCosts().enterData(positionFunction, salaryPackage);

        applyScenario.logoutPage().signout();


    }

    public void createMinDataApplication(String username, String password, String applicationName, String administeringInstitution,
                                         String grantDuration, String participatingInstitution1, String researchEffort1, String department1,
                                         String participatingInstitution2, String researchEffort2, String department2,
                                         String broadResearchArea, String researchField, String peerReviewArea1, String peerReviewArea2,
                                         String peerReviewArea3, String researchKeyword1, String researchKeyword2, String researchKeyword3,
                                         String researchKeyword4, String researchKeyword5, String burdenOfDiseases, String level1, String level2,
                                         String level3, String ciaEmail, String relevantBackground, String grantProposalFile, String declarationOfInterestFile,
                                         String budgetProposalFile, String positionFunction, String salaryPackage, String year1Value, String year2Value) throws Exception {
        // Create an application that is min-data compliant and submit it
        reportManager.startTest("2020 Primary Health Care Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");
        applyScenario.loginPage().login(username, password);

        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2020 Primary Health Care Research")
                .setApplicationName(applicationName);

//        applyScenario.applicationDetailsTab().enterData(administeringInstitution, grantDuration, "", "");
        applyScenario.participatingInstitutionsTab().enterData(participatingInstitution1,
                researchEffort1, department1);
        applyScenario.researchClassificationTab().enterData(broadResearchArea,  researchField,
                peerReviewArea1,  peerReviewArea2, peerReviewArea3,  researchKeyword1,
                researchKeyword2,  researchKeyword3, researchKeyword4,  researchKeyword5);

        applyScenario.researchTeamTab().enterData(ciaEmail, relevantBackground);
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().enterData(grantProposalFile);
        applyScenario.declarationOfInterest().enterData(declarationOfInterestFile);

        applyScenario.budgetProposalTab().enterData(budgetProposalFile);
        applyScenario.directResearchCosts().enterData(positionFunction, salaryPackage);
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
    }


    public void configureGrantOpportunityToOpen(String minDataWarningDate, String minDataDeadlineDate, String startDate, String endDate) throws Exception {
        // PREPROD Link: https://nhmrcomnistar3uat.f1solutions.com.au/OmniBase#system/round
        //TODO: add method to navigate to GO page
        applyScenario.grantOpportunitySearchPage().enterData();
        applyScenario.grantOpportunityEditPage().configureMinDataDates(minDataWarningDate, minDataDeadlineDate)
                                               .configureStartEndDate(startDate, endDate)
                                               .saveGOChanges();

    }


}
