package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    @FindBy(className = "main-header")
    private WebElement headerElements;

    @FindBy(id = "item-0")
    private WebElement textBoxButton;

    @FindBy(id = "item-1")
    private WebElement checkBoxButton;

    @FindBy(id = "item-2")
    private WebElement radioButtonButton;

    @FindBy(id = "item-3")
    private WebElement webTablesButton;

    @FindBy(id = "item-4")
    private WebElement buttonsButton;

    @FindBy(id = "item-5")
    private WebElement linksButton;

    @FindBy(id = "item-6")
    private WebElement brokenLinksImgButton;

    @FindBy(id = "item-7")
    private WebElement uploadAndDownloadButton;

    @FindBy(id = "item-8")
    private WebElement dynamicPropertiesButton;

    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public TextBoxPage clickTextBoxButton() {
        textBoxButton.click();
        return new TextBoxPage(driver);
    }

    public RadioButtonPage clickRadioButtonButton() {
        radioButtonButton.click();
        return new RadioButtonPage(driver);
    }

    public ButtonsPage clickButtonsButton() {
        buttonsButton.click();
        return new ButtonsPage(driver);
    }

    public CheckBoxPage clickCheckBoxButton() {
        checkBoxButton.click();

        return new CheckBoxPage(driver);
    }


//    public String getHeader() {
//        return headerElements.getText();
//    }

    public String header () {
        return getHeader(headerElements);
    }
}