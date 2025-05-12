package pages;

import core.Driver;
import maps.ProductsListMaps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductsListPage extends ProductsListMaps {
    public ProductsListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getLinkBoasVindas() {
        return linkBoasVindas;
    }

    public String getText() {
        return linkBoasVindas.getText();
    }
}
