package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class I_TestExecutionPriority {
  @Test(priority=2)
  public void test1() 
  {
	  System.out.println("test1");
//	  validation
	  assertEquals("Google", "Google"); // actual, expected
  }
  
  @Test(priority=1)
  public void test3() 
  {
	  System.out.println("test3");
//	  validation
	  assertEquals("google", "google"); // actual, expected
	  
  }
  
  @Test(priority=3)
  public void test2() 
  {
	  System.out.println("test2");
//	  validation
	  assertEquals("Yahoo", "Yahoo"); // actual, expected
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

}
