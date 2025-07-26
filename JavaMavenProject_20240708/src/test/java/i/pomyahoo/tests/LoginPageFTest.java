package i.pomyahoo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import i.pomyahoo.pages.LoginPageF;

public class LoginPageFTest {

	static LoginPageF myLoginPage;
		
	LoginPageFTest()
	{
		myLoginPage = new LoginPageF();
	}
	
	public static void main(String[] args) 
	{
		LoginPageFTest myLoginTest = new LoginPageFTest();
		myLoginPage.login("test.selenium@myyahoo.com", "AutomateDemo@123");
		assertTrue(myLoginPage.getPageTitleAfterLogin().contains("Yahoo"));
		myLoginPage.closeBrowser();
	}
	
}
