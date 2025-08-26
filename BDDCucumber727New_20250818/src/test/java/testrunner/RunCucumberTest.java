package testrunner;

import org.junit.platform.suite.api.*;
import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")	
@SelectPackages("features") 
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinitions")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinitions,hooks")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
						value = "pretty,html:target/cucumber-report.html")

@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@ddt")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@hookex")


//----- Reference ---------------------------------------
//// Test runner for executing Cucumber BDD tests using JUnit 5 and new version of Cucumber 7.27.1
//
//@Suite
//@IncludeEngines("cucumber")	// Use the Cucumber engine for running feature files
//
////@SelectClasspathResource("features/a_login.feature") // relative to src/test/resources for single feature file
//@SelectPackages("features") // relative to src/test/resources for entire package
//
////Specify the package(s) containing step definitions
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinitions")
//
////Configure output plugins for reporting
////@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
//@ConfigurationParameter(
//	    key = PLUGIN_PROPERTY_NAME,
//	    value = "pretty,"								// Console output
//	    		+" html:target/cucumber-report.html," 	// HTML report
//	    		+" json:target/cucumber-report.json," 	// JSON report
//	    		+" junit:target/cucumber-report.xml," 	// JUnit XML report
//	)
//
////Optional: Run only scenarios with specific tags (e.g., @Smoke, @Regression)
//@ConfigurationParameter(
//key = FILTER_TAGS_PROPERTY_NAME,
////value = "@ddt"
//value = "@ddtcsv"
////value = "@regression or @smoke"    
////value = "@regression and @smoke"    
////value = "not @linux"    
////value = "not @regression"
//)
//
////Optional: Set dry run to true to validate step definitions without executing them
//@ConfigurationParameter(
//key = EXECUTION_DRY_RUN_PROPERTY_NAME,
//value = "false"
//)
//--------------------------------------------

public class RunCucumberTest 
{ 
	// This class will be empty 
}


