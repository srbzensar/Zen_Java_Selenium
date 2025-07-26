package h.synchornization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_ImplicitWaitEx {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
//		String url = "https://the-internet.herokuapp.com/dynamic_loading/1"; // element present
		String url = "https://the-internet.herokuapp.com/dynamic_loading/2"; // element rendered later
		driver.get(url);
		Thread.sleep(2000);
		
//		//// Without Synchronization
//		driver.findElement(By.tagName("button")).click();
//		System.out.println("Hello World diplayed? " + driver.findElement(By.id("finish")).isDisplayed());
		
//		2. Implicit wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
			driver.findElement(By.tagName("button")).click();
			System.out.println("Hello World diplayed? " + driver.findElement(By.id("finish")).isDisplayed());
			
		
		Thread.sleep(4000); 
		driver.quit(); 
	}

}
