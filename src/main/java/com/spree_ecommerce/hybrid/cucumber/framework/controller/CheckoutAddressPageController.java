package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.CheckoutAddressPageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.SeleniumUtils;


public class CheckoutAddressPageController extends BasePage {
	
	private WebDriver driver = null;
	SeleniumUtils utils ;
	
	public CheckoutAddressPageController(WebDriver driver) {
		this.driver = driver;
	}

	
	public void firstNameTextbox(String firstName) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getFirstName());
		           element.sendKeys(firstName);
		           
	}
	
	public void lastNameTextbox(String lastName) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getLastName());
		           element.sendKeys(lastName);
		           
	}
	
	public void streetAddressTextbox(String address) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getStreetAddress());
		           element.sendKeys(address);
		           
	}
	
	public void cityTextbox(String city) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getcityName());
		           element.sendKeys(city);
		           
	}
	
	public void countryTextbox(String country) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getCountryName());
		  
		Select select = new Select(element);
		select.selectByVisibleText(country);
	}
	
	public void stateTextbox(String state) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getStateName());
		
		Select select = new Select(element);
		select.selectByVisibleText(state);
	}
	
	public void zipCodeTextbox(String zip) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getZipCode());
		           element.sendKeys(zip);
		
	}
	public void phoneTextbox(String num) {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getPhone());
		           element.sendKeys(num);
	} 
	
	public void shippingCheckbox() {
		WebElement element = driver.findElement(CheckoutAddressPageModel.getCheckButton());
		
		System.out.println("The checkbox is selection state is - " + element.isSelected());
		
		if(!element.isSelected())
			element.click();
	}
	
	public void clickSaveButton() {
		
		WebElement element = driver.findElement(CheckoutAddressPageModel.getSaveContinueButton());
		           element.click();
		           
	}
	
	
	
	
	
	
	
	
	
	
}
