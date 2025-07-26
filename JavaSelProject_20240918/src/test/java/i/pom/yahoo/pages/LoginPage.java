package i.pom.yahoo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	private WebDriver driver;
	private WebElement username;
	private WebElement password;
	private WebElement signin;
	private String url;
	
	public LoginPage()
	{
		driver = new ChromeDriver();
		url = "https://login.yahoo.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void login(String id, String pwd)
	{
		username = driver.findElement(By.id("login-username"));
		signin = driver.findElement(By.id("login-signin"));
		
		username.sendKeys(id);
		signin.click();
		
		password = driver.findElement(By.id("login-passwd"));
		signin = driver.findElement(By.id("login-signin"));
		
		password.sendKeys(pwd);
		signin.click();
	}
	
	public String getPageTitleAfterLogin()
	{
		return driver.getTitle();
	}
	
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
