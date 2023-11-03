package test;

import Utilities.ConfigReader;
import driverUtil.BaseDriverUtils;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.InventoryPage;
import pageObjects.LoginPage;



public class runner {
    WebDriver driver;
    private final Logger logger = LoggerFactory.getLogger(runner.class);


    @BeforeTest
    public void openBrowser(){
        //instantiate your base driver - get and quit browser
        driver = BaseDriverUtils.getDriver();
        logger.info("This instantiate my driver");
    }



    @Test
    public void testRun(){
        logger.info("New instantance of a login page");
        LoginPage logPg = new LoginPage(driver);

        logger.info("Enter my username");
        logPg.userName("standard_user");

        logger.info("Enter my password");
        logPg.password("secret_sauce");

        logger.info("Click button");
        logPg.login();

        InventoryPage Inventory = new InventoryPage(driver);
        System.out.println(Inventory.getItemsList());

        Inventory.clickItemByName("Sauce Labs Bolt T-Shirt");

//        String itemName = Inventory.getItemName(3); // Get the name of the third item (index 2)
//        if (itemName != null) {
//            // Click on the item using the name or any other appropriate action
//            Inventory.clickItemByName(itemName);
//        } else {
//            System.out.println("Item not found or index out of bounds.");
//        }
//        System.out.println("The item name: " +itemName);
    }



    @AfterTest
    public void closeBrowser(){
        BaseDriverUtils.quitDriver();
        logger.info("Quit test application");
    }
}
