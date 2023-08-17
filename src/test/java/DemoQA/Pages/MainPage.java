package DemoQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    @FindBy(linkText = "https://demoqa.com")
    public WebElement headerLink;

    @FindBy(xpath = "//h5[text() = 'Elements']")
    public WebElement elementsCard;

    @FindBy(xpath = "//h5[text() = 'Forms']")
    public WebElement formsCard;

    @FindBy(xpath = "//h5[text() = 'Alerts, Frame & Windows']")
    public WebElement alertsFrameWindowsCard;

    @FindBy(xpath = "//h5[text() = 'Widgets']")
    public WebElement widgetsCard;

    @FindBy(xpath = "//h5[text() = 'Interactions']")
    public WebElement interactionsCard;

    @FindBy(xpath = "//h5[text() = 'Book Store Application']")
    public WebElement bookStoreAppCard;

    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    public List<WebElement> categoryCards;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
