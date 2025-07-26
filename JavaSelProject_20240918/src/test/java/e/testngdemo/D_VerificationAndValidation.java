package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class D_VerificationAndValidation {
	WebDriver driver;
	String url = "https://www.google.com";
	
  @Test
  public void test1() 
  {
	  driver.get(url);
	  
////	  Verification
	  if(driver.getTitle().equals("Google1"))
		  System.out.println("Test Passed");
	  else
		  System.out.println("Test Failed");
		  
	  
////	  Validation
//	  assertEquals(driver.getTitle(), "Google1");
	  
	  System.out.println("All tests completed");
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
