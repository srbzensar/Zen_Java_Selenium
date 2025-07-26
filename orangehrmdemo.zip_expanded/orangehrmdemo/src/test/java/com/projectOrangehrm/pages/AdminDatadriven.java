package com.projectOrangehrm.pages;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.projectOrangehrm.BaseClass.BaseClass;
import com.projectOrangehrm.utility.Log;

public class AdminDatadriven extends BaseClass{
	
	//public static String path = null;
	public static FileInputStream file = null;
	public static String path ="Files/info.xlsx";

	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement usernameadmin;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement userroleadmin;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement enameadmin;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement statusadmin;
	
	public AdminDatadriven() {
		PageFactory.initElements(driver, this);
	}
	
			
			
	public void loginadmin(String username,String UserROle, String EmployeeName, String Status ) throws Exception  {
		driver.findElement(By.xpath("//*[@href='/web/index.php/admin/viewAdminModule']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(usernameadmin));
		usernameadmin.sendKeys(username);
		Log.info("username added");
		
		
		Select role = new Select(userroleadmin);
		//Thread.sleep(1000);
		Log.info("role selected");
		role.selectByVisibleText(UserROle);
		Log.info("Tag Team role selected..");
		wait.until(ExpectedConditions.elementToBeClickable(enameadmin));
		enameadmin.sendKeys(EmployeeName);
		
		Select statuss = new Select(statusadmin);
		//Thread.sleep(1000);
		Log.info("role selected");
		statuss.selectByVisibleText(Status);
		
		
	}

}
