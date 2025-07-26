package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/checkboxes";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		
		WebElement chk1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	
		Thread.sleep(3000);
		if(!chk1.isSelected())
			chk1.click();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
