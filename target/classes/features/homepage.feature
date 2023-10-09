Feature: Home Page

@Home
Scenario Outline: User click on "<link>" button for the data structure option without login
 Given User is on homepage of DS Algo
 When User click on "<link>" for the data structure option without login
 Then User should get error message "<message>"
 
 Examples:
 |link       |							message|
 |Get Started|You are not logged in|

Scenario Outline: User select "<link>" option from the dropbox menu without login
 Given User is on homepage of DS Algo
 When User click on "<link>" from drop down menu without login
 Then User should get error message "<message>"
 
 Examples:
 |link|							message|
 |Arrays|You are not logged in|
 
 @Home
 Scenario Outline: User click on Register "<link>"
 Given User is on homepage of DS Algo
 When User click on register "<link>" button
 Then User should redirected to Register "<link>" page
 
 Examples:
 |link|
 |Register|
 
 @Home
 Scenario Outline: User click on Sign In "<link>"
 Given User is on homepage of DS Algo
 When User click on login "<link>" button
 Then User should redirected to login "<link>" page
 
 Examples:
 |link|
 |login|