@test
Feature: Test the APIs and check the data is correctly displayed

  Scenario: Validate user can be created
    Given user invoke the api for users
    When the user will get 201 response
    Then user will see all the users

  Scenario Outline: Validate all users get retrieved
    Given user invoke the api for "<page>"
    When the user will get 200 response for users "<page>"
    Then user will see all the users "<page>"
    Examples:
      | page |
      |1|

  Scenario Outline: Validate user can be updated
    Given user invoke the api for update "<user>"
    When the user will get update 200 response "<user>"
    Then user will see the updated "<user>"
    Examples:
      |user|
      |2|