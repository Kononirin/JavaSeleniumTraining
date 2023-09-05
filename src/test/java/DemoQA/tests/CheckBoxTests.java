package DemoQA.tests;

import DemoQA.core.BaseTest;
import DemoQA.pages.CheckBoxPage;
import DemoQA.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CheckBoxTests extends BaseTest {

    @Test
    public void testCheckBoxCommands() {
        CheckBoxPage checkBoxPage = new MainPage(driver)
                .clickElementsCard()
                .clickCheckBoxButton()
                .selectCheckBoxCommands();

        Assert.assertEquals(checkBoxPage.checkBoxCommandsResult(), "commands");
    }

    @Test
    public void testcheckBoxHome() {
        List<String> allCheckBoxes = Arrays.asList("home", "desktop", "notes", "commands", "documents", "workspace", "react", "angular", "veu",
                "office", "public", "private", "classified", "general", "downloads", "wordFile", "excelFile");

        CheckBoxPage checkBoxPage = new MainPage(driver)
                .clickElementsCard()
                .clickCheckBoxButton()
                .selectCheckBoxHome();

        Assert.assertEquals(checkBoxPage.checkBoxHomeResult(), allCheckBoxes);
    }
}
