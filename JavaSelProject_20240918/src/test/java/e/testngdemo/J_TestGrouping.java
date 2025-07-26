package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class J_TestGrouping {
  @Test(groups = {"smoke"}, enabled = false)
  public void test1() 
  {
	  System.out.println("test1");
	  assertEquals("Google", "Google"); // actual, expected
  }
  
  @Test(groups = {"smoke"})
  public void test3() 
  {
	  System.out.println("test3");
	  assertEquals("google", "google"); // actual, expected
	  
  }
  
  @Test(groups = {"regression"})
  public void test2() 
  {
	  System.out.println("test2");
	  assertEquals("Yahoo", "Yahoo"); // actual, expected
  }

  @Test(groups = {"smoke", "regression"})
  public void test4() 
  {
	  System.out.println("test4");
	  assertEquals("Yahoo", "Yahoo"); // actual, expected
  }
  
  @Test(groups = {"smoke", "linux"})
  public void test5() 
  {
	  System.out.println("test5");
	  assertEquals("Yahoo", "Yahoo"); // actual, expected
  }

  @Test(groups = {"win"})
  public void test6() 
  {
	  System.out.println("test6");
	  assertEquals("Yahoo", "Yahoo"); // actual, expected
  }

}
