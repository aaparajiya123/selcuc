Feature: Parameters example
  @sanity @regression
  Scenario: Check the title of website softpost
    Given I am on the home page of the "http:\\www.softpost.org"
    Then I verify tht title contains "tutorial"


#  Scenario: Check the title of website google
#    Given I am on the home page of the "http:\\www.google.co.uk"
#    Then I verify that title contains page "Google"