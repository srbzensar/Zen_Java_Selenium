package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		
		driver.get(url);
		
//		driver.quit();
		
	}

}
