package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class K_TestDependsOn {
  @Test
  public void test1() 
  {
	  System.out.println("This is login test");
	  assertEquals("Google", "Google2"); // actual, expected
  }

  @Test(dependsOnMethods="test1")
  public void test3() 
  {
	  System.out.println("This is account details test");
	  assertEquals("Google", "Google"); // actual, expected
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("This is my test2");
	  assertEquals("Google", "Google"); // actual, expected
  }
  

}
