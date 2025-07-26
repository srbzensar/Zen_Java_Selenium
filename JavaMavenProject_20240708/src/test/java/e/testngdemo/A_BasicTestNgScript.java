package e.testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_BasicTestNgScript {
  @Test
  public void test1() {
	  System.out.println("This is my test");
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
	  System.out.println("before suite setup2");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite teardown2");
  }
  
}
