package e.testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class M_ShoppingList {
  @Test
  @Parameters({"f1", "f2"})
  public void cartList(String fruit1, String fruit2) 
  {
	  System.out.println("Shoppig List contains: " + fruit1 + " " + fruit2);
  }
 
  
}
