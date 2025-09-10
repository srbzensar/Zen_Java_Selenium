package com.projectOrangehrm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.projectOrangehrm.BaseClass.BaseClass;
import com.projectOrangehrm.pages.LoginPage;
import com.projectOrangehrm.utility.DataProviders;
import com.projectOrangehrm.utility.Log;

public class LoginTest extends BaseClass {

	private LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		launch();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void loginTest() throws Throwable {
		loginPage = new LoginPage();

		Log.startTestCase("---LoginTestStart---");

		loginPage.login();

		Log.info("Login with Username & Password into OrangeHRM app successfully...");

		Log.endTestCase("---LoginTestEnd---");

	}

	

}
