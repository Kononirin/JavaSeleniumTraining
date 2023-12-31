package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonPage extends BasePage {

    @FindBy(id = "yesRadio")
    private WebElement yesRadioButton;

    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadioButton;

    @FindBy(id = "noRadio")
    private WebElement noRadioButton;

    @FindBy(xpath = "//span[@class='text-success']")
    private WebElement textSuccess;

    public RadioButtonPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public RadioButtonPage clickYesRadioButton() {
        new Actions(driver).moveToElement(yesRadioButton).click().perform();

        return this;
    }

    public RadioButtonPage clickImpressiveRadioButton() {
        new Actions(driver).moveToElement(impressiveRadioButton).click().perform();

        return this;
    }

    public String getTextResult() {

        return textSuccess.getText();
    }

    public RadioButtonPage clickNoRadioButton() {
        new Actions(driver).moveToElement(noRadioButton).click().perform();

        return this;
    }

    public boolean isElementEnable() {

        return noRadioButton.isEnabled();
    }
}
