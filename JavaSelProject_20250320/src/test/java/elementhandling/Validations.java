package elementhandling;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		String url = "https://the-internet.herokuapp.com/checkboxes";
//		
//		driver.get(url);	
//		System.out.println(driver.getTitle());
//		
//		WebElement chk1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
//	
//		Thread.sleep(3000);
//
//		System.out.println(chk1.isSelected()); 
//		System.out.println(chk1.isEnabled());
//		System.out.println(chk1.isDisplayed());
//		
//		assertEquals(chk1.isSelected(), false);
//		assertEquals(chk1.isEnabled(), true);
//		assertEquals(chk1.isDisplayed(), true);
		
		String eR = "hello";
		String aR = "Why?";
//		String aR = "hello";
		
		assertEquals(aR, eR);
//		assertEquals(eR, aR);
		
		
		Thread.sleep(3000);
//		driver.quit();
		
	}
}
