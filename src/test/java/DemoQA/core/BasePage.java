package DemoQA.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }
}
