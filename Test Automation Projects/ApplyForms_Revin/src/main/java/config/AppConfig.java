package config;

public class AppConfig {

	// Bad practice to modify configuration using scripts i.e at runtime

	// Application urls - defined as constants
	public static final String preprodUrl ="https://nhmrcomnistar3uat.f1solutions.com.au";
	public static final String projectQaUrl ="https://nhmrcomnistartestprojectqa.f1solutions.com.au";
	public static final String bauQaUrl ="https://nhmrcomnistartestbauqa.f1solutions.com.au";
	public static final String discoveryUrl ="https://nhmrcomnistar3uat.f1solutions.com.au";
	public static final String performanceUrl ="https://nhmrcomnistarperformance.f1solutions.com.au";
	public static final String applicationurl = performanceUrl;

	// Supporting Software Location
	public static final String chromeExtensionLocation = "C:\\Program Files (x86)\\Micro Focus\\Unified Functional Testing\\Installations\\Chrome\\Agent.crx";

	// Report Location
    public static final String reportFolder="src/test/java/resources/reports/";

    // Used in GMA
    public static String environment = new AppConfig().getEnvironment();


	// get the environment text using the current value of application url
	// Used for constructing urls
	private String getEnvironment()
	{
		switch (applicationurl) // current value of application url
		{
			case bauQaUrl:
				return  "bauqa";
			case preprodUrl:
				return  "pre-prod";
			case projectQaUrl:
				return  "projectqa";
			case performanceUrl:
				return  "performance";
		}
			return "";
	}
}
