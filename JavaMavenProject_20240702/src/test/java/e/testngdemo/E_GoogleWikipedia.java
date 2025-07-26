package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class E_GoogleWikipedia {
	WebDriver driver;
	String url;
	
  @Test
  public void test1() 
  {
	  url = "https://www.google.com";
	  driver.get(url);
	  assertEquals(driver.getTitle(), "Google");
  }
  
  @Test
  public void test2() 
  {
	  url = "https://www.wikipedia.org/";
	  driver.get(url);
	  assertEquals(driver.getTitle(), "Wikipedia");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new ChromeDriver();
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
