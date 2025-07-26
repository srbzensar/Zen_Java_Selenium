package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // launches browser
		String url = "https://www.google.com"; 
		
		driver.get(url); // open particular url
		
		Thread.sleep(5000);
		driver.quit(); // close the browser
		
	}

}
