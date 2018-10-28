package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;

import org.junit.Test;

import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;



public class CheckoutAddressPageTest extends CommonStepsPage {
	
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
			spreeController().checkoutPage().firstNameTextbox(PropertyReaderService.getInstance().getProperty("FIRST_NAME"));
			spreeController().checkoutPage().lastNameTextbox(PropertyReaderService.getInstance().getProperty("LAST_NAME"));
			spreeController().checkoutPage().streetAddressTextbox(PropertyReaderService.getInstance().getProperty("ADDRESS_TEXTBOX"));
			spreeController().checkoutPage().cityTextbox(PropertyReaderService.getInstance().getProperty("CITY_TEXTBOX"));
			spreeController().checkoutPage().countryTextbox(PropertyReaderService.getInstance().getProperty("COUNTRY_TEXTBOX"));
			spreeController().checkoutPage().stateTextbox(PropertyReaderService.getInstance().getProperty("STATE_TEXTBOX"));
			spreeController().checkoutPage().zipCodeTextbox(PropertyReaderService.getInstance().getProperty("ZIP_NUM"));
		    spreeController().checkoutPage().phoneTextbox(PropertyReaderService.getInstance().getProperty("PHONE_NUM"));
			spreeController().checkoutPage().shippingCheckbox();
			spreeController().checkoutPage().clickSaveButton();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	
	
	
	
	
	
	
	

}
