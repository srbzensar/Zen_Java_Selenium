package h.synchornization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C_ExplicitWaitEx {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
//		String url = "https://the-internet.herokuapp.com/dynamic_loading/1"; // element present
		String url = "https://the-internet.herokuapp.com/dynamic_loading/2"; // element rendered later //NoSuchElementException
		
		driver.get(url);
		Thread.sleep(2000);
		
//		//// Without Synchronization
//		driver.findElement(By.tagName("button")).click();
//		System.out.println("Hello World diplayed? " + driver.findElement(By.id("finish")).isDisplayed());
		
//		3. Explicit wait 
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				
			driver.findElement(By.tagName("button")).click();

//			WebElement msg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("finish"))));
			// we know that the element exists already, we are just waiting for some condition
			
			WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
//			// we are waiting for the element as well as the condition.			
			
			System.out.println("Hello World diplayed? " + msg.isDisplayed());
			
		Thread.sleep(3000); 
		driver.quit(); 
	}

}
