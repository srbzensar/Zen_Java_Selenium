Feature: Login Functionality using Data Driven Test

@ddt
Scenario Outline: Successful login with valid credentials
	Given robo is on login page
	When robo enters "<username>" and "<password>"
	Then robo is navigated to the home page
	
Examples:
	|	username	|	password	|
	|	user1		|	pass123		|
	|	user2		|	pass456		|
	|	user3		|	pass789		|
