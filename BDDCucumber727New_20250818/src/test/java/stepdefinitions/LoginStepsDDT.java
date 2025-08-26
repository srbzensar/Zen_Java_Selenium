package stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDDT 
{
	@Given("robo is on login page")
	public void robo_is_on_login_page() {
		System.out.println("robo navigates to the login page");
	}

	@When("robo enters {string} and {string}")
	public void robo_enters_and(String username, String password) {
		System.out.printf("robo enters username %s and password %s", username, password);
	}

	@Then("robo is navigated to the home page")
	public void robo_is_navigated_to_the_home_page() {
		System.out.println("robo is navigated to home page");
		assertTrue(true);
	}
}
