package com.spree_ecommerce.hybrid.cucumber.framework.model;

import org.openqa.selenium.By;

public class SignUpPageModel {
	
	private static By emailBox = By.xpath("//input[@id='spree_user_email']");
	private static By password = By.xpath("//input[@id='spree_user_password']");
	private static By confirmPassword = By.xpath("//input[@id='spree_user_password_confirmation']");
	private static By createButton = By.xpath("//input[@value='Create']");
	private static By signUpMessage = By.xpath("//div[@class='alert alert-notice']");
	private static By invalidMessage = By.xpath("//div[@id='errorExplanation']");
	
	
	public static By getEmail() {
		return emailBox;
	}
	public static By getPassword() {
		return password;
	}
    public static By getConfirmPassword() {
    	return confirmPassword;
    }
    public static By getCreateAccount() {
    	return createButton;
    }
    public static By getSignUpMessage() {
    	return signUpMessage;
    }
    
    public static By getInvalidMessage() {
    	return invalidMessage;
    	}
}
