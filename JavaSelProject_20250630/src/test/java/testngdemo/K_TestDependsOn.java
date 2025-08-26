package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class K_TestDependsOn 
{
  @Test
  public void test1() 
  {
	  System.out.println("Login Method");
	  assertEquals("Google", "Google");
  }
  
  @Test(dependsOnMethods={"test1", "test3"})
  public void test2 ()
  {
	  System.out.println("Account details Method");
	  assertEquals("Google", "Google");
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("Test3 Method");
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
