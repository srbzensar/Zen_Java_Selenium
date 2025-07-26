package b.elementhandling;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class B_Validations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://the-internet.herokuapp.com/checkboxes";
		
		driver.get(url);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		WebElement chk1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(chk1.isSelected());
		System.out.println(chk1.isEnabled());
		System.out.println(chk1.isDisplayed());
		
//		Assert.assertEquals(chk1.isSelected(), false);
//		Assert.assertEquals(chk1.isEnabled(), true);
//		Assert.assertEquals(chk1.isDisplayed(), true);

		assertEquals(chk1.isSelected(), false);
		assertEquals(chk1.isEnabled(), true);
		assertEquals(chk1.isDisplayed(), true);
		
		String eR = "hello";
		String aR = "Why?";
//		String aR = "hello";

		//		assertEquals(eR, aR);
		assertEquals(aR, eR);
		
		
//		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

}
