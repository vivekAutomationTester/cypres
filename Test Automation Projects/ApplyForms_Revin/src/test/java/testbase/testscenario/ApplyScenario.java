package testbase.testscenario;

import apppages.admin.adminSystemSettings.GrantOpportunityEditPage;
import apppages.admin.adminSystemSettings.GrantOpportunitySearchPage;
import apppages.applicationforms.pages.*;

import groovy.transform.Undefined;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.useractions.BasePage;
import org.openqa.selenium.WebDriver;

import com.hp.lft.sdk.web.Browser;

import apppages.common.ApplicationsPage;
import apppages.common.HomePage;
import apppages.common.LoginPage;
import apppages.common.LogoutPage;

public class ApplyScenario extends BasePage {



	/**
	 * Instantiates a new Base page.
	 *
	 * @param driverObj the driver obj
	 */
	public ApplyScenario(DriverObj driverObj) {
		super(driverObj);
	}


	//	test comment
	public LoginPage loginPage() throws Exception
	{
		// TODO Auto-generated method stub
		return new LoginPage(driverObj);
	}
	public HomePage homePage() throws Exception
	{
		// TODO Auto-generated method stub
		return new HomePage(driverObj);
	}
	public PostgradForm postgradForm() throws Exception
	{
		return new PostgradForm(driverObj);
	}
	public ApplicationsPage applicationsPage()
	{
		return new ApplicationsPage(driverObj);
	}
	public ApplicationDetailsTab applicationDetailsTab() throws Exception
	{
		return new ApplicationDetailsTab(driverObj);
	}
	public ParticipatingInstitutionsTab participatingInstitutionsTab()
	{
		return new ParticipatingInstitutionsTab(driverObj);
	}
	public ResearchClassificationTab researchClassificationTab()
	{
		return new ResearchClassificationTab(driverObj);
	}
	public ResearchTeamTab researchTeamTab() throws Exception
	{
		return new ResearchTeamTab(driverObj);
	}
	public EthicsTab ethicsTab()
	{
		return new EthicsTab(driverObj);
	}
	public GrantProposalTab grantProposalTab()
	{
		return new GrantProposalTab(driverObj);
	}
	public StrategicPrioritiesTab strategicPrioritiesTab()
	{
		return new StrategicPrioritiesTab(driverObj);
	}
	public BudgetProposalTab budgetProposalTab()
	{
		return new BudgetProposalTab(driverObj);
	}
	public DirectResearchCosts directResearchCosts() throws Exception
	{
		return new DirectResearchCosts(driverObj);
	}
	public AddOtherResearchCosts addOtherResearchCosts()
	{
		return new AddOtherResearchCosts(driverObj);
	}
	public CertifyTab certifyTab()
	{
		return new CertifyTab(driverObj);
	}
	public FinaliseApplication finaliseApplication()
	{
		return new FinaliseApplication(driverObj);
	}
	public LogoutPage logoutPage()
	{
		return new LogoutPage(driverObj);
	}

	public DeclarationOfInterest declarationOfInterest()
	{
		return new DeclarationOfInterest(driverObj);
	}
	public CallSpecificInformation callSpecificInformation() throws Exception
	{
		return new CallSpecificInformation(driverObj);
	}
	public GrantOpportunitySearchPage grantOpportunitySearchPage()
	{
		return new GrantOpportunitySearchPage(driverObj);
	}
	public GrantOpportunityEditPage grantOpportunityEditPage() throws Exception
	{
		return new GrantOpportunityEditPage(driverObj);
	}
	public ResearchTeamChiefInvestigatorTab researchTeamChiefInvestigatorTab() throws Exception
	{
		return new ResearchTeamChiefInvestigatorTab(driverObj);
	}
	public ResearchTeamAssociateInvestigatorTab researchTeamAssociateInvestigatorTab() throws Exception
	{
		return new ResearchTeamAssociateInvestigatorTab(driverObj);
	}
	public ThirdPartyResearchTab thirdPartyResearchTab()
	{
		return new ThirdPartyResearchTab(driverObj);
	}

	public PartnerOrganisationsTab partnerOrganisationsTab() throws Exception
	{
		return new PartnerOrganisationsTab(driverObj);
	}
	public PartnerDetailsTab partnerDetailsTab() throws Exception
	{
		return new PartnerDetailsTab(driverObj);
	}
    public FundingPartners fundingPartners() throws Exception
	{
		return new FundingPartners(driverObj);
    }
    public AddPartnerContribution addPartnerContribution()
	{
		return new AddPartnerContribution(driverObj);
    }
    public KeyApplicationInformationTab keyApplicationInformationTab()
	{
		return new KeyApplicationInformationTab(driverObj);
	}
	public EnrolmentQualificationsAndExperienceTab enrolmentQualificationsAndExperienceTab()
	{
		return new EnrolmentQualificationsAndExperienceTab(driverObj);
	}
	public ResearchAndCareerInformationTab researchAndCareerInformationTab()
	{
		return new ResearchAndCareerInformationTab(driverObj);
	}
	public ScholarshipAttachments scholarshipAttachments()
	{
		return new ScholarshipAttachments(driverObj);
	}
	public PartnerDetailsPracticeTab partnerDetailsPracticeTab()
	{
		return new PartnerDetailsPracticeTab(driverObj);
	}
	public TrackRecord trackRecord()
	{
		return new TrackRecord(driverObj);
	}
	public StrategicPrioritiesAndFundingPartnersTab strategicPrioritiesAndFundingPartnersTab()
	{
		return new StrategicPrioritiesAndFundingPartnersTab(driverObj);
	}
	public FundingOrganisationsTab fundingOrganisationsTab()
	{
		return new FundingOrganisationsTab(driverObj);
	}
	public BudgetProposalDRCAndEquipmentTab budgetProposalDRCAndEquipmentTab()
	{
		return new BudgetProposalDRCAndEquipmentTab(driverObj);
	}
	public ResearcherTab researcherTab()
	{
		return new ResearcherTab(driverObj);
	}
	public SalaryDeclarationSummaryTab salaryDeclarationSummaryTab()
	{
		return new SalaryDeclarationSummaryTab(driverObj);
	}
	public RelativeToOpportunityTab relativeToOpportunityTab()
	{
		return new RelativeToOpportunityTab(driverObj);
	}
	public AlternativeResearchClassificationTab alternativeResearchClassificationTab()
	{
		return new AlternativeResearchClassificationTab(driverObj);
	}
	public AlternativeResearchTeamTab alternativeResearchTeamTab()
	{
		return new AlternativeResearchTeamTab(driverObj);
	}
	public SynergyResearchTeamTab synergyResearchTeamTab()
	{
		return new SynergyResearchTeamTab(driverObj);
	}
	public SynergyTrackRecordTab synergyTrackRecordTab()
	{
		return new SynergyTrackRecordTab(driverObj);
	}
	public AlternativeCallSpecificInformationTab alternativeCallSpecificInformationTab()
	{
		return new AlternativeCallSpecificInformationTab(driverObj);
	}
	public DirectResearchCostsTest directResearchCostsTest()
	{
		return new DirectResearchCostsTest(driverObj);
	}
	public DevGrantsApplicationDetailsTab devGrantsApplicationDetailsTab()
	{
		return new DevGrantsApplicationDetailsTab(driverObj);
	}
	public ChiefInvestigatorTab chiefInvestigatorTab()
	{
		return new ChiefInvestigatorTab(driverObj);
	}
	public ParticipatingOrganisationsTab participatingOrganisationsTab()
	{
		return new ParticipatingOrganisationsTab(driverObj);
	}
	public InformationAboutApplicantTab informationAboutApplicantTab() throws Exception
	{
		return new InformationAboutApplicantTab(driverObj);
	}

	public YourDetailsTab yourDetailsTab()
	{
		return new YourDetailsTab(driverObj);
	}
}