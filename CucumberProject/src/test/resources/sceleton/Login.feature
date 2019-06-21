Feature: Login Feature File
Scenario: A valid login scenario
Given The URL of demo web shop application
When User enters "kannan1@gmail.com" as username
And User enters "test1234" as password
Then User is in valid page