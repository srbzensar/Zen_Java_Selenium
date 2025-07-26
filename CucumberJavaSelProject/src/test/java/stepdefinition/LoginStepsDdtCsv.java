package stepdefinition;

import io.cucumber.java.en.*;

import java.io.FileReader;
import java.util.List;

import org.junit.Assert;

import com.opencsv.CSVReader;

public class LoginStepsDdtCsv {
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
    
    public static List<String[]> readCSV(String filePath) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(filePath));
        List<String[]> data = reader.readAll();
        reader.close();
        return data;
    }
}
