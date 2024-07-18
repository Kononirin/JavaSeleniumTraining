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

    @FindBy(xpath = "//div[@class='rt-resizable-header-content']")
    private List<WebElement> listWebTableHeaders;

    private WebElement[] arrayOfTableHeaders;

    public WebTablesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Integer getNumberOfTableRows() {

        return webTableRowContent.size();
    }

    public Integer getNumberOfTableHeaders() {

        return listWebTableHeaders.size();
    }

    public String[] arrayOfTableHeaders() {

//        String[] arrayOfTableHeaders = listWebTableHeaders
//                .toArray(new String[listWebTableHeaders.size()]);
//
//        return arrayOfTableHeaders;


//        String[] textArray = webTableRowContent.stream()
//                .map(WebElement::getText)
//                .toArray(String[]::new);

        String[] arrayOfTableHeaders = listWebTableHeaders.stream()
                .map(WebElement::getText)
                .toArray(String[]::new);

        return arrayOfTableHeaders;
    }


}
