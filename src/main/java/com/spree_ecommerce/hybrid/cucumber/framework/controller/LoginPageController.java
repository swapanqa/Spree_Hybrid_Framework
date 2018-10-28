package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.LoginPageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;


public class LoginPageController extends BasePage   {
	
	private WebDriver driver = null;
	
	public LoginPageController(WebDriver driver) {
		this.driver = driver;
	}
   
	public void emailText(String email) {
		WebElement emailElement = driver.findElement(LoginPageModel.getEmail());
		           emailElement.sendKeys(email);
		           
		           
	}
	
	public void emailTextBoxClear() {
		WebElement emailClear = driver.findElement(LoginPageModel.getEmail());
		           emailClear.clear();
	}
	
	public void passwordClear() {
		WebElement passwordClear = driver.findElement(LoginPageModel.getPassword());
		           passwordClear.clear();
	}
	
	
	public void passwordText(String password) {
		WebElement passwordElement = driver.findElement(LoginPageModel.getPassword());
		           passwordElement.sendKeys(password);
		           
		
	}
	public void loginClick() {
		WebElement loginButton = driver.findElement(LoginPageModel.getLogin());
		           loginButton.click();
		           
		           
		
	}
	
	public void verifyLoginTitle() {
		
		  String title = DriverFactory.getInstance().getDriver().getTitle();
		  assertThat(title, startsWith("Login - Spree Demo Site"));
	  }
	  
	public void loginNotSuccessMessage(String mess) {
		
		String message = driver.findElement(LoginPageModel.getLoginNotAssertion()).getText();
		assertThat(message, startsWith(mess));
	}
	
	public void goToCreateAccountPage() {
		WebElement accountButton = driver.findElement(LoginPageModel.getCreateAccount());
		           accountButton.click();
	}
	
	public void loginSuccessMessageDisplay(String expectedMessage) {
		
		String loginSuccess = driver.findElement(LoginPageModel.getMessage()).getText();
		 assertThat(loginSuccess, startsWith(expectedMessage));      	
	}
	
	public void logoutClick() {
		WebElement logout = driver.findElement(LoginPageModel.getLogout());
		           logout.click();
		           
		
	}
	
	public void logoutSuccessMessageDisplay(String message) {
		String logoutSuccess = driver.findElement(LoginPageModel.getLogoutMess()).getText();
		assertThat(logoutSuccess, startsWith(message));
	}
	
	public void existingLogin() {
		WebElement element = driver.findElement(LoginPageModel.getExistingLogin());
		           element.click();
	}
	
	
	
	
	
	
	
	
	
}
