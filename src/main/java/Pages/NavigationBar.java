package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverFactory;

import java.util.List;

public class NavigationBar {
    By search = By.id("search-form__input-field__search-input");
    By CardList = By.className("cart-dropdown");
    By searchButton = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__center > form > div > div.search-form__input-field.search-form__input-field--second-wrap > button");
    WebDriver driver;

    public NavigationBar() {
        driver = DriverFactory.getDriver();
    }

    public void search(String arg0) {
        driver.findElement(search).sendKeys(arg0);
        driver.findElement(searchButton).click();
    }

    public void clickCard(String arg0) {
        List<WebElement> webElementList = driver.findElements(CardList);

        for (WebElement webElement : webElementList
        ) {

            if (arg0.equals(webElement.getText())) {
                webElement.click();
                break;
            }

        }


    }
}
