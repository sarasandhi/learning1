Feature: Validate Costco sign in

@negative_path

Scenario Outline:
Given user visit Costco homepage 
When user click on Sign In and type invalid ‘’<email>” , valid ‘’<password >’’
Then user click on sign in 


Examples:

|email|password|
|mona#@gmail.com|xyz@123|
