Feature: facebook  login 


@P1 
Scenario Outline: login with right user and wrong password 
	Given I enter Username as "<username>" 
	Then I enter Password as "<pass>" 
	Then clickon "loginbutton" 
	Then error "errormessage"
	
	
	Examples: 
		|username|pass|
		|fredoz0999@gmail.com|123456|
		|pnt@gmail.com|9999999|
		|fdaa@gmail.com|111111|
		