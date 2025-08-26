package pom.yahoo.normal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class YahooLogin {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		String url = "https://login.yahoo.com";
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("files/users.properties");
		p.load(fis);

		String id = p.getProperty("id");
		String pwd = p.getProperty("pwd");
		
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.id("login-username"));
		WebElement signin = driver.findElement(By.id("login-signin"));
		
		username.sendKeys(id);
		signin.click();
		
		WebElement password = driver.findElement(By.id("login-passwd"));
//		WebElement password = driver.findElement(By.name("password"));
		signin = driver.findElement(By.id("login-signin"));
		
		password.sendKeys(pwd);
		signin.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
