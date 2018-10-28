package com.spree_ecommerce.hybrid.cucumber.framework.steps;


import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpPageSteps extends BasePage {
	
	@When("^User click on login button$")
	public void user_click_on_login_button()  {
		spreeController().homePage().goToLoginPage();
	}
	@Then("^Spree login Page should display$")
	public void spree_login_Page_should_display()  {
		spreeController().loginPage().verifyLoginTitle();
	}
	
	@When ("^User click on create a account button$")
	public void user_click_on_create_a_account_button() {
		spreeController().loginPage().goToCreateAccountPage();
	}
	
	@Then ("^Signup page should display$")
	public void signup_page_should_display() {
		spreeController().signUpPage().signUpPageTitle();	
	}
	
	@When ("^User put email address as \"([^\"]*)\"$")
	  public void user_put_email_address_as(String email) {
		spreeController().signUpPage().emailBox(email);  
	  }
	  
	@When ("^User put password as \"([^\"]*)\"$") 
	public void user_put_password_as(String password) {
		spreeController().signUpPage().passwordBox(password);
	}
	
   @When ("^User put confirm Password as \"([^\"]*)\"$")
   public void user_put_confirm_password_as(String confirmpassword) {
	   spreeController().signUpPage().confirmPasswordBox(confirmpassword);
   }
   
   @When ("^User click on create account button$")
   public void user_click_on_create_account_button() {
	   spreeController().signUpPage().createAccount();  
   }
   
   @Then("^SignUp successful massage should display as \"([^\"]*)\"$")
   public void signup_successful_massage_should_display_as(String arg1)  {
	 spreeController().signUpPage().signUpSuccessfulMessage(arg1);
       
   }
   
  
   
   
}
