package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNgScripts {
  @Test
  public void test1() {
	  System.out.println("Test1 Method");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2 Method");
  }
  
//  this method will not be executed
  public void test3() {
	  System.out.println("Test3 Method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
