package DemoQA.Tests;

import DemoQA.Pages.ElementsPage;
import DemoQA.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest{
    MainPage mainPage;
    ElementsPage elementsPage;


    @Test
    public void testClickElementsCard() {
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);

        mainPage.elementsCard.click();

        Assert.assertEquals(elementsPage.headerElements.getText(), "Elements");
    }
}