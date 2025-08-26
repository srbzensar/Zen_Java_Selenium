package d.popupsframewindow;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
3 ways to switch to a frame
switchTo.frame(id/name)
switchTo.frame(index)
switchTo.frame(element)

switch to the parent frame
switchTo.parentFrame()

switch to the main page
switchTo.defaultContent()
*/

public class B_HandlingFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "http://www.cookbook.seleniumacademy.com/Frames.html";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println("Main page");

//		switch to frame using id
		driver.switchTo().frame("left");
		WebElement lPara =  driver.findElement(By.tagName("p"));
		System.out.println(lPara.getText());		
		driver.switchTo().defaultContent(); // switching back to the parent page 
		System.out.println("Main page");
		
//		switch to frame using name
		driver.switchTo().frame("right");
		WebElement rPara =  driver.findElement(By.tagName("p"));
		System.out.println(rPara.getText());		
		driver.switchTo().defaultContent(); // switching back to the parent page 
		System.out.println("Main page");
		
		
//		switch to frame using index
		driver.switchTo().frame(1);
		WebElement mPara =  driver.findElement(By.tagName("p"));
		System.out.println(mPara.getText());		
		driver.switchTo().defaultContent(); // switching back to the parent page 
		System.out.println("Main page");

//		switch to inner frame 
		driver.switchTo().frame("right");
		System.out.println("Inside right frame");
		driver.switchTo().frame(0);
		System.out.println("Inside iFrame");
		driver.switchTo().parentFrame(); 
		System.out.println("Inside right Frame (parent frame)");
		driver.switchTo().defaultContent(); // switching back to the parent page 
		System.out.println("Main page");

////		switch to a frame using frame element
		WebElement leftFrame = driver.findElement(By.id("left"));
		driver.switchTo().frame(leftFrame);
		lPara =  driver.findElement(By.tagName("p"));
		System.out.println(lPara.getText());		
		driver.switchTo().defaultContent(); // switching back to the parent page 
		System.out.println("Main page");
		
		
		Thread.sleep(2000);
		
		
		driver.quit(); 
		
		
	}

}
