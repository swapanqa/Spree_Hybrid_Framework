package com.spree_ecommerce.hybrid.cucumber.framework.model;

import org.openqa.selenium.By;

public class CheckoutAddressPageModel {
	
	private static By firstNameTextbox = By.xpath("//input[@id='order_bill_address_attributes_firstname']");
	private static By lastNameTextbox = By.xpath("//input[@id='order_bill_address_attributes_lastname']");
	private static By streetAddressTextbox = By.xpath("//input[@id='order_bill_address_attributes_address1']");
	private static By cityTextbox = By.xpath("//input[@id='order_bill_address_attributes_city']");
	private static By countryTextbox = By.xpath("//select[@id='order_bill_address_attributes_country_id']");
	private static By stateTextbox = By.xpath("//select[@id='order_bill_address_attributes_state_id']");
	private static By zipTextbox = By.xpath("//input[@id='order_bill_address_attributes_zipcode']");
	private static By phoneTextbox = By.xpath("//input[@id='order_bill_address_attributes_phone']");
	private static By checkButtonAddress = By.xpath("//input[@id='order_use_billing']");
	private static By saveContinueButton = By.xpath("//input[@value='Save and Continue']");
	
	
	
	public static By getFirstName() {
		return firstNameTextbox;
	}
	
	public static By getLastName() {
		return lastNameTextbox;
	
	}
	
	public static By getStreetAddress() {
		return streetAddressTextbox;
	}
	
	public static By getcityName() {
		return cityTextbox;
	}
	
	public static By getCountryName() {
		return countryTextbox;
	}
	
	public static By getStateName() {
		return stateTextbox;
	}
	
   public static By getZipCode() {
	   return zipTextbox;
   }
	
	public static By getPhone() {
		return phoneTextbox;
	}
	public static By getCheckButton() {
		return checkButtonAddress;
	}
	
	public static By getSaveContinueButton() {
		return saveContinueButton;
	}
	
	
}
