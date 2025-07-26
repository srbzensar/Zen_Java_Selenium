package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
				
		driver.get(url);
		
		Thread.sleep(5000);
		
		
		driver.quit(); 
		
		
	}

}
