package d.popupsframewindow;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "file:///D:/LnD/Sessions/202407_Pool_SDET/20240709_Selenium_TestingTrackSDET/locating%20techniques/SamplePage.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
 
		WebElement btnS = driver.findElement(By.id("salert"));
		WebElement btnC = driver.findElement(By.id("calert"));
		WebElement btnP = driver.findElement(By.id("palert"));
		
		Thread.sleep(2000);		
		Actions action = new Actions(driver);
		
//		ok button: alert.accept()			cancel button: alert.dismiss()
// Simple alert
		action.doubleClick(btnS).perform();
		Thread.sleep(3000);
 
		Alert sAlert = driver.switchTo().alert(); // to switch to the alert
		sAlert.accept();
		
// Confirm alert
		action.doubleClick(btnC).perform();
		Thread.sleep(3000);
 
		Alert cAlert = driver.switchTo().alert(); // to switch to the alert
		cAlert.dismiss();
		
// Prompt alert
		action.doubleClick(btnP).perform();
		Thread.sleep(3000);
 
		Alert pAlert = driver.switchTo().alert(); // to switch to the alert
		Thread.sleep(2000);
		pAlert.sendKeys("Sachin Tendulkar");
		Thread.sleep(2000);
		pAlert.accept();
				
		Thread.sleep(2000);
		
		driver.quit(); 
		
	}

}
