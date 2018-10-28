package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;

import org.junit.Test;


import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;

public class SearchItemTest extends CommonStepsPage {
	
	
	@Test
	
	public void test() {
		
		spreeController().homePage().browseToTheSite();
		spreeController().search().searchBoxClear();
		spreeController().search().searchBoxText(PropertyReaderService.getInstance().getProperty("SEARCH_ITEM"));
		spreeController().search().searchButtonClick();
		spreeController().search().searchResutAssert();
		
	}
	
	
	
	
	
	

}
