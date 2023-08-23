package DemoQA.Tests;

import DemoQA.Data.Person;
import DemoQA.Pages.ElementsPage;
import DemoQA.Pages.MainPage;
import DemoQA.Pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTests extends BaseTest{

    MainPage mainPage;
    ElementsPage elementsPage;
    TextBoxPage textBoxPage;
    Person person = new Person();

    @Test
    public void testTextBox() {
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);

        mainPage.elementsCard.click();
        elementsPage.textBoxButton.click();

//        WebElement elementsCard1 = new WebDriverWait(driver, Duration.ofSeconds(10)).
//                until(ExpectedConditions.elementToBeClickable(mainPage.elementsCard));
////                elementsCard1.click();
//        new Actions(driver).moveToElement(elementsCard1).click().build().perform();
//
//        WebElement textBoxButton1 = new WebDriverWait(driver, Duration.ofSeconds(10)).
//                until(ExpectedConditions.elementToBeClickable(elementsPage.textBoxButton));
////                elementsCard1.click();
//        new Actions(driver).moveToElement(elementsCard1).click().build().perform();
//
////        elementsPage.textBoxButton.click();

        textBoxPage.fillFields(
                person.USER_NAME,
                person.EMAIL,
                person.CURRENT_ADDRESS,
                person.PERMANENT_ADDRESS);

        Assert.assertEquals("Name:" + person.USER_NAME, textBoxPage.nameResult.getText());
        Assert.assertEquals("Email:" + person.EMAIL, textBoxPage.emailResult.getText());
        Assert.assertEquals("Current Address :" + person.CURRENT_ADDRESS, textBoxPage.currentAddressResult.getText());
        Assert.assertEquals("Permananet Address :" + person.PERMANENT_ADDRESS, textBoxPage.permanentAddressResult.getText());
    }
}
