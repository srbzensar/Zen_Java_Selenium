Feature: Google Search hooks

  @hookex
  Scenario: Google Search
  	Given I am on Google Homepage
  	When I search for "Selenium"
  	Then title should be valid
  	