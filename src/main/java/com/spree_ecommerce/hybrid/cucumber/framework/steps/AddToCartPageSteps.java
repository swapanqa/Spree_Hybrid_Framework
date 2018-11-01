package com.spree_ecommerce.hybrid.cucumber.framework.steps;


import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartPageSteps extends BasePage {
	
	

     @When("^User click the bags categories link$")
     public void user_click_the_bags_categories_link() {
    	 spreeController().homePage().goToBagsPage();
     }
     
    @Then("^Bags categories page should display$")
    public void bags_categories_page_should_display() {
    	spreeController().cartPage().verifyBagsPageTitle();
    }
     
     @When("^User select ruby on rails bag item$")
     public void user_select_buby_on_rails_bag_item() {
    	 spreeController().cartPage().selectProduct();
     }
     
     @Then("^Ruby on rails bag page should display$")
     public void buby_on_rails_bag_page_should_display() {
    	 spreeController().cartPage().rubybagPageTitle();
     }
     
     @When("^User Select the quantity$")
     public void user_select_the_quantity() {
    	 spreeController().cartPage().selectProductQuantity("2");
     }
     
     @When("^Click the add to cart button$")
     public void click_the_add_cart_button() {
    	 spreeController().cartPage().addToCartButton();
     }
     

}
