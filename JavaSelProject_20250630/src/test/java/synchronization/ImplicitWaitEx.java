package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
//		String url = "https://the-internet.herokuapp.com/dynamic_loading/1"; // element present
		String url = "https://the-internet.herokuapp.com/dynamic_loading/2"; // element rendered later
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get(url);
		Thread.sleep(2000);
		
//		//// Without Synchronization
//		driver.findElement(By.tagName("button")).click();
//		System.out.println("Hello World diplayed? " + driver.findElement(By.id("finish")).isDisplayed());
		
////		2. Explicit wait 
			
			driver.findElement(By.tagName("button")).click();
			
//			WebElement ele = driver.findElement(By.id("finish"));
//			WebElement msg = wait.until(ExpectedConditions.visibilityOf(ele));
			
			WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
			
			System.out.println("Hello World diplayed? " + msg.isDisplayed());
			
		
		Thread.sleep(4000); 
		driver.quit(); 
	}
}
