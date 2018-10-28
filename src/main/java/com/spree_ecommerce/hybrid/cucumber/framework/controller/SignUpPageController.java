package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.SignUpPageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;


public class SignUpPageController extends BasePage   {
	
	private WebDriver driver = null;
	
	
	public SignUpPageController(WebDriver driver) {
		
		this.driver = driver;
	}

	
	public void emailBox(String emaill) {
		WebElement emailElement = driver.findElement(SignUpPageModel.getEmail());
		           emailElement.sendKeys(emaill);
	}
	
	public void passwordBox(String passwordd) {
		WebElement passwordElement = driver.findElement(SignUpPageModel.getPassword());
		           passwordElement.sendKeys(passwordd);
	}
	
	public void confirmPasswordBox(String confirm) {
		WebElement passwordElement = driver.findElement(SignUpPageModel.getConfirmPassword());
		           passwordElement.sendKeys(confirm);
		
	}
	
	
	public void createAccount() {
		
		WebElement createElement = driver.findElement(SignUpPageModel.getCreateAccount());
		           createElement.click();
	}
	public void signUpPageTitle() {
		String title = DriverFactory.getInstance().getDriver().getTitle();
		assertThat(title, startsWith("Spree Demo Site"));
	}
	
	
	public void signUpSuccessfulMessage(String message) {
		String successfulMeg = driver.findElement(SignUpPageModel.getSignUpMessage()).getText();
				assertThat(successfulMeg, startsWith(message));
	}
	
	public void invalidMessage(String message) {
		
		String invalidmess = driver.findElement(SignUpPageModel.getInvalidMessage()).getText();
		     assertThat(invalidmess, startsWith(message));
	}
	
	
	
	
	
	
	
	
	
}
