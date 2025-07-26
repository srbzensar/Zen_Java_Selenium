package c.complexactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/LnD/Sessions/202407_Pool_SDET/20240709_Selenium_TestingTrackSDET/locating%20techniques/SamplePage.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());

		WebElement btn = driver.findElement(By.tagName("button"));
		
		Thread.sleep(2000);		
		Actions action = new Actions(driver);
		action.doubleClick(btn).perform();
		
//		action.doubleClick(btn); // action defined		
//		action.perform(); // action performed
		
		
		Thread.sleep(5000);
		
		
		driver.quit(); 
		
		
	}

}
