Feature: Costco sign in

@costcosignup_happypath
Scenario Outline: 
Given user visits Costco homepage
When user clicks on Sign In option 
When user types valid "<email>", "<password>"
Then user will be able to Sign in successfully

Examples: 
|email|password| 
|sara.eco38@gmail.com|Abcdef@123|               
