Feature: Google Search

  Scenario: Successful Google Search
  	Given user launch Chrome Browser
  	When user opens URL "https://www.google.com"
  	And enters the search text as "Selenium"
  	And submits the search request
  	Then page title should be valid
  	And close the browser
