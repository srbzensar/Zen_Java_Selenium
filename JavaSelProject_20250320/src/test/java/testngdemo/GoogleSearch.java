package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleSearch {
	WebDriver driver;
	String url = "https://www.google.com";
	
  @Test
  public void test1() {
	  System.out.println("Test1 Method");
	  driver.get(url);
	  assertEquals(driver.getTitle(), "Google");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("After Method");
	  Thread.sleep(3000);
	  driver.quit();
  }

}
