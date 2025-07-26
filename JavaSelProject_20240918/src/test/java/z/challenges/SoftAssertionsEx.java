package z.challenges;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;


public class SoftAssertionsEx 
{

    @Test
    public void testSoftAssert() {

        WebDriver driver = new ChromeDriver();

        SoftAssert softAssert = new SoftAssert();

        driver.navigate().to("https://www.google.com/");

        String actualTitle = driver.getTitle();

        System.out.println("A1");
        softAssert.assertEquals(actualTitle, "Google1");

        System.out.println("A2");
        softAssert.assertNotEquals(actualTitle, "Incorrect Title", "Title matches an incorrect value");

        System.out.println("A3");
        softAssert.assertNotNull(actualTitle, "Page title should not be null");

        boolean titleMatch = actualTitle.equalsIgnoreCase("google");

        System.out.println("A4");
        softAssert.assertTrue(titleMatch, "Title does not match in case-insensitive comparison");

        try {
        	softAssert.assertAll();  // Reports all assertion results        	
        }
        catch(AssertionError e)
        {
//        	System.out.println(e.getMessage());
        	System.out.println(e);
        }
        finally
        {
        	driver.quit();
        }

    }

}