package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    private WebDriver driver;

    @FindBy(css = ".bm-burger-button")
    WebElement burgerBtn;

    @FindBy(id = "logout_sidebar_link")
    WebElement logout;

    public LogoutPage(WebDriver driver){
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hamBrgBtn(){
        burgerBtn.click();
    }

    public void out(){
        logout.click();
    }
}
