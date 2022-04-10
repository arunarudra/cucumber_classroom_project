Feature: This feature would be used to check the login functionality

  Background: open the Application
    Given I have opened the application in browser
	@sanity
  Scenario: Validate the successful Login
    When I click on the Login link
    And I enter username "aruna.rudra76@gmail.com"
    And I enter password "Nonewp@55word"
    And I click on the login Button
    Then I should be Landed on the home page
    

  Scenario Outline: Validate login functionality with multiple data
    When I click on the Login link
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login Button
    Then I should be Landed on the home page
    

    Examples: 
      | UserName                | Password      |
      | abc@gmail.com           | Pqrst123@     |
      | aruna.rudra76@gmail.com | N0newp@55word |

	@regression @rapid
  Scenario: Validate the Negative Login
    When I click on the Login link
    And I enter username "aruna123.rudra76@gmail.com"
    And I enter password "Nonewp@55word"
    And I click on the login Button
    Then I should get the error message "The email or password you have entered is invalid."
    
