import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest{

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
}
