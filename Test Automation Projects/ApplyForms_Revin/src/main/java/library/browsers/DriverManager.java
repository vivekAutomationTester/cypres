package library.browsers;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserDescription;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import config.AppConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Driver manager.
 */
public class DriverManager {

    /**
     * The Driver.
     */
    protected WebDriver driver;
    /**
     * The Browser.
     */
    protected Browser browser;

    /**
     * Open new browser selenium web driver.
     *
     * @return the web driver
     */
    public WebDriver openNewBrowser_Selenium() {
        return openNewBrowser_Selenium(AppConfig.applicationurl);
    }

    /**
     * Open new browser selenium web driver.
     *
     * @param url the url
     * @return the web driver
     */
    public WebDriver openNewBrowser_Selenium(String url)
    {
        // TODO Auto-generated method stub
        Map <String, Object> prefs = new HashMap <String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);


        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOptions("prefs", prefs);

        WebDriverManager.chromedriver().setup();
        options.addExtensions(new File(AppConfig.chromeExtensionLocation));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        return driver;
    }


    /**
     * Open new browser lean ft browser.
     *
     * @return the browser
     * @throws Exception the exception
     */
    public Browser openNewBrowser_LeanFT() throws Exception
    {
        return openNewBrowser_LeanFT(AppConfig.applicationurl);
    }

    /**
     * Open new browser lean ft browser.
     *
     * @param url the url
     * @return the browser
     * @throws Exception the exception
     */
    public Browser openNewBrowser_LeanFT(String url) throws Exception
    {
        browser = BrowserFactory.launch(BrowserType.CHROME);;
        browser.deleteCookies();
        browser.clearCache();
        browser.navigate(url);
        return browser;
    }

    /**
     * Use open browser leanft browser.
     *
     * @return the browser
     * @throws GeneralLeanFtException the general lean ft exception
     */
    public Browser useOpenBrowser_Leanft() throws GeneralLeanFtException {
        // TODO Auto-generated method stub
        return BrowserFactory.attach(new BrowserDescription.Builder().type(BrowserType.CHROME).build());
    }

    /**
     * Clear cache.
     *
     * @throws Exception the exception
     */
    public void clearCache() throws Exception
    {
            driver.manage().deleteAllCookies();
            Thread.sleep(7000);
    }

}
