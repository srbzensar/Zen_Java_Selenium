package com.projectOrangehrm.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.projectOrangehrm.BaseClass.BaseClass;
import com.projectOrangehrm.utility.Log;

public class LoginPage extends BaseClass {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login()  {
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys(prop.getProperty("username"));
		
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys(prop.getProperty("password"));
		
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		LoginButton.click();
		
	}


	
	
}
