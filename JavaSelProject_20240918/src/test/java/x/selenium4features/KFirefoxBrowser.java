package x.selenium4features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		String url = "https://www.google.com"; 
		
		driver.get(url); 
		
		Thread.sleep(5000);
		driver.quit(); 
		
	}

}
