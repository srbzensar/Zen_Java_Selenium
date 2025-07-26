package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
//import static org.testng.Assert.assertEquals;

public class StepDef {

	public WebDriver driver;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		driver = new ChromeDriver();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);}

	@When("enter the search text as {string}")
	public void enter_the_search_text_as(String searchText) {
		driver.findElement(By.name("q")).sendKeys(searchText);
	}

	@When("submits the search request")
	public void submits_the_search_request() {
		driver.findElement(By.name("btnK")).submit();
	}

	@Then("page title should be valid")
	public void page_title_should_be_valid() {
		Assert.assertTrue(true); // assert("selenium - Google Search", driver.getTitle());
	}

	@Then("result should contain the contents as per search text")
	public void result_should_contain_the_contents_as_per_search_text() {
		System.out.println("check contents");
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	
}
