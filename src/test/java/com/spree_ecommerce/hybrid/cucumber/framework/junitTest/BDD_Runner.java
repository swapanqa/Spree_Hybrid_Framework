package com.spree_ecommerce.hybrid.cucumber.framework.junitTest;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// tags = { " @Aceptance " },
		// tags = { "@debug" },
		// tags = { "@smoke" }, /* smoke test only */
		// tags = { "@smoke,@debug" }, /* debug or smoke test */
		// tags = { "@smoke","@debug" }, /* debug and smoke test */
		// dryRun = true,
		monochrome = true,

		 //features = "src/test/resources/features/HomePage.feature",
		 //features = "src/test/resources/features/LoginPage.feature",
		
		// features = "src/test/resources/features/SearchPage.feature",
		 features = "src/test/resources/features/AddToCartPage.feature",

		glue = { "com.spree_ecommerce.hybrid.cucumber.framework.steps",
				"com.spree_ecommerce.hybrid.cucumber.framework.hooks" },

		plugin = { "pretty:target/cucumber-test-report/cucumber-pretty.txt", 
				"html:target/cucumber-test-report",
				
				"junit:target/cucumber-test-report/test-report.xml" })

public class BDD_Runner  {

}
