package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_FF {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.google.com";
		
		driver.get(url);
//		driver.navigate().to(url);
	
		Thread.sleep(3000);
		driver.quit();
		
//		driver.close();
	}
}
