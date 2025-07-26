package g.jsexecutor;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class A_JSExecutor_Scroll {
	WebDriver driver;
	String url = "https://courses.letskodeit.com/practice";
	private JavascriptExecutor js;
	
	
  @Test
  public void test1() throws InterruptedException 
  {
	driver.get(url);
	Thread.sleep(2000);
	
//	display an alert
//	js.executeScript("window.alert('This is my alert')");
	
//	scroll down
	
	js.executeScript("window.scrollBy(0, 1200);");
	Thread.sleep(3000);

	js.executeScript("window.scrollBy(0, -1200);");
	Thread.sleep(3000);

	WebElement ele = driver.findElement(By.id("cookie_box"));
	js.executeScript("arguments[0].scrollIntoView(true)", ele);
	Thread.sleep(5000);
	 
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new ChromeDriver();
	  js = (JavascriptExecutor)driver;
//	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
