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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class B_MultipleTests {
	WebDriver driver;
	String url = "https://www.google.com";
	
	static ExtentTest test;
	static ExtentReports report;
	static ExtentSparkReporter extentSparkReporter;
	
  @Test
  public void test1() 
  {
//	  driver.get(url);
	 
	  test = report.createTest("GoogleSearch Test", "This test case has passed");
	  
	  if("Google".contains("Google"))
		  test.log(Status.PASS, "Page Title matched");
	  assertEquals("Google", "Google");
  }
  
  @Test
  public void test2()
  {
	  if("Google".equals("Google1"))
		  test.log(Status.PASS, "Google string matched");
	  else
		  test.log(Status.FAIL, "Google string not matched");
	  assertEquals("Google", "Google1");
  }
  
  @Test
  public void test3()
  {
	  if("Yahoo".equals("Yahoo"))
		  test.log(Status.PASS, "Yahoo string matched");
	  else
		  test.log(Status.FAIL, "Yahoo string not matched");
  }
  
  @Test(dependsOnMethods="test2")
  public void test4() 
  {
	  System.out.println("This is account details test");
	  assertEquals("Google", "Google"); // actual, expected
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  extentSparkReporter = new ExtentSparkReporter("./reports/ExtentSpark.html");
	  extentSparkReporter.config().setDocumentTitle("Automation Report");
	  extentSparkReporter.config().setReportName("Test Automation Report");
	  extentSparkReporter.config().setTheme(Theme.DARK);
	  report = new ExtentReports();
	  report.attachReporter(extentSparkReporter);
  }
  
  @AfterClass
  public void afterClass()
  {
	  report.flush();
  }

}
