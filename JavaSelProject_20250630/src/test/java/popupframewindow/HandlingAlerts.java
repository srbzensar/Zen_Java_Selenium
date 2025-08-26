package popupframewindow;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "file:///D:/LnD/Sessions/202506_DAP_SDET_Automation/xpath/SamplePage.html";
		driver.get(url);			
		System.out.println(driver.getTitle());
		
		WebElement btnS = driver.findElement(By.id("salert"));
		WebElement btnC = driver.findElement(By.id("calert"));
		WebElement btnP = driver.findElement(By.id("palert"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(5000);
		
//		simple Alert
		action.doubleClick(btnS).perform();
		Thread.sleep(3000);
		
		Alert sAlert = driver.switchTo().alert();
		sAlert.accept();
		
//		confirm Alert
		action.doubleClick(btnC).perform();
		Thread.sleep(3000);
		
		Alert cAlert = driver.switchTo().alert();
		sAlert.dismiss();
		
//		Prompt Alert
		action.doubleClick(btnP).perform();
		Thread.sleep(3000);		
		
		Alert pAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		pAlert.sendKeys("Saurav Ganguli");
		Thread.sleep(4000);
		pAlert.accept();
		Thread.sleep(5000);
		
		driver.quit();	
	}

}
