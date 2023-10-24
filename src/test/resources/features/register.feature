Feature: User is on Register page and validate the fields "usename","password",and "password confirmation" with valid/invalid data

@register
Scenario Outline: User click on register button with username and password fields empty
Given New user is on Register page
When User enters username "<Sheetname>" and password <RowNumber> both as blank
And User click on register button
Then User should get error message for blank field


 Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         0 |
      
 
@register
Scenario Outline: User click on register button with user name but empty password
Given New user is on Register page
When User enter username "<Sheetname>" and password <RowNumber> as blank
And  User click on register button
Then User should get error message for blank field

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         1 |
      

@register 
Scenario Outline: User click on register button with user name and password and confirm password as blank
Given New user is on Register page
When  User enter username "<Sheetname>" and password <RowNumber> but confirm password as blank
And   User click on register button
Then  User should get error message for blank field

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         2 |
      

@register
Scenario Outline: User enter username and password less than 8 chars
Given New user is on Register page
When  User enter username "<Sheetname>" and password <RowNumber> less than 8 chars
And   User click on register button
Then  User should get mismatch error message

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         3 |
      


@register
Scenario Outline: User click on register button with password with only numeric value
Given New user is on Register page
When User enter username "<Sheetname>" and password <RowNumber> with numeric value only
And User click on register button
Then User should get mismatch error message

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         4 |
 

@register
Scenario Outline: User click on register button with user name as blank and password and confirm password with valid values
Given New user is on Register page
When  User enter username "<Sheetname>" as blank and password <RowNumber> with valid value
And   User click on register button
Then  User should get error message for blank field

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         5 | 
      

@register
Scenario Outline: User click on register button with user name and different password and confirm password
Given New user is on Register page
When User enter username "<Sheetname>" and different password <RowNumber> and confirm password
And User click on register button
Then User should get mismatch error message

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         6 | 
      
      
@register
Scenario Outline: User click on register button with valid user name and password and confirm password
Given New user is on Register page
When User enter valid username "<Sheetname>" and password <RowNumber> and confirm password
And User click on register button
Then User should be logged in successfully

Examples: 
      | Sheetname      |  RowNumber|
      | Sheet1         |         7 | 