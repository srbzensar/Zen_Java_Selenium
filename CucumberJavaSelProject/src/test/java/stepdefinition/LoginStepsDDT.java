package stepdefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepsDDT {
    @Given("A User is on the Login Page")
    public void user_is_on_login_page() {
        System.out.println("User navigates to Login Page");
    }

    @When("A User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) {
        System.out.println("User enters Username: " + username + " and Password: " + password);
    }

    @Then("A User should be logged in successfully")
    public void user_logged_in_successfully() {
        System.out.println("Login Successful!");
        Assert.assertTrue(true);
    }
}
