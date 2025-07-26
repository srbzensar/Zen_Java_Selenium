package b.elementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;

public class B_Validations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "http://cookbook.seleniumacademy.com/Config.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
		WebElement checkBox = driver.findElement(By.name("airbags"));
		Thread.sleep(2000);		
		

		System.out.println("Selected? " + checkBox.isSelected());
		System.out.println("Enabled? " + checkBox.isEnabled());
		System.out.println("Displayed? " + checkBox.isDisplayed());
		
//		Assert.assertEquals(checkBox.isSelected(), false);
//		Assert.assertEquals(checkBox.isEnabled(), true);
//		Assert.assertEquals(checkBox.isDisplayed(), true);
		
		assertEquals(checkBox.isSelected(), false);
		assertEquals(checkBox.isEnabled(), true);
		assertEquals(checkBox.isDisplayed(), true);
		
		
//		String eR = "hello";
//		String aR = "Why?";
//		String aR = "hello";
//		assertEquals(aR, eR); // correct sequence
////		assertEquals(eR, aR); // incorrect
		
		
		
		
		
		Thread.sleep(2000);
		
		
		driver.quit(); 
		
		
	}

}
