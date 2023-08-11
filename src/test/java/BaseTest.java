import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    protected void beforeMethod() {
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

}
