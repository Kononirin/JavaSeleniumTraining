package DemoQA.tests;

import DemoQA.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class Tests extends BaseTest {

    private static final By ELEMENTS = By.xpath("//div[1][@class='card mt-4 top-card']");

    @Test
    public void testGetHeader() {
        driver.findElement(ELEMENTS).click();

        WebElement mainHeader = driver.findElement(By.xpath("//div[@class='main-header']"));

        Assert.assertEquals(mainHeader.getText(), "Elements");
    }

    @Test
    public void testTextBox() {
        driver.findElement(ELEMENTS).click();
        driver.findElement(By.id("item-0")).click();
        driver.findElement(By.id("userName")).sendKeys("Irina Shlyapina");
        driver.findElement(By.id("userEmail")).sendKeys("kononirin@yandex.ru");
        driver.findElement(By.id("currentAddress")).sendKeys("Perm, Turchevicha 6-320");
        driver.findElement(By.id("permanentAddress")).sendKeys("Perm, Turchevicha 6-320");
        driver.findElement(By.id("submit")).click();

        WebElement name = driver.findElement(By.xpath("//p[text()='Irina Shlyapina']"));
        WebElement email = driver.findElement(By.xpath("//p[@id='email']"));
        WebElement currentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

        Assert.assertEquals(name.getText(), "Name:Irina Shlyapina");
        Assert.assertEquals(email.getText(), "Email:kononirin@yandex.ru");
        Assert.assertEquals(currentAddress.getText(), "Current Address :Perm, Turchevicha 6-320");
        Assert.assertEquals(permanentAddress.getText(), "Permananet Address :Perm, Turchevicha 6-320");
    }

    @Test
    public void testRadioButtonYes() {
        driver.findElement(ELEMENTS).click();
        driver.findElement(By.id("item-2")).click();

        WebElement radioButtonYes = driver.findElement(By.xpath("//input[@id='yesRadio']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", radioButtonYes);

        WebElement yourSelect = driver.findElement(By.xpath("//span[@class='text-success']"));

        Assert.assertEquals(yourSelect.getText(), "Yes");
    }

    @Test
    public void testRadioButtonImpressive() {
        driver.findElement(ELEMENTS).click();
        driver.findElement(By.id("item-2")).click();

        WebElement radioButtonImpressive = driver.findElement(By.id("impressiveRadio"));
        new Actions(driver).moveToElement(radioButtonImpressive).click().build().perform();

        WebElement yourSelect = driver.findElement(By.xpath("//span[@class='text-success']"));

        Assert.assertEquals(yourSelect.getText(), "Impressive");
    }

    @Test
    public void testCheckBoxCommands() {
        driver.findElement(ELEMENTS).click();
        driver.findElement(By.id("item-1")).click();

        driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button[@aria-label]")).click();


        WebElement checkBoxCommands = driver.findElement(By.xpath("//input[@id='tree-node-commands']/following-sibling::span[@class='rct-checkbox']"));
        checkBoxCommands.click();

        WebElement yourSelect = driver.findElement(By.xpath("//span[@class='text-success']"));

        Assert.assertEquals(yourSelect.getText(), "commands");
    }

    @Test
    public void testCheckBoxHome() {
        driver.findElement(ELEMENTS).click();
        driver.findElement(By.id("item-1")).click();

        WebElement checkBoxHome = driver.findElement(By
                .xpath("//span[@class='rct-checkbox']"));
        checkBoxHome.click();

        List<String> allCheckBoxes = Arrays.asList("home", "desktop", "notes", "commands", "documents", "workspace", "react", "angular", "veu",
                "office", "public", "private", "classified", "general", "downloads", "wordFile", "excelFile");

        List<WebElement> selectedCheckBoxes = driver.findElements(By.xpath(
                "//span[@class='text-success']"));

        List<String> selectedCheckBoxesStrings = new ArrayList<>();

        for (WebElement selectedCheckBox : selectedCheckBoxes) {
            selectedCheckBoxesStrings.add(selectedCheckBox.getText());
        }

        Assert.assertEquals(selectedCheckBoxesStrings, allCheckBoxes);
    }

    @Test
    public void workWithWindows() {
        driver.findElement(ELEMENTS).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 250)");

        Actions actions = new Actions(driver);
        WebElement linksButton1 = driver.findElement(By.id("item-5"));
        actions.moveToElement(linksButton1).click().perform();

        String originalWindow = driver.getWindowHandle();
        //Set<String> existingWindows = driver.getWindowHandles();

        WebElement linkHome1 = driver.findElement(By.id("simpleLink"));
        linkHome1.click();

        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }

//        WebElement headerDemoQA = driver.findElement(By.xpath("//header//a[@href='https://demoqa.com']"));
//        Assert.assertEquals(headerDemoQA.getText(), "https://demoqa.com");

        String titleDemoQA = driver.getTitle();
        Assert.assertEquals(titleDemoQA, "DEMOQA");

        driver.close();
        driver.switchTo().window(originalWindow);
    }
}
