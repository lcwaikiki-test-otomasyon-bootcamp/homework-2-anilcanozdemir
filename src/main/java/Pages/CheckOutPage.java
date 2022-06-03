package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class CheckOutPage {
    WebDriver driver;
    public CheckOutPage()
    {
        driver= DriverFactory.getDriver();
    }
    public void shouldSeeCheckOutPage() {
        driver.findElement(By.id("login"));
    }
}
