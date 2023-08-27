package DemoQA.tests;

import DemoQA.pages.ElementsPage;
import DemoQA.pages.MainPage;
import DemoQA.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest {
    MainPage mainPage;
    ElementsPage elementsPage;

    @Test
    public void testClickElementsCard() {
        mainPage = new MainPage(driver);
//        elementsPage = new ElementsPage(driver);

        mainPage.elementsCard.click();

        Assert.assertEquals(elementsPage.headerElements.getText(), "Elements");
    }
}
