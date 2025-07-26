package z.challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APrintGoogleLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
//		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement l:links)
		{
			System.out.print(l.getText() + " ");
			System.out.println(l.getAttribute("href"));
		}
		System.out.println("Total urls: " + links.size());
		
		Thread.sleep(2000);
		
		
		driver.quit(); 
		
		
	}

}
