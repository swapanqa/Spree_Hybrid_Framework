package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;

import org.junit.Test;

import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;



public class CartPageTest extends CommonStepsPage {
	
	@Test
	
	public void test() {
		
		spreeController().homePage().browseToTheSite();
		spreeController().homePage().goToBagsPage();
		spreeController().cartPage().selectProduct();
		spreeController().cartPage().selectProductQuantity("2");
		spreeController().cartPage().addToCartButton();
		spreeController().cartPage().clickCheckoutButton();
		spreeController().loginPage().existingLogin();
		spreeController().loginPage().emailText(PropertyReaderService.getInstance().getProperty("EMAIL"));
		spreeController().loginPage().passwordText(PropertyReaderService.getInstance().getProperty("PASSWORD"));
		spreeController().loginPage().loginClick();
		
		
		
		
	}
	
	

}
