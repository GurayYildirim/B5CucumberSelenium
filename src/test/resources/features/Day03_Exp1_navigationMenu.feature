@Navigation
Feature:Navigation Menu

  Scenario:Navigation to Developers menu
    Given The user is on the login page
    When The user enters developer credentials
    Then The user schould be able to sees welcome message
    And The user navigate to Developers menu
    Then The user able to see developer text

  Scenario: Navigation to All Post menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to sees welcome message
    And The user navigates to All Post menu
    Then The user able to see Posts text

  Scenario:Navigation to My Account menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to sees welcome message
    And The user navigates to My Account menu
    Then The user able to see dashboard text