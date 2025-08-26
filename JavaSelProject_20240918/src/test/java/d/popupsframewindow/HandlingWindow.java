package d.popupsframewindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://www.google.com";
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.wikipedia.org");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.bing.com/");
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
