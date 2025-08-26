package elementhandling;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownEx {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "https://the-internet.herokuapp.com/dropdown";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		
		WebElement dd = driver.findElement(By.id("dropdown"));
		Select dd1 = new Select(dd);
		
//		3 ways to select values from dropdown
		Thread.sleep(2000);		
		dd1.selectByValue("1");
		
		Thread.sleep(2000);		
		dd1.selectByIndex(2); // index starts from 0
		
		Thread.sleep(2000);		
		dd1.selectByVisibleText("Option 1");
		
		System.out.println(dd1.getOptions().size());
		
//		challenge: create arraylists of expected values and actual values
		List<String> expValues = new ArrayList<>();
		expValues.add("Please select an option");
		expValues.add("Option 1");
		expValues.add("Option 2");

		List<String> actValues = new ArrayList<>();
		for(WebElement opt: dd1.getOptions())
			actValues.add(opt.getText());
		
		assertEquals(actValues, expValues);
		
		Thread.sleep(3000);		
		driver.quit();	
	}

}
