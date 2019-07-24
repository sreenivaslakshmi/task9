# Add Customer page1
Feature: To test add customer functionality

 
  Scenario: To test the generate customer id functionality
    Given the user is in add customer page
    When The user fill in the valid customer details
    |firstName   |one         |
    |lastName    |two     |
    |emailAddress|laxmi@gmail.com|
    |address		 |delhi      |
    |phNo        |123456789    |
    And the user click the submit button
    Then the user should see the customer id generated 
    
  Scenario: To test the generate customer id functionality2
    Given the user is in add customer page
    When The user fill in the invalid customer details
    |firstName   |two       |
    |lastName    |three|
    |emailAddress|laxmigmail.com|
    |address		 |mumbai      |
    |phNo        |1549787625    |
    And the user click the submit button
    Then the user should see the error message 
   
   Scenario: To test the generate customer id functionality3
    Given the user is in add customer page
    When The user is not fill in the customer phone number
    |firstName   |test          |
    |lastName    |selenium      |
    |emailAddress|              |
    |address     |              |
    |phNo        |              |
    And the user click  submit button
    Then the user should see the popup message
    
      Scenario: To test the generate customer id functionality4
    Given the user is in add customer page
    When The user fill in the valid customer details
    |firstName   |three          |
    |lastName    |four      |
    |emailAddress|test@gmail.com|
    |address		 |bangalore     |
    |phNo        |123456789    |
    And the user click the reset button
    Then the user should see the empty fields
    