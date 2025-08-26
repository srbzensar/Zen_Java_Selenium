package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps 
{
	public WebDriver driver;
	
	@Given("user launch Chrome Browser")
	public void user_launch_chrome_browser() 
	{
		driver = new ChromeDriver();
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) 
	{
			driver.get(url);
	}

	@When("enters the search text as {string}")
	public void enters_the_search_text_as(String searchText) throws InterruptedException 
	{
		driver.findElement(By.name("q")).sendKeys(searchText);
		Thread.sleep(3000);
	}

	@When("submits the search request")
	public void submits_the_search_request() throws InterruptedException 
	{
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(3000);
	}
	

	@Then("page title should be valid")
	public void page_title_should_be_valid() 
	{
		assertTrue(driver.getTitle().contains("Selenium"));
	}

	@Then("close the browser")
	public void close_the_browser() 
	{
		driver.quit();
	}
}
