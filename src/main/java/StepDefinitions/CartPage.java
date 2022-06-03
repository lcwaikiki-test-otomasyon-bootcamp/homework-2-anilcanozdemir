package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPage {

Pages.CartPage cartPage=new Pages.CartPage();
    @Then("should see CartPage")
    public void shouldSeeCartPage() {
        cartPage.shouldSeeCartPage();
    }

    @Then("should see the product which is {int} sized and {string} coloured.")
    public void shouldSeeTheProductWhichIsSizeSizedAndColoured(int arg1,String arg2) throws Exception {
        cartPage.checkSize(arg1);
        cartPage.checkColour(arg2);


    }

    @When("should proceed to the checkout")
    public void shouldProceedToTheCheckout() {
        cartPage.proceedToTheCheckout();
    }


}
