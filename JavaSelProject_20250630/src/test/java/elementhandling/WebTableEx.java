package elementhandling;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebTableEx {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();   
		String url = "https://cosmocode.io/automation-practice-webtable/";
		
		driver.get(url);	
		System.out.println(driver.getTitle());
		
		WebElement table = driver.findElement(By.id("countries"));
		
		int rowCount = table.findElements(By.tagName("tr")).size();
		System.out.println(rowCount);
		
		int colCount = table.findElements(By.tagName("h3")).size();
		System.out.println(colCount);
		
		int r=0;
		for(WebElement row: table.findElements(By.tagName("tr")))
		{	
			
			int col = 0;
			for(WebElement cell: row.findElements(By.tagName("td")))
			{
				col++;
				if(col == 1 || col == 5)
					continue;
				String str = String.format("%20s", cell.getText());
				System.out.print(str);
			}
			System.out.println();
			if(r++ == 5)
				break;
		}
		
		
		
		Thread.sleep(3000);		
		driver.quit();	
	}

}
