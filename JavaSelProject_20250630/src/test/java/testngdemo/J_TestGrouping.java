package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class J_TestGrouping 
{
  @Test(groups= {"smoke"})
  public void test1() 
  {
	  System.out.println("Test1 Method");
  }
  
  @Test(groups= {"smoke"})
  public void test2() 
  {
	  System.out.println("Test2 Method");
  }
  
  @Test(groups= {"regression"})
  public void test3() 
  {
	  System.out.println("Test3 Method");
  }
  
  @Test(groups= {"smoke", "regression"})
  public void test4() 
  {
	  System.out.println("Test4 Method");
  }
  
  @Test(groups= {"smoke", "linux"})
  public void test5() 
  {
	  System.out.println("Test5 Method");
  }
  
  @Test(groups= {"win"})
  public void test6() 
  {
	  System.out.println("Test6 Method");
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
