package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_Edge {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		String url = "https://www.google.com";
		
		driver.get(url);
//		driver.navigate().to(url);
	
		Thread.sleep(3000);
		driver.quit();
		
//		driver.close();
	}
}
