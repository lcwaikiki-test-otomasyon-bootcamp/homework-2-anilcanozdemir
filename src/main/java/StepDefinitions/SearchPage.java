package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage {
Pages.SearchPage searchPage=new Pages.SearchPage();
    @Then("should see SearchPage")
    public void shouldSeeSearchPage() {
        searchPage.shouldSeeSearchPage();
    }


    @When("Click {string} named product")
    public void clickNamedProduct(String arg0) {
        searchPage.clickNamedProduct( arg0);
    }
}
