package testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class M_CalcTest {
	
  @Test
  @Parameters({"a", "b"})
  public void add(int x, int y) 
  {
	  int r = x + y;
	  System.out.println("Result is " + r);
  }
  
  @Test
  @Parameters({"a", "b"})
  public void sub(int x, int y) 
  {
	  int r = x - y;
	  System.out.println("Result is " + r);
  }
  
  
}
