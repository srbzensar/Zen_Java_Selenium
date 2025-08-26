package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;


public class ChromeBrowserHeadless {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);   
		String url = "https://www.google.com";
		
		driver.get(url);	
		
		System.out.println(driver.getTitle());
		
		
//		Thread.sleep(3000);
		
		driver.quit();	
	}

}
