Feature: Test the HomeScreen
Scenario Outline: Add the notes
	Given user is on homepage
	When user enters "<note>"
	And user clicks add button
	#Then note should get added 
	
	Examples:
	
	|note|
	|first|
	|second|
	|third|
	|fourth|