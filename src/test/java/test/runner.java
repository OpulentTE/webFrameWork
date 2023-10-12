package test;

import Utilities.ConfigReader;
import driverUtil.BaseDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;



public class runner {
    WebDriver driver;


    @BeforeTest
    public void openBrowser(){
        //instantiate your base driver - get and quit browser
        driver = BaseDriverUtils.getDriver();

    }



    @Test
    public void testRun(){
        LoginPage logPg = new LoginPage(driver);
        logPg.userName("standard_user");
        logPg.password("secret_sauce");
        logPg.login();

    }



    @AfterTest
    public void closeBrowser(){
        BaseDriverUtils.quitDriver();
    }
}
