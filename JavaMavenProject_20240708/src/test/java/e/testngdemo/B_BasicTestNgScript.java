package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class B_BasicTestNgScript {

  @Test
  public void test2() 
  {
	  System.out.println("This is my test2");
  }
	
  @Test
  public void test1() 
  {
	  System.out.println("This is my test1");
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
