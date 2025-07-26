package popupframewindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/LnD/Sessions/Ref/Selenium/SamplePage.html";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		
		WebElement btn = driver.findElement(By.id("salert"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.doubleClick(btn).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
