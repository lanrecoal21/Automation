@ValidLogin
Feature: Valid Login

  Scenario Outline: Login multiple users at the same time

    Given I am on the homepage
    And I click the signIn
    When I enter my user email "<email>" address
    And I enter my user password "<password>" detail
    When I click the login button
    Then I should be logged in successfully

    Examples:
    |email                         |password      |
    |blessingosakue540@outlook.it  |automation    |
    |lanre.ikuesan659@gmail.com    |automation    |
    |lanre.ikuesan857@gmail.com    |automation    |