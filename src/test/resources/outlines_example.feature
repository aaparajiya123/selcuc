Feature: Run outline selenium example
  Scenario Outline: Check the tile softpost.org
    Given I am on the home page of softpost <website>
    Then I verify that title contains <word>

    Examples: This is the test data
    |website                |word|
    |http://www.softpost.org|tutorial|
#    |http://www.google.co.uk|google  |

    Scenario Outline: Check that you can enter first and last name
      Given I am on the url "https://www.softpost.org/selenium-test-page/"
      Then I verify that I enter first name <firstName>
      Then I verify that I enter last name <lastName>
      When I close browser
      Examples: First and Last Name
      |firstName|lastName|
      |Ashwin|Parajiya|
      |Daxa |Parajiya|