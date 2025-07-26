package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "https://www.google.com";
		
		driver.get(url);	
		
		System.out.println(driver.getTitle());
		
//		String name = "Selenium WebDriver";
//		System.out.println(name.toUpperCase().toLowerCase().charAt(0));
		
		
		Thread.sleep(3000);
//		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		WebElement searchBox = driver.findElement(By.name("q")); 
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("btnK")).click();
		
//		or
//		driver.findElement(By.name("btnK")).submit();
		
		Thread.sleep(5000);
		
		driver.quit();	
	}

}
