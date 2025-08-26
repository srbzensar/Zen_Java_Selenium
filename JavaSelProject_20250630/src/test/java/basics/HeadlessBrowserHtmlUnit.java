package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadlessBrowserHtmlUnit {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new HtmlUnitDriver();   
		String url = "https://www.google.com";
		
		driver.get(url);	
		
		System.out.println(driver.getTitle());
		
		
//		Thread.sleep(3000);
		
		driver.quit();	
	}

}
