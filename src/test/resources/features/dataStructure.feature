Feature:  
	User navigate to Data Structure introduction Page for selected Topics covered and click on Try Here button 

@ds 
Scenario Outline: User navigate to Data Structure introduction Page for selected Topics covered and click on Try Here button 
	Given The user is on signin page 
	When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for Data Structure Introduction card 
	Then User should redirected to Data Structure Introduction page 
	When User click Try Here button in the Data Structure Introduction page 
	Then User should be redirected to try Text Editor page 
	
	
	Examples: 
		| Sheetname | RowNumber |
		| Sheet1    |         3 |
		
		
@ds 
Scenario Outline: User enter valid and invalid python code in try text Editor 
	Given The user is on signin page 
	When The user enter sheet "<Sheetname>" and <RowNumber> 
	And  click login button 
	When User click Get Started button for Data Structure Introduction card 
	Then User should redirected to Data Structure Introduction page 
	When User click Try Here button in the Data Structure Introduction page 
	Then User should be redirected to try Text Editor page 
	When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
	Then User should get error message alert window 
			
	Examples: 
			
				| Sheetname     | RowNumber |
				| Sheet1    	  |         3 |
				
				
@ds 
Scenario Outline: User Enter valid Python code in tryEditor and click Run button
		Given The user is on signin page 
		When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for Data Structure Introduction card 
		Then User should redirected to Data Structure Introduction page 
		When User click Try Here button in the Data Structure Introduction page 
		Then User should be redirected to try Text Editor page 
		When User enter python code "<Sheetname>" in tryEditor <RowNumber> and click run button 
		Then User should see code executed successfully 
		Examples: 
					
						| Sheetname     | RowNumber |
						| Sheet1    		|         4 |
						
						
@ds 
Scenario Outline: User navigate to Data Structure Practice Question Page
		Given The user is on signin page 
		When The user enter sheet "<Sheetname>" and <RowNumber> 
		And  click login button 
		When User click Get Started button for Data Structure Introduction card 
		Then User should redirected to Data Structure Introduction page 
		When User click practice questions tab 
		Then User should redirected to practice question page 
							
		Examples: 
							
								| Sheetname     | RowNumber |
								| Sheet1    		|         3 |
	