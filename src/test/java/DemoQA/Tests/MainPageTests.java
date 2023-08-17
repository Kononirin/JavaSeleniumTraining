package DemoQA.Tests;

import DemoQA.Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{

    MainPage mainPage;

    @Test
    public void testCountOfCategoryCard(){
        mainPage = new MainPage(driver);

        Assert.assertEquals(mainPage.categoryCards.size(), 6);
    }

}
