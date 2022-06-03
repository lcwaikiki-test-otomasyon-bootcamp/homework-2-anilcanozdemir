package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverFactory;

import java.util.List;

public class ProductPage {
    By productTitle = By.className("product-title");
    WebDriver driver;
    By colorLabel = By.className("color-label");

    public ProductPage() {
        driver = DriverFactory.getDriver();
    }

    public void shouldSeeProductPage() {
        driver.findElement(productTitle);
    }

    public void chooseSize(int arg0) {
        try {
            driver.findElement(By.className("tooltipHeader")).click();
        } catch (Exception e) {

        }
        WebElement optionSize = driver.findElement(By.id("option-size"));
        List<WebElement> webElementList = optionSize.findElements(By.xpath(".//*"));
        for (WebElement webElement : webElementList
        ) {
      

            if (Integer.toString(arg0).equals(webElement.getText())) {
                webElement.click();
                break;
            }

        }
    }

    public void chooseColour(String arg1) {
        try {
            driver.findElement(By.className("tooltipHeader")).click();
        } catch (Exception e) {

        }
        List<WebElement> webElementList = driver.findElements(colorLabel);
        for (WebElement webElement : webElementList
        ) {

            if (arg1.equals(webElement.getText())) {
                webElement.click();
                break;
            }

        }
    }

    public void addToCart() {
        driver.findElement(By.id("pd_add_to_cart")).click();
    }
}
