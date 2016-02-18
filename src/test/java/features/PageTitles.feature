@titles
Feature: Check the Page Titles from some of the links from bottom page.

  Scenario: Check the page title for Home Page
    Given I am on openweathermap current page
    When I navigate to "Find your city"
    Then I check the page title is "find"
    And I close the browser

  Scenario: Check the page title for Weather Page
    Given I am on openweathermap current page
    When I navigate to "Examples of OpenWeatherMap weather map layers"
    Then I check the page title is "Web maps"
    And I close the browser

@important
  Scenario: Check the page title for API Page
    Given I am on openweathermap current page
    When I navigate to "How to connect your weather station"
    Then I check the page title is "stations"
    And I close the browser

  Scenario: Check the page title for Price Page
    Given I am on openweathermap current page
    When I navigate to "Price of service and support"
    Then I check the page title is "Weather API Price-list"
    And I close the browser

  Scenario: Check the page title for Stations Page
    Given I am on openweathermap current page
    When I navigate to "OpenWeatherMap technology"
    Then I check the page title is "Technology"
    And I close the browser

  Scenario: Check the page title for News Page
    Given I am on openweathermap current page
    When I navigate to "Terms of Service"
    Then I check the page title is "Terms"
    And I close the browser
    