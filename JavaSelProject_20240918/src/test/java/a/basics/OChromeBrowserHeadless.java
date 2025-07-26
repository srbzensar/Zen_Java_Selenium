package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OChromeBrowserHeadless {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
        
        // Define headless argument
        options.addArguments("headless");
	
        WebDriver driver = new ChromeDriver(options); // launches browser
		String url = "https://www.google.com"; 
		
		driver.get(url); // open particular url
		
		Thread.sleep(5000);
		driver.quit(); // close the browser
		
	}

}
