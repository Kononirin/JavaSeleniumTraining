package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage extends BasePage {

    @FindBy(id = "simpleLink")
    private WebElement simpleLink;

    public LinksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public LinksPage clickToLinks() {
        simpleLink.click();
        return new LinksPage(driver);
    }
}
