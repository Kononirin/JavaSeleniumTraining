package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.MainPage;
import DemoQA.pages.RadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonPageTests extends BaseTest {

    @Test
    public void testRadioButtonYes() {
        RadioButtonPage radioButtonPage = new MainPage(driver)
                .clickElementsCard()
                .clickRadioButtonButton()
                .clickYesRadioButton();

        Assert.assertEquals(radioButtonPage.getTextResult(), "Yes");
    }

    @Test
    public void testRadioButtonImpressive() {
        RadioButtonPage radioButtonPage = new MainPage(driver)
                .clickElementsCard()
                .clickRadioButtonButton()
                .clickImpressiveRadioButton();

        Assert.assertEquals(radioButtonPage.getTextResult(), "Impressive");
    }

    @Test
    public void testRadioButtonNo() {
        RadioButtonPage radioButtonPage = new MainPage(driver)
                .clickElementsCard()
                .clickRadioButtonButton()
                .clickNoRadioButton();

        Assert.assertFalse(radioButtonPage.isElementEnable());
    }
}
