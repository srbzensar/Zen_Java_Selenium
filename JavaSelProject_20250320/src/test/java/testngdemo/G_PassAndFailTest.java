package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class G_PassAndFailTest {
  @Test
  public void test1() 
  {
	  System.out.println("This is my test1");
//	  validation
	  assertEquals("Google", "Google1"); // actual, expected
	  
  }
  
  @Test
  public void test2() 
  {
//	  validation
	  assertEquals("Google", "Google"); // actual, expected
	  
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

}
