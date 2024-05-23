package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTests extends BaseTest {

    @Test
    public void testNumberOfTableRows() {
        Integer numberOfTableRows = new MainPage(driver)
                .clickElementsCard()
                .clickWebTablesButton()
                .getNumberOfTableRows();

        Assert.assertEquals(numberOfTableRows, 10);
    }
}
