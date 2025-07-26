# test login feature
Feature: feature to robo test login functionality 
	
	@smoketest
	Scenario: check robo login is successful with valid credentials
	
		Given robo is on login page
		When robo enters username and password
		And robo clicks on login button
		Then robo is navigated to home page
		