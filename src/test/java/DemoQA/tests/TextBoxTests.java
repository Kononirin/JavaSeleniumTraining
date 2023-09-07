package DemoQA.tests;

import DemoQA.data.Person;
import DemoQA.pages.MainPage;
import DemoQA.pages.TextBoxPage;
import DemoQA.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {

    Person person = new Person();

    @Test
    public void testTextBox() {
        TextBoxPage textBoxPage = new MainPage(driver)
                        .clickElementsCard()
                        .clickTextBoxButton()
                        .fillAllFields(
                                person.USER_NAME,
                                person.EMAIL,
                                person.CURRENT_ADDRESS,
                                person.PERMANENT_ADDRESS);

        Assert.assertEquals(textBoxPage.getNameResult(),
                "Name:" + person.USER_NAME);
        Assert.assertEquals(textBoxPage.getEmailResult(),
                "Email:" + person.EMAIL);
        Assert.assertEquals(textBoxPage.getCurrentAddressResult(),
                "Current Address :" + person.CURRENT_ADDRESS);
        Assert.assertEquals(textBoxPage.getPermanentAddressResult(),
                "Permananet Address :" + person.PERMANENT_ADDRESS);
    }


}
