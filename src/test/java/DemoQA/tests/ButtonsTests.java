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
                .clickDoubleOnButtonDoubleClickMe();

        Assert.assertEquals(buttonsPage.getDoubleClickResult(), "You have done a double click");
    }

    @Test
    public void testRightClickMeButton() {
        ButtonsPage buttonsPage = new MainPage(driver)
                .clickElementsCard()
                .clickButtonsButton()
                .clickRightOnButton();

        Assert.assertEquals(buttonsPage.getRightClickResult(), "You have done a right click");
    }

    @Test
    public void testClickMeButton() {
        ButtonsPage buttonsPage = new MainPage(driver)
                .clickElementsCard()
                .clickButtonsButton()
                .clickOnClickMeButton();

        Assert.assertEquals(buttonsPage.getClickMeResult(), "You have done a dynamic click");
    }
}
