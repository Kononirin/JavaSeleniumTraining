package DemoQA.Pages;

import DemoQA.Tests.BaseTest;
import DemoQA.Tests.RadioButtonPageTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BaseTest {

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
