package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_ChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		
		driver.get(url);
//		driver.navigate().to(url);
	
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
		
//		driver.close();
	}
}
