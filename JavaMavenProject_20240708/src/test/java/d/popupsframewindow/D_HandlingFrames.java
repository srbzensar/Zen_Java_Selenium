package d.popupsframewindow;



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

public class D_HandlingFrames {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "https://the-internet.herokuapp.com/nested_frames";
		driver.get(url);			
		System.out.println(driver.getTitle());
		System.out.println("Main Page");
		
		driver.switchTo().frame("frame-top"); // id or name
		System.out.println("Frame Top");
		
		driver.switchTo().frame("frame-left");
		System.out.print("Frame Left: ");
		
		System.out.println(driver.getPageSource().contains("LEFT"));	// true
		System.out.println("Frame Right: " + driver.getPageSource().contains("RIGHT"));	// false
		
		driver.switchTo().parentFrame();
		System.out.println("Frame Top");

//		switch to a frame using index (index starts from 0)
		driver.switchTo().frame(1);
		System.out.print("Frame Middle: ");
		System.out.println(driver.getPageSource().contains("MIDDLE"));	// true
		
		driver.switchTo().parentFrame();
		System.out.println("Frame Top");

		WebElement elem = driver.findElement(By.name("frame-right"));
		driver.switchTo().frame(elem);
		System.out.print("Frame Right: ");
		System.out.println(driver.getPageSource().contains("RIGHT"));	// true
		
		driver.switchTo().defaultContent(); // main page
		System.out.println("Main Page");
		
		Thread.sleep(5000);
		driver.quit();	
	}

}
