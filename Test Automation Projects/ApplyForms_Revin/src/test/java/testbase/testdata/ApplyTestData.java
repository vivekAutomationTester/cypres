package testbase.testdata;

import library.datadriver.ExcelManager;
import org.testng.annotations.DataProvider;

public class ApplyTestData {


    @DataProvider(name = "2020 Idea Grants")
    public static Object[][] getData_2020IdeasGrant() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 Idea Grants.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 CTCS BAU")
    public static Object[][] getData_2020_CTCS_BAU() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 CTCS BAU.xlsx", 0).getData();
    }

    @DataProvider(name = "MRFF Year 2")
    public static Object[][] getData_MRFF_Year_2() throws Exception {
        return new ExcelManager("src/test/java/resources/2019applyforms/MRFF Year 2.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 E-Asia Joint Research Program")
    public static Object[][] getData_2020_EAsia() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 E-Asia Joint Research Program.xlsx", 0).getData();
    }


    @DataProvider(name = "Other Funding - Create Data")
    public static Object[][] getData_OtherFunding_CreateData() throws Exception {
        return new ExcelManager("src/test/java/resources/2019applyforms/Other Funding-Create Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Other Funding - Update Data")
    public static Object[][] getData_OtherFunding_UpdateData() throws Exception {
        return new ExcelManager("src/test/java/resources/2019applyforms/Other Funding-Update Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Employment History - Create Data")
    public static Object[][] getData_EmploymentHistory_CreateData() throws Exception {
        return new ExcelManager("src/test/java/resources/2019applyforms/Employment History -Update Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Employment History - Update Data")
    public static Object[][] getData_EmploymentHistory_updateData() throws Exception {
        return new ExcelManager("src/test/java/resources/2019applyforms/Employment History -Create Data.xlsx", 0).getData();
    }

    @DataProvider(name = "NHMRC Special Initiative in Mental Health - National Centre")
    public static Object[][] getData_NHMRC_Special_Initiative_in_Mental_Health_National_Centre() throws Exception {

        return new ExcelManager("src/test/java/resources/2020applyforms/2020 NHMRC Special Initiative in Mental Health - National Centre.xlsx", 0).getData();  //TODO: make excel spreadsheet
    }

    @DataProvider(name = "NHMRC International - NIHR - 2021 RATES")
    public static Object[][] getData_NHMRC_International_NIHR_2021_RATES() throws Exception {

        return new ExcelManager("src/test/java/resources/2021applyforms/NHMRC International - NIHR - 2021 RATES.xlsx", 0).getData();
    }


    @DataProvider(name = "2020 MRFF COVID 19 Private Signle Year")
    public static Object[][] getData_2020_MRFF_COVID_19_Private_Signle_Year() throws Exception {

        return new ExcelManager("src/test/java/resources/2020applyforms/2020 MRFF COVID 19 Private Signle Year.xlsx", 0).getData();
    }

    @DataProvider(name = "NHMRC MRFF Single Year ATSI Non Mandatory")
    public static Object[][] getData_NHMRC_MRFF_Single_Year_ATSI_Non_Mandatory() throws Exception {
        return new ExcelManager("src/test/java/resources/2019applyforms/NHMRC MRFF Single Year ATSI Non Mandatory.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Medicinal")
    public static Object[][] getData_MRFF_EPCDRI_Medicinal() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 MRFF - EPCDRI - Medicinal.xlsx", 0).getData();
    }

    @DataProvider(name = "NHMRC-European Union Joint Programme on Neurodegenerative Disease Research")
    public static Object[][] getData_NHMRC_European_Union_Joint_Programme_on_Neurodegenerative_Disease_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 NHMRC-European Union Joint Programme on Neurodegenerative Disease Research - JPND.xlsx").getData();
    }

    @DataProvider(name = "National Network for Aboriginal and Torres Strait Islander Health Researchers")
    public static Object[][] getData_National_Network_for_Aboriginal_and_Torres_Strait_Islander_Health_Researchers() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 National Network for Aboriginal and Torres Strait Islander Health Researchers.xlsx").getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Silicosis Research")
    public static Object[][] getData_2020_MRFF_EPCDRI_Silicosis_Research() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 MRFF - EPCDRI - Silicosis Research.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates")
    public static Object[][] getData_2020_MRFF_EPCDRI_Improving_Diagnosis_in_Cancers_with_Low_Survival_Rates() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 MRFF - EPCDRI - Improving Diagnosis in Cancers with Low Survival Rates.xlsx", 0).getData();
    }

    @DataProvider(name = "2020 Special Initiative in Human Health and Environmental Change")
    public static Object[][] getData_2020_Special_Initiative_in_Human_Health_and_Environmental_Change() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2020 Special Initiative in Human Health and Environmental Change.xlsx", 0).getData();
    }

    @DataProvider(name = "2021 Partnership Projects PRC1")
    public static Object[][] getData_Partnership_Projects_PRC1() throws Exception {
        return new ExcelManager("src/test/java/resources/2020applyforms/2021 Partnership Projects PRC1.xlsx", 0).getData();
    }


}