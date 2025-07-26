package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSetup {

	public static void main(String[] args) throws InterruptedException 
	{
//		Interface				Class
		WebDriver driver = new ChromeDriver();  // New instance of Chrome Browser 
		
		driver.get("https://www.google.com");	// visit a url
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();	// close the browser
	}

}
