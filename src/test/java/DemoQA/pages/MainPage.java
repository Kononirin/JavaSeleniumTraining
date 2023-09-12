package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//img[@class='banner-image']")
    private WebElement banner;

    @FindBy(linkText = "https://demoqa.com")
    private WebElement headerLink;

    @FindBy(xpath = "(//div[@class='card-body']//h5)[1]")
    private WebElement elementsCard;

    @FindBy(xpath = "(//div[@class='card-body']//h5)[2]")
    private WebElement formsCard;

    @FindBy(xpath = "(//div[@class='card-body']//h5)[3]")
    private WebElement alertsFrameWindowsCard;

    @FindBy(xpath = "(//div[@class='card-body']//h5)[4]")
    private WebElement widgetsCard;

    @FindBy(xpath = "(//div[@class='card-body']//h5)[5]")
    private WebElement interactionsCard;

    @FindBy(xpath = "(//div[@class='card-body']//h5)[6]")
    private WebElement bookStoreAppCard;

    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    private List<WebElement> categoryCards;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public int countNumberOfCards() {
        return categoryCards.size();
    }

    public ElementsPage clickElementsCard() {
        elementsCard.click();

        return new ElementsPage(driver);
    }

    public Boolean isBannerPresent() {

        return driver.findElements(By.xpath("//img[@class='banner-image']")).size() > 0;
    }
}
