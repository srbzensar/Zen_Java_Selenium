package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class G_PassAndFailTest 
{
  @Test
  public void test1() 
  {
	  System.out.println("Test1 Method");
	  assertEquals("Google", "Google1");
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("Test2 Method");
	  assertEquals("Google", "Google");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method");
  }

}
