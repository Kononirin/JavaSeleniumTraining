package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class WebTablesTests extends BaseTest {

    @Test
    public void testNumberOfTableRows() {
        Integer numberOfTableRows = new MainPage(driver)
                .clickElementsCard()
                .clickWebTablesButton()
                .getNumberOfTableRows();

        Assert.assertEquals(numberOfTableRows, 10);
    }

    @Test
    public void testNumberOfTableHeaders() {
        Integer numberOfTableHeaders = new MainPage(driver)
                .clickElementsCard()
                .clickWebTablesButton()
                .getNumberOfTableHeaders();

        Assert.assertEquals(numberOfTableHeaders, 7);
    }

    @Test
    public void testNamesOfTableHeaders() {

        String[] expectedArray = {"First Name", "Last Name",
                "Age", "Email", "Salary", "Department", "Action"};

        String[] actualArray = new MainPage(driver)
                .clickElementsCard()
                .clickWebTablesButton()
                .arrayOfTableHeaders();

        Assert.assertEquals(actualArray, expectedArray);
    }



}
