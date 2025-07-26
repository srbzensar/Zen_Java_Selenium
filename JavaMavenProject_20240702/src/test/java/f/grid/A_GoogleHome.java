package f.grid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class A_GoogleHome {
	WebDriver driver;
	String url = "https://www.google.com";
	
  @Test
  public void test1() 
  {
	  driver.get(url);
	  assertEquals(driver.getTitle(), "Google");
	  System.out.println(driver.getTitle());
  }
  
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException 
  {
////	  execute the test on Chrome browser
//	  ChromeOptions chromeOptions = new ChromeOptions();
//	  driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	  
	  FirefoxOptions ff = new FirefoxOptions();
	  driver = new RemoteWebDriver(new URL("http://localhost:4444"), ff);
	  
	  
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
