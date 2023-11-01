package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class InventoryPage {

    private WebDriver driver;

    @FindBy(css = ".inventory_item_name")
    private List<WebElement> itemNames;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCart;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //function to iteration through items list
    public List<String> getItemsList() {
        List<String> itemsList = new ArrayList<>();
        for (WebElement itemName: itemNames){
            itemsList.add(itemName.getText());
        }
        return itemsList;
    }

    public String getItemName(int index) {
        List<String> names = getItemsList();
        if (index >= 0 && index < names.size()) {
            return names.get(index);
        }
        return null; // Return null if the index is out of bounds
    }





    public void addBtn(){
        addToCart.click();
    }

    public void clickItemByName(String itemNameToClick) {
        for (WebElement itemName : itemNames) {
            if (itemName.getText().equals(itemNameToClick)) {
                itemName.click();
                return; // Item found and clicked, exit the loop
            }
        }

        // If the loop finishes without finding the item, you can handle it here
        System.out.println("Item '" + itemNameToClick + "' not found.");
        // You might want to throw an exception or take other actions based on your requirements.
    }

}

