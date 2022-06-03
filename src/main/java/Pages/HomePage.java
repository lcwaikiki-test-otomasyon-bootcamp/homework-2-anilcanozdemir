package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class HomePage {
    By homePageContainer = By.id("container");
    WebDriver driver;
    public HomePage()
    {
        driver=DriverFactory.getDriver();
    }
    public void IsOnHomePage() {
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public void shouldSeeHomePage() {
        driver.findElement(homePageContainer);
    }
}
