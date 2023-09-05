package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.LinksPage;
import DemoQA.pages.MainPage;
import org.testng.annotations.Test;

public class LinksTests  extends BaseTest {

    @Test
    public void testClickToLinks() {
        LinksPage linksPage = new MainPage(driver)
                .clickElementsCard()
                .clickLinksButton()
                .clickToLinks();
    }
}
