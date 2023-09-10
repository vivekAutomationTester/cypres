package testbase.basetestclass;


import com.hp.lft.sdk.web.WebElement;
import library.browsers.DriverManager;
import library.browsers.DriverObj;
import library.reports.ReportManager;
import library.reports.Reporter;
import library.utility.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import com.hp.lft.sdk.web.Browser;


public class BaseTest {

	protected DriverObj driverObj;

	private DriverManager driverManager;
	protected String environmentUrl;
	protected ReportManager reportManager;

	// Runs before the start of the execution
	@BeforeGroups(alwaysRun=true)
	@BeforeSuite(alwaysRun=true)
	public void setup() throws Exception
	{
		SDK.init(new ModifiableSDKConfiguration());
		driverObj = new DriverObj();
		driverObj.setReportManager(Reporter.getInstance());
		reportManager = driverObj.getReportManager();
		driverManager = new DriverManager();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	}

	// Runs before every test
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() throws Exception
	{
		//	Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");

		driverObj.setDriver(driverManager.openNewBrowser_Selenium());
		driverObj.setBrowser(driverManager.useOpenBrowser_Leanft());

	}


	// Runs after every test
	@AfterMethod(alwaysRun=true)
	public void afterMethod(ITestResult result) throws Exception
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			reportManager
					.logFail("Exception Found: " +
									result.getThrowable() ,
							new Screenshot(driverObj.getDriver()).takeScreenshot((reportManager.getExtentReportDirectory()+"\\"),
									"Exception"));
		}
		reportManager.publish();
//		browser.close();
//		driver.quit();

	}


	// Runs after every test
	@AfterSuite
	public void cleanup() throws Exception
	{
		// Clear everything up
		//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	}


}
