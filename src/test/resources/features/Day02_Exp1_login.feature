@Login @smoke
Feature: Eurotech log in Text
  #Agile Story: As a user, I should be able to log in so I can see my account
  Background:
    Given the user in on the login page

@Teacher @Eurotech
Scenario: login as a teacher

  When The user enters teacher credentials
  Then The user schould be able to login
@Student
Scenario: login as a student

  When The user enters student credentials
  Then The user schould be able to login
@Developer @Eurotech
Scenario: login as a developer

  When The user enters developer credentials
  Then The user schould be able to login
