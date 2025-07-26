package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class N_TestExecuteParallel {
  @Test
  public void test1() 
  {
	  System.out.println("This is my test1");
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("This is my test2");
  }
 

}
