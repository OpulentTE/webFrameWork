package driverUtil;

import Utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseDriverUtils {
    /*

     */
    private static WebDriver driver; //set up the driver to pick driver

    @BeforeClass
    public static WebDriver getDriver() {
        if (driver == null) {
            // Set up the WebDriver instance
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            ConfigReader reader = new ConfigReader();
            String webSite =  reader.getProperty("baseUrl"); //get property is getting a property because is getting a String




            // Configure Chrome options
            ChromeOptions chrome = new ChromeOptions();
            chrome.addArguments("--start-maximized"); // Maximize the browser window
            chrome.addArguments("--disable-infobars"); // Disable the info bar
            chrome.addArguments("--disable-notifications"); // Disable notifications
            chrome.addArguments("--disable-extensions"); // Disable browser extensions


            DesiredCapabilities desire = new DesiredCapabilities();
            desire.setCapability(ChromeOptions.CAPABILITY, chrome);

            chrome.merge(desire);


            WebDriverManager.chromedriver().driverVersion("116").setup();
            driver = new ChromeDriver(chrome);

            //navigate to the url
            driver.get(webSite);

        }
        return driver;
    }

    @AfterClass
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



}
