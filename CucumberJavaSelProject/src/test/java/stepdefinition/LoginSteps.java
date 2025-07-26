package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginSteps 
{

	@Given("robo is on login page")
	public void visit_login_page() {
	    System.out.println("Inside step - robo is on login page");
	}

	@When("robo enters username and password")
	public void enter_username_and_password() {
		System.out.println("Inside step - robo enters username and password");
	}

	@When("robo clicks on login button")
	public void click_login_button() {
		System.out.println("Inside step - robo clicks on login button");
	}

	@Then("robo is navigated to home page")
	public void check_robo_is_navigated_to_home_page() {
		System.out.println("Inside step - robo is navigated to home page");
	}
	
	
}
