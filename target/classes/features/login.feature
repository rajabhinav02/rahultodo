Feature: logging in to the application
Scenario: log in to the application
	Given user is on login page
	When user enters the following details
	|raj.abhinav02@gmail.com|Abhinav@2k21|
	And user clicks on login button
	Then user should move to homepage