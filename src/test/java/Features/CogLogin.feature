Feature: Login page features

@LoginTest
Scenario: Validate Successful login in page

Given user lunch site url
When user enter correct username and password
And user click on login button
Then validate successful login 
Given user click on update profile button
When user click on update resume button
And user upload select resume from system
Then validate successful updation



