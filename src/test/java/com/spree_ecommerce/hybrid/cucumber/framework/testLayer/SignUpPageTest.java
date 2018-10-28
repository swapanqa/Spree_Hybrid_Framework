package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;

import org.junit.Test;


import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;

public class SignUpPageTest extends CommonStepsPage {
	
	@Test
	
	public void test() {
		
		spreeController().homePage().browseToTheSite();
		spreeController().homePage().goToLoginPage();
		spreeController().loginPage().goToCreateAccountPage();
		spreeController().signUpPage().signUpPageTitle();
		spreeController().signUpPage().emailBox(PropertyReaderService.getInstance().getProperty("EMAILBOX"));
		spreeController().signUpPage().passwordBox(PropertyReaderService.getInstance().getProperty("PASSWORDBOX"));
		spreeController().signUpPage().confirmPasswordBox(PropertyReaderService.getInstance().getProperty("CONFIRMPASSWORD"));
		spreeController().signUpPage().createAccount();
		spreeController().signUpPage().signUpSuccessfulMessage("Welcome! You have signed up successfully.");
		
	}
	
	
	
	
	

}
