Feature: Login

  @release
  Scenario: Login as registered user
    Given I am registered
    When  I log in
    Then  I am successfully logged in

  Scenario: Login with wrong password
    Given I am registered
    When  I log in with wrong password
    Then  error message appears