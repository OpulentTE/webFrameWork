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

}

