package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
//		WebElement e = driver.findElement(By.name("q"));
//		e.sendKeys("Selenium");
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
