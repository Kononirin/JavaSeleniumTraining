package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage extends BasePage {

    @FindBy(xpath = "//p/a[@id='simpleLink']")
    public WebElement simpleLink;

    @FindBy(id = "dynamicLink")
    public WebElement dynamicLink;

    @FindBy(id = "created")
    public WebElement createdLink;

    @FindBy (xpath = "//p[@id='linkResponse']/b[1]")
    public WebElement responseCode;

    public LinksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public MainPage clickLinkHomeAndOpenNewWindow() {
        simpleLink.click();

        for(String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }

        return new MainPage(driver);
    }

    public MainPage clickDynamicLinkAndOpenNewWindow() {
        dynamicLink.click();

        for(String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }

        return new MainPage(driver);
    }
//
//    public MainPage clickAnyLinkAndOpenNewWindow(WebElement link) {
//        link.click();
//
//        for(String newWindow : driver.getWindowHandles()) {
//            driver.switchTo().window(newWindow);
//        }
//
//        return new MainPage(driver);
//    }

    public LinksPage clickLinkCreated() {
        createdLink.click();

        return this;
    }

    public String getResponseCode() {

        return responseCode.getText();
    }


}
