package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "output")
    public WebElement resultContainer;

    @FindBy(id = "name")
    public WebElement nameResult;

    @FindBy(id = "email")
    public WebElement emailResult;

    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement currentAddressResult;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement permanentAddressResult;

    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(this.driver, this);
    }

    public TextBoxPage fillFields(String name, String email, String curAddress, String permAddress) {
        userName.sendKeys(name);
        userEmail.sendKeys(email);
        currentAddress.sendKeys(curAddress);
        permanentAddress.sendKeys(permAddress);
        submitButton.click();
        return this;
    }

    public TextBoxPage fillUserName (String name){
        userName.sendKeys(name);
        return this;
    }
}
