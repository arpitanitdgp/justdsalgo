Feature: User navigate to Queue data structure Page and try different operations on Queues


@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation of queue in python link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation using collections link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation using array link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click queue operations link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		

@queue 
 Scenario Outline: User navigate to queue data structure page and validate practice questions page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation of queue in python link
	Then User click practice questions link on implementation of queue in python page
	Then User validates the queue title
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation of queue in python link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window
	
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page for invalid code
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation using collections link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click implementation using array link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@queue 
 Scenario Outline: User navigate to queue data structure page and validate operations on queue page
 	Given The user is on signin page
 	When The user enter sheet "<Sheetname>" and <RowNumber> 
  And  click login button 
	When User click Get Started button for the queue card 
	Then User should redirected to queue page 
	When User click queue operations link
	And  User click Try Here button
	Then User should be redirected to try Text Editor page
	When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
	
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		