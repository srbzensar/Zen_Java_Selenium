package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = {"src/test/resources/features/login11.feature"},
//		features = {"src/test/resources/features/GoogleSearchFeature.feature"},
		features = {"src/test/resources/features/LoginDDT.feature"},
//		features = {"src/test/resources/features/"},
		glue = {"stepdefinition"},
		dryRun = false,
		monochrome = true,
//		plugin = {"pretty", "html:target/htmlreport.html"}
//		plugin = {"pretty", "json:target/report.json"}
//		plugin = {"pretty", "junit:target/report.xml"}
		plugin = {"pretty", 
					"html:target/htmlreport.html",
					"json:target/report.json",
					"junit:target/report.xml"
		}	
//		,tags = "@smoketest"
		,tags = "@ddt"
		)


public class Run {
// This class will be empty
}
