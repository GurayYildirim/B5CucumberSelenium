Feature: Navigate to Menu with Parameters

  Background:
    Given the user in on the login page

@smoke
  Scenario: User navigates to Developers Menu
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigate to "Developers" menu
    Then The user schould be able to see Header as "Filter Profiles by Skill or by Location"
  @smoke
  Scenario: User navigates to All Post Menu
    When The user logs in using "studentB5@ets.com" and "studentB5"
    Then The welcome message contains "student"
    And The user navigate to "All Posts" menu
    Then The user schould be able to see Header as "Posts"
  @smoke
  Scenario: User navigates to My Account Menu
    When The user logs in using "developerB5@ets.com" and "developerB5"
    Then The welcome message contains "developer"
    And The user navigate to "My Account" menu
    Then The user schould be able to see Header as "Dashboard"

  @NavigatetoMenu
  Scenario Outline: Navigate to Menu with Parameters
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    And The user navigate to "<Title>" menu
    Then The user schould be able to see Header as "<Text>"
    Examples:
      | userType            | password    | name      | Title      | Text                                    |
      | eurotech@gmail.com  | Test12345!  | Teacher   | Developers | Filter Profiles by Skill or by Location |
      | studentB5@ets.com   | studentB5   | student   | All Posts  | Posts                                   |
      | developerB5@ets.com | developerB5 | developer | My Account | Dashboard                               |



