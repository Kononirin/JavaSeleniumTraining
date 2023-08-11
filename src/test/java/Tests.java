import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests extends BaseTest{

    @Test
    public void testGetHeaderUrl() {

        driver.findElement(By.xpath("//div[1][@class='card mt-4 top-card']")).click();

        WebElement mainHeader = driver.findElement(By.xpath("//div[@class='main-header']"));

        Assert.assertEquals(mainHeader.getText(), "Elements");
    }
}
