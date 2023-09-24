package DemoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage {

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    private List<WebElement> webTableRowContent;

    public WebTablesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Integer getNumberOfTableRows() {

        return webTableRowContent.size();
    }
}
