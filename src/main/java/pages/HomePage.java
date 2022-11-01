package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    private List<WebElement> links;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
