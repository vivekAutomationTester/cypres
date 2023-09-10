package testbase.testdata;

import library.datadriver.ExcelManager;
import org.testng.annotations.DataProvider;


public class ApplyForms_Jan2021 {

    @DataProvider(name = "2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation")
    public static Object[][] getData_2020CovidVaccine_CandidateResearch_Round_2_Stage_2_by_Invitation() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 COVID-19 Vaccine Candidate Research - Round 2 Stage 2 by Invitation.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Childhood Cancer Research")
    public static Object[][] getData_2020_MRFF_EPCDRI_Childhood_Cancer_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 MRFF - EPCDRI - Childhood Cancer Research.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF Efficient Use of Existing Medicines")
    public static Object[][] getData_2020_PPHR_Initiative_Efficient_use_of_Existing_Medicines() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 MRFF Efficient Use of Existing Medicines.xlsx", 0).getData();
    }

    @DataProvider(name = "MRFF - PPHR Initiative - 2020 Maternal First 2000 Days and Childhood Health")
    public static Object[][] getData_MRFF_PPHR_Initiative_2020_Maternal_First_2000_Days_and_Childhood_Health() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/MRFF - PPHR Initiative - 2020 Maternal First 2000 Days and Childhood Health.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Special Initiative in Human Health and Environmental Change")
    public static Object[][] getData_2020_Special_Initiative_in_Human_Health_and_Environmental_Change() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Special Initiative in Human Health and Environmental Change.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 COVID-19 VCR Round 2 Stage 2 by Invitation")
    public static Object[][] getData_2020_COVID_19_VCR_Round_2_Stage_2_by_Invitation() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 COVID-19 VCR Round 2 Stage 2 by Invitation.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 EPCDR - Improving Diagnosis in Cancers with Low Survival Rates")
    public static Object[][] getData_2020_EPCDR_Improving_Diagnosis_in_Cancers_with_Low_Survival_Rates() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Cardiovascular Health Mission")
    public static Object[][] getData_2020_Cardiovascular_Health_Mission() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Cardiovascular Health Mission.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Genomics Health Futures Mission - Stream 3")
    public static Object[][] getData_2020_Genomics_Health_Futures_Mission_Stream_3() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Genomics Health Futures Mission - Stream 3.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Genomics Health Futures Mission - Streams 1-2")
    public static Object[][] getData_2020_Genomics_Health_Futures_Mission_Streams_1_2() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Genomics Health Futures Mission - Streams 1-2.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Stem Cell Therapies Mission")
    public static Object[][] getData_2020_Stem_Cell_Therapies_Mission() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/NHMRC 2020 Stem Cell Therapies Mission.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Traumatic Brain Injury Mission - Stream 1")
    public static Object[][] getData_2020_Traumatic_Brain_Injury_Mission_Stream_1() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Traumatic Brain Injury Mission - Stream 1.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Traumatic Brain Injury Mission - Streams 2-5")
    public static Object[][] getData_2020_Traumatic_Brain_Injury_Mission_Streams_2_5() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Traumatic Brain Injury Mission - Stream 2-5.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Dementia Ageing and Aged Care Mission")
    public static Object[][] getData_2020_Dementia_Ageing_and_Aged_Care_Mission() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Dementia Ageing and Aged Care Mission.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 Indigenous Health Research Fund")
    public static Object[][] getData_2020_Indigenous_Health_Research_Fund() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 Indigenous Health Research Fund.xlsx", 0).getData();
    }
    @DataProvider(name = "2020 EPCDR - Neurofibromatosis Research")
    public static Object[][] getData_2020_EPCDR_Neurofibromatosis_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 MRFF - EPCDRI - Neurofibromatosis Research.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Paediatric Cancer")
    public static Object[][] getData_MRFF_EPCDRI_Paediatric_Cancer_2020() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 MRFF - EPCDRI-Paediatric Cancer.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF International Clinical Trial Collaborations - ICTC 20-2")
    public static Object[][] getData_2020_MRFF_International_Clinical_Trial_Collaborations_ICTC_20_2() throws Exception {
        return new ExcelManager("src/test/java/resources/2021applyforms/2020 MRFF International Clinical Trial Collaborations - ICTC 20-2.xlsx", 0).getData();
    }
}
