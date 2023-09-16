package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.LinksPage;
import DemoQA.pages.MainPage;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTests  extends BaseTest {

    @Test
    public void testOpenNewWindowAndCheckBanner() {
        Boolean isBannerExist = new MainPage(driver)
                .clickElementsCard()
                .clickLinksButton()
                .clickLinkHomeAndOpenNewWindow()
                .isBannerPresent();

        Assert.assertTrue(isBannerExist);

        driver.close();
    }

    @Test
    public void testClickDynamicLinkAndCheckBannerInNewWin() {
        Boolean isBannerExist = new MainPage(driver)
                .clickElementsCard()
                .clickLinksButton()
                .clickDynamicLinkAndOpenNewWindow()
                .isBannerPresent();

        Assert.assertTrue(isBannerExist);

        driver.close();
    }

//    LinksPage linksPage = new LinksPage(driver);
//
//    @Test
//    public void testIsBannerExist() {
//        Boolean isBannerExist = new MainPage(driver)
//                .clickElementsCard()
//                .clickLinksButton()
//                .clickAnyLinkAndOpenNewWindow(linksPage.dynamicLink)
//                .isBannerPresent();
//
//        Assert.assertTrue(isBannerExist);
//
//        driver.close();
//    }

    @Test
    public void testClickCreatedLink() {
        LinksPage linksPage = new MainPage(driver)
                .clickElementsCard()
                .clickLinksButton()
                .clickLinkCreated();

        Assert.assertEquals(linksPage.getResponseCode(), "201");
    }

    @Test
    public void testStatusCodeCreatedLink() {
        int statusCode = RestAssured.get("https://demoqa.com/created").statusCode();

        Assert.assertEquals(statusCode, 201);

    }
}
