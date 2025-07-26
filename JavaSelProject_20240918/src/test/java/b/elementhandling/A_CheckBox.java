package b.elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://the-internet.herokuapp.com/checkboxes";
		
		driver.get(url);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement chk1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
////		code to ensure that we select the checkbox
//		if(!chk1.isSelected())
//			chk1.click();
		
//		code to ensure that we de-select the checkbox
		if(chk1.isSelected())
			chk1.click();

		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

}
