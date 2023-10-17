Feature: User navigate to List data structure Page and try different operations on List


@list  
 Scenario Outline: User navigate to linked list data structure page and validate Introduction link page
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click introduction link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
  
  
  @list
  Scenario Outline: User navigate to linked list data structure page and validate creating linked list page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page 
		When User click creating link list link
		And  User click Try Here button 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		

@list
Scenario Outline: User navigate to linked list data structure page and validates types of linked list link page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page 
		When User click types of linked list link
		And  User click Try Here button 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |

@list
Scenario Outline: User navigate to linked list data structure page and validates implement linked list link in python page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page 
		When User click implement linked list in python link
		And  User click Try Here button 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |

		
@list
Scenario Outline: User navigate to linked list data structure page and validates traversal link page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page 
		When User click traversal link
		And  User click Try Here button 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		

@list
Scenario Outline: User navigate to linked list data structure page and validates insertion link page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page 
		When User click insertion link
		And  User click Try Here button 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		

@list
Scenario Outline: User navigate to linked list data structure page and validates deletion link page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page 
		When User click deletion link
		And  User click Try Here button 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@list
Scenario Outline: User navigate to linked list data structure page and validates practice questions page
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for the list card 
		Then User should redirected to linked list page
		When User click introduction link 
		Then User click practice questions link
		Then User validates the title
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@list
Scenario Outline: User validates error message for Introduction in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click introduction link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |

		
@list
Scenario Outline: User validates error message for Creating link list in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click creating link list link
	And  User click Try Here button 
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		

@list		
Scenario Outline: User validates error message for types of link list in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click types of linked list link
	And  User click Try Here button  
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		

@list
Scenario Outline: User validates error message for implement link list in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click implement linked list in python link
	And  User click Try Here button  
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@list
Scenario Outline: User validates error message for traversal link list in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click traversal link
	And  User click Try Here button  
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
	
		
@list
Scenario Outline: User validates error message for insertion link list in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click insertion link
	And  User click Try Here button  
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@list
Scenario Outline: User validates error message for deletion link list in try editor page for invalid code
  Given The user is on signin page
  When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for the list card 
	Then User should redirected to linked list page 
	When User click deletion link
	And  User click Try Here button  
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		