package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LHeadlessBrowserHtmlUnit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new HtmlUnitDriver(); 
		String url = "https://www.google.com";
		
		driver.get(url);
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
