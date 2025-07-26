package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Chrome_OldWay {

	public static void main(String[] args) 
	{
//		This is old way, just for reference. No need to this way in the project now.
		System.setProperty("webdriver.chrome.driver", "D:\\movableinstallation\\selenium\\chrome\\chrome-win64\\chrome.exe");
		
//		Interface				Class
		WebDriver driver = new ChromeDriver();  // New instance of Chrome Browser 
		
		driver.get("https://www.google.com");	// visit a url
		
		System.out.println(driver.getTitle());
		
		driver.quit();	// close the browser
	}

}
