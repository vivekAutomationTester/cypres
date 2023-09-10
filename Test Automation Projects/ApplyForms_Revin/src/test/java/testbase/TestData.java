package testbase;



import library.datadriver.ExcelManager;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class TestData {
	
    @DataProvider(name = "2020 Idea Grants")
    public static Object[][] getData_2020IdeasGrant() throws Exception {
           return new ExcelManager("src/test/java/resources/2020 Idea Grants.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 CTCS BAU")
    public static Object[][] getData_2020_CTCS_BAU() throws Exception {
           return new ExcelManager("src/test/java/resources/2020 CTCS BAU.xlsx", 0).getData();
    }

    @DataProvider(name = "MRFF Year 2")
    public static Object[][] getData_MRFF_Year_2() throws Exception {
           return new ExcelManager("src/test/java/resources/MRFF Year 2.xlsx", 0).getData();
    }
    
    @DataProvider(name = "2020 E-Asia Joint Research Program")
    public static Object[][] getData_2020_EAsia() throws Exception {
           return new ExcelManager("src/test/java/resources/2020 E-Asia Joint Research Program.xlsx", 0).getData();
    }
    
    
    @DataProvider(name = "Other Funding - Create Data")
    public static Object[][] getData_OtherFunding_CreateData() throws Exception {
           return new ExcelManager("src/test/java/resources/Other Funding-Create Data.xlsx", 0).getData();
    }
    
    @DataProvider(name = "Other Funding - Update Data")
    public static Object[][] getData_OtherFunding_UpdateData() throws Exception {
           return new ExcelManager("src/test/java/resources/Other Funding-Update Data.xlsx", 0).getData();
    }
    
    @DataProvider(name = "Employment History - Create Data")
    public static Object[][] getData_EmploymentHistory_CreateData() throws Exception {
           return new ExcelManager("src/test/java/resources/Employment History -Update Data.xlsx", 0).getData();
    }
    
    @DataProvider(name = "Employment History - Update Data")
    public static Object[][] getData_EmploymentHistory_updateData() throws Exception {
           return new ExcelManager("src/test/java/resources/Employment History -Create Data.xlsx", 0).getData();
    }
 
    @DataProvider(name = "Create Test Account - Person")
    public static Object[][] getData_CreateTestAccount_person() throws Exception {
    	return new ExcelManager("src/test/java/resources/Create Test Account - Person.xlsx", 0).getData();
    }
    
    @DataProvider(name = "NHMRC Special Initiative in Mental Health - National Centre")
    public static Object[][] getData_NHMRC_Special_Initiative_in_Mental_Health_National_Centre() throws Exception {
    	
    	return new ExcelManager("src/test/java/resources/2020 NHMRC Special Initiative in Mental Health - National Centre.xlsx", 0).getData();  //TODO: make excel spreadsheet
    }
    
    @DataProvider(name = "NHMRC International - NIHR - 2021 RATES")
    public static Object[][] getData_NHMRC_International_NIHR_2021_RATES() throws Exception {
    	
    	return new ExcelManager("src/test/java/resources/NHMRC International - NIHR - 2021 RATES.xlsx", 0).getData();  
    }
    
    
    @DataProvider(name = "2020 MRFF COVID 19 Private Signle Year")
    public static Object[][] getData_2020_MRFF_COVID_19_Private_Single_Year() throws Exception {
    	
    	return new ExcelManager("src/test/java/resources/2020 MRFF COVID 19 Private Signle Year.xlsx", 0).getData();
    }

    @DataProvider(name = "NHMRC MRFF Single Year ATSI Non Mandatory")
    public static Object[][] getData_NHMRC_MRFF_Single_Year_ATSI_Non_Mandatory() throws Exception {
        return new ExcelManager("src/test/java/resources/NHMRC MRFF Single Year ATSI Non Mandatory.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Medicinal")
    public static Object[][] getData_MRFF_EPCDRI_Medicinal() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF - EPCDRI - Medicinal.xlsx", 0).getData();
    }

    @DataProvider(name = "NHMRC-European Union Joint Programme on Neurodegenerative Disease Research")
    public static Object[][] getData_NHMRC_European_Union_Joint_Programme_on_Neurodegenerative_Disease_Research() throws Exception{
        return new ExcelManager("src/test/java/resources/2020 NHMRC-European Union Joint Programme on Neurodegenerative Disease Research - JPND.xlsx").getData();
    }

    @DataProvider(name = "National Network for Aboriginal and Torres Strait Islander Health Researchers")
    public static Object[][] getData_National_Network_for_Aboriginal_and_Torres_Strait_Islander_Health_Researchers() throws Exception{
        return new ExcelManager("src/test/java/resources/2020 National Network for Aboriginal and Torres Strait Islander Health Researchers.xlsx").getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Silicosis Research")
    public static Object[][] getData_2020_MRFF_EPCDRI_Silicosis_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF - EPCDRI - Silicosis Research.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates")
    public static Object[][] getData_2020_MRFF_EPCDRI_Improving_Diagnosis_in_Cancers_with_Low_Survival_Rates() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Special Initiative in Human Health and Environmental Change")
    public static Object[][] getData_2020_Special_Initiative_in_Human_Health_and_Environmental_Change() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Special Initiative in Human Health and Environmental Change.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
    public static Object[][] getData_2020CovidVaccine_CandidateResearch_Round_2_Stage_2_by_Invitation() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Paediatric Cancer")
    public static Object[][] getData_2020_MRFF_EPCDRI_Paediatric_Cancer() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF - EPCDRI - Paediatric Cancer.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Indigenous Health Research Fund")
    public static Object[][] getData_2020_Indigenous_Health_Research_Fund() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Indigenous Health Research Fund.xlsx", 0).getData();
    }





    @DataProvider(name = "2020 Genomics Health Futures Mission - Streams 1-2")
    public static Object[][] getData_2020_Genomics_Health_Futures_Mission_Streams_1_2() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Genomics Health Futures Mission - Streams 1-2.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Genomics Health Futures Mission - Stream 3")
    public static Object[][] getData_2020_Genomics_Health_Futures_Mission_Stream_3() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Genomics Health Futures Mission - Stream 3.xlsx", 0).getData();
    }

    @DataProvider(name = "NHMRC 2020 Stem Cell Therapies Mission")
    public static Object[][] getData_NHMRC_2020_Stem_Cell_Therapies_Mission() throws Exception {
        return new ExcelManager("src/test/java/resources/NHMRC 2020 Stem Cell Therapies Mission.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Cardiovascular Health Mission")
    public static Object[][] getData_2020_Cardiovascular_Health_Mission() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Cardiovascular Health Mission.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Dementia Ageing and Ages Care Mission")
    public static Object[][] getData_2020_Dementia_Ageing_and_Ages_Care_Mission() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Dementia Ageing and Ages Care Mission.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Traumatic Brain Injury Mission - Stream 1")
    public static Object[][] getData_2020_Traumatic_Brain_Injury_Mission_Stream_1() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Traumatic Brain Injury Mission - Stream 1.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Traumatic Brain Injury Mission - Stream 2-5")
    public static Object[][] getData_2020_Traumatic_Brain_Injury_Mission_Stream_2_5() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Traumatic Brain Injury Mission - Stream 2-5.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCRDI - Neurofibromatosis Research")
    public static Object[][] getData_2020_MRFF_EPCRDI_Neurofibromatosis_Research() throws Exception {
            return new ExcelManager("src/test/java/resources/2020 MRFF - EPCRDI - Neurofibromatosis Research.xlsx", 0).getData();
    }

    @DataProvider(name = "2021 Centres of Research Excellence - Clinical Research")
    public static Object[][] getData_2021_Centres_of_Research_Excellence_Clinical_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2021 Centres of Research Excellence - Clinical Research.xlsx", 0).getData();
    }
    @DataProvider(name = "2021 Centres of Research Excellence - Health Services Research")
    public static Object[][] getData_2021_Centres_of_Research_Excellence_Health_Services_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2021 Centres of Research Excellence - Health Services Research.xlsx", 0).getData();
    }
    @DataProvider(name = "2021 Centres of Research Excellence - Public Health Research")
    public static Object[][] getData_2021_Centres_of_Research_Excellence_Public_Health_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2021 Centres of Research Excellence - Public Health Research.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Rare Cancers Rare Diseases and Unmet Need - General")
    public static Object[][] getData_2020_Rare_Cancers_Rare_Diseases_and_Unmet_Need_General() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Rare Cancers Rare Diseases and Unmet Need - General.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Rare Cancers Rare Diseases and Unmet Need - COVID 19")
    public static Object[][] getData_2020_Rare_Cancers_Rare_Diseases_and_Unmet_Need_COVID_19() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 Rare Cancers Rare Diseases and Unmet Need - COVID 19.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 NHMRC-NIHR Collaborative Research Grant Scheme Round 1")
    public static Object[][] getData_2020_NHMRC_NIHR_Collaborative_Research_Grant_Scheme_Round_1() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 NHMRC-NIHR Collaborative Research Grant Scheme Round 1.xlsx", 0).getData();
    }
    @DataProvider(name = "2019 NHMRC-NIHR Collaborative Research Grant Scheme Round 3 - November Submission")
    public static Object[][] getData_2019_NHMRC_NIHR_Collaborative_Research_Grant_Scheme_Round_3_November_Submission() throws Exception {
        return new ExcelManager("src/test/java/resources/2019 NHMRC-NIHR Collaborative Research Grant Scheme Round 3 - November Submission.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 COVID-19 Vaccine Candidate Research - Round 2 EOI")
    public static Object[][] getData_2020_COVID_19_Vaccine_Candidate_Research_Round_2_EOI() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 COVID-19 Vaccine Candidate Research - Round 2 EOI.xlsx", 0).getData();
    }
    @DataProvider(name = "2021 Centres of Research Excellence")
    public static Object[][] getData_2021_Centres_of_Research_Excellence() throws Exception {
        return new ExcelManager("src/test/java/resources/2021 Centres of Research Excellence.xlsx", 0).getData();
    }
    @DataProvider(name = "NHMRC MRFF 5 YEAR DURATION")
    public static Object[][] getData_NHMRC_MRFF_5_YEAR_DURATION() throws Exception {
        return new ExcelManager("src/test/java/resources/NHMRC MRFF 5 YEAR DURATION.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 MRFF International Clinical Trial Collaborations - ICTC 20-2")
    public static Object[][] getData_2020_MRFF_International_Clinical_Trial_Collaborations_ICTC_20_2() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF International Clinical Trial Collaborations - ICTC 20-2.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 PPHR Initiative Efficient use of Existing Medicines")
    public static Object[][] getData_2020_PPHR_Initiative_Efficient_use_of_Existing_Medicines() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF International Clinical Trial Collaborations - ICTC 20-2.xlsx", 0).getData();
    }


    @DataProvider(name = "2021 Development Grant")
    public static Object[][] getData_2021_Development_Grant() throws Exception {
        return new ExcelManager("src/test/java/resources/2021 Development Grant.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 MRFF Efficient Use of Existing Medicines")
    public static Object[][] getData_2020_MRFF_Efficient_Use_of_Existing_Medicines() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF Efficient Use of Existing Medicines.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 MRFF - EPCDRI - Childhood Cancer Research")
    public static Object[][] getData_2020_MRFF_EPCDRI_Childhood_Cancer_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 MRFF - EPCDRI - Childhood Cancer Research.xlsx", 0).getData();
    }


    @DataProvider(name = "2020 NHMRC Special Initiative in Mental Health - National Centre")
    public static Object[][] getData_2020_NHMRC_Special_Initiative_in_Mental_Health_National_Centre() throws Exception {
        return new ExcelManager("src/test/java/resources/2020 NHMRC Special Initiative in Mental Health - National Centre.xlsx", 0).getData();
    }






















}