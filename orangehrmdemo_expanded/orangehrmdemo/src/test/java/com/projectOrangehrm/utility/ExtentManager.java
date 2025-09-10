package com.projectOrangehrm.utility;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() throws Exception {
		extentSparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport.html");
		//extentSparkReporter= new ExtentSparkReporter("./reportsSpark/ExtentSpark.html");
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setDocumentTitle("OrangeHRMTestAutomationReport");
		extentSparkReporter.loadXMLConfig("./extent-config.xml");
		
		extent = new ExtentReports();
		extent.attachReporter(extentSparkReporter);
		
		extent.setSystemInfo("ProjectName", "OrangeHRMProject");
		extent.setSystemInfo("Tester", "Gauri");
		
	}
	public static void endReport() {
		extent.flush();
	}
}
