package testbase.testdata;



import library.datadriver.ExcelManager;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class AccountsTestData {
	
    @DataProvider(name = "Create Test Account - Person")
    public static Object[][] createTestAccounts() throws Exception {
        return new ExcelManager("src/test/java/resources/Create Test Account - Person.xlsx", 0).getData();
    }


}