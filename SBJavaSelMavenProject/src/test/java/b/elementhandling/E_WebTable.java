package b.elementhandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E_WebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://testautomationpractice.blogspot.com/";
				
		driver.get(url);
		System.out.println(driver.getTitle());
		
		WebElement table = driver.findElement(By.name("BookTable"));
		
//		row count
		int rowCount = table.findElements(By.tagName("tr")).size();
		Assert.assertEquals(rowCount, 7);
		
//		column count
		int colCount = table.findElements(By.tagName("th")).size();
		Assert.assertEquals(colCount, 4);
		
		for(WebElement cell: table.findElements(By.tagName("th")))
		{
//			String str = String.format("%s", cell.getText());
			String str = String.format("%18s", cell.getText());
			System.out.print(str);
		}
		System.out.println();
		
		for(WebElement row: table.findElements(By.tagName("tr")))
		{
			for(WebElement cell: row.findElements(By.tagName("td")))
			{
				String str = String.format("%18s", cell.getText());
				System.out.print(str);
			}
			System.out.println();
		}

		Thread.sleep(2000);
		
		driver.quit(); 
		
	}

}
