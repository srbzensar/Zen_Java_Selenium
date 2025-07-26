package complexactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlClickEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://the-internet.herokuapp.com/hovers";
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement link = driver.findElement(By.linkText("my link"));
		 
        // Create an Actions object
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        // Perform Ctrl + Click on the link
        actions.keyDown(Keys.CONTROL)
               .click(link)
               .keyUp(Keys.CONTROL)
               .perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
