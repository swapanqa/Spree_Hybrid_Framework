package com.spree_ecommerce.hybrid.cucumber.framework.model;

import org.openqa.selenium.By;

public class CartPageModel {
	
	private static By cartLink = By.id("link-to-cart");
	private static By continueShoppingLink = By.xpath("//a[@class='btn btn-default']");
    private static By railsBagLink = By.xpath("//a[@title='Ruby on Rails Bag']");
    private static By railsBagQuantity = By.xpath("//input[@id='quantity']");
    private static By addToCartButton = By.xpath("//button[@id='add-to-cart-button']");
    private static By upDateButtonlink = By.xpath("//button[@id='update-button']");
    private static By checkoutButton = By.xpath("//button[@id='checkout-link']");
    
    
    
    public static By getCart() {
		return cartLink;
	}
	
    public static By getContinueShoppingLink() {
    	return continueShoppingLink;
    }
    
    public static By getRailBagLink() {
    	return railsBagLink;
    }
    
    public  static By getRailsBagQuantity() {
    	return railsBagQuantity;
    }
    
    public static By getAddToCartButton() {
    	return addToCartButton;
    }
    
    public static By getUpDateLink() {
    	return upDateButtonlink;
    }
    
    public static By getCheckoutButton() {
    	return checkoutButton;
    }
    
    
    
    
    
    
}
