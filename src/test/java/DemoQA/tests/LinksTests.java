package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.LinksPage;
import DemoQA.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTests  extends BaseTest {

    @Test
    public void testClickToLinks() {
        String titleNewWindow = new MainPage(driver)
                .clickElementsCard()
                .clickLinksButton()
                .clickLink();

        Assert.assertEquals(titleNewWindow, "DEMOQA");

        driver.close();
    }
}
