package a.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BCheckSetup {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver is an interface
		WebDriver driver;
		
		driver = new ChromeDriver(); // new instance of the browser
		
		Thread.sleep(3000);  // Java feature to pause the execution for sometime (in millisecond)
		
		
//		driver.close(); // closes the current window only
		driver.quit(); // close all the windows of browser, which were opened during script execution.
		
	}

}
