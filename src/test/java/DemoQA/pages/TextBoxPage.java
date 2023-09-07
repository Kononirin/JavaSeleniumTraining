package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    private WebElement userName;

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "output")
    private WebElement resultContainer;

    @FindBy(id = "name")
    private WebElement nameResult;

    @FindBy(id = "email")
    private WebElement emailResult;

    @FindBy(xpath = "//p[@id='currentAddress']")
    private WebElement currentAddressResult;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    private WebElement permanentAddressResult;

    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public TextBoxPage fillAllFields(String name, String email, String curAddress, String permAddress) {
        userName.sendKeys(name);
        userEmail.sendKeys(email);
        currentAddress.sendKeys(curAddress);
        permanentAddress.sendKeys(permAddress);
        submitButton.click();

        return this;
    }

    public String getNameResult() {

        return nameResult.getText();
    }

    public String getEmailResult() {

        return emailResult.getText();
    }

    public String getCurrentAddressResult() {

        return currentAddressResult.getText();
    }

    public String getPermanentAddressResult() {

        return permanentAddressResult.getText();
    }

    public TextBoxPage fillUserNameField (String name){
        userName.sendKeys(name);

        return this;
    }
}
