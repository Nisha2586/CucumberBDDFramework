@Regression
Feature: Techfios Bank and Cash New Account Functionality Validation

  Background: 
    Given User is on Techfios login page

  @TF_bank&cash_newAccount
  Scenario Outline: User should be able to login with valid credentials and open new account
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks signin button
    Then User should land on dashboard page
    And User clicks bank & cash "bank&cash" side menu
    And User clicks new account
    Then User should land on add new accounts page
    And User enters account title as "<account title>" in accounts page
    And User enters description as "<description>" in accounts page
    And user enters initial balance as "<initial balance>" in accounts page
    And User enters account number as "<account number>" in accounts page
    And User enters contact person as "<contact person>" in accounts page
    And User enters phone "<phone>" in accounts page
    And User enters internet banking url "<internet banking url>" in accounts page
    And User clicks submit button
    Then User should be able to validate accounts created successfully

    Examples: 
      | username          | password | account title   | description | initial balance | account number | contact person | phone        | internet banking url |
      | demo@techfios.com | abc123   | Savings account | Nisha FD    |            1000 |       12345667 | kelly          | 123 123 1234 |https://www.usbank.com/online-mobile-banking/online-account-login.html        |
