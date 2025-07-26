package pom.yahoo.tests;

import static org.testng.Assert.assertTrue;

import pom.yahoo.pages.LoginPageF;

public class LoginPageTestF {

	static LoginPageF myLoginPage = new LoginPageF();
	
	public static void main(String[] args) {
		String id = "test.selenium@myyahoo.com";
		String pwd = "AutomateDemo@123";
		
		myLoginPage.login(id, pwd);
		assertTrue(myLoginPage.getPageTitleAfterLogin().contains("Yahoo"));
		myLoginPage.closeBrowser();
		
	}

}
