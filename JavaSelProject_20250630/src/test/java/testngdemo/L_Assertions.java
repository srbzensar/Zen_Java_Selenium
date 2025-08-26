package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.AfterMethod;

public class L_Assertions {
  @Test
  public void test1() 
  {
	  System.out.println("This is login test");
	  assertEquals(10, 10); // actual, expected
  }

  @Test(dependsOnMethods="test1")
//  @Test
  public void test3() 
  {
	  System.out.println("This is account details test");
	  assertEquals("Google", "Google"); // actual, expected
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("This is my test2");
	  assertEquals(10, 15); // actual, expected
  }
  
  @Test
  public void test9() 
  {
	  System.out.println("This is my test2");
	  assertNotEquals(10, 15); // actual, expected
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("This is my test4");
	  assertTrue(10==10, "values did match");	// pass
//	  assertTrue(10==15, "values did match");   // fail
  }

  @Test
  public void test5() 
  {
	  System.out.println("This is my test5");
	  assertFalse(10==15, "values matched"); // pass
//	  assertFalse(10==10, "values matched"); // fail
  }
  
  @Test
  public void test6() 
  {
	  int expected[] = {30, 5, 10, 20};
	  int actual[] = {30, 5, 10, 20};
	  System.out.println("This is my test to assert array elements");
	  assertEquals(actual, expected, "array values are not matching");
  }

  @Test
  public void test7() 
  {
	  System.out.println("This is my test to fail without message");
	  fail();
  }
  
  @Test
  public void test8() 
  {
	  System.out.println("This is my test to fail with message");
	  fail("Failed with custom message");
  }
  
  
  
}
