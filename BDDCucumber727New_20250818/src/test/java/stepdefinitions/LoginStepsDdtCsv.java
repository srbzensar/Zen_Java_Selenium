package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.ReaderUtils;

import com.opencsv.CSVReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoginStepsDdtCsv {

    @Given("user logs in with credentials from CSV file")
    public void user_logs_in_with_credentials_from_csv_file() throws Exception 
    {
//    	Path path = Paths.get("src/test/resources/testdata/users.csv");
//        CSVReader reader = new CSVReader(new FileReader(path.toFile()));
//        List<String[]> records = reader.readAll();
    	
    	List<String[]> records = ReaderUtils.readCsv("src/test/resources/testdata/users.csv");
    	
//        records.remove(0); // remove header, if applicable

        for (String[] record : records) 
        {
            String username = record[0];
            String password = record[1];
            
            System.out.printf("Logging in with: %s / %s%n", username, password);
            boolean loginSuccess = simulateLogin(username, password);
            if(loginSuccess)
            	System.out.println("Login successful for user: " + username);
            else
            	System.out.println("Login failed for user: " + username);
        }
    }

    @Then("login should be successful for all users")
    public void login_should_be_successful_for_all_users() {
        System.out.println("All logins processed.");
        // Add assertions or validations here
    }

    private boolean simulateLogin(String username, String password) {
        return username.startsWith("user"); // Dummy logic
    }

}
