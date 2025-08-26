Feature: Login functionality using CSV data

  @ddtcsv
  Scenario: Login with credentials from CSV
    Given user logs in with credentials from CSV file
    Then login should be successful for all users

    