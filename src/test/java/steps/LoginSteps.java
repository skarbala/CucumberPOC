package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am registered$")
    public void iAmRegistered() throws Throwable {
        System.out.println("User is prepared an registered");
    }

    @When("^I log in$")
    public void iLogIn() throws Throwable {
        System.out.println("Logging in");
    }

    @Then("^I am successfully logged in$")
    public void iAmSuccessfullyLoggedIn() throws Throwable {
        System.out.println("Logged in!");
    }
}
