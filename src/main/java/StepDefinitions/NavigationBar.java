package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NavigationBar {
Pages.NavigationBar navigationBar=new Pages.NavigationBar();

    @When("Search {string}")
    public void search(String arg0) {

        navigationBar.search(arg0);
    }


    @When("Click {string} named card on navigationBar")
    public void clickNamedCardOnNavigationBar(String arg0) {
        navigationBar.clickCard(arg0);
    }
}
