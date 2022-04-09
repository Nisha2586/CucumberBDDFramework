$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfioBank\u0026CashsNewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Bank and Cash New Account Functionality Validation",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials and open new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@TF_bank\u0026cash_newAccount"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks bank \u0026 cash \"bank\u0026cash\" side menu",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks new account",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should land on add new accounts page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters account title as \"\u003caccount title\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters description as \"\u003cdescription\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters initial balance as \"\u003cinitial balance\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters account number as \"\u003caccount number\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters contact person as \"\u003ccontact person\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters phone \"\u003cphone\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters internet banking url \"\u003cinternet banking url\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks submit button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should be able to validate accounts created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "account title",
        "description",
        "initial balance",
        "account number",
        "contact person",
        "phone",
        "internet banking url"
      ],
      "line": 27,
      "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Savings account",
        "Nisha FD",
        "1000",
        "12345667",
        "kelly",
        "123 123 1234",
        "https://www.usbank.com/online-mobile-banking/online-account-login.html"
      ],
      "line": 28,
      "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5497899400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefenition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1594595300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User should be able to login with valid credentials and open new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 7,
      "name": "@TF_bank\u0026cash_newAccount"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks bank \u0026 cash \"bank\u0026cash\" side menu",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks new account",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should land on add new accounts page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters account title as \"Savings account\" in accounts page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters description as \"Nisha FD\" in accounts page",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters initial balance as \"1000\" in accounts page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters account number as \"12345667\" in accounts page",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters contact person as \"kelly\" in accounts page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters phone \"123 123 1234\" in accounts page",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters internet banking url \"https://www.usbank.com/online-mobile-banking/online-account-login.html\" in accounts page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks submit button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should be able to validate accounts created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefenition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 3352338400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefenition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3157767700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefenition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 4624803800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefenition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 3486081200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bank\u0026cash",
      "offset": 25
    }
  ],
  "location": "LoginStepDefenition.user_clicks_bank_cash_side_menu(String)"
});
formatter.result({
  "duration": 203003200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefenition.user_clicks_new_account()"
});
formatter.result({
  "duration": 1194972300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefenition.user_should_land_on_add_new_accounts_page()"
});
formatter.result({
  "duration": 3244434600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Savings account",
      "offset": 30
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_account_title_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 200435600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nisha FD",
      "offset": 28
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_description_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 153211800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 32
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_initial_balance_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 159530100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345667",
      "offset": 31
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_account_number_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 222670500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kelly",
      "offset": 31
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_contact_person_as_in_accounts_page(String)"
});
formatter.result({
  "duration": 239613800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123 123 1234",
      "offset": 19
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_phone_in_accounts_page(String)"
});
formatter.result({
  "duration": 261433900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.usbank.com/online-mobile-banking/online-account-login.html",
      "offset": 34
    }
  ],
  "location": "BankAndCashNewAccountStepDefenition.user_enters_internet_banking_url_in_accounts_page(String)"
});
formatter.result({
  "duration": 407210600,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashNewAccountStepDefenition.user_clicks_submit_button()"
});
formatter.result({
  "duration": 2438757800,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashNewAccountStepDefenition.user_should_be_able_to_validate_accounts_created_successfully()"
});
formatter.result({
  "duration": 3367168100,
  "status": "passed"
});
});