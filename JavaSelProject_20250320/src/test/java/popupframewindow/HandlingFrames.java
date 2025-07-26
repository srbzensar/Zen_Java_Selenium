package popupframewindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/nested_frames";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		System.out.println("Main Page");
		
		driver.switchTo().frame("frame-top");
		System.out.println("Frame Top");
		
		driver.switchTo().frame("frame-left");
		System.out.println("Frame Left");
		
		System.out.println(driver.getPageSource().contains("LEFT"));
//		System.out.println(driver.getPageSource().contains("RIGHT"));
		
		driver.switchTo().parentFrame();
		System.out.println("Frame Top");
		
		driver.switchTo().frame(1);
		
		
		driver.switchTo().defaultContent();
		System.out.println("Main Page");
		
		WebElement ele = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(ele);
		System.out.println("Frame Top");
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
