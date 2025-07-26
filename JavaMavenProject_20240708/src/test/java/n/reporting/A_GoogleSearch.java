package n.reporting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class A_GoogleSearch {
	WebDriver driver;
	String url = "https://www.google.com";
	
	static ExtentTest test;
	static ExtentReports report;
	static ExtentSparkReporter extentSparkReporter;
	
  @Test
  public void test1() 
  {
	  driver.get(url);
	  extentSparkReporter = new ExtentSparkReporter("./reports/ExtentSpark.html");
	  extentSparkReporter.config().setDocumentTitle("Automation Report");
	  extentSparkReporter.config().setReportName("Test Automation Report");
	  extentSparkReporter.config().setTheme(Theme.DARK);
	  report = new ExtentReports();
	  report.attachReporter(extentSparkReporter);
	  test = report.createTest("GoogleSearch Test", "This test case has passed");
	  
	  if(driver.getTitle().contains("Google"))
		  test.log(Status.PASS, "This test passed");
	  assertEquals(driver.getTitle(), "Google");
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  report.flush();
	  driver.quit();
  }

}
