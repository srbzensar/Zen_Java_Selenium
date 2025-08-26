package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class A_BasicTestNgScript 
{
  @Test
  public void test1() 
  {
	  System.out.println("Test1 Method");
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
