Feature: Spree home page functionality


  Scenario:
   Given Not a validated user
   When User browse to the site
   Then Spree home page should display
   And All links are not broken
    
   