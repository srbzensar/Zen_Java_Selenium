package b.elementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "http://cookbook.seleniumacademy.com/Config.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
		WebElement radioButton = driver.findElement(By.name("fuel_type"));
		Thread.sleep(2000);		
		

		radioButton.click();
		
		Thread.sleep(2000);
		
		
		driver.quit(); 
		
		
	}

}
