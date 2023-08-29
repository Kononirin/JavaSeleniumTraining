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
                        .fillFields(
                                person.USER_NAME,
                                person.EMAIL,
                                person.CURRENT_ADDRESS,
                                person.PERMANENT_ADDRESS);

        Assert.assertEquals(textBoxPage.nameResult(), "Name:" + person.USER_NAME);
        Assert.assertEquals(textBoxPage.emailResult(), "Email:" + person.EMAIL);
        Assert.assertEquals(textBoxPage.currentAddressResult(), "Current Address :" + person.CURRENT_ADDRESS);
        Assert.assertEquals(textBoxPage.permanentAddressResult(), "Permananet Address :" + person.PERMANENT_ADDRESS);
    }


}
