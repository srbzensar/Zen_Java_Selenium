package j.pomyahoopf.tests;

import static org.testng.Assert.assertEquals;

import i.pomyahoo.pages.LoginPage;

public class LoginPageTest {

	static LoginPage myLoginPage;
		
	LoginPageTest()
	{
		myLoginPage = new LoginPage();
	}
	
	public static void main(String[] args) 
	{
		LoginPageTest myLoginTest = new LoginPageTest();
		myLoginPage.login("actualUserId", "actualPassword");
		assertEquals(myLoginPage.getPageTitleAfterLogin(), "Yahoo");
		myLoginPage.closeBrowser();
	}
	
}
