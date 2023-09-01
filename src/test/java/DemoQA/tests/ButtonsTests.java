package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.ButtonsPage;
import DemoQA.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTest {

    @Test
    public void testDoubleClickMeButton() {
        ButtonsPage buttonsPage = new MainPage(driver)
                .clickElementsCard()
                .clickButtonsButton()
                .doubleClickOnButton();

        Assert.assertEquals(buttonsPage.doubleClickResult(), "You have done a double click");
    }

    @Test
    public void testRightClickMeButton() {
        ButtonsPage buttonsPage = new MainPage(driver)
                .clickElementsCard()
                .clickButtonsButton()
                .rightClickOnButton();

        Assert.assertEquals(buttonsPage.rightClickResult(), "You have done a right click");
    }

    @Test
    public void testClickMeButton() {
        ButtonsPage buttonsPage = new MainPage(driver)
                .clickElementsCard()
                .clickButtonsButton()
                .clickOnClickMeButton();

        Assert.assertEquals(buttonsPage.clickMeResult(), "You have done a dynamic click");
    }
}
