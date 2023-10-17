Feature: User navigate to Stack data structure Page and try different operations on Stack


@stack 
 Scenario Outline: User navigate to Stack list data structure page and validate operations in stack page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the stack card 
	Then User should redirected to stack page 
	When User click operations in stack link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
  

 @stack 
 Scenario Outline: User navigate to Stack list data structure page and validate implementation in stack page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the stack card 
	Then User should redirected to stack page 
	When User click implementation link on stack page
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		

@stack 
 Scenario Outline: User navigate to Stack list data structure page and validate applications in stack page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the stack card 
	Then User should redirected to stack page 
	When User click applications link on stack page
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
  

@stack  
Scenario Outline: User navigate to stack data structure page and validates practice questions page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the stack card 
		Then User should redirected to stack page
		When User click implementation link on stack page 
		Then User click practice questions link on implementation page
		Then User validates the stack title
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
  
  
@stackinvalid 
Scenario Outline: User navigate to Stack list data structure page and validate operations in stack page for invalid code
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the stack card 
		Then User should redirected to stack page
		When User click operations in stack link 
		And  User click Try Here button
		Then User should be redirected to try Text Editor page
		When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should get error message alert window
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		

@stackinvalid 
Scenario Outline: User navigate to Stack list data structure page and validate implementation in stack page for invalid code
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the stack card 
		Then User should redirected to stack page
		When User click implementation link on stack page
		And  User click Try Here button
		Then User should be redirected to try Text Editor page
		When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should get error message alert window
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@stack 
Scenario Outline: User navigate to Stack list data structure page and validate applications link in stack page for invalid code
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the stack card 
		Then User should redirected to stack page
		When User click applications link on stack page
		And  User click Try Here button
		Then User should be redirected to try Text Editor page
		When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should get error message alert window
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |