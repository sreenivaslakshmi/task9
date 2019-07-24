#Author: your.email@your.domain.com

Feature: To test add tariff plan functionality
  
  Scenario Outline: To verify the success message
    Given The user is in add tariff plan page
    When the user fill in the valid tariff plan details "<monthRent>","<freeLocal>","<freeRent>","<freeSms>","<localCharges>","<interCharges>","<smsCharges>"
    And the user clicks the submit button
    Then the user should see the success message

    Examples: 
      | monthRent| freeLocal |freeRent  |freeSms|localCharges|interCharges|smsCharges|
      | 1040      |        200 |300        |801      |  500       |501          |2200   |
      | 5021      |     5052   |1401       |5502     |  6503      |1502         |4802   |
      |1245       |12456       |1278       |  4578   |25487       |2458         |12456  |