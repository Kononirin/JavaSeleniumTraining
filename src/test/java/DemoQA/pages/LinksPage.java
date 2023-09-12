package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage extends BasePage {

//    @FindBy(id = "simpleLink")
//    private WebElement simpleLink;

    @FindBy(xpath = "//p/a[@id='simpleLink']")
    private WebElement simpleLink;

    public LinksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public LinksPage clickHomeLink() {
        simpleLink.click();

        return new LinksPage(driver);
    }

    public String getOriginalWindowHandle() {

        return driver.getWindowHandle();
    }

    public MainPage switchToNewWindow() {
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }

        return new MainPage(driver);
    }

    public String getTitleDemoQA() {

        return driver.getTitle();
    }

    public MainPage closeDriver() {
        driver.close();

        return new MainPage(driver);
    }

    public MainPage switchToOriginalWin(String originalWin) {
        driver.switchTo().window(originalWin);

        return new MainPage(driver);
    }

    public LinksPage getOriginAndNewWindowHandle() {

        return this;
    }

    public String clickLink() {
        String originalWindow = driver.getWindowHandle();

        simpleLink.click();

        for(String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }

        return driver.getTitle();
    }
}
