Feature: This feature file would be creating a calculator or Add and subtract

  Background: Open the application
	@regression
  Scenario: Adding two numbers
    Given I have a calculator
    When I add 5 and 4
    Then sum should be displayed as 9
	@regression
  Scenario: subtract two numbers
    Given I have a calculator
    When I subtract 10 and 3
    Then result should be displayed as 7

  Scenario Outline: Adding two numbers using scenario Outline
    Given I have a calculator
    When I add <num1> and <num2>
    Then sum should be displayed as <res>

    Examples: 
      | num1 | num2 | res |
      |    3 |    2 |   5 |
      |   -2 |    1 |  -1 |
      |    7 |    3 |  10 |

  Scenario Outline: subtract two numbers using scenario Outline
    Given I have a calculator
    When I subtract <num1> and <num2>
    Then result should be displayed as <res>

    Examples: 
      | num1 | num2 | res |
      |    7 |    3 |   4 |

  Scenario: Adding multiple numbers using cucumber data table
    Given I have a calculator
    When I add  below numbers
      | 4 |
      | 6 |
      | 2 |
      | 7 |
    Then sum should be displayed as 19

  Scenario: Adding multiple numbers using cucumber List
    Given I have a calculator
    When I add  below numbers
      |  4 |
      |  6 |
      |  2 |
      |  7 |
      | 11 |
    Then sum should be displayed as 30
    
  Scenario: To calculate total bill of the order
  Given I have a calculator
  When I order below items
  |coffee|30|
  |tea|20|
  |pizza|200|
  Then Order total should be 250
  
  Scenario: To calculate total bill of the order
  Given I have a calculator
  When I order below items and quantity
  |coffee|1|30|
  |tea|2|20|
  |pizza|2|100|
  Then Order total should be 270
