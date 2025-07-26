package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class F_AnnotationsDemo {
	  @Test
	  public void test1() 
	  {
		  System.out.println("This is my test1");
	  }
	  
	  @Test
	  public void test2() 
	  {
		  System.out.println("This is my test2");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("This is before Method");
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("This is after Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after suite");
	  }

}
