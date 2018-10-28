package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import org.openqa.selenium.WebDriver;

import com.spree_ecommerce.hybrid.cucumber.framework.utils.SeleniumUtils;

public class ApplicationController {
	
	private WebDriver driver = null;
    protected HomePageController homePage = null;
	protected LoginPageController loginPage = null;
	protected SearchPageController search   = null;
	protected SignUpPageController signUpPage = null;
	protected CartPageController cartPage = null;
	protected CheckoutAddressPageController addressPage = null;
	
	
	public ApplicationController(WebDriver driver) {
		
		this.driver = driver;
		
	}

	public HomePageController homePage() {
		if(homePage == null) {
			homePage = new HomePageController(driver);
		}
		return homePage;
	}
	
	public LoginPageController loginPage() {
		if(loginPage == null) {
			loginPage = new LoginPageController(driver);
		}
		return loginPage;
	}
	
	public SearchPageController search() {
		if(search == null) {
			search = new SearchPageController(driver);
		}
		return search;
	}
	
	public SignUpPageController signUpPage() {
		if(signUpPage == null) {
			signUpPage = new SignUpPageController(driver);
		}
		return signUpPage;
	}
	
	public CartPageController cartPage() {
		if(cartPage == null) {
			cartPage = new CartPageController(driver);
			}
		return cartPage;
	}
	
	public CheckoutAddressPageController checkoutPage() {
		if(addressPage ==null) {
			addressPage = new CheckoutAddressPageController(driver);
		}
		return addressPage;
	}
	
   
    }
	

