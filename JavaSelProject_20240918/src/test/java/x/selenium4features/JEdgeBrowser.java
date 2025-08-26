package x.selenium4features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		String url = "https://www.google.com"; 
		
		driver.get(url); 
		
		Thread.sleep(5000);
		driver.quit(); 
		
	}

}
