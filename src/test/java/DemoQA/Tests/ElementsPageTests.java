package DemoQA.Tests;

import DemoQA.Pages.ElementsPage;
import DemoQA.Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest{
    MainPage mainPage;
    ElementsPage elementsPage;

    @Test
    public void testElementsCard() {
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);

        mainPage.elementsCard.click();

        Assert.assertEquals(elementsPage.headerElements.getText(), "Elements");
    }
}
