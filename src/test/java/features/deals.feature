Feature: Free CRM Deal Feature

#Without examples keyword
Scenario: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
| naveenk | test@123 |
Then user clicks on Login button
Then user is on home page
Then user moves to new deals page
Then user enters deals details
| test deal | 1000 | 50 | 10 |
Then close browser