Feature: Login Functionality using Data Driven Test

@ddt
Scenario Outline: Successful Login with Valid Credentials
  Given A User is on the Login Page
  When A User enters "<username>" and "<password>"
  Then A User should be logged in successfully

Examples:
  | username  | password  |
  | <username>| <password>|
