package d.complexactions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class C_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		String url = "file:///D:/LnD/Sessions/202407_Pool_SDET/20240709_Selenium_TestingTrackSDET/locating%20techniques/SamplePage.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement btn = driver.findElement(By.tagName("button"));
		
		Thread.sleep(2000);		
		Actions action = new Actions(driver);
//		action.moveToElement(btn).doubleClick();
		action.doubleClick(btn);
		
		action.perform();

		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText(), "You double clicked me..");
		
		alert.accept();

		Thread.sleep(2000);
		driver.quit(); 
	}

}
