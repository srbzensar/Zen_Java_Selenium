package elementhandling;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;


public class ValidationsEx {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "https://the-internet.herokuapp.com/checkboxes";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		
		WebElement chk1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
//		verification
		System.out.println(chk1.isSelected());
		System.out.println(chk1.isEnabled());
		System.out.println(chk1.isDisplayed());
		
//		Validation
//		Assert.assertEquals(chk1.isSelected(), false);
//		Assert.assertEquals(chk1.isEnabled(), true);
//		Assert.assertEquals(chk1.isDisplayed(), true);
		
//		Challenge: use assertEquals() method directly without using Assert class
		assertEquals(chk1.isSelected(), false);
		assertEquals(chk1.isEnabled(), true);
		assertEquals(chk1.isDisplayed(), true);
		
////		String eR = "hello";
//		String eR = "Namaste";
//		String aR = "hello";
//		
////		assertEquals(eR, aR);
//		assertEquals(aR, eR);
		
		
		Thread.sleep(3000);
		driver.quit();	
	}

}
