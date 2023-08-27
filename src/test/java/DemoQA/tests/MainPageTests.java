package DemoQA.tests;

import DemoQA.pages.MainPage;
import DemoQA.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {

    MainPage mainPage;

    @Test
    public void testCountOfCategoryCard(){
        mainPage = new MainPage(driver);

        Assert.assertEquals(mainPage.categoryCards.size(), 6);
    }
}
