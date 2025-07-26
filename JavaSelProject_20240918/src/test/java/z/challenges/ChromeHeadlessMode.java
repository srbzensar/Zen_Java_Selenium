package z.challenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessMode {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
//		options.addArguments("disable-gpu");
		
		WebDriver driver = new ChromeDriver(options); 
		String url = "https://www.google.com";
		
		driver.get(url);
//		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
		driver.quit();
		
	}

}
