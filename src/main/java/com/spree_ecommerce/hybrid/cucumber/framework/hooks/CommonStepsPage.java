package com.spree_ecommerce.hybrid.cucumber.framework.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonStepsPage extends BasePage {
	

	protected WebDriver driver = DriverFactory.getInstance(PropertyReaderService.getInstance().getProperty("BROWSER")).getDriver();
	
	

	@Before
	public void setUp() {
		
         DriverFactory.getInstance().getDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		
		DriverFactory.getInstance().removeDriver();
		DriverFactory.getInstance().getDriver();
	}
	
	
	
	

}
