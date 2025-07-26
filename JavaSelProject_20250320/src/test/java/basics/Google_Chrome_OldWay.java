package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Chrome_OldWay {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/movableinstallation/selenium/chrome/chrome-win64/chrome.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		
		driver.get(url);
//		driver.navigate().to(url);
	
		Thread.sleep(3000);
		driver.quit();
		
//		driver.close();
	}
}
