package z.challenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWithActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://en.wikipedia.org/wiki/Selenium";
        driver.get(url);

        Actions actions = new Actions(driver);

        // Scroll down using PAGE_DOWN key
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Scroll down using ARROW_DOWN key
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        // Scroll to a specific element
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("Isotopes"));
        actions.moveToElement(element).perform();
        
        // Scroll using Mouse Wheel Support
        Thread.sleep(3000);
		WheelInput wheel = new WheelInput("wheel");
		Sequence scroll = new Sequence(wheel, 0);
		scroll.addAction(wheel.createScroll(
				0, 0, 
				0, 600, 
				Duration.ofMillis(500), 
				ScrollOrigin.fromElement(element))); // Scroll down by 250 pixels
		
		((RemoteWebDriver) driver).perform(Arrays.asList(scroll));

		Thread.sleep(3000);
        driver.quit();
    }
}
