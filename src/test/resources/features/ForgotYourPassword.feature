Feature: Forgot your password

  Scenario: Forgot your password should return a message

    Given Am into the application homepage
    And I click the forget your password
    Then I enter a valid email
    And I click retrieve password button
    Then I get a confirmation message
