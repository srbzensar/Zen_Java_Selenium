Feature: Google Search

@regressiontest
Scenario: Successful Google Search
	Given user launch Chrome Browser
	When User opens URL "https://www.google.com"
	And enters the search text as "Selenium"
	And sumbits the search request
	Then page title should be valid
	And close the browser
	