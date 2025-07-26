package b.elementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_CheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "http://cookbook.seleniumacademy.com/Config.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
		WebElement checkBox = driver.findElement(By.name("airbags"));
		Thread.sleep(2000);		
		

		if(!checkBox.isSelected())
			checkBox.click();
		
		
		
		Thread.sleep(2000);
		
		
		driver.quit(); 
		
		
	}

}
