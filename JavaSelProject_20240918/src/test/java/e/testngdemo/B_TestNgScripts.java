package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class B_TestNgScripts {
  
  @Test
  public void test1() {
	  System.out.println("Test1 Method");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2 Method");
  }
  
  
//  This will not be considered in TestNg execution at all
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
