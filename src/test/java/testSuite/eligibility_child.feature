#Author: Laxmi

@nhstesting
Feature: To check the child below 19 is eligible for NHS cost

  @start
	Scenario: check the start button
	Given user is on the NHS portal 
	When click start button
	Then country selection page is displayed
	
	@country
	Scenario: to select the country lives in 
	Given user is on country page
	When select wales click next
	Then date of birth page is displayed
	
	@dob
	Scenario Outline: to enter date of birth 
	Given user is on date selection page
	When enter date of birth <day> and <month> and <year> and click next
	Then education selection page is displayed
	Examples:
	|day|month|year|
	|06|05|2004|
	
	@edu
	Scenario: to select the full time education details 
	Given user is on education page
	When select no click next
	Then live with partner page is displayed
	
	@partner
	Scenario: to select lives with partner or not
	Given user is on select partner page 
	When select no click next
	Then claim any benefits page is displayed 
	
	@claimbenefit
	Scenario: to select claim any benefit
	Given user is on claim benifit page
	When select no click next
	Then pregancy details page is displayed
	
	@pregnant
	Scenario: to select pregnancy or give birth
	Given user is on pregnancy selection page
	When select no click next
	Then injury or illness page is displayed
	
	@injury
	Scenario: to select illness or injury details
	Given user is on injury or illness selection page
	When select no click next
	Then diabetes page is displayed
	 
	@diabetes
	Scenario: to select diabetes details
	Given user is on diabetes selection page
	When select no click next
	Then glaucoma page is displayed
	
	@glaucoma
	Scenario: to select glaucoma details
	Given user is on glaucoma selection page
	When select no click next
	Then care home page is displayed
	 
	@carehome
	Scenario: to select carehome details
	Given user is on carehome selection page
	When select no click next
	Then investments or property page is displayed
	
	@investment
	Scenario: to select investment property details
	Given user is on investment selection page
	When select no click next
	Then display the final eligibility status page 
