Feature: Run Selenium Scenario

  Scenario: Check the title of softpost.org
    Given I am on the home page of softpost
    Then I should see that title contains tutorial
