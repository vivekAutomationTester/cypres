package tests.applicationform.apply.bauqa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testbase.basetestclass.BaseTest;
import testbase.testscenario.ApplyScenario;

public class CurrentTests extends BaseTest {

    private ApplyScenario applyScenario;

    @BeforeMethod(alwaysRun=true)
    public void beforeMethod() throws Exception
    {
        super.beforeMethod();
        applyScenario = new ApplyScenario(driverObj);
    }

    //Genomics Health Futures Mission - Streams 1-2
    @Test
    public void createApplication_Genomics_Health_Futures_Mission_Streams_1_2() throws Exception {
        reportManager.startTest("Genomics Health Futures Mission - Streams 1-23", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Genomics Health Futures Mission - Streams 1-2")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "Stream 1 - Targeted Call for Research", "");

        applyScenario.participatingInstitutionsTab().enterData("Australian Centre for Diabetes Strategies",
                "50", "NRMA");

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");

        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().enterData("C:\\Users\\Vivek Kannapiran\\Desktop\\test.pdf");

        applyScenario.declarationOfInterest().enterData("C:\\Users\\Vivek Kannapiran\\Desktop\\test.pdf");

        applyScenario.budgetProposalTab().enterData("C:\\Users\\Vivek Kannapiran\\Desktop\\test.pdf");

        applyScenario.directResearchCosts().enterData("Tester", "Personnel Support Package 1");

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //Dementia Ageing and Aged Care Mission
    @Test
    public void createApplication_Dementia_Ageing_and_Aged_Care_Mission() throws Exception {
        reportManager.startTest("Dementia Ageing and Aged Care Mission", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Dementia Ageing and Aged Care Mission")
                .setApplicationName("My Application");

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


    //MRFF - EPCDRI - Silicosis Research
    @Test
    public void createApplication_MRFF_EPCDRI_Silicosis_Research(
    ) throws Exception {
        reportManager.startTest("MRFF - EPCDRI - Silicosis Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("MRFF - EPCDRI - Silicosis Research")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "3", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.declarationOfInterest().fillData();
        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //MRFF - EPCDRI - Childhood Cancer Research
    @Test
    public void createApplication_MRFF_EPCDRI_Childhood_Cancer_Research() throws Exception {

        reportManager.startTest("MRFF - EPCDRI - Childhood Cancer Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("EPCDRI - Childhood Cancer Research")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");
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


    //Partnership Projects PRC1
    // doesn't check yes/no for "Do you have a waiver for this organisation to be a Partner Organisation"
    @Test
    public void createApplication_Partnership_Projects_PRC1() throws Exception {
        reportManager.startTest("Partnership Projects PRC1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2021 Partnership Projects PRC1")
                .setApplicationName("My Application");

        applyScenario.applicationDetailsTab().fillData();

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");
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
        applyScenario.logoutPage().signout();

    }


    //EPCDR - Neurofibromatosis Research
    @Test
    public void createApplication_EPCDR_Neurofibromatosis_Research() throws Exception {
        reportManager.startTest("EPCDR - Neurofibromatosis Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("MRFF - EPCRDI - Neurofibromatosis Research")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "Stream 1", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");
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


    //MRFF International Clinical Trial Collaborations - ICTC 20-2
    @Test
    public void createApplication_International_Clinical_Trial_Collaborations_ICTC_20_2() throws Exception {
        reportManager.startTest("MRFF International Clinical Trial Collaborations - ICTC 20-2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("International Clinical Trial Collaborations - ICTC 20-2")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");

        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        applyScenario.partnerOrganisationsTab().fillData();

        applyScenario.partnerDetailsTab().fillData();

        applyScenario.declarationOfInterest().fillData();

        applyScenario.budgetProposalTab().fillData();

        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //Maternal First 2000 Days and Childhood Health
    @Test
    public void createApplication_Maternal_First_2000_Days_Childhood_Health() throws Exception
    {
        reportManager.startTest("2020 Maternal First 2000 Days and Childhood Health", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Maternal First 2000 Days and Childhood Health")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");
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


    //EPCDRI - Paediatric Cancer
    @Test
    public void createApplication_EPCDRI_Paediatric_Cancer() throws Exception
    {
        reportManager.startTest("MRFF - EPCDRI - Paediatric Cancer", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("EPCDRI - Paediatric Cancer")
                .setApplicationName("My Application");

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

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
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

    //Genomics Health Futures Mission - Stream 3
    // will not select stream
    @Test
    public void createApplication_Genomics_Health_Futures_Mission_Stream3() throws Exception
    {
        reportManager.startTest("Genomics Health Futures Mission - Stream 3", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Genomics Health Futures Mission - Stream 3")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");

        // missing Associate Investigator tab
        //applyScenario.researchTeamAssociateInvestigatorTab().enterData();

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

    //Ideas Grant
    // strategic Priorities Tab fills out page, but doesn't move onto the third party tab.
    @Test
    public void createApplication_IdeasGrant() throws Exception
    {
        reportManager.startTest("Idea Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");



        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("2021 Ideas Grant")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");
        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();
        applyScenario.strategicPrioritiesTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

    //Ideas Grant
    // strategic Priorities Tab fills out page, but doesn't move onto the third party tab.
    @Test
    public void createApplication_IdeasGrant_IREC_No() throws Exception
    {
        reportManager.startTest("Idea Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");



        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

//        for (int i=0; i<=2; i++) {
            applyScenario.applicationsPage().createNewApplication("2021 Ideas Grant")
                    .setApplicationName("My Application");


//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "").setIrecAsNo();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");
            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();
//            applyScenario.strategicPrioritiesTab().enterData();
            applyScenario.thirdPartyResearchTab().fillData();
            applyScenario.directResearchCosts().fillData();

            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();

//        }
        applyScenario.logoutPage().signout();

    }


    //Traumatic Brain Injury Mission - Stream 1
    // wont select stream
    @Test
    public void createApp_Traumatic_Brain_Injury_Mission_Stream1 () throws Exception

    {
        reportManager.startTest("Traumatic Brain Injury Mission - Stream 1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Traumatic Brain Injury Mission - Stream 1")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1","Stream 1 – Ovarian Cancer", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");


        applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");

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


    //Special Initiative in Human Health and Environmental Change
    @Test
    public void createApp_Special_Initiative_Human_Health_Environmental_Change() throws Exception

    {
        reportManager.startTest("Special Initiative in Human Health and Environmental Change", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Special Initiative in Human Health and Environmental Change")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");

        applyScenario.ethicsTab().enterData();

        applyScenario.grantProposalTab().fillData();

        applyScenario.budgetProposalTab().fillData();

        applyScenario.directResearchCosts().fillData();

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //e-ASIA Joint Research Program
    @Test
    public void createApplication_eAsia_Joint_Research_Program() throws Exception

    {
        reportManager.startTest("e-ASIA Joint Research Program", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("NHMRC e-ASIA 2021 Joint Research Program")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

        applyScenario.callSpecificInformation().fillData();

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

        applyScenario.directResearchCosts().enterData("Tester", "Personnel Support Package 1");

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }

    //e-ASIA Joint Research Program
    @Test
    public void createApplication_eAsia_Joint_Research_Program_Irec_No() throws Exception

    {
        reportManager.startTest("e-ASIA Joint Research Program", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for (int i=0; i<=8; i++)
        {
            applyScenario.applicationsPage().createNewApplication("NHMRC e-ASIA 2021 Joint Research Program")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "").setRandom_GrantDurationListBox().setIrecAsNo();

            applyScenario.callSpecificInformation().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Health Services Research",
                    "Gastroenterology",
                    "Epidemiology",  "allergy testing",
                    "amino acids", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().fillData();

            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();

            applyScenario.budgetProposalTab().fillData();

            applyScenario.directResearchCosts().enterData("Tester", "Personnel Support Package 1");

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();

            Thread.sleep(3000);
        }


        applyScenario.logoutPage().signout();

    }


    //Development Grants
    @Test
    public void createApplication_developmentGrants() throws Exception

    {
        reportManager.startTest("Development Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Development Grants")
                .setApplicationName("My Application");

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

        applyScenario.budgetProposalTab().fillData();

        applyScenario.directResearchCosts().enterData("Tester", "Personnel Support Package 1");

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //Synergy Grant
    @Test
    public void createApplication_synergyGrant() throws Exception

    {
        reportManager.startTest("Development Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Synergy Grant")
                .setApplicationName("My Application");

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

        applyScenario.fundingPartners().fillData();
        // Check this for the implementation
        throw new Exception("Check the implementation of this module");

        // default
//        applyScenario.certifyTab().enterData();
//        applyScenario.finaliseApplication().enterData();
//        applyScenario.logoutPage().signout();

    }

    //Investigator Grant
    @Test
    public void createApplication_investigatorGrant() throws Exception

    {
        reportManager.startTest("Investigator Grants", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();


            applyScenario.applicationsPage().createNewApplication("2021 Investigator Grant")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.ethicsTab().enterData();
            // add researcher tab here
            // add career tab here
//            applyScenario.strategicPrioritiesTab().enterData();
            // add track record tab here

            applyScenario.grantProposalTab().fillData();


            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();

        applyScenario.logoutPage().signout();

    }


    //EPCDR - Improving Diagnosis in Cancers with Low Survival Rates
    @Test
    public void createApplication_EPCDR_Improving_Diagnosis_Cancers_Low_Survival_Rates() throws Exception

    {
        reportManager.startTest("EPCDR - Improving Diagnosis in Cancers with Low Survival Rates", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Improving Diagnosis in Cancers with Low Survival Rates")
                .setApplicationName("My Application");

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

    //NHMRC International - NIHR
    @Test
    public void createApplication_NIHR_RATES() throws Exception
    {
        reportManager.startTest("NHMRC International - NIHR", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("NHMRC International - NIHR")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");
        applyScenario.participatingInstitutionsTab().fillData();
        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.callSpecificInformation().fillData();

        applyScenario.researchTeamTab().fillData();
        applyScenario.ethicsTab().enterData();
        applyScenario.budgetProposalTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //primary health
    @Test
    public void createApplication_Primary_Health_Care_Research() throws Exception

    {
        reportManager.startTest("Primary Health Care Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Primary Health Care Research")
                .setApplicationName("My Application");

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

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //Stem Cell Therapies Mission
    @Test
    public void createApplication_Stem_Cell_Therapies_Mission() throws Exception

    {
        reportManager.startTest("2020 Stem Cell Therapies Mission", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Stem Cell Therapies Mission")
                .setApplicationName("My Application");

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
                .setApplicationName("My Application");

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

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //Centres of Research Excellence - Clinical Research
    //grant duration only working sometimes
    @Test
    public void createApplication_Centres_of_Research_Excellence_Clinical_Research() throws Exception {

        reportManager.startTest("Centres of Research Excellence - Clinical Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Clinical Research")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Test2@test.com.au");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();



        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //Centres of Research Excellence - Health Services Research
    //grant duration only working sometimes *** - Investigate
    @Test
    public void createApplication_Centres_Research_Excellence_Health_Services_Research() throws Exception {

        reportManager.startTest("Centres of Research Excellence - Health Services Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Health Services Research")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Test2@test.com.au");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();

        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //2020 NIHR Collaborative Research Grant R1
    // * Requires "Call Specific Information" Tab
    // * Form in Pre Prod is 2020 NHMRC-NIHR Collaborative Research Grant Scheme Round 1
    @Test
    public void createApplication_NIHR_Collaborative_Research_Grant_R1() throws Exception {

        reportManager.startTest("NIHR Collaborative Research Grant R1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("NIHR Collaborative Research Grant R1")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "");
        applyScenario.callSpecificInformation().fillData();
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Test2@test.com.au");

        applyScenario.ethicsTab().enterData();
        applyScenario.thirdPartyResearchTab().fillData();
        applyScenario.directResearchCosts().fillData();


        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //Centres of Research Excellence - Public Health
    @Test
    public void createApplication_Centres_Research_Excellence_Public_Health() throws Exception {

        reportManager.startTest("Centres of Research Excellence - Public Health", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Centres of Research Excellence - Public Health")
                .setApplicationName("My Application");

//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
        applyScenario.participatingInstitutionsTab().fillData();

        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Test2@test.com.au");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();
        applyScenario.thirdPartyResearchTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }


    //Cardiovascular Health Mission
    @Test
    public void createApplication_Cardiovascular_Health_Mission() throws Exception

    {
        reportManager.startTest("Cardiovascular Health Mission", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Cardiovascular Health Mission")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");

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


    //Traumatic Brain Injury Mission - Streams 2-5
    @Test
    public void createApplication_Traumatic_Brain_Injury_Mission_Streams_2_5 () throws Exception

    {
        reportManager.startTest("Traumatic Brain Injury Mission - Streams 2-5", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("Traumatic Brain Injury Mission - Streams 2-5")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
        
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


    //COVID-19 Vaccine Candidate Research - Round 3 EOI
    // crashes at IREC
    @Test
    public void createApplication_Covid_Candidate_Research_Round3_EOI () throws Exception

    {
        reportManager.startTest("COVID-19 Vaccine Candidate Research - Round 3 EOI", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for (int i=0; i<=5; i++) {

            applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research - Round 3 EOI")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "");

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
        }
        applyScenario.logoutPage().signout();

    }

    //COVID-19 Vaccine Candidate Research - Round 3 EOI
    // crashes at IREC
    @Test
    public void createApplication_Covid_Candidate_Research_Round3_EOI_IrecNo () throws Exception

    {
        reportManager.startTest("COVID-19 Vaccine Candidate Research - Round 3 EOI", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

            applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research - Round 3 EOI")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "", "", "").setIrecAsNo();

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


    // NHMRC-NIHR Collaborative Research Grant Scheme Round 2
    @Test
    public void createApplication_NHMRC_NIHR_Collaborative_Research_Grant_Scheme_Round2() throws Exception

    {
        reportManager.startTest("NHMRC-NIHR Collaborative Research Grant Scheme Round 2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("NHMRC-NIHR Collaborative Research Grant Scheme Round 2")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");

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

        // default
        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();

    }


    //PPHR Initiative Efficient use of Existing Medicines
    @Test
    public void createApplication_PPHR_Efficient_Existing_Medicines() throws Exception

    {
        reportManager.startTest("PPHR Initiative Efficient use of Existing Medicines", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("PPHR Initiative Efficient use of Existing Medicines")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
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


    //MRFF Efficient Use of Existing Medicines
    @Test
    public void createApplication_MRFF_Efficient_Existing_Medicines() throws Exception

    {
        reportManager.startTest("MRFF Initiative Efficient use of Existing Medicines", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("MRFF Initiative Efficient use of Existing Medicines")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
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


    //CTCS BAU
    @Test
    public void createApplication_CTCS_BAU() throws Exception

    {
        reportManager.startTest("CTCS BAU", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("CTCS BAU")
                .setApplicationName("My Application");

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


    //COVID-19 Vaccine Candidate Research
    @Test
    public void createApplication_CovidVaccine_CandidateResearch() throws Exception

    {
        reportManager.startTest("COVID-19 Vaccine Candidate Research", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("COVID-19 Vaccine Candidate Research")
                .setApplicationName("My Application");

        // Call the tabs from here
//        applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "5", "", "");
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
    public void createApplication_CovidVaccine_Round2_Stage2_Invitation() throws Exception

    {
        reportManager.startTest("COVID-19 VCR Round 2 Stage 2 by Invitation", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
                .setApplicationName("My Application");

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


    //COVID-19 VCR Round 2 Stage 2 by Invitation
    @Test
    public void createApplication_CovidVaccine_Round2_Stage2_Invitation_IrecNo() throws Exception

    {
        reportManager.startTest("COVID-19 VCR Round 2 Stage 2 by Invitation", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for (int i=0; i<=8; i++)
        {

            applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "", "")setIrecAsNo().setRandom_GrantDurationListBox();
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

        Thread.sleep(3000);

        }
        applyScenario.logoutPage().signout();

    }

    //2020 Special Initiative in Mental Health
    @Test
    public void createApplication_2020_Special_Initiative_in_Mental_Health() throws Exception
    {

        reportManager.startTest("2020 Special Initiative in Mental Health", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("Special Initiative in Mental Health")
                .setApplicationName("My Application");

        applyScenario.applicationDetailsTab().fillData().enterCIAEmail("Test2@test.com.au");
        applyScenario.participatingInstitutionsTab().fillData();
        applyScenario.researchClassificationTab().enterData("Basic Science",
                "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                "Gastroenterology",
                "Epidemiology", "allergy testing",
                "amniocentesis", "ascites", "adipocytes", "astrocytes");

        applyScenario.ethicsTab().enterData();
        applyScenario.grantProposalTab().fillData();
        applyScenario.budgetProposalTab().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //2020 TCR: End of Life Care
    @Test
    public void createApplication_2020_TCR_End_of_Life_Care() throws Exception
    {

        reportManager.startTest("2020 TCR: End of Life Care", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        applyScenario.applicationsPage().createNewApplication("End of Life Care")
                .setApplicationName("My Application");

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

        applyScenario.thirdPartyResearchTab().fillData();
        applyScenario.directResearchCosts().fillData();

        applyScenario.certifyTab().enterData();
        applyScenario.finaliseApplication().enterData();
        applyScenario.logoutPage().signout();
    }

    //2020 Clinical Trials and Cohort Studies
    @Test
    public void createApplication_2020_Clinical_Trials_and_Cohort_Studies() throws Exception
    {

        reportManager.startTest("2020 Clinical Trials and Cohort Studies", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();
        for(int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("Clinical Trials and Cohort Studies")
                    .setApplicationName("My Application");

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

            applyScenario.strategicPrioritiesTab().fillData();

            applyScenario.budgetProposalTab().fillData();
            applyScenario.directResearchCosts().fillData();

            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
        }

        applyScenario.logoutPage().signout();
    }

    //MRFF International Clinical Trial Collaborations - ICTC 21-1
    @Test
    public void createApplication_International_Clinical_Trial_Collaborations_ICTC_21_1_IrecNo() throws Exception
    {
        reportManager.startTest("MRFF International Clinical Trial Collaborations - ICTC 21-1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for (int i=0; i<=8; i++)
        {
            applyScenario.applicationsPage().createNewApplication("2021 MRFF International Clinical Trial Collaborations - ICTC 21-1")
                    .setApplicationName("My Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");

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
        }
        applyScenario.logoutPage().signout();
    }

    //MRFF International Clinical Trial Collaborations - ICTC 21-1
    // crashing at the partner details tab
    @Test
    public void createApplication_International_Clinical_Trial_Collaborations_ICTC_21_1() throws Exception
    {
        reportManager.startTest("MRFF International Clinical Trial Collaborations - ICTC 20-2", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for (int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("2021 MRFF International Clinical Trial Collaborations - ICTC 21-1")
                    .setApplicationName("My Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Good Worker");

            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();

            applyScenario.partnerOrganisationsTab().fillData();

            applyScenario.partnerDetailsTab().fillData();

            applyScenario.declarationOfInterest().fillData();

            applyScenario.budgetProposalTab().fillData();

            applyScenario.directResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
        }
        applyScenario.logoutPage().signout();
    }
}