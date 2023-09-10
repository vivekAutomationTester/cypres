package testbase.testdata;

import library.datadriver.ExcelManager;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ProfileTestData {

    @DataProvider(name = "Create Professional Membership - Profile")
    public static Object[][] createProfessionalMembership() throws Exception {
        return new ExcelManager("src/test/java/resources/Professional Membership Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Professional Membership - Min Data")
    public static Object[][] createProfessionalMembership_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Professional Membership - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Professional Membership - No Min Data")
    public static Object[][] createProfessionalMembership_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Professional Membership - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Career Disruptions - Profile")
    public static Object[][] createCareerDisruptions() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Career Disruptions Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Career Disruptions - Min Data")
    public static Object[][] createCareerDisruptions_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Career Disruptions - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Career Disruptions - No Min Data")
    public static Object[][] createCareerDisruptions_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Career Disruptions - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Relative To Oppurtunity - Profile")
    public static Object[][] createRelativeOppurtunity() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Relative Oppurtunity Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Relative To Oppurtunity - Min Data")
    public static Object[][] createRelativeOppurtunity_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Relative Oppurtunity - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Relative To Oppurtunity - No Min Data")
    public static Object[][] createRelativeOppurtunity_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Relative Oppurtunity - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Appointments - Profile")
    public static Object[][] createAppointments() throws Exception {
        return new ExcelManager("src/test/java/resources/Create  Appointments.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Appointments - Min Data")
    public static Object[][] createAppointments_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Appointments - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Appointments - No Min Data")
    public static Object[][] createAppointments_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Appointments - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Appointments")
    public static Object[][] createAppointments_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Appointments - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Employment History - Profile")
    public static Object[][] createEmploymentHistory() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Employment History.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Employment History - Min Data")
    public static Object[][] createEmploymentHistory_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Employment History - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Employment History - No Min Data")
    public static Object[][] createEmploymentHistory_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Employment History - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Peer Review Information - Profile")
    public static Object[][] createPeerReviewInformation() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Peer Review Information Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Peer Review Information - Min Data")
    public static Object[][] createPeerReviewInformation_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Peer Review Information Data - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Peer Review Information - No Min Data")
    public static Object[][] createPeerReviewInformation_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Peer Review Information Data - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Research Tools - Profile")
    public static Object[][] createResearchTools() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Tools.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Research Tools - Min Data")
    public static Object[][] createResearchTools_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Tools - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Research Tools - No Min Data")
    public static Object[][] createResearchTools_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Tools - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Workload - Profile")
    public static Object[][] createWorkload() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Workload Data.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Workload - Min Data")
    public static Object[][] createWorkload_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Workload Data - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Workload - Without Min Data")
    public static Object[][] createWorkload_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Workload Data - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Personal Information - Profile")
    public static Object[][] createPersonaInformation() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Personal Information.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Personal Information - Min Data")
    public static Object[][] createPersonaInformation_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Personal Information - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Personal Information - No Min Data")
    public static Object[][] createPersonaInformation_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Personal Information - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Other Funding - Profile")
    public static Object[][] createOtherFunding() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Other Funding.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Other Funding - Min Data")
    public static Object[][] createOtherFunding_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Other Funding - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Other Funding - No Min Data")
    public static Object[][] createOtherFunding_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Other Funding - Missing Mandatory Fields.xlsx", 0).getData();
    }


    @DataProvider(name = "Create Unavailablity Calendar - Profile")
    public static Object[][] createUnavailablityCalendar() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Unavailablity Calendar.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Unavailablity Calendar - Min Data")
    public static Object[][] createUnavailablityCalendar_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Unavailablity Calendar - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Unavailablity Calendar - No Min Data")
    public static Object[][] createUnavailablityCalendar_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Unavailablity Calendar - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Unavailablity Calendar")
    public static Object[][] deleteUnavailablityCalendar() throws Exception {
        return new ExcelManager("src/test/java/resources/Delete Multiple Records - Unavailablity Calendar.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Conference Participations - Profile")
    public static Object[][] createConferenceParticipations() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Conference Participations.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Conference Participations - Min Data")
    public static Object[][] createConferenceParticipations_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Conference Participations - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Conference Participations - No Min Data")
    public static Object[][] createConferenceParticipations_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Conference Participations - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Conference Participations")
    public static Object[][] deleteConferenceParticipations() throws Exception {
        return new ExcelManager("src/test/java/resources/Delete Multiple Records - Conference Participations.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Publications - Profile")
    public static Object[][] createPublications() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Publications.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Publications - Min Data")
    public static Object[][] createPublications_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Publications - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Publications - No Min Data")
    public static Object[][] createPublications_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Publications - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Community Engagement - Profile")
    public static Object[][] createCommunityEngagements() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Community Engagement.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Community Engagement - Min Data")
    public static Object[][] createCommunityEngagement_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Community Engagement - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Community Engagement - No Min Data")
    public static Object[][] createCommunityEngagement_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Community Engagement - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Community Engagement")
    public static Object[][] deleteCommunityEngagement() throws Exception {
        return new ExcelManager("src/test/java/resources/Delete Multiple Records - Community Engagement.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Journal Review - Profile")
    public static Object[][] createJournalReview() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Journal Review.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Journal Review - Min Data")
    public static Object[][] createJournalReview_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Journal Review - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Journal Review - No Min Data")
    public static Object[][] createJournalReview_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Journal Review - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Journal Review")
    public static Object[][] deleteJournalReview() throws Exception {
        return new ExcelManager("src/test/java/resources/Delete Multiple Records - Journal Review.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Academics - Profile")
    public static Object[][] createAcademics() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Academics.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Academics - Min Data")
    public static Object[][] createAcademics_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Academics - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Academics - No Min Data")
    public static Object[][] createAcademics_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Academics - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Qualification - Profile")
    public static Object[][] createQualifications() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Qualifications.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Qualification - Min Data")
    public static Object[][] createQualifications_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create  Qualifications - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Qualification - No Min Data")
    public static Object[][] createQualifications_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create  Qualifications - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Supervision - Profile")
    public static Object[][] createSupervision() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Supervision and Mentoring.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Supervision - Min Data")
    public static Object[][] createSupervision_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Supervision and Mentoring - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Supervision - No Min Data")
    public static Object[][] createSupervision_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Supervision and Mentoring - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Supervision and Mentoring")
    public static Object[][] createSupervision_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Supervision and Mentoring - Delete Multiple Records.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Research Dataset - Profile")
    public static Object[][] createResearchDataset() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Dataset.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Research Dataset - Min Data")
    public static Object[][] createResearchDataset_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Dataset - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Research Dataset - No Min Data")
    public static Object[][] createResearchDataset_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Dataset - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Research Dataset")
    public static Object[][] createResearchDataset_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Research Dataset - Delete Multiple Records.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Translation Policy - Profile")
    public static Object[][] createTranslationPolicy() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Translation Policy.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Translation Policy - Min Data")
    public static Object[][] createTranslationPolicy_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Translation Policy - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Translation Policy - No Min Data")
    public static Object[][] createTranslationPolicy_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Translation Policy - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Translation Policy")
    public static Object[][] createTranslationPolicy_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Translation Policy - Delete Multiple Records.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Patents - Profile")
    public static Object[][] createPatents() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Patents.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Patents - Min Data")
    public static Object[][] createPatents_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Patents - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Patents - No Min Data")
    public static Object[][] createPatents_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Patents - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Patents")
    public static Object[][] createPatents_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Patents - Delete Multiple Records.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Contributions to NHMRC - Profile")
    public static Object[][] createContributionsToNHMRC() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Contributions to NHMRC.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Contributions to NHMRC - Min Data")
    public static Object[][] createContributionsToNHMRC_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Contributions to NHMRC - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Contributions to NHMRC - Without Min Data")
    public static Object[][] createContributionsToNHMRC_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Contributions to NHMRC - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Contributions to NHMRC")
    public static Object[][] createContributionsToNHMRC_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Contributions to NHMRC - Delete Multiple Records.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Commercial Product Outcome - Profile")
    public static Object[][] createCommercialProductOutcome() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Commercial Product Outcome.xlsx", 0).getData();
    }

    @DataProvider(name = "Create Commercial Product Outcome - Min Data")
    public static Object[][] createCommercialProductOutcome_MinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Commercial Product Outcome - Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Commercial Product Outcome - Without Min Data")
    public static Object[][] createCommercialProductOutcome_NoMinData() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Commercial Product Outcome - Missing Mandatory Fields.xlsx", 0).getData();
    }

    @DataProvider(name = "Delete Multiple Records - Commercial Product Outcome")
    public static Object[][] createCommercialProductOutcome_DeleteMultipleRecords() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Commercial Product Outcome - Delete Multiple Records.xlsx", 0).getData();
    }

}
