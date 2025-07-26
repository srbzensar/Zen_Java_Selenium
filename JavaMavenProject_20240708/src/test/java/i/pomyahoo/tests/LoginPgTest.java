package i.pomyahoo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import i.pomyahoo.pages.LoginPage;

public class LoginPgTest {

	static LoginPage myLoginPage = new LoginPage();
	
//	static
//	{
//		myLoginPage = new LoginPage();
//	}
	
	public static void main(String[] args) 
	{
//		LoginPageTest myLoginTest = new LoginPageTest();
		myLoginPage.login("test.selenium@myyahoo.com", "AutomateDemo@123");
		assertTrue(myLoginPage.getPageTitleAfterLogin().contains("Yahoo"));
		myLoginPage.closeBrowser();
	}
	
}
