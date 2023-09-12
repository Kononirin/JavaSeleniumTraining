package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ButtonsPage extends BasePage {

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickMe;

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickMe;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement clickMe;

    @FindBy(id = "doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    private WebElement dynamicClickMessage;

    public ButtonsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ButtonsPage clickDoubleOnButton() {
        new Actions(driver).moveToElement(doubleClickMe).doubleClick().perform();

        return this;
    }

    public String getDoubleClickResult() {

        return doubleClickMessage.getText();
    }

    public ButtonsPage clickRightOnButton() {
        new Actions(driver).moveToElement(rightClickMe).contextClick().perform();

        return this;
    }

    public String getRightClickResult() {

        return rightClickMessage.getText();
    }

    public ButtonsPage clickOnClickMeButton() {
        clickMe.click();

        return this;
    }

    public String getClickMeResult() {


        return dynamicClickMessage.getText();
    }
}
