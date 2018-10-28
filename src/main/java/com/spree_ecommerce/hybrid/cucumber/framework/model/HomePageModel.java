package com.spree_ecommerce.hybrid.cucumber.framework.model;

import org.openqa.selenium.By;

public class HomePageModel {
	
	private static By loginLink = By.xpath("//a[contains(text(),'Login')]");
	
	
	private static By allDepertmentLink = By.xpath("//select[@id='taxon']");
	private static By bagsLink = By.xpath("//a[contains(text(),'Bags')]");
	private static By mugsLink = By.xpath("//a[contains(text(),'Mugs')]");
	private static By clothingLink = By.xpath("//a[contains(text(),'Clothing')]");
	private static By rubyLink = By.xpath("//a[@class='list-group-item'][contains(text(),'Ruby')]");
	private static By apacheLink = By.xpath("//a[@class='list-group-item'][contains(text(),'Apache')]");
	private static By spreeLink = By.xpath("//a[@class='list-group-item'][contains(text(),'Spree')]");
	private static By railsLink = By.xpath("//a[@class='list-group-item'][contains(text(),'Rails')]");
	private static By homePageLinks = By.tagName("a"); 
	
	
	public static By getLoginPage() {
		return loginLink;
	}

	
	public static By getDepartmentBox() {
		
		return allDepertmentLink;
	}
	
	
	public static By getBags() {
		return bagsLink;
	}
	
	public static By getMugs() {
		return mugsLink;
	}
	
	public static By getClothing() {
		
		return clothingLink;
	}
	
	public static By getRuby() {
		return rubyLink;
	}
	
	public static By getApache() {
		return apacheLink;
	}
	
	public static By getSpree() {
		return spreeLink;
	}
	public static By getRails() {
		return railsLink;
	}

	public static By getHomePageLinks() {
        return homePageLinks;
    }
	

    
}
