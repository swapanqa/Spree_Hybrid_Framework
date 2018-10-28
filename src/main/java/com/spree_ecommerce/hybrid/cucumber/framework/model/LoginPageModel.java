package com.spree_ecommerce.hybrid.cucumber.framework.model;

import org.openqa.selenium.By;

public class LoginPageModel {
	
	private static By emailTextBox = By.xpath("//input[@id='spree_user_email']");
	private static By passwordTextBox = By.xpath("//input[@id='spree_user_password']");
	private static By loginButton = By.xpath("//input[@value='Login']");
	private static By createAccountLink = By.xpath("//a[contains(text(),'Create a new account')]");
	private static By successfulmeg = By.xpath("//div[@class='alert alert-success']");
	private static By logoutButton = By.xpath("//a[contains(text(),'Logout')]");
	private static By logoutMessage = By.xpath("//div[@class='alert alert-notice']");
	private static By loginNotsuccess = By.xpath("//div[@class='alert alert-error']");
	public static By loginExisting = By.xpath("//a[contains(text(),'Login as Existing Customer')]");
	
	public static By getEmail() {
		
		return emailTextBox;
	}
	
	public static By getPassword() {
		return passwordTextBox;
	}
	
	public static By getLogin() {
		return loginButton;
	}
	
	public static By getCreateAccount() {
		
		return createAccountLink;
	}
	
	public static By getMessage() {
		return successfulmeg;
	}
	
	public static By getLogout() {
		return logoutButton;
		
	}
	
	public static By getLogoutMess() {
		
		return logoutMessage;
	}

	public static By getLoginNotAssertion() {
		return loginNotsuccess;
	}

	public static By getExistingLogin() {
		return loginExisting;
		
	}
	
}
