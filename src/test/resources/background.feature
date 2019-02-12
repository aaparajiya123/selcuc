Feature: Run Background Selenium
  Background: This is a simple background
    Given I am on the home page of softpost

  Scenario: Check the title of softpage.org
    Then I should see that title contains tutorial

  Scenario: Check the source of softpage.org
    Then I should see that source contains tutorial
