package tests.applicationform.apply.bauqa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testbase.basetestclass.BaseTest;
import testbase.testscenario.ApplyScenario;

public class CurrentTests_Tahneia extends BaseTest {
    private ApplyScenario applyScenario;

    @BeforeMethod(alwaysRun=true)
    public void beforeMethod() throws Exception
    {
        super.beforeMethod();
        applyScenario = new ApplyScenario(driverObj);
    }

// C

    //Centres of Research Excellence - Clinical Research
    @Test
    public void createApplication_Centres_of_Research_Excellence_Clinical_Research () throws Exception
    {
        reportManager.startTest("Centres of Research Excellence - Clinical Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Clinical Research")
                .setApplicationName("New Application");


        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.alternativeResearchTeamTab().enterData();

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();
//        applyScenario.budgetProposalDRCAndEquipmentTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.applicationDetailsTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //Centres of Research Excellence - Health Services Research
    @Test
    public void createApplication_Centres_Research_Excellence_Health_Services_Research () throws Exception
    {
        reportManager.startTest("Centres of Research Excellence - Health Services Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Health Services Research")
                .setApplicationName("New Application");

        // Centre of Research Excellence Type list box does not work
        applyScenario.applicationDetailsTab().enterData( "Baker Heart and Diabetes Institute", "5", "", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.alternativeResearchTeamTab().enterData();

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.budgetProposalDRCAndEquipmentTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //Centres of Research Excellence - Public Health
    @Test
    public void createApplication_Centres_Research_Excellence_Public_Health () throws Exception
    {
        reportManager.startTest("Centres of Research Excellence - Public Health", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Public Health")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.alternativeResearchTeamTab().enterData();

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //Centres of Research Excellence - Dementia Research
    @Test
    public void createApplication_Centres_of_Research_Excellence_Dementia_Research () throws Exception
    {
        reportManager.startTest("Centres of Research Excellence - Clinical Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Clinical Research")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.alternativeResearchTeamTab().enterData();
//        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    // Clinical Trials and Cohort Studies
    @Test
    public void createApplication_2020_Clinical_Trials_and_Cohort_Studies () throws Exception
    {
        reportManager.startTest("2020 Clinical Trials and Cohort Studies", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Clinical Trials and Cohort Studies")
                .setApplicationName("My Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
//        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");
        applyScenario.researchTeamTab().fillData();

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.strategicPrioritiesTab().fillData();
        applyScenario.budgetProposalTab().fillData();

        applyScenario.directResearchCostsTest().enterData();
        applyScenario.addOtherResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();

        applyScenario.logoutPage().signout();
    }

    // NHMRC-NIHR Collaborative Research Grant Scheme
    @Test
    public void createApplication_NHMRC_NIHR_Collaborative_Research_Grant_Scheme () throws Exception
    {
        reportManager.startTest("NHMRC-NIHR Collaborative Research Grant Scheme", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

//        for (int i = 0; i <= 1; i++) {

            applyScenario.applicationsPage().createNewApplication("NIHR Collaborative Research Grant Scheme")
                    .setApplicationName("New Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().fillData(); //.setIrecAsNo()

            // call specific info tab
            applyScenario.alternativeCallSpecificInformationTab().fillData();


            applyScenario.participatingOrganisationsTab().enterData();
            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.ethicsTab().enterData();

            applyScenario.thirdPartyResearchTab().fillData();

            applyScenario.directResearchCosts().fillData();

            applyScenario.researchTeamTab().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
//        }
        applyScenario.logoutPage().signout();
    }

    // NHMRC-NIHR Collaborative Research Grant Scheme Round 2
    @Test
    public void createApplication_NHMRC_NIHR_Collaborative_Research_Grant_Scheme_Round2 () throws Exception
    {
        reportManager.startTest("NHMRC-NIHR Collaborative Research Grant Scheme Round 2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

        for (int i = 0; i <= 1; i++) {

            applyScenario.applicationsPage().createNewApplication("NHMRC-NIHR Collaborative Research Grant Scheme Round 2")
                    .setApplicationName("New Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", ""); //.setIrecAsNo()

            // call specific info tab
            applyScenario.alternativeCallSpecificInformationTab().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.ethicsTab().enterData();

            applyScenario.thirdPartyResearchTab().fillData();

            applyScenario.directResearchCosts().fillData();
            applyScenario.addOtherResearchCosts().fillData();

            applyScenario.researchTeamTab().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
        }
        applyScenario.logoutPage().signout();
    }

    // NHMRC-NIHR Collaborative Research Grant Scheme Round 3
    @Test
    public void createApplication_NHMRC_NIHR_Collaborative_Research_Grant_Scheme_Round3 () throws Exception
    {
        reportManager.startTest("NHMRC-NIHR Collaborative Research Grant Scheme Round 3", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

        for (int i = 0; i <= 1; i++) {

            applyScenario.applicationsPage().createNewApplication("NHMRC-NIHR Collaborative Research Grant Scheme Round 3")
                    .setApplicationName("New Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", ""); //.setIrecAsNo()

            // call specific info tab
            applyScenario.alternativeCallSpecificInformationTab().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.ethicsTab().enterData();

            applyScenario.budgetProposalTab().fillData();

            applyScenario.directResearchCosts().fillData();
            applyScenario.addOtherResearchCosts().fillData();

            applyScenario.researchTeamTab().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
        }
        applyScenario.logoutPage().signout();
    }

    //COVID-19 VCR Round 2 EOI
    @Test
    public void createApplication_CovidVaccine_Round2_EOI () throws Exception
    {
        reportManager.startTest("COVID-19 VCR Round 2 EOI", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 EOI")
                .setApplicationName("SIT2 test application");

        // Call the tabs from here
        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();

        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

    //COVID-19 VCR Round 2 Stage 2 by Invitation
    @Test
    public void createApplication_CovidVaccine_Round2_Stage2_Invitation () throws Exception
    {
        reportManager.startTest("COVID-19 VCR Round 2 Stage 2 by Invitation", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
                .setApplicationName("Demo Application");

        // Call the tabs from here

//        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();

        applyScenario.applicationDetailsTab().fillData();

        applyScenario.directResearchCosts().fillData();
//        applyScenario.addOtherResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //COVID-19 VCR Round3 EOI
    @Test
    public void createApplication_CovidVaccine_Round3_EOI () throws Exception
    {
        reportManager.startTest("COVID-19 VCR Round 3 EOI", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 3 EOI")
                .setApplicationName("Test application");

        // Call the tabs from here
        applyScenario.applicationDetailsTab().fillData();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();

        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

    //COVID-19 VCR Round 3 Stage 2 by Invitation
    @Test
    public void createApplication_CovidVaccine_Round3_Stage2_Invitation () throws Exception
    {
        reportManager.startTest("COVID-19 VCR Round 3 Stage 2 by Invitation", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research - Round 3 Stage 2 - by Invitation")
                .setApplicationName("test application");

        // Call the tabs from here

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
//        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();

//        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

// D

    //Development Grants
    @Test
    public void createApplication_DevelopmentGrants() throws Exception
    {
        reportManager.startTest("Development Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test.Researcher10@testdata.email");
        applyScenario.homePage().openApplicationsPage();

//        for(int i=0;i<=7;i++) {
            applyScenario.applicationsPage().createNewApplication("Development Grants")
                    .setApplicationName("SIT Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().fillData();
            applyScenario.participatingInstitutionsTab().fillData();
            applyScenario.ethicsTab().enterData();
            applyScenario.grantProposalTab().fillData();
            applyScenario.thirdPartyResearchTab().fillData();
            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");
            applyScenario.researchTeamTab().fillData();

            applyScenario.directResearchCosts().fillData();



            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
//        }
        applyScenario.logoutPage().signout();
    }

// E

    //e-ASIA Joint Research Program
    @Test
    public void createApplication_eAsia_Joint_Research_Program() throws Exception
    {
        reportManager.startTest("e-ASIA Joint Research Program", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("NHMRC e-ASIA 2021 Joint Research Program")//NHMRC e-ASIA 2021 Joint Research Program ; 2020 NHMRC e-ASIA JRP
                .setApplicationName("New Application");

        // Call the tabs from here
        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();


        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Health Services Research",
                "Gastroenterology",
                "Epidemiology",  "allergy testing",
                "amino acids", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();

        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.directResearchCosts().fillData();

        applyScenario.callSpecificInformation().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //European Union Joint Programme on Neurodegenerative Disease Research
    @Test
    public void createApp_European_Union_Joint_Programme_Neurodegenerative_Disease_Research() throws Exception
    {
        reportManager.startTest("European Union Joint Programme on Neurodegenerative Disease Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("European Union Joint Programme on Neurodegenerative Disease Research")
                .setApplicationName("New Application");

    //        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

// G

    //2019 GACD Cancer Prevention Call
    @Test
    public void createApplication_2019_GACD_Cancer_Prevention() throws Exception
    {
        reportManager.startTest("2019 GACD Cancer Prevention", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

//        for (int i=0; i<=8; i++) {

            applyScenario.applicationsPage().createNewApplication("2019 GACD Cancer Prevention Call")
                    .setApplicationName("New Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

            applyScenario.alternativeCallSpecificInformationTab().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().fillData();

            applyScenario.ethicsTab().enterData();

            applyScenario.thirdPartyResearchTab().fillData();

            applyScenario.directResearchCostsTest().enterData();
            applyScenario.addOtherResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();

//        }
        applyScenario.logoutPage().signout();
    }

    //Genomics Health Futures Mission - Streams 1-2
    @Test
    public void createApplication_Genomics_Health_Futures_Mission_Streams_1_2() throws Exception
    {
        reportManager.startTest("Genomics Health Futures Mission - Streams 1-23", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");



        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Genomics Health Futures Mission - Streams 1-2")
            .setApplicationName("My Application");

        // Call the tabs from here
//         applyScenario.applicationDetailsTab().fillData();

         applyScenario.participatingInstitutionsTab().fillData();

         applyScenario.researchClassificationTab().enterData("Basic Science",
            "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
            "Gastroenterology",
            "Epidemiology", "allergy testing",
            "amniocentesis", "ascites", "adipocytes", "astrocytes");

         applyScenario.researchTeamTab().fillData();
         applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //Genomics Health Futures Mission - Stream 3
    @Test
    public void createApplication_Genomics_Health_Futures_Mission_Stream3() throws Exception
    {
        reportManager.startTest("Genomics Health Futures Mission - Stream 3", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Genomics Health Futures Mission - Stream 3")
                .setApplicationName("New Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().fillData(); //Stream 3 - Targeted Call for Research
//
//        applyScenario.participatingInstitutionsTab().fillData();
//
//        applyScenario.researchClassificationTab().enterData("Basic Science",
//                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
//                "Gastroenterology",
//                "Epidemiology", "allergy testing",
//                "amniocentesis", "ascites", "adipocytes", "astrocytes", "100",
//                "Diseases of the Digestive",
//                "Liver disease", "Fatty Liver");

        applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");
        applyScenario.researchTeamAssociateInvestigatorTab().enterData("Tester", "Good worker");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();

        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

// I

    //Ideas Grant
    @Test
    public void createApplication_IdeasGrant() throws Exception
    {
        reportManager.startTest("Idea Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

//        for(int i=0; i<=2; i++) {
            applyScenario.applicationsPage().createNewApplication("2021 Ideas Grant")
                    .setApplicationName("Regression Test Application");

            applyScenario.applicationDetailsTab().fillData();

            //applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().fillData();
            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();
            applyScenario.thirdPartyResearchTab().fillData();

            applyScenario.directResearchCosts().fillData();
//            applyScenario.addOtherResearchCosts().fillData();

            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
//        }
        applyScenario.logoutPage().signout();
    }


    //Indigenous Health Research Fund
    @Test
    public void createApplication_Indigenous_Health_Research_Fund () throws Exception
    {
        reportManager.startTest("Indigenous Health Research Fund", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Indigenous Health Research Fund")
                .setApplicationName("My Application");

        // Call the tabs from here
    //        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "Stream 1 - Incubator", "Topic A");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

    //2021 Innovative Therapies for Mental Illness
    @Test
    public void createApplication_2021_Innovative_Therapies_for_Mental_Illness() throws Exception
   {
        reportManager.startTest("2021 Innovative Therapies for Mental Illness", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2021 Innovative Therapies for Mental Illness")
                .setApplicationName("Regression Test Application");

        // Call the tabs from here
    //        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();


        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //MRFF International Clinical Trial Collaborations - ICTC 21-1
    @Test
    public void createApplication_International_Clinical_Trial_Collaborations_ICTC_21_1() throws Exception
    {
        reportManager.startTest("MRFF International Clinical Trial Collaborations - ICTC 21-1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();


        applyScenario.applicationsPage().createNewApplication("2021 MRFF International Clinical Trial Collaborations - ICTC 21-1")
                .setApplicationName("Regression Test Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().fillData();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.partnerOrganisationsTab().fillData();
        applyScenario.partnerDetailsTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();
        // does not run direct research cost automatically.

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();

        applyScenario.logoutPage().signout();
    }

    //MRFF International Clinical Trial Collaborations - ICTC 21-2
    @Test
    public void createApplication_International_Clinical_Trial_Collaborations_ICTC_21_2() throws Exception
    {
        reportManager.startTest("MRFF International Clinical Trial Collaborations - ICTC 21-2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2021 MRFF International Clinical Trial Collaborations - ICTC 21-2")
                .setApplicationName("New Application");

        // Call the tabs from here
        applyScenario.applicationDetailsTab().fillData();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.partnerOrganisationsTab().fillData();
        applyScenario.partnerDetailsTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();
        // does not run direct research cost automatically.

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();

        applyScenario.logoutPage().signout();
    }

   //2021 Investigator Grants
    @Test
    public void createApplication_investigatorGrant() throws Exception
    {
        reportManager.startTest("2021 Investigator Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        for (int i=0; i<=4; i++) {
            applyScenario.applicationsPage().createNewApplication("2021 Investigator Grants")
                    .setApplicationName("New Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.ethicsTab().enterData();
            applyScenario.researcherTab().fillData();

            applyScenario.salaryDeclarationSummaryTab().enterData();

            applyScenario.strategicPrioritiesAndFundingPartnersTab().enterData();
            applyScenario.trackRecord().fillData();

            applyScenario.grantProposalTab().fillData();
            applyScenario.relativeToOpportunityTab().enterData();


            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
        }
        applyScenario.logoutPage().signout();
    }

// M

    //Maternal First 2000 Days and Childhood Health
    @Test
    public void createApplication_Maternal_First_2000_Days_Childhood_Health() throws Exception
    {
        reportManager.startTest("2020 Maternal First 2000 Days and Childhood Health", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Maternal First 2000 Days and Childhood Health")
                .setApplicationName("New Application");

        // Call the tabs from here

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.applicationDetailsTab().fillData();
        applyScenario.directResearchCosts().fillData();
        applyScenario.participatingInstitutionsTab().fillData();


        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

// N

    //2020 National Network for Aboriginal and Torres Strait Islander Health Researchers
    @Test
    public void createApplication_2020_National_Network_for_Aboriginal_and_Torres_Strait_Islander_Health_Researchers() throws Exception
    {
        reportManager.startTest("2020 National Network for Aboriginal and Torres Strait Islander Health Researchers", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2020 National Network for Aboriginal and Torres Strait Islander Health Researchers")
                .setApplicationName("My Application");

        // Call the tabs from here
        applyScenario.applicationDetailsTab().fillData();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");
        applyScenario.researchTeamAssociateInvestigatorTab().enterData("Tester", "Good worker");
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();


        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

    //EPCDR - Neurofibromatosis Research
    @Test
    public void createApplication_EPCDR_Neurofibromatosis_Research() throws Exception
    {
        reportManager.startTest("EPCDR - Neurofibromatosis Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("MRFF - EPCRDI - Neurofibromatosis Research")
                .setApplicationName("My Application");

        // Call the tabs from here
        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCostsTest().enterData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

// P

    //Partnership Projects PRC1
    //couldn't find apply/BudgetProposal.pdf
    @Test
    public void createApplication_Partnership_Projects_PRC1() throws Exception
    {
        reportManager.startTest("Partnership Projects PRC1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

        for(int i=0; i<=7; i++) {
            applyScenario.applicationsPage().createNewApplication("2021 Partnership Projects PRC1")
                    .setApplicationName("New Application");

            applyScenario.applicationDetailsTab().fillData();

            applyScenario.partnerOrganisationsTab().fillData();
            applyScenario.partnerDetailsTab().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().fillData();
            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();
            applyScenario.fundingPartners().fillData();

            applyScenario.addPartnerContribution().fillData();
            applyScenario.thirdPartyResearchTab().fillData();

            applyScenario.directResearchCostsTest().enterData();
            applyScenario.addOtherResearchCosts().fillData();

            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
        }
        applyScenario.logoutPage().signout();

    }

    //Partnership Projects PRC2
    @Test
    public void createApplication_Partnership_Projects_PRC2() throws Exception
    {
        reportManager.startTest("Partnership Projects PRC2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
    //        for(int i=0; i<=1; i++) {
        applyScenario.applicationsPage().createNewApplication("2021 Partnership Projects PRC2")
                .setApplicationName("Regression Test Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        applyScenario.fundingPartners().fillData();
        applyScenario.partnerOrganisationsTab().fillData();

        applyScenario.partnerDetailsTab().fillData();
        applyScenario.addPartnerContribution().fillData();

        applyScenario.thirdPartyResearchTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
    //        }
        applyScenario.logoutPage().signout();

    }

    //Partnership Projects PRC3
    @Test
    public void createApplication_Partnership_Projects_PRC3() throws Exception
    {
        reportManager.startTest("Partnership Projects PRC3", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
    //        for(int i=0; i<=1; i++) {
        applyScenario.applicationsPage().createNewApplication("2021 Partnership Projects PRC3")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        applyScenario.fundingPartners().fillData();
        applyScenario.partnerOrganisationsTab().fillData();

        applyScenario.partnerDetailsTab().fillData();
        applyScenario.addPartnerContribution().fillData();

        applyScenario.thirdPartyResearchTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
    //        }
        applyScenario.logoutPage().signout();
    }

    // Postgraduate Scholarships
    @Test
    public void createApp_2020_Postgraduate_Scholarships() throws Exception
    {
        reportManager.startTest("2020 Postgraduate Scholarships", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2021 Postgraduate Scholarships")
                .setApplicationName("Regression Test Application");

        applyScenario.applicationDetailsTab().fillData();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.keyApplicationInformationTab().fillData();
        applyScenario.enrolmentQualificationsAndExperienceTab().fillData();

        applyScenario.researchAndCareerInformationTab().fillData();
        applyScenario.scholarshipAttachments().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.logoutPage().signout();
        applyScenario.loginPage().login("Test2@test.com.au");

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
    }

// S

    //Special Initiative in Human Health and Environmental Change
    @Test
    public void createApp_Special_Initiative_Human_Health_Environmental_Change() throws Exception
    {
        reportManager.startTest("Special Initiative in Human Health and Environmental Change", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Chief.Investigator@testdata.email");
        applyScenario.homePage().openApplicationsPage();

//        for(int i=0; i<=2; i++)
//        {
            applyScenario.applicationsPage().createNewApplication("Special Initiative in Human Health and Environmental Change")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().fillData();
//
//            applyScenario.participatingInstitutionsTab().fillData();
//
//            applyScenario.researchClassificationTab().enterData("Basic Science",
//                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
//                    "Gastroenterology",
//                    "Epidemiology", "allergy testing",
//                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");
            applyScenario.researchTeamAssociateInvestigatorTab().enterData("Tester", "Good worker");

            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();

            applyScenario.budgetProposalTab().fillData();

            applyScenario.directResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
            Thread.sleep(3000);
//        }
        applyScenario.logoutPage().signout();

    }


    //2021 Synergy Grants
    @Test
    public void createApplication_2021_Synergy_Grants() throws Exception
    {
        reportManager.startTest("2021 Synergy Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2021 Synergy Grants")
                .setApplicationName("SIT2 test application");

        // Call the tabs from here

        applyScenario.synergyResearchTeamTab().fillData();
        applyScenario.synergyTrackRecordTab().fillData();

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();
        applyScenario.fundingOrganisationsTab().enterData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();

        applyScenario.logoutPage().signout();
    }

// T

    //2020 TCR: End of Life Care
    @Test
    public void createApplication_2020_TCR_End_of_Life_Care() throws Exception
    {
        reportManager.startTest("2020 TCR: End of Life Care", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("End of Life Care")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.directResearchCostsTest().enterData();
        applyScenario.addOtherResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //2021 TCR - Participation in Cancer Screening Programmes
    @Test
    public void createApplication_2020_TCR_Participation_in_Cancer_Screening_Programmes() throws Exception
    {
        reportManager.startTest("2021 TCR: End of Life Care", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2021 TCR - Participation in Cancer Screening Programmes")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.directResearchCostsTest().enterData();
        applyScenario.addOtherResearchCosts().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //2021 Rare Cancers Rare Diseases and Unmet Need - Streams 1_3_4_5_6 and 7
    @Test
    public void createApplication_2021_Rare_Cancers_Rare_Diseases_and_Unmet_Need_Streams_1_3_4_5_6_and_7() throws Exception
    {
        reportManager.startTest("2021 Rare Cancers Rare Diseases and Unmet Need - Streams 1_3_4_5_6 and 7", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2021 Rare Cancers Rare Diseases and Unmet Need - Streams 1_3_4_5_6 and 7")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
//        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //2021 Rare Cancers Rare Diseases and Unmet Need - Streams 2
    @Test
    public void createApplication_2021_Rare_Cancers_Rare_Diseases_and_Unmet_Need_Stream_2_only() throws Exception
    {
        reportManager.startTest("2021 Rare Cancers Rare Diseases and Unmet Need - Stream 2 only", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2021 Rare Cancers Rare Diseases and Unmet Need - Stream 2 only")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
//        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //2020 NHMRC-EU Collaborative Research Grant Scheme
    @Test
    public void createApplication_2020_NHMRC_EU_Collaborative_Research_Grant_Scheme() throws Exception
    {
        reportManager.startTest("2020 NHMRC-EU Collaborative Research Grant Scheme", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2020 NHMRC-EU Collaborative Research Grant Scheme")
                .setApplicationName("New Application");

        applyScenario.applicationDetailsTab().fillData().setIrecAsNo();
        applyScenario.alternativeCallSpecificInformationTab().fillData();
        applyScenario.partnerOrganisationsTab().fillData();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();

        applyScenario.thirdPartyResearchTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //Other

    //Fill Supervisor Form
    @Test
    public void createApplication_Fill_Supervisor_Form() throws Exception
    {
        reportManager.startTest("Supervisor Form", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test1@test.com.au");
        applyScenario.postgradForm().postgradForm();
        applyScenario.postgradForm().openFormPage();
        applyScenario.informationAboutApplicantTab().enterData();
        applyScenario.yourDetailsTab().enterData();
        applyScenario.logoutPage().signout();
    }
    //Delete Supervisor Form
    @Test
    public void createApplication_Delete_Supervisor_Form() throws Exception
    {
        reportManager.startTest("Supervisor Form", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test1@test.com.au");
        applyScenario.postgradForm().postgradForm();
        applyScenario.postgradForm().deleteFormPage();
        applyScenario.logoutPage().signout();
    }

}