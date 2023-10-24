Feature: User navigate to Tree data structure Page and try different operations on Trees


@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click overview of trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click overview of trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		

@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click terminologies link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click terminologies link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click types of trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
	
	
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click types of trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click traversals illustration link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click traversals illustration link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
	
	
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
			
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click types of binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click types of binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click implementation in python trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click implementation in python trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click binary trees traversals link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click binary trees traversals link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click implementation of binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click implementation of binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click applications of binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click applications of binary trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click binary search trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click binary search trees link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click implementation of bst link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@tree 
 Scenario Outline: User navigate to tree data structure page and validate operations on tree page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the tree card 
	Then User should redirected to tree page 
	When User click implementation of bst link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@tree
Scenario Outline: User navigate to graph data structure page and and trying to sign out
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the tree card 
		Then User should redirected to tree page
		When User click signout button
		Then User is redirected to home page
		
Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		