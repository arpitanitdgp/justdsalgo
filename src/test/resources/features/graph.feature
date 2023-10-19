Feature: User navigate to Graph data structure Page and try different operations on Graphs


@graph 
 Scenario Outline: User navigate to graph data structure page and validate operations on graph page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the graph card 
	Then User should redirected to graph page 
	When User click graph link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		

@graph 
 Scenario Outline: User navigate to graph data structure page and validate operations on graph page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the graph card 
	Then User should redirected to graph page 
	When User click graph link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
	
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@graph 
 Scenario Outline: User navigate to graph data structure page and validate operations on graph page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the graph card 
	Then User should redirected to graph page 
	When User click graph representations link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@graph 
 Scenario Outline: User navigate to graph data structure page and validate operations on graph page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the graph card 
	Then User should redirected to graph page 
	When User click graph representations link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window  
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		

@graph		
Scenario Outline: User navigate to graph data structure page and validates practice questions page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the graph card 
		Then User should redirected to graph page
		When User click graph link 
		Then User click graph practice questions link
		Then User validates the graph practice ques title
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |


@graph
Scenario Outline: User navigate to graph data structure page and and trying to sign out
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the graph card 
		Then User should redirected to graph page
		When User click signout button
		Then User is redirected to home page
		
Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |