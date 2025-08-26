package gridex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class GoogleHome 
{
	WebDriver driver;
	String url = "https://www.google.com";

	@Test
	public void test1() 
	{
		driver.get(url);
		assertEquals(driver.getTitle(), "Google");
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException 
	{
		
//		WebDriver driver = new ChromeDriver();
		
		ChromeOptions chromeOptions = new ChromeOptions();
//		earlier than Java 20
//		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		
//		Java 20, java.net.URL has been deprecated. 
//		Recommended to use java.net.URI class and convert it to a URL using .toURL()
		driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(), chromeOptions);
		
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
