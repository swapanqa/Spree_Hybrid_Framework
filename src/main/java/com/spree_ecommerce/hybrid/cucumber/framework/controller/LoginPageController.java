package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.LoginPageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.SeleniumUtils;


public class LoginPageController extends BasePage   {
	
	private WebDriver driver = null;
	SeleniumUtils utils;
	
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
	
	
	public void loginBySikuli() throws FindFailed {
		

		Screen screen = new Screen();
		
		Pattern loginLink = new Pattern("C:\\MyProject\\hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\loginLink.PNG");
		Pattern emailTextBox = new Pattern("C:\\MyProject\\hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\emailTextBOx.PNG");
		Pattern passwordTextBox = new Pattern("C:\\MyProject/hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\passwordTextBox.PNG");
	    Pattern loginButton = new Pattern("C:\\MyProject\\hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\loginButton.PNG");
		
		
		screen.wait(loginLink, 1);
		screen.click(loginLink);
		
		
		screen.type(emailTextBox, "swapanny79@yahoo.com");
		screen.wait(emailTextBox, 1);
		
		
		screen.type(passwordTextBox,"swapan");
		screen.wait(passwordTextBox, 1);
		
		screen.wait(loginButton,1);
		screen.click(loginButton);
		
	        }
	
	
	
	
	
	
	
	

		
		
		
	}
	
	
	
	
	
	
	

