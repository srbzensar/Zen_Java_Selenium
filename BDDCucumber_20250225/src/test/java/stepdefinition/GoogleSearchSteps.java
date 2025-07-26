package stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver;
	String url = "https://www.google.com";
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step - user is on google search page");
		driver.get(url);
		System.out.println(driver.getTitle());
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		System.out.println("Inside step - user is on google search page");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("SeleniumDev");
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside step - user hits enter");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("Inside step - user is navigated to search results");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
