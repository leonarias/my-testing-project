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

- features: Cucumber Feature files are stored here. Feature files describes the scenarios to be tested using Gherking Language.
- includes: This module contains generic and speficic methods used to implement the tests. By using this approach, test scripts become more maintanable and testers can easily reuse code. A "FeatureHelpMod" file takes care of the generic methods. Other classes can be created here for specific methods used in more complex features.
- page_objects: This is the object repository. Classes are created by page, mapping all elements inside a web page. This way it's easier to mantain the location of objects.
- step_definitions: These are the actual implementation of the tests. 

I wasn't able to implement all the test cases due to time constraints but I'm sharing the complete list of test scenarios here for your reference. 

RESTful services scripts was also part of the plan. If you want me to create an specific test about that just let me know.

Thanks,
Leon 

