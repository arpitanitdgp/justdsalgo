Feature: User navigate to Array data structure Page and try different operations on Arrays


 @array1
 Scenario Outline: User navigate to Array data structure page and try print valid python code
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for Array card 
		Then User should redirected to Array page 
		When User click arrays in python link
		And  User click Try Here button
		Then User should be redirected to try Text Editor page
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully 
 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
  
  
 @array2
 Scenario Outline: User navigate to Array data structure page and try practice questions
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for Array card 
		Then User should redirected to Array page 
		When User click arrays in python link
		Then User navigate to practice search the array question
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         4 |
		
 @array3
 Scenario Outline: User navigate to Array data structure page and try print invalid python code
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for Array card 
		Then User should redirected to Array page 
		When User click arrays in python link
		And  User click Try Here button
		Then User should be redirected to try Text Editor page
		When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should get error message alert window

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		

@array4
 Scenario Outline: User navigate to Array data structure page and try practice questions with invalid code
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for Array card 
		Then User should redirected to Array page 
		When User click arrays in python link
		Then User navigate to practice search the array question
		When User enter invalid python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should get error message alert window

 
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |