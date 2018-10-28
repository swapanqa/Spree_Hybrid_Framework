package com.spree_ecommerce.hybrid.cucumber.framework.steps;


import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BasePage {
	
	@When("^User click login link$")
	public void user_click_login_link() {
		spreeController().homePage().goToLoginPage();;
	}
	
	@Then("^Browser display Login page$")
	public void browser_display_login_page() {
		spreeController().loginPage().verifyLoginTitle();
	}
	
	@When("^User enter user email as \"([^\"]*)\"$")
	public void user_enter_user_email_as(String email) {
		spreeController().loginPage().emailText(email);
	}
	
	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password ) {
		spreeController().loginPage().passwordText(password);
	}
	
	@When("User click login button")
	public void user_click_login_button() {
		spreeController().loginPage().loginClick();
	}

	
	@Then("^Login success message \"([^\"]*)\" display$")
	public void login_success_message_display(String expectedMessage) {
		spreeController().loginPage().loginSuccessMessageDisplay(expectedMessage);
	}
	

    @Then("^Home page should display$")
    public void home_page_should_display()  {
        spreeController().homePage().verifyHomePageTitle();
}

   @Then("^Login not success message \"([^\"]*)\" display$")
   public void login_not_success_message_display(String mess)  {
      spreeController().loginPage().loginNotSuccessMessage(mess);
}	
	
}
