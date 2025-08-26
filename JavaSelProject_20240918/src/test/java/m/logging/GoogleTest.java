package m.logging;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private static final Logger logger = LogManager.getLogger(GoogleTest.class);

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        logger.info("Initializing ChromeDriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.debug("Window maximized");
    }

    @Test
    public void testGoogleHomePage() {
        logger.info("Navigating to Google");
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        logger.info("Page title is: " + title);

        assertEquals(title, "Google", "Title mismatch");
        logger.info("Assertion passed");
    }

    @AfterMethod
    public void tearDown() {
        logger.info("Closing browser");
        driver.quit();
    }
}
