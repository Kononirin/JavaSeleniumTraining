package DemoQA.Pages;

import DemoQA.Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BaseTest {

    @FindBy(className = "main-header")
    public WebElement headerElements;

    @FindBy(xpath = "//span[text() = 'Text Box']")
    public WebElement textBoxButton;

    @FindBy(xpath = "//span[text() = 'Check Box']")
    public WebElement checkBoxButton;

    @FindBy(xpath = "//span[text() = 'Radio Button']")
    public WebElement radioButtonButton;

    @FindBy(xpath = "//span[text() = 'Web Tables']")
    public WebElement webTablesButton;

    @FindBy(xpath = "//span[text() = 'Buttons']")
    public WebElement buttonsButton;

    @FindBy(xpath = "//span[text() = 'Links']")
    public WebElement linksButton;

    @FindBy(xpath = "//span[text() = 'Broken Links - Images']")
    public WebElement brokenLinksImgButton;

    @FindBy(xpath = "//span[text() = 'Upload and Download']")
    public WebElement uploadAndDownloadButton;

    @FindBy(xpath = "//span[text() = 'Dynamic Properties']")
    public WebElement dynamicPropertiesButton;

    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ElementsPage() {
    }

//    public ElementsPage clickTextBoxButton() {
//        textBoxButton.click();
//        return new TextBoxPage();
//    }
}
