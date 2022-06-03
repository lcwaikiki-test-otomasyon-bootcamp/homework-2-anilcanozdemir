package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverFactory;

import java.util.List;

public class SearchPage {
WebDriver driver;
By productListHeader=By.className("product-list-heading__product-count");
By productList=By.className("product-card__title");
    public SearchPage()
    {
        driver= DriverFactory.getDriver();
    }
    public void shouldSeeSearchPage() {
        driver.findElement(productListHeader);
    }

    public void clickNamedProduct(String arg0) {
        List<WebElement> webElementList = driver.findElements(productList);

        for (WebElement webElement : webElementList
        ) {

            if (arg0.equals(webElement.getText())) {
                webElement.click();
                break;
            }

        }
    }
}
