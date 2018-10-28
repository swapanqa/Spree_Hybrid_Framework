Feature: Spree signup page funtionalities
  Background:
   Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
    When User click on login button
    Then Spree login Page should display
    

    Scenario: 1.Create an account with valid email and password
      When User click on create a account button
      Then Signup page should display
      When User put email address as "babulinux12@gmail.com"
      And User put password as "2345671"
      And User put confirm Password as "2345671" 

      And User click on create account button
      
      Then SignUp successful massage should display as "Welcome! You have signed up successfully." 
