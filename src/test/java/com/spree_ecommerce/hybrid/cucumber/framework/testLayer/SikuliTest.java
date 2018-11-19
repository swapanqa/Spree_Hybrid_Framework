package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;



import org.junit.Test;
import org.sikuli.script.FindFailed;
import com.spree_ecommerce.hybrid.cucumber.framework.hooks.CommonStepsPage;




public class SikuliTest extends CommonStepsPage {
	

	
	
     @Test
	
	public void test1() throws FindFailed {
    	
    	 spreeController().loginPage().loginBySikuli();
    	 
    	 
    	 
     }
		
	
	
	
	
}
