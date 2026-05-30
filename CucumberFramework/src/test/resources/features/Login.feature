@Smoke
Feature: Login Functionality

Background:

Given User launches browser
And User opens login page

@Regression
Scenario: Valid Login

When user enters username "Admin"
And user enters password "admin123"
And clicks on login button
Then user should navigate to dashboard

@Sanity
Scenario: Invalid Login

When user enters username "Admin"
And user enters password "wrongPassword"
And clicks on login button
Then error message should display