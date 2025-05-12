package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductsListPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private LoginPage loginPage;
    private String user;

    @Before
    public void arrange() {
        Driver.initializeBrowser();
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get("http://165.227.93.41/lojinha-web/v2/");
        this.loginPage = new LoginPage();
        assertTrue(Driver.isAt(Driver.getDriver(), loginPage.getBtnLogin()));
    }
    @When("the login is executed with the data")
    public void theLoginIsExecutedWithTheData(Map<String, String> map) {
        this.loginPage.login(map.get("user"), map.get("password"));
        user = map.get("user");
    }
    @Then("log into the system")
    public void logIntoTheSystem() {
        ProductsListPage productsListPage = new ProductsListPage();
        assertTrue(Driver.isAt(Driver.getDriver(), productsListPage.getLinkBoasVindas()));
        assertEquals("Boas vindas, " + user + "!", productsListPage.getText());
    }

    @After
    public void after() {
        Driver.getDriver().quit();
    }
}
