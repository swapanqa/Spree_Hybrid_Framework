package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;


import org.junit.Test;

import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;

import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;



public class LoginPageTest extends CommonStepsPage{
	

	
	
	
	@Test
	
	public void test() {
	
		spreeController().homePage().browseToTheSite();
		spreeController().homePage().goToLoginPage();
		spreeController().loginPage().verifyLoginTitle();
		spreeController().loginPage().emailTextBoxClear();
		spreeController().loginPage().emailText(PropertyReaderService.getInstance().getProperty("EMAIL"));
		spreeController().loginPage().passwordClear();
		spreeController().loginPage().passwordText(PropertyReaderService.getInstance().getProperty("PASSWORD"));
		spreeController().loginPage().loginClick();
		spreeController().loginPage().loginSuccessMessageDisplay("Logged in successfully");
	    spreeController().loginPage().logoutClick();
		spreeController().loginPage().logoutSuccessMessageDisplay("Signed out successfully.");
	}
	
	
	
	
	
	
	

}
