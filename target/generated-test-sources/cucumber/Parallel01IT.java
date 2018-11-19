import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"c:/MyProject/hybrid.bdd_cucumber.automation_framework/src/test/resources/features/AddToCartPage.feature:9"},
        plugin = {"json:c:/MyProject/hybrid.bdd_cucumber.automation_framework/target/cucumber-parallel/1.json"},
        monochrome = false,
        glue = {"com.spree_ecommerce.hybrid.cucumber.framework.steps"})
public class Parallel01IT {
}
