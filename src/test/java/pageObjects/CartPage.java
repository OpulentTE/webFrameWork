package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(css = ".inventory_item_name")
    private WebElement itemName;

    @FindBy(className = ".inventory_item_desc")
    private WebElement descriptionText;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeBtn;

    @FindBy(name = "continue-shopping")
    private WebElement continueBtn;

    @FindBy(name = "checkout")
    private WebElement checkBtn;


    public CartPage(WebDriver driver){
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //method for each element created above
    public String getCartBadge(){
        return cartBadge.getText();
    }

    public String getItemName(){
        return itemName.getText();
    }

    public String getItemDesc(){
        return descriptionText.getText();
    }

    /*Method types
    Set: accepting parameters
    get: getting/retriving parameter to return any data type required
    return: returning anything String, int, float

     */

    public  void continueShopping(){
        continueBtn.click();
    }

    public void clickCheckBtn() { //
        checkBtn.click();
    }

    public void removeItem(){
        removeBtn.click();
    }

    /*
    choose an item
    add to cart
    checkout
     */
}
