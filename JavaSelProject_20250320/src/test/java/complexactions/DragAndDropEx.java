package complexactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://the-internet.herokuapp.com/drag_and_drop";
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement e1 = driver.findElement(By.id("column-a"));
		WebElement e2 = driver.findElement(By.id("column-b"));
		
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDrop(e1, e2).perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
