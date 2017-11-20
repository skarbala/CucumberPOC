package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

  @Given("^I am registered$")
  public void iAmRegistered() throws Throwable {
    Thread.sleep(4000);
    System.out.println("User is prepared and registered");
    Thread.sleep(3000);
  }

  @When("^I log in$")
  public void iLogIn() throws Throwable {
    System.out.println("Logging in");
    Thread.sleep(3000);
  }

  @When("^I log in with wrong password$")
  public void iLogInWithWrongPassword() throws Throwable {
    System.out.println("Logging in with wrong password");
  }

  @Then("^error message appears$")
  public void errorMessageAppears() throws Throwable {
    System.out.println("error message appears");
  }
}
