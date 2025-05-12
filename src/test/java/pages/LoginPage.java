package pages;

import core.Driver;
import maps.LoginMaps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMaps {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getBtnLogin() {
        return inpUser;
    }

    public void login(String user, String password) {
        inpUser.sendKeys(user);
        inpPassword.sendKeys(password);
        btnLogin.click();
    }
}

