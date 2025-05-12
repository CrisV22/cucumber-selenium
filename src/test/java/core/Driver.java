package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import util.ChromeDriverOptions;

import java.time.Duration;

public class Driver {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initializeBrowser() {
        driver = new ChromeDriver(ChromeDriverOptions.getChromeDriverOptions());
    }

    public static boolean isAt(WebDriver driverFluentWait, WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<>(driverFluentWait)
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);

        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }
}
