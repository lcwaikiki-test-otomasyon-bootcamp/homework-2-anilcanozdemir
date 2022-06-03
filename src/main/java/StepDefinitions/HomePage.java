package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage {
    Pages.HomePage homePage=new Pages.HomePage();
    @Given("Customer is on HomePage")
    public void customerIsOnHomePage() {
        homePage.IsOnHomePage();
        homePage.shouldSeeHomePage();
    }


}
