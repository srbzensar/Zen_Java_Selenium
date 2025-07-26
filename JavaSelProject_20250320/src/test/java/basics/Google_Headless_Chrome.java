package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_Headless_Chrome {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");
		
        // Define headless argument
        options.addArguments("headless");
		
        WebDriver driver = new ChromeDriver(options);
		String url = "https://www.google.com";
		
		driver.get(url);
	
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
