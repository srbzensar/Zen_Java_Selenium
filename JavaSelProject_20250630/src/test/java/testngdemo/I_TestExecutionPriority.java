package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

/*
By default tests gets executed in alphabetical order
priority can be assigned using priority parameter
by default the priority is 0
even -1 is there, which has higher priority than 0
*/
public class I_TestExecutionPriority 
{
  @Test(priority=3)
  public void test1() 
  {
	  System.out.println("Test1 Method");
  }
  
  @Test(priority=2, enabled=false)
  public void test3() 
  {
	  System.out.println("Test3 Method");
  }
  
  @Test(priority=1)
  public void test2() 
  {
	  System.out.println("Test2 Method");
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
