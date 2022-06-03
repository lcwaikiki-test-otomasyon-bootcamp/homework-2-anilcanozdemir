package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class CartPage {
    WebDriver driver;
    By itemSize=By.className("rd-cart-item-size");
    By checkoutButton=By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-4.desktop-price-info > div.col-md-12.pl-20.pr-20 > a");
    By itemColour=By.className("rd-cart-item-color");
    By cartPageContainer = By.id("container");
    public CartPage()
    {
        driver= DriverFactory.getDriver();
    }
    public void shouldSeeCartPage() {
        driver.findElement(cartPageContainer);
    }

    public void checkSize( int arg0) throws Exception {

        if (! ("Beden: "+Integer.toString(arg0)).equals(driver.findElement(itemSize).getText()))
        {
            throw  new Exception("checkSize");
        }

    }

    public void checkColour(String arg0) throws Exception {

        if (! ("Renk: "+arg0).equals(driver.findElement(itemColour).getText()))
        {
            throw  new Exception("checkColour");
        }

    }

    public void proceedToTheCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
