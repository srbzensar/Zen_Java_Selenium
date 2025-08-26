package pom.yahoo.normal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_YahooLoginNormal {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		String url = "https://login.yahoo.com"; 
		driver.get(url);
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		normally > enter userId	> enter password > click submit button
//		flow > enter userId	> click next button > enter password > click next button
		
		WebElement username = driver.findElement(By.id("login-username"));
		WebElement signin = driver.findElement(By.id("login-signin"));
		String id = "test.selenium@myyahoo.com";
		String pwd = "SeleniumDemo@123";
		
		
		username.sendKeys(id);
		signin.click();
		
		WebElement password = driver.findElement(By.id("login-passwd"));
		signin = driver.findElement(By.id("login-signin"));
		
		password.sendKeys(pwd);
		signin.click();
		
		Thread.sleep(4000); 
		driver.quit(); 
	}

}
