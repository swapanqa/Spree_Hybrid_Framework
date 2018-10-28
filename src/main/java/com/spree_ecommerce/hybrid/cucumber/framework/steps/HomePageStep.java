package com.spree_ecommerce.hybrid.cucumber.framework.steps;


import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep extends BasePage  {
	
	
	@Given("^Not a validated user$")
	 public void not_a_valideted_user() {
		spreeController().homePage().deleteAllCookies();
	}
	
	@When("^User browse to the site$")
	public void User_browse_to_the_Site() {
		spreeController().homePage().browseToTheSite();
	}
	

     @Then("^Spree home page should display$")
     public void spree_home_page_should_display()  {
	    spreeController().homePage().verifyHomePageTitle();
    
}
	 @Then("^All links are not broken$")
	 public void all_links_are_not_broken() {
		 spreeController().homePage().brokenLinks();
	 }
	
   
}
