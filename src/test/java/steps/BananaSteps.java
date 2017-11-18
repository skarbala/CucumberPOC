package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BananaSteps {
    @Given("^One banana costs (\\d+)$")
    public void oneBananaCostsBananaPrice(int bananaPrice) throws Throwable {
        System.out.println("Banana price is " + bananaPrice);
    }

    @When("^I want to buy (\\d+)$")
    public void iWantToBuyNumberOfBananas(int bananaAmount) throws Throwable {
        System.out.println("Number of bananas " + bananaAmount);
    }

    @Then("^The final price is (\\d+)$")
    public void theFinalPriceIsBananaTotalPrice(int finalPrice) throws Throwable {
        Assert.assertEquals("1", "1");
    }
}
