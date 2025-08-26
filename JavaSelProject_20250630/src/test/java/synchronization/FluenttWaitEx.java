package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluenttWaitEx {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/dynamic_loading/1"; // element present
//		String url = "https://the-internet.herokuapp.com/dynamic_loading/2"; // element rendered later 
		
		driver.get(url);
		Thread.sleep(2000);
		
		// Fluent Wait setup
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(10))       // Max wait time
		            .pollingEvery(Duration.ofSeconds(1))       // Check every 1 second
		            .ignoring(Exception.class);                // Ignore errors

//		click start button
		driver.findElement(By.tagName("button")).click();

////		wait for the element 
//		boolean found = wait.until(d -> {
//		    List<WebElement> el = d.findElements(By.id("finish"));
//		    return el.size()>0 ? true : false; 
//		    // Returns the element only if it's visible; otherwise, returns null (making Fluent Wait retry). 
//		});
		
		
        // Wait until the "Hello World!" message is visible
		WebElement msg = wait.until(d -> {
		    WebElement el = d.findElement(By.id("finish"));
		    return el.isDisplayed() ? el : null; 
		    // Returns the element only if it's visible; otherwise, returns null (making Fluent Wait retry). 
		});

			
		System.out.println("Hello World diplayed? " + msg.isDisplayed());
			
		Thread.sleep(3000); 
		driver.quit(); 
	}

}
