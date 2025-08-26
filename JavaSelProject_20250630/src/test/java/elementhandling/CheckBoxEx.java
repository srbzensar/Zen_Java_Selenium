package elementhandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxEx {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "https://the-internet.herokuapp.com/checkboxes";
		
		driver.get(url);	
		
		WebElement chk1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		Thread.sleep(2000);
		if(!chk1.isSelected())
			chk1.click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();	
	}

}
