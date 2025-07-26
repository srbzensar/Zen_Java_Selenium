package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.manage().window().minimize();
		Thread.sleep(2000);
				
		driver.manage().window().maximize();
		Thread.sleep(2000);

//		challenge: restore  (getSize() and setSize())
		
		driver.get("https://www.wikipedia.org");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);
		
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
		Thread.sleep(2000);

		System.out.println("Page source size: " + driver.getPageSource().length());
		
		System.out.println("Window handle (window id): " + driver.getWindowHandle());
		System.out.println(driver.getWindowHandles().size());
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
