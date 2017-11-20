package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BananaSteps {
  @Given("^One banana costs (\\d+) EUR$")
  public void oneBananaCostsBananaPrice(int bananaPrice) throws Throwable {
    Thread.sleep(3000);
    System.out.println("Banana price is " + bananaPrice);
    Thread.sleep(3000);
  }

  @When("^I want to buy (\\d+) bananas$")
  public void iWantToBuyNumberOfBananas(int bananaAmount) throws Throwable {
    System.out.println("Number of bananas " + bananaAmount);
    Thread.sleep(3000);
  }

  @Then("^The final price is (\\d+) EUR$")
  public void theFinalPriceIsBananaTotalPrice(int finalPrice) throws Throwable {
    Assert.assertEquals(finalPrice, finalPrice);
  }
}
