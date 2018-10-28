package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;



import org.junit.Test;


import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;

public class HomePageTest extends CommonStepsPage{
	
	
	@Test
	
	public void test() {
		spreeController().homePage().browseToTheSite();
		spreeController().homePage().verifyHomePageTitle();
		spreeController().homePage().brokenLinks();
		spreeController().homePage().departmentBox();
	}
	


}
