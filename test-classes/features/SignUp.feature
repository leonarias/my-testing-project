@sign_Up
Feature: Sign Up

  @web
  Scenario: Navigate to Sign Up page 
    Given user is on openweathermap current page
    When user clicks on Sign Up link
    Then Create New Account page is displayed
    
  @create_user
  Scenario: Submit form using valid data
    Given user is on openweathermap current page
    When user clicks on Sign Up link
    And I submit the form with valid data
    |Fields|Value|
    |Username  |Matt Heafy|
    |Email|matt1425387545894@mail.com|
    |Password|12345678     |
    |Repeat Password  |12345678|
    Then I check that the form has been submitted
    
  @negative_test
  Scenario: Form data is wrong, new account can't be created 
    Given user is on SignUp page
    When user submits the form with blank data
    Then error messages are displayed correctly  
    