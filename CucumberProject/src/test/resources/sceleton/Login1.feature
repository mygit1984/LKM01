Feature: Login Feature file
Scenario Outline: A valid login scenario
Given The URL of demo web shop
When User enters <username> as <type> username
When User enters <password> as password
Then User is in valid page
Examples:
|username|password|type|
|kannan1@gmail.com|test1234|admin|
|kannan2@gmail.com|test1234|guest|
|kannan3@gmail.com|test1234|vendor|

