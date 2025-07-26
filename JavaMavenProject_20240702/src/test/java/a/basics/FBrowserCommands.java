package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		restore (getsize() and setSize())
		
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.navigate().back(); 
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());

		System.out.println("page source size: " + driver.getPageSource().length());
		
		System.out.println("window handle (window id): " + driver.getWindowHandle());
		
		System.out.println("Window handle (window id): " + driver.getWindowHandles().size());
		
		Thread.sleep(5000);
		
		
		driver.quit(); 
		
		
	}

}
