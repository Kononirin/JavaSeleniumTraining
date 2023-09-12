package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.MainPage;
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
    public void testclickDynamicLinkAndCheckBannerInNewWin() {
        Boolean isBannerExist = new MainPage(driver)
                .clickElementsCard()
                .clickLinksButton()
                .clickDynamicLinkAndOpenNewWindow()
                .isBannerPresent();

        Assert.assertTrue(isBannerExist);

        driver.close();
    }



//    public void testIsBannerExist() {
//        Boolean isBannerExist = new MainPage(driver)
//                .clickElementsCard()
//                .clickLinksButton()
//                .clickAnyLinkAndOpenNewWindow(dynamicLink)
//                .isBannerPresent();
//
//        Assert.assertTrue(isBannerExist);
//
//        driver.close();
//    }
}
