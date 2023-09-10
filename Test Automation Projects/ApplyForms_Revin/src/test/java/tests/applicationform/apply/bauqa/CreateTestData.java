package tests.applicationform.apply.bauqa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testbase.basetestclass.BaseTest;
import testbase.testscenario.ApplyScenario;

public class CreateTestData extends BaseTest {


    private ApplyScenario applyScenario;

    @BeforeMethod(alwaysRun=true)
    public void beforeMethod() throws Exception
    {
        super.beforeMethod();
        applyScenario = new ApplyScenario(driverObj);
    }


    //Cardiovascular Health Mission
    @Test
    public void createApplication_Cardiovascular_Health_Mission_Irec_No() throws Exception

    {
        reportManager.startTest("Cardiovascular Health Mission", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

//        for(int i=0; i<=8; i++)
//        {
            applyScenario.applicationsPage().createNewApplication("Cardiovascular Health Mission")
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

            applyScenario.directResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
            Thread.sleep(3000);
//        }

        applyScenario.logoutPage().signout();

    }


    //Cardiovascular Health Mission
    @Test
    public void createApplication_Cardiovascular_Health_Mission_Yes() throws Exception

    {
        reportManager.startTest("Cardiovascular Health Mission", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for(int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("Cardiovascular Health Mission")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().enterData("Baker Heart and Diabetes Institute", "1", "Stream 1 - Targeted Call for Research", "");

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


    //e-ASIA Joint Research Program
    @Test
    public void createApplication_eAsia_Joint_Research_Program_Irec_Yes() throws Exception

    {
        reportManager.startTest("e-ASIA Joint Research Program", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for (int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("NHMRC e-ASIA 2021 Joint Research Program")
                    .setApplicationName("My Application");

            // Call the tabs from here
            applyScenario.applicationDetailsTab().fillData();
//                    .setRandom_GrantDurationListBox();

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
            applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

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


    //Special Initiative in Human Health and Environmental Change
    // Set Irec as Yes
    @Test
    public void createApp_Special_Initiative_Human_Health_Environmental_Change() throws Exception

    {
        reportManager.startTest("Special Initiative in Human Health and Environmental Change", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for(int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("Special Initiative in Human Health and Environmental Change")
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
            // Missing associate investigator tab
            //applyScenario.researchTeamAssociateInvestigatorTab().enterData();

            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();

            applyScenario.budgetProposalTab().fillData();

            applyScenario.directResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
            Thread.sleep(3000);
        }

        applyScenario.logoutPage().signout();

    }


    //Special Initiative in Human Health and Environmental Change
    //Set irec as No
    @Test
    public void createApp_Special_Initiative_Human_Health_Environmental_Change_IrecNo() throws Exception

    {
        reportManager.startTest("Special Initiative in Human Health and Environmental Change", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for(int i=0; i<=8; i++)
        {
            applyScenario.applicationsPage().createNewApplication("Special Initiative in Human Health and Environmental Change")
                    .setApplicationName("My Application");

            // Call the tabs from here
//            applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamChiefInvestigatorTab().enterData("Good worker");


            applyScenario.ethicsTab().enterData();

            applyScenario.grantProposalTab().fillData();

            applyScenario.thirdPartyResearchTab().fillData();

            applyScenario.directResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
            Thread.sleep(3000);
        }

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

        for(int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
                    .setApplicationName("My Application");

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

    //COVID-19 VCR Round 2 Stage 2 by Invitation
    // Set Irec as No
    @Test
    public void createApplication_CovidVaccine_Round2_Stage2_Invitation_IrecAsNo() throws Exception

    {
        reportManager.startTest("COVID-19 VCR Round 2 Stage 2 by Invitation", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for(int i=0; i<=4; i++)
        {
            applyScenario.applicationsPage().createNewApplication("2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
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
            applyScenario.directResearchCosts().fillData();

            // default
            applyScenario.certifyTab().enterData();
            applyScenario.finaliseApplication().enterData();
            Thread.sleep(3000);
        }

        applyScenario.logoutPage().signout();

    }


    //Partnership Projects PRC1
    // Set Irec as Yes
    @Test
    public void createApplication_Partnership_Projects_PRC1() throws Exception {
        reportManager.startTest("Partnership Projects PRC1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");


        applyScenario.loginPage().login("Test2@test.com.au");
        applyScenario.homePage().openApplicationsPage();

        for(int i=0; i<=2; i++)
        {
            applyScenario.applicationsPage().createNewApplication("2021 Partnership Projects PRC1")
                    .setApplicationName("My Application");

           // applyScenario.applicationDetailsTab().fillData();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Test2@test.com.au");
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
            Thread.sleep(3000);
        }

        applyScenario.logoutPage().signout();

    }


    //Partnership Projects PRC1
    // Set Irec as No
    @Test
    public void createApplication_Partnership_Projects_PRC1_IrecAsNo() throws Exception {
        reportManager.startTest("Partnership Projects PRC1", "Golden Path Test Case");
        reportManager.logPass("The application is opened in the browser");

        for(int i=0; i<=8; i++)
        {
            applyScenario.loginPage().login("Test2@test.com.au");
            applyScenario.homePage().openApplicationsPage();
            applyScenario.applicationsPage().createNewApplication("2021 Partnership Projects PRC1")
                    .setApplicationName("My Application");

//            applyScenario.applicationDetailsTab().fillData().setIrecAsNo();

            applyScenario.participatingInstitutionsTab().fillData();

            applyScenario.researchClassificationTab().enterData("Basic Science",
                    "MEDICAL BIOCHEMISTRY AND METABOLOMICS | Medical Biochemistry: Amino Acids and Metabolites", "Clinical Trial",
                    "Gastroenterology",
                    "Epidemiology", "allergy testing",
                    "amniocentesis", "ascites", "adipocytes", "astrocytes");

            applyScenario.researchTeamTab().enterData("Test2@test.com.au", "Test2@test.com.au");
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
            Thread.sleep(3000);

        }
        applyScenario.logoutPage().signout();

    }

}
