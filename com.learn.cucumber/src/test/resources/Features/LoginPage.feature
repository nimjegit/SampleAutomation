#Author: vinanimje
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions/describe the user actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login page feature
  I want to use this template for my feature file

  @LoginpageTitle
  Scenario: Login page Title
    Given User is on the login page
    When user is on the login page
    Then page title should be " "

  @Resetpasswordlink
  Scenario: Forgot password link
    Given User is on the login page
    Then forgot password link should be displayed
	
	@loginvalidcredentials
 	Scenario: Login with correct credentials
 	Given User is on the login page
 	When user enters username "abc@test.com"
 	And user enters password "Test@1234"
 	And user clicks on Login button
 	Then user should be logged in successfully
 	Then title of the page should be "My Account"
 	
