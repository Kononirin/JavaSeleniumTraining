package DemoQA.tests;

import DemoQA.data.Person;
import DemoQA.pages.ElementsPage;
import DemoQA.pages.MainPage;
import DemoQA.pages.TextBoxPage;
import DemoQA.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {

    MainPage mainPage;
    ElementsPage elementsPage;
    TextBoxPage textBoxPage;
    Person person = new Person();

    @Test
    public void testTextBox() {

        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);

        mainPage.elementsCard.click();
        elementsPage.textBoxButton.click();

        textBoxPage.fillFields(
                person.USER_NAME,
                person.EMAIL,
                person.CURRENT_ADDRESS,
                person.PERMANENT_ADDRESS);

        Assert.assertEquals("Name:" + person.USER_NAME, textBoxPage.nameResult.getText());
        Assert.assertEquals("Email:" + person.EMAIL, textBoxPage.emailResult.getText());
        Assert.assertEquals("Current Address :" + person.CURRENT_ADDRESS, textBoxPage.currentAddressResult.getText());
        Assert.assertEquals("Permananet Address :" + person.PERMANENT_ADDRESS, textBoxPage.permanentAddressResult.getText());
    }
}
