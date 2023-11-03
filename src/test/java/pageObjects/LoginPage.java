package pageObjects;

import driverUtil.BaseDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

    private WebDriver driver;

    @FindBy(css="[data-test=\"username\"]")
    WebElement userName;

    @FindBy(css="[data-test=\"password\"]")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userName(String uName){
        userName.sendKeys(uName);
    }

    public void password(String pws) {password.sendKeys(pws);}

    public void login() {
        loginButton.click();
    }

}
