package b.elementhandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D_DropDownSingle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "http://cookbook.seleniumacademy.com/Config.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
		WebElement dropdown = driver.findElement(By.name("make"));
		Select make = new Select(dropdown);
		
//		select the options
//		1. by value
		Thread.sleep(2000);
		make.selectByValue("audi");
		

//		2. by index
		Thread.sleep(2000);
		make.selectByIndex(1); // Merc - Index starts from 0
		
//		3. by visible text
		Thread.sleep(2000);
		make.selectByVisibleText("Honda");
		
		System.out.println("selected option: " + make.getFirstSelectedOption().getText());
		Assert.assertEquals(make.getOptions().size(), 4);
		

		System.out.println("Is multiple? " + make.isMultiple());
		
		List<String> expectedValues = new ArrayList<String>();
		expectedValues.add("BMW");
		expectedValues.add("Audi");
		expectedValues.add("Mercedes");
		expectedValues.add("Honda");
		
		List<String> actualValues = new ArrayList<String>();
		for(WebElement opt: make.getOptions())
			actualValues.add(opt.getText());
		
		Assert.assertEquals(actualValues, expectedValues);
		
		
		Thread.sleep(2000);
		
		
		driver.quit(); 
		
		
	}

}
