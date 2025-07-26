package pom.yahoo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageF {
	
	private WebDriver driver;
	
	@FindBy(id = "login-username")
	@CacheLookup
	private WebElement username;
	
	@FindBy(id = "login-passwd")
	@CacheLookup
	private WebElement password;
		
	@FindBy(id = "login-signin")
//	@CacheLookup
	private WebElement signin;
	
	private String url;
	
	public LoginPageF()
	{
		driver = new ChromeDriver();
		url = "https://login.yahoo.com"; 
		
		PageFactory.initElements(driver, this);
		
		driver.get(url);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void login(String id, String pwd)
	{
		username.sendKeys(id);
		signin.click();
		
		password.sendKeys(pwd);
		signin.click();
	}
	
	public String getPageTitleAfterLogin()
	{
		return driver.getTitle();
	}

	public void closeBrowser()
	{
		if(driver!=null)
			driver.quit();
	}
}
