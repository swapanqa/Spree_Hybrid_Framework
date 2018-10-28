import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"c:/MyProject/hybrid.bdd_cucumber.automation_framework/src/test/resources/features/SearchPage.feature:8"},
plugin = {"json:target/cucumber-parallel/5.json"},
monochrome = false,
tags = {},
glue = { "com.spree_ecommerce.hybrid.cucumber.framework.steps", "com.spree_ecommerce.hybrid.cucumber.framework.hooks" })
public class Parallel05IT {
}
