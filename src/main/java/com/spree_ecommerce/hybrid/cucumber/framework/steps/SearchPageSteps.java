package com.spree_ecommerce.hybrid.cucumber.framework.steps;


import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageSteps extends BasePage {
	
	 @When ("^User type in the search box as \"([^\"]*)\"$")
	 public void user_type_in_the_search_box_as(String item) {
		 spreeController().search().searchBoxText(item);
	 }
	
	@When ("^User click the search button$")
	public void user_click_the_search_button() {
		spreeController().search().searchButtonClick();	
	}
	@Then("^Searched product page should dispaly$")
	public void searched_product_page_should_dispaly() {
		 spreeController().search().varifySearchTitel();
	   
	}
	
	
	

}
