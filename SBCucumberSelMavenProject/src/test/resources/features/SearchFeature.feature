Feature: Google Search

Scenario: Successful Google Search
  Given User launch Chrome browser
  When User opens URL "https://www.google.com"
  And enter the search text as "Selenium"
  And submits the search request
  Then page title should be valid
  Then result should contain the contents as per search text
  And close browser
