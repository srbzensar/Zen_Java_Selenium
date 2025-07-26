package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxGoogleEx {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new FirefoxDriver();   
		String url = "https://www.google.com";
		
		driver.get(url);	
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();	
	}

}
