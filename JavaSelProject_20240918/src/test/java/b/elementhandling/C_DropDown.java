package b.elementhandling;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://the-internet.herokuapp.com/dropdown";
		
		driver.get(url);
		
		System.out.println(driver.getTitle());
		
		WebElement dd = driver.findElement(By.id("dropdown"));
		Select dd1 = new Select(dd);
		
		Thread.sleep(2000);
		dd1.selectByValue("1");
		
		Thread.sleep(2000);
		dd1.selectByIndex(2); // index starts with 0
		
		Thread.sleep(2000);
		dd1.selectByVisibleText("Option 1");
		
		System.out.println("Selected option: " + dd1.getFirstSelectedOption().getText());
		
		System.out.println(dd1.getOptions().size());
		
		List<String> expectedValues = new ArrayList<String>();
		expectedValues.add("Please select an option");
		expectedValues.add("Option 1");
		expectedValues.add("Option 2");
		
		
		List<String> actualValues = new ArrayList<String>();
		for(WebElement opt: dd1.getOptions())
			actualValues.add(opt.getText());
		
//		System.out.println(actualValues);
		
		assertEquals(actualValues, expectedValues);
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

}
