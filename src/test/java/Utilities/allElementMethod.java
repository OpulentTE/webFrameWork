package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allElementMethod {

    private WebDriver driver;


    public allElementMethod(WebDriver driver){
        this.driver = driver;
    }

    /*
    click function to call an y element

     */

    public void clickElement(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void sendText(By by, String msg){
        WebElement element = driver.findElement(by);
        element.clear();

    }
}
