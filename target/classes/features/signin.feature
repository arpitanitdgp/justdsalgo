Feature: SignIn Page

@invalidlogintest
Scenario Outline: User on login page and login with invalid inputs from Excel "<Sheetname>" and 
   <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    And click login button
    Then User get error message


    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      

@validlogintest
Scenario Outline: User on login page and login with valid inputs from Excel "<Sheetname>" and 
   <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    And click login button
    Then User get logged in message


    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         3 |