package testbase.basetestclass;

import config.AppConfig;
import org.testng.annotations.BeforeMethod;
import testbase.testscenario.ApplyScenario;

public class ApplicationsFormsTest  extends BaseTest {
    protected ApplyScenario testScenario;


    @BeforeMethod
    public void beforeMethod() throws Exception {
        testScenario = new ApplyScenario(driverObj);
        environmentUrl = AppConfig.discoveryUrl;
        super.beforeMethod();
    }


}
