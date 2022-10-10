 @all
Feature: Techfios billing Login Functionality Validation

  Background: 
    Given User is on Techfios login page

  @TF_login1
  Scenario Outline: User should be able to Login with valid credentials
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks signin button
    Then User should land on dashboard page

    Examples: 
      | username          | password |
      | demo@techfios.com | abc123   |

  #|demo1@techfios.com|abc123|
  ##|demo@techfios.com|abc121|
  
  @TF_login2 @Smoke
  Scenario: User should be able to login with valid credentials from Database
    When User enters "username" from database
    When User enters "password" from database
    When User clicks signin button
    Then User should land on dashboard page
|
