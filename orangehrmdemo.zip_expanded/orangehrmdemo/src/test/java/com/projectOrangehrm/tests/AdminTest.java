package com.projectOrangehrm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.projectOrangehrm.BaseClass.BaseClass;
import com.projectOrangehrm.pages.AdminDatadriven;
import com.projectOrangehrm.pages.LoginPage;
import com.projectOrangehrm.utility.DataProviders;
import com.projectOrangehrm.utility.Log;
import com.projectOrangehrm.utility.NewExcelLibrary;

public class AdminTest extends BaseClass {
	private AdminDatadriven adminpg;

	@BeforeMethod
	public void setup() {
		launch();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1, dataProvider = "AdminData", dataProviderClass = DataProviders.class)
	public void loginTestAdmin(String username, String UserROle, String EmployeeName, String Status)
			throws Throwable {
		adminpg = new AdminDatadriven();

		Log.startTestCase("---LoginTestAdminStart---");

		adminpg.loginadmin(username, UserROle, EmployeeName, Status);

		Log.info("Values added using excel file into OrangeHRM app successfully...");

		Log.endTestCase("---LoginTestAdminEnd---");

	}

}
