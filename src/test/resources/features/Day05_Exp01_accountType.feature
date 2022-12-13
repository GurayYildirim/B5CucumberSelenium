
Feature: Accunt Type

  Background:
    Given the user in on the login page

  @wip
  Scenario: Teacher user
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
  @wip
  Scenario: Student user
    When The user logs in using "studentB5@ets.com" and "studentB5"
    Then The welcome message contains "student"
  @wip
  Scenario: Developer user
    When The user logs in using "developerB5@ets.com" and "developerB5"
    Then The welcome message contains "developer"


  Scenario Outline: Different <name> as a User Type
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    Examples:
      | userType                  | password    | name         |
      | eurotech@gmail.com        | Test12345!  | Teacher      |
      | studentB5@ets.com         | studentB5   | student      |
      | developerB5@ets.com       | developerB5 | developer    |
      | leventaydin3472@gmail.com | 4422La.     | Levent Aydin |
      | isa@gmail.com             | 2828isa     | isa          |
      | hakans@gmail.com          | hakan86     | Hakan        |
      | student33@gmail.com       | Test12345!  | Denis        |