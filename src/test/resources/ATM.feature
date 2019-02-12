Feature: ATM card feature

  Scenario: Enter correct PIN at ATM
    Given I insert the ATM card in ATM machine
    And I am asked to enter the PIN
    When I enter the correct PIN
    Then I should be able to see option to withdraw money
    Then I withdraw money

  Scenario: Enter wrong PIN at ATM
    Given I insert the ATM card in ATM machine
    And I am asked to enter the PIN
    When I enter the correct PIN
    Then I should not be able to see option to withdraw money