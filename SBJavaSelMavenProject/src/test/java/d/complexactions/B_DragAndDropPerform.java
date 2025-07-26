package d.complexactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class B_DragAndDropPerform {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "http://www.cookbook.seleniumacademy.com/DragDropDemo.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable);
		
		System.out.println(droppable.getText());
		action.perform();
		
		Thread.sleep(3000);
		System.out.println(droppable.getText());
		Assert.assertEquals(droppable.getText(), "Dropped!");
		
		driver.quit(); 
		
		
	}

}
