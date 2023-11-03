package test;

import driverUtil.BaseDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import testData.data;

public class loginSmokeTest{

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        //instantiate your base driver - get and quit browser
        driver = BaseDriverUtils.getDriver();
//        logger.info("This instantiate my driver");
    }

    @Test(testName = "smokeTest", dataProvider = "loginData")
    public void smokeTest(String userName, String password){
        LoginPage lgPage = new LoginPage(driver);
        lgPage.userName(userName);
        lgPage.password(password);
        lgPage.login();

        LogoutPage outPage = new LogoutPage(driver);
        outPage.hamBrgBtn();
        outPage.out();
    }



    @AfterTest
    public void closeBrowser(){
        BaseDriverUtils.quitDriver();
//        logger.info("Quit test application");
    }


    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] { //https://www.saucedemo.com/
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
                {"visual_user", "secret_sauce"},
                // Add more data pairs as needed
        };
    }



}
