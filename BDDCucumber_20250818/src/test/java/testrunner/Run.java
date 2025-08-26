package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = {"src/test/resources/features/a_login.feature"},
		features = {"src/test/resources/features"},
		glue = {"stepdefinitions"},
		dryRun = false,
		monochrome= true,
		plugin = {"pretty", "html:target/htmlreport.html"}
		)

public class Run 
{
// This class will be empty
}
