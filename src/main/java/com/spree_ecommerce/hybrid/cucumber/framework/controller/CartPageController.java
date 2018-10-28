package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.CartPageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;


public class CartPageController extends BasePage  {
	
	private WebDriver driver = null;
	
	public CartPageController(WebDriver driver) {
		this.driver = driver;
	}

	
	public void clickCartLink() {
		WebElement element = driver.findElement(CartPageModel.getCart());
		           element.click();
		          
		           
	}
	
	public void goToShoppingPage() {
		WebElement element = driver.findElement(CartPageModel.getContinueShoppingLink());
		           element.click();
	}
	
	public void selectProduct() {
		WebElement element = driver.findElement(CartPageModel.getRailBagLink());
		           element.click();
		           
		           
	}
	public void selectProductQuantity(String num) {
		WebElement element = driver.findElement(CartPageModel.getRailsBagQuantity());
		           element.sendKeys(num);
		
	}
	 public void addToCartButton() {
		WebElement element = driver.findElement(CartPageModel.getAddToCartButton());
		           element.click();	 
	 }
	
	 public void clickCheckoutButton() {
		 WebElement element = driver.findElement(CartPageModel.getCheckoutButton());
		            element.click();
		            
	 }
	 
	 public void upDate() {
		 WebElement element =driver.findElement(CartPageModel.getUpDateLink());
		            element.click();
	 }
	 
	 public void verifyBagsPageTitle() {
		  
		  String title = DriverFactory.getInstance().getDriver().getTitle();
		  assertThat(title, startsWith("Categories - Bags - Spree Demo Site"));
	  }
	 
	 public void rubybagPageTitle() {
		 String title = DriverFactory.getInstance().getDriver().getTitle();
		  assertThat(title, startsWith("Ruby on Rails Bag - Spree Demo Site"));
		 
	 }
	 
	 
	 
}
