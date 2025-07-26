package k.screenshotdemo;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class A_ScreenshotDemoGoogle {
	WebDriver driver;
	String url = "https://www.google.com";
	TakesScreenshot ts;
	
  @Test
  public void test1() throws InterruptedException, IOException 
  {
	  driver.get(url);
	  assertEquals(driver.getTitle(), "Google");
	  
	  Thread.sleep(2000);
	  
	  File srcFile = ts.getScreenshotAs(OutputType.FILE);
	  Files.copy(srcFile, new File("screenshots/google_home_page.png"));
	  
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new ChromeDriver();
	  ts = (TakesScreenshot)driver;
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
