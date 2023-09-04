package DemoQA.pages;

import DemoQA.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxPage extends BasePage {

    @FindBy(xpath = "//button[@aria-label='Toggle']")
    private WebElement toggleHome;

    @FindBy(xpath = "//label[@for='tree-node-desktop']/preceding-sibling::button[@aria-label]")
    private WebElement toggleDesktop;

    @FindBy(xpath = "//input[@id='tree-node-commands']/following-sibling::span[@class='rct-checkbox']")
    private WebElement checkBoxCommands;

    @FindBy(className = "rct-checkbox")
    private WebElement checkBoxHome;

    @FindBy(xpath = "//span[@class='text-success']")
    private WebElement textSuccessCommands;

    @FindBy(xpath = "//span[@class='text-success']")
    private WebElement textSuccessHome;

    public CheckBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public CheckBoxPage selectCheckBoxCommands() {
        toggleHome.click();
        toggleDesktop.click();
        checkBoxCommands.click();

        return this;
    }

    public CheckBoxPage selectCheckBoxHome() {
        checkBoxHome.click();

        return this;
    }

    public String checkBoxCommandsResult() {

        return textSuccessCommands.getText();
    }

    public List <String> checkBoxHomeResult() {

        List<WebElement> selectedCheckBoxes = driver.findElements(By.xpath(
                "//span[@class='text-success']"));

        List<String> selectedCheckBoxesStrings = new ArrayList<>();

        for (WebElement selectedCheckBox : selectedCheckBoxes) {
            selectedCheckBoxesStrings.add(selectedCheckBox.getText());
        }

        return selectedCheckBoxesStrings;
    }
}
