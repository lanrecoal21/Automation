@ignore
Feature: Create New User

  Scenario: Verify that new user can create account

    Given I am on the application homescreen
    When I click the signIn link
    And I enter My email address to create an account
    And I click the Create account button
    And I select my gender
    When I enter all mandatory information
    And I click the register button
    Then my Account should be successfully created