package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.testng.TestNGCucumberRunner;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/SearchFeature.feature"},
		glue = {"stepdefinition"},
		dryRun = false,
		monochrome = true // ,
//		plugin = {"pretty", "html:target/htmlreport.html"}
		)


public class Run // extends AbstractTestNGCucumberTests
{
//	This class will be empty
}
