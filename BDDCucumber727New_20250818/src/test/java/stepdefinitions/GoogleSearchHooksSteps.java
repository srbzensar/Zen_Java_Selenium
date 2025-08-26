package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchHooksSteps 
{
	public WebDriver driver = Hooks.driver;
	
	
	@Given("I am on Google Homepage")
	public void I_am_on_Google_Homepage() 
	{
			driver.get("https://www.google.com");
	}

	@When("I search for {string}")
	public void I_search_for(String searchText) throws InterruptedException 
	{
		driver.findElement(By.name("q")).sendKeys(searchText);
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(3000);
	}

	@Then("title should be valid")
	public void title_should_be_valid() 
	{
		assertTrue(driver.getTitle().contains("Selenium"));
	}
}
