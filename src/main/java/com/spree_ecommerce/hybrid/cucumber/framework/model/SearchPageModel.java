package com.spree_ecommerce.hybrid.cucumber.framework.model;

import org.openqa.selenium.By;

public class SearchPageModel {
	
	private static By searchBoxLink = By.xpath("//input[@id='keywords']");
	private static By searchButtonLink = By.xpath("//input[@value='Search']");
	private static By searchResult = By.xpath("//h6[@class='search-results-title']");
	
	
	
	
	
	
	
	public static By getSearchBox() {
		return searchBoxLink;
	}
	
	public static By getSearchButton() {
		return searchButtonLink;
	}
	
	public static By getSearchResultAsseration() {
		return searchResult;
	}
	
	

}
