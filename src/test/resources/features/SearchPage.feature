Feature: Spree search box functionality
  Background:
   Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
  
  
  Scenario: 1.Valid search in the search box
    When User type in the search box as "shirt"
    And User click the search button
    Then Searched product page should dispaly 
