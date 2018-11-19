import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"c:/MyProject/hybrid.bdd_cucumber.automation_framework/src/test/resources/features/LoginPage.feature:46"},
        plugin = {"json:c:/MyProject/hybrid.bdd_cucumber.automation_framework/target/cucumber-parallel/5.json"},
        monochrome = false,
        glue = {"com.spree_ecommerce.hybrid.cucumber.framework.steps"})
public class Parallel05IT {
}
