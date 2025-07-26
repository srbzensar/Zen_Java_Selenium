package e.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class I2_TestExecutionPriority2 {
  
  @Test
//  @Test(priority=2)
  public void test1() {
	  System.out.println("Test1 Method");
  }
  
//  @Test
  @Test(priority=-1)
  public void test3() {
	  System.out.println("Test3 Method");
  }
  
  @Test
//  @Test(priority=1)
  public void test2() {
	  System.out.println("Test2 Method");
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
