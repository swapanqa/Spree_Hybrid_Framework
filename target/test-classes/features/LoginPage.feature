Feature: Spree login functionality - 1
Background:
   Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
  

 
 Scenario: 1.Valid user with valid password
	  Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
	  When User click login link
	  Then Browser display Login page
	  When User enter user email as "swapanny79@yahoo.com"
	  And User enter password as "swapan"
	  And User click login button
	  Then Home page should display
	  And Login success message "Logged in successfully" display

  Scenario: 2.Invalid user with Invalid password
	  Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
	  When User click login link
	  Then Browser display Login page
	  When User enter user email as "swapanny779@yahoo.com"
	  And User enter password as "swapan"
	  And User click login button
	  Then Browser display Login page
	  And Login not success message "Invalid email or password." display
	 
	Scenario Outline: 3.Valid user with valid password Data Driven
	  Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
	  When User click login link
	  Then Browser display Login page
	  When User enter user email as "<EmailAddress>"
	  And User enter password as "<Password>"
	  And User click login button
	  Then Home page should display
	  And Login success message "Logged in successfully" display
	 Examples:
      |EmailAddress        |Password    |
      |swapanny79@yahoo.com	 |swapan |
      
	  