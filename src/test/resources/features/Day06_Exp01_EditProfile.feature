Feature: The user schould be able to profile

  Background:
    Given the user in on the login page

  Scenario: Edit Profile
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    And The user navigates to "Edit Profile"
    And The user select status "Instructor"
    And The user sliders the slider 3
    And The user add "company" "Eurotech Study"
    And The user add "website" "http://www.eurotechstudy.com/"
    And The user add "location" "London"
    And The user add "skills" "Java, Cucumber, Junit"
    And The user add "githubusername" "eurotech2022"
    And The user add "bio" "SDET Eurotech"
    Then The user click on submit button


  Scenario Outline:Edit profile with Scenario Outline
    When The user logs in using "<email>" and "<password>"
    And The user navigates to "<add info module>"
    And The user select status "<status info>"
    And The user sliders the slider 3
    And The user add "company" "<company info>"
    And The user add "website" "<website info>"
    And The user add "location" "<location info>"
    And The user add "skills" "<skills info>"
    And The user add "githubusername" "<github info>"
    And The user add "bio" "<bio info>"
    Then The user click on submit button
    Examples:
      | email                     | password    | add info module | status info         | company info   | website info                  | location info | skills info                      | github info  | bio info      |
      | eurotech@gmail.com        | Test12345!  | Edit Profile    | Instructor          | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber, Junit            | eurotech2022 | SDET Eurotech |
      | studentB5@ets.com         | studentB5   | Edit Profile    | Manager             | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber                   | eurotech2022 | SDET Eurotech |
      | developerB5@ets.com       | developerB5 | Edit Profile    | Senior Developer    | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber, Junit, Github    | isamat23     | SDET Eurotech |
      | leventaydin3472@gmail.com | 4422La.     | Edit Profile    | Student or Learning | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber, Junit, Core Java | eurotech2022 | SDET Eurotech |


  Scenario Outline:Edit profile with Scenario Outline
    When The user logs in using "<email>" and "<password>"
    And The user navigates to "<add info module>"
    And The user select status "<status info>"
    And The user sliders the slider "<handleNumber>"
    And The user add "company" "<company info>"
    And The user add "website" "<website info>"
    And The user add "location" "<location info>"
    And The user add "skills" "<skills info>"
    And The user add "githubusername" "<github info>"
    And The user add "bio" "<bio info>"
    Then The user click on submit button
    Examples:
      | email                     | password    | add info module | status info         | handleNumber | company info   | website info                  | location info | skills info                      | github info  | bio info      |
      | eurotech@gmail.com        | Test12345!  | Edit Profile    | Instructor          | 5            | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber, Junit            | eurotech2022 | SDET Eurotech |
      | studentB5@ets.com         | studentB5   | Edit Profile    | Manager             | 6            | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber                   | eurotech2022 | SDET Eurotech |
      | developerB5@ets.com       | developerB5 | Edit Profile    | Senior Developer    | 2            | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber, Junit, Github    | isamat23     | SDET Eurotech |
      | leventaydin3472@gmail.com | 4422La.     | Edit Profile    | Student or Learning | 7            | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java, Cucumber, Junit, Core Java | eurotech2022 | SDET Eurotech |

