package i.pom.yahoo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import i.pom.yahoo.pages.LoginPage;

public class LoginPageTest {

	static LoginPage myLoginPage = new LoginPage();
	
	public static void main(String[] args) 
	{
		String id = "actualid";
		String pwd = "actualPassword";
		
		myLoginPage.login(id, pwd);
		assertTrue(myLoginPage.getPageTitleAfterLogin().contains("Yahoo"));
		myLoginPage.closeBrowser();
	}

}
