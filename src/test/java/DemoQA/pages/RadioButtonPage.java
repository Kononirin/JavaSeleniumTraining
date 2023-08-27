package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BasePage {

    @FindBy(className = "yesRadio")
    public WebElement yesRadioButton;

    @FindBy(className = "impressiveRadio")
    public WebElement impressiveRadioButton;

    @FindBy(className = "noRadio")
    public WebElement noRadioButton;

    @FindBy(xpath = "//span[text() = 'Yes']")
    public WebElement textSuccessYes;

    @FindBy(xpath = "//span[text() = 'Impressive']")
    public WebElement textSuccessImpressive;

    public RadioButtonPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
