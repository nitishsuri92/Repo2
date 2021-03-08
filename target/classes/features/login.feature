Feature: Free CRM Login Feature

#Without examples keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on login page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on Login button
#Then user gets error

#with examples keyword use Scenario Outline.

Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user gets error
Then close the browser

Examples: 
	| username | password |
	| naveenk | test@123 |
	| tom | test@456 |