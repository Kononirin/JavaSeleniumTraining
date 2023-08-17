package DemoQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    @FindBy(className = "main-header")
    public WebElement headerElements;

    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
