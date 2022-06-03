package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPage {
    Pages.ProductPage productPage=new Pages.ProductPage();

    @Then("should see productPage")
    public void shouldSeeProductPage() {
        productPage.shouldSeeProductPage();
    }


    @When("Choosing {int} size and {string} colour and add to cart.")
    public void choosingSizeAndRENKAndAddToCart(int arg0, String arg1) {
        productPage.chooseColour(arg1);
        productPage.chooseSize(arg0);
        productPage.addToCart();


    }
}
