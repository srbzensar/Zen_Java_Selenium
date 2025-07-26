package h.synchornization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_SynchronizationEx {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/dynamic_loading/1";
		driver.get(url);
		Thread.sleep(2000);
		
////		// Without Synchronization
//		driver.findElement(By.tagName("button")).click();
//		System.out.println("Hello World diplayed? " + driver.findElement(By.id("finish")).isDisplayed());
		
//		1. using Thread.sleep which is Java feature (not recommended)
			driver.findElement(By.tagName("button")).click();
			Thread.sleep(5000);
			System.out.println("Hello World diplayed? " + driver.findElement(By.id("finish")).isDisplayed());
			
		
		Thread.sleep(4000); 
		driver.quit(); 
	}

}
