package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {
    @FindBy(id = "usuario")
    protected WebElement inpUser;

    @FindBy(id = "senha")
    protected WebElement inpPassword;

    @FindBy(id = "btn-entrar")
    protected WebElement btnLogin;

}
