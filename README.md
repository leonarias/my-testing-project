# my-testing-project
openweatherapp.org automation

Hi!

The purpose of this project is to develop a small testing framework for "openweathermap.org/current" app.

I used different tools and design techniques that I would like to describe here:

Programming Language: Java
Build tool: Maven
Test engine: jUnit
Testing frameworks, tools: Cucumber, Selenium WebDriver
Design techniques: Page Object Model, Parameter Handling via Cucumber feature files, Scenario DataTables, Scenario Hooks, Scenario Outline, Keyword-Driven framework, Java Collections, OOP, etc..

The framework consists of the below folder structure:

- features: Cucumber Feature files are stored here. Feature files describe the scenarios to be tested using Gherking Language.
- includes: This module contains generic and speficic methods used to implement the tests. By using this approach, test scripts become more maintanable and testers can easily reuse code. A "FeatureHelpMod" file takes care of the generic methods. Other classes can be created here for specific methods used in more complex features.
- page_objects: This is the object repository. Classes are created by page, mapping all elements inside a web page. This way it's easier to mantain the location of objects.
- step_definitions: These are the actual implementation of the tests. 

"RunCukeTests.java" (aka Cucumber runner class) controls the test execution. Tags can be used for single script execution or execution of the whole suite. Tags need to be added inside the scenario files. You can create test suites with this option. Examples: tags = "@negative_test", tags = "@sign_Up".


I wasn't able to implement all the test cases due to time constraints but I'm sharing the list of test scenarios here for your reference.

RESTful services scripts was also part of the plan. If you want me to create an specific test about that just let me know.


Thanks!,
Leon 

***********
TEST CASES:
***********
Scenario: Click on Weather in your city

Objective: Screen with some links will be displayed, links will take you to the page
where weather is described. Weather information will be displayed in a table, incluiding: wind, cloudines, pressure, 
humidity, sunrise, sunset and geo coords. Next days Weather information will be dsplayed in a list.
Tabs Main, Daily, Hour, Chart, Map and satelite will be available


Expected results: Link with the weather of the city selected will be displayed correctly

_________________________

Scenario: Weather in your city - Main - Next hours

Objective: Follow the line across the hours and verify the information in each point is displayed: Hour, 
Precipitation, Temperature

Expected results: Weather information should be displayed for each hour

_____________________
Scenario: Weather in your city - Hourly tab

Objective: Verify Hourly tab is displaying the weather information

Expected results:Verify the information is displayed


______________________

Scenario: Weather in your city - Chart  - Temperature

Objective: Follow the line across the days and verify the information in each point is displayed: Temperature

Expected results: Weather information should be displayed for each point


_________________________

Scenario: Weather in your city - Chart  - Wind

Objective: Follow the line across the days and verify the information in each point is displayed: Temperature

Expected results: Weather information should be displayed for each point


_________________________
Scenario: Weather in your city - Chart - Pressure

Objective: Follow the line across the days and verify the information in each point is displayed: Temperature

Expected results: Weather information should be displayed for each point


_________________________
Scenario: Weather in your city - Chart  - Precipitation

Objective: Follow the line across the days and verify the information in each point is displayed: Temperature

Expected results: Weather information should be displayed for each point


_________________________

Scenario: Weather in your city - Map

Objective:  Map should be displayed highlighting precipitation zones, user should be able to navigate
through the map

Expected results: Map should be displayed and able to navigate on it


_________________________
Scenario: Weather in your city - Chart  - Precipitation

Objective: Follow the line across the days and verify the information in each point is displayed: Temperature

Expected results: Weather information should be displayed for each point


_________________________
Scenario: Weather in your city - Satelite

Objective: Click on Satelite tab and several pictures will be displayed with their corresponding link , which 
will take the user to the satelite view of the city

Expected results: Pictures of satelite view will be displayed

_________________________
Scenario: Weather in your city - Your city name Search

Objective: Introduce the name of other city to verify the weather and click on Search

Expected results:Objective: Screen with some links will be displayed, links will take you to the page
where weather is described. Weather information will be displayed in a table, incluiding: wind, cloudines, pressure, 
humidity, sunrise, sunset and geo coords. Next days Weather information will be dsplayed in a list


_________________________
Scenario: OpenWeatherMap

Objective: Verify next info is displayed:
Field to enter city name, information of the last city searched is displayed(current temperature, graphic for temperature next hours, 
map to navigate

Expected results: Page is displayed with information from the last city searched

_________________________
Scenario: Home

Objective: Verify next info is displayed:
Field to enter city name, information of the last city searched is displayed(current temperature, graphic for temperature next hours, 
map to navigate

Expected results: Page is displayed with information from the last city searched


_________________________
Scenario: Weather


Objective:  Weather information will be displayed for the last city searched, the information will be in a tableincluiding: wind, cloudines, pressure, 
humidity, sunrise, sunset and geo coords. Next days Weather information will be dsplayed in a list. 
Tabs Main, Daily, Hour, Chart, Map and satelite will be available

Expected results: Information of last city searched will be displayed


_________________________
Scenario: Maps

Objective: Validate next 3 options will be available under the menu Maps:Weather maps, Current Satelite maps, Beautiful maps

Expected results:Sub menu for Maps is available

_________________________
Scenario: Maps - Weather maps

Objective : Verify that click on teh submenu Weather maps will display the map of the world with temperatures of the main cities,
clicking on the city will display table with more detailed information about the weather

Expected results: Map is displayed and is able to navigate

_________________________


Scenario: Maps - Current satellite maps

Objective : Verify that click on teh submenu Current Satellite maps will display the satellite view of the world

Expected results: Map is displayed and is able to navigate

_________________________

Scenario: Maps - Beautiful maps

Objective : Verify that click on teh submenu Beautifil maps will display in a new tab the satellite view of different weathers in the world,
clickin on the images will take you to the view of the place with that weather

Expected results: Images from differents weathers are displayed with links to verify places with that weather

_________________________
Scenario: Price

Objective: Click on Price tab and verify the table with price information is displayed

Expected results: Information is displayed correctly

_________________________
Scenario: Stations

Objective: Click on Station tab and verify  information is displayed


Expected results:

_________________________
Scenario: News

Objective: Click on News tab and verify  information is displayed
Verify next links are available: Twiter and Facebook and the most popular list and the links to the news


Expected results: Page with link to the news is displayed correctly


_______________________

Scenario: Sign In

Objective:  Enter name and password and click in submit

Expected results: Page for the profile entered is displayed

_________________________

Scenario: Sign in - Create an account

Objective:  Enter username, mail, password and repeat password, click on agreement and click on Create Account

Expected results: Account will be created if information entered is valid, password should be 8 chars. Screen will be displayed after account is created
to fill next information: fullname, password and confir password. Buttons Save, Reset APPID and Change password  are available


_________________________


Scenario: Sign up

Objective:  Enter username, mail, password and repeat password, click on agreement and click on Create Account

Expected results: Account will be created if information entered is valid, password should be 8 chars. Screen will be displayed after account is created
to fill next information: fullname, password and confir password. Buttons Save, Reset APPID and Change password  are available


_________________________

Scenario: Sign in

Objective:  Verify next tabs are available: My weather station, my services, my payments and billing plans

Expected results: Tabs are available in User profile

_________________________

Scenario: Sign in - Billing plans

Objective: Verify plans are displayed and buttons Suscribe are available

Expected results: Plans are displayed and buttons Suscribe are available in each line
_________________________

API Testing: Due to time constraints i couldn't create test scripts/scenarios for this. I have experience working with SoapUI tool and RESTful services. If you want me to create some scripts for that please let me know.


