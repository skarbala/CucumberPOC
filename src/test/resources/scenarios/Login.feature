Feature: Login
  Scenario: Login as registered user
    Given I am registered
    When  I log in
    Then  I am successfully logged in