package i.pomyahoo.tests;

import static org.testng.Assert.assertEquals;

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
		myLoginPage.login("actualUserId", "actualPassword");
		assertEquals(myLoginPage.getPageTitleAfterLogin(), "Yahoo");
		myLoginPage.closeBrowser();
	}
	
}
