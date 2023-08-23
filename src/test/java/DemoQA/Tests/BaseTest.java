package DemoQA.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver = new ChromeDriver();

    @BeforeMethod
    protected void beforeMethod() {
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.addArguments("--remote-debugging-port=9225", "--headless", "--disable-gpu");
//        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
        driver.quit();
    }
}
