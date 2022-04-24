package seleniumTests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.Common;
import utils.PropertyLoader;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.Objects;

public class BaseTest {

    WebDriver driver;

    protected Common c = new Common();

    //public String setStringKey = System.setProperty("StendKey", "stend1");
    public static String stendKey = System.getProperty("StendKey", "stend1");
    public static String stendUrl = PropertyLoader.loadProperty(stendKey);
    public static String browserNameKey = System.getProperty("BrowserName", "browserName1");
    public static String browserName = PropertyLoader.loadProperty(browserNameKey);

    @BeforeTest
    public void  beforeT() {
        Capabilities op = null;
        if (browserName.equals("chrome")) {
            c.logToReport("Chrome");
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
            op = new ChromeOptions();
        }

        if (browserName.equals("firefox")) {
            c.logToReport("Firefox");
            System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
            op = new FirefoxOptions();
        }
        //op.addArguments("user-agent=\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36\"");
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        dc.setCapability(ChromeOptions.CAPABILITY, op);
//        driver = new ChromeDriver();

        //op.setCapability("version", "selenoid_buharova");

        URL hub = null;

        try {
            hub = new URL("http://localhost:4445/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub, op);
    }

    @AfterTest
    public void afterTest() {
        getScreenShot();
        driver.quit();
        if(driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }


    @Attachment(value="Page screenshot", type = "image/png")
    public byte[] getScreenShot() {

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
