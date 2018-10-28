package com.spree_ecommerce.hybrid.cucumber.framework.basePage;

import org.openqa.selenium.WebDriver;

import com.spree_ecommerce.hybrid.cucumber.framework.controller.ApplicationController;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.SeleniumUtils;

public class BasePage   {
	

	protected WebDriver driver = DriverFactory.getInstance(PropertyReaderService.getInstance().getProperty("CLOUD_BROWSER")).getDriver();
	
	protected ApplicationController applicationController = null;
	
	
	public ApplicationController spreeController() {
		
		if(applicationController == null) {
			applicationController = new ApplicationController(driver);
		}
		
		return applicationController;
	}
	
	
	
   
}

