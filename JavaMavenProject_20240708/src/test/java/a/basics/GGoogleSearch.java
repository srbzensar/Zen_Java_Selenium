package a.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GGoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Selenium");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).submit();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		
		driver.quit(); 
		
		
	}

}
