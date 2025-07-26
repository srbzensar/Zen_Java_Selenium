package d.popupsframewindow;

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
		
//		switch to the top frame (using name)
		driver.switchTo().frame("frame-top");
		System.out.println("Top Frame");
		
		
	//		switch to the LEFT frame (using id or name)
		driver.switchTo().frame("frame-left");
//		System.out.println(driver.getPageSource());
		System.out.println("Left Frame");

		driver.switchTo().parentFrame();
		System.out.println("Top/Parent Frame");
		
		driver.switchTo().defaultContent();
		System.out.println("Main Page");
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
