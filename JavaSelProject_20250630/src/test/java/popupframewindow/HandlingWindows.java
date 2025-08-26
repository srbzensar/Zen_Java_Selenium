package popupframewindow;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();   
		String url = "https://www.google.com";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.wikipedia.org");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.bing.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
				
		Thread.sleep(3000);
		driver.quit();	
	}
}
