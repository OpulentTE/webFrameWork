package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class helpers {

    private WebDriver driver;

    public helpers(WebDriver driver){
        this.driver = driver;
    }

    public void clickElement(By by){
        WebElement elem = driver.findElement(by);
        elem.click();
    }

    public void loginUserDetails(String userName, String Password){
        /*
        instantiate a WebElement
        Set a value to collect username
        set a value to collect a password
        Then pass element to click action

         */



    }
}
