package DemoQA.Tests;

import DemoQA.Pages.TextBoxPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest{

    TextBoxPage textBoxPage;



    @Test
    public void testTextBox() {
        textBoxPage = new TextBoxPage(driver);


        driver.findElement(By.id("item-0")).click();


    }
}
