package DemoQA.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    protected void beforeMethod(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments( "--headless", "--disable-gpu");
        //options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

        Dimension dimension = new Dimension(1600, 900);
        driver.manage().window().setSize(dimension);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/");

        BasePage.setDriver(driver);
}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
