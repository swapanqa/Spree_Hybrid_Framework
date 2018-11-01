package com.spree_ecommerce.hybrid.cucumber.framework.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.SearchPageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;


public class SearchPageController extends BasePage   {
	
	private WebDriver driver = null;
	
	public SearchPageController(WebDriver driver) {
		this.driver = driver;
	}

	
	public void searchBoxText(String itemName) {
		
		WebElement searchElement = driver.findElement(SearchPageModel.getSearchBox());
		           searchElement.sendKeys(itemName);
		           
	}
	
	public void searchBoxClear() {
		WebElement clear = driver.findElement(SearchPageModel.getSearchBox());
		           clear.clear();
	}
	
	
	public void searchButtonClick() {
		
		WebElement buttonElement = driver.findElement(SearchPageModel.getSearchButton());
		           buttonElement.click();
		           
	}
	
	public void searchResutAssert() {
		
		String result = driver.findElement(SearchPageModel.getSearchResultAsseration()).getText();
		System.out.println(result);
		  assertThat(result, startsWith("Search results for 'shirt'"));}
	
	
	
	public void varifySearchTitel() {

		  String title = DriverFactory.getInstance().getDriver().getTitle();
		  assertThat(title, startsWith("Spree Demo Site"));
		
	}	
		
	
	
	
	
	
	
	
	
	
	
}
