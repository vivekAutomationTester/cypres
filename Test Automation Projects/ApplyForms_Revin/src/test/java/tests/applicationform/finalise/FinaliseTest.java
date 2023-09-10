package tests.applicationform.finalise;

import org.testng.annotations.Test;

import apppages.common.LoginPage;
import apppages.admin.AdminHomePage;
import apppages.admin.ApprovalPage;
import config.UserAccounts;
import testbase.basetestclass.BaseTest;

public class FinaliseTest extends BaseTest{
	
	@Test
	public void approveTest() throws Exception {
		for (int j=0; j <5; j ++)
		{
			
		
				reportManager.startTest("2020 Idea Grants", "Golden Path Test Case");
				reportManager.logPass("The application is opened in the browser");
				new LoginPage(driverObj).login(UserAccounts.approver_Username, UserAccounts.approver_Password);
				new AdminHomePage(driverObj).openApprovalsPage();
				
				for (int i = 0; i < 200; i++) 
				{
					new ApprovalPage(driverObj).filterByStatus_SubmittedToRAO( "2020 CTCS BAU")
				                                                .approveApplications();
				
				}
		}
	}

}
