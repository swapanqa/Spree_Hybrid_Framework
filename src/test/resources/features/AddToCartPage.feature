Feature: Add to cart functionality
Background:
   Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display



  Scenario: 1.User Add the product to shopping cart
      When User click the bags categories link
      Then Bags categories page should display
      When User select ruby on rails bag item
      Then Ruby on rails bag page should display
      When User Select the quantity
      And Click the add to cart button
       
       
       