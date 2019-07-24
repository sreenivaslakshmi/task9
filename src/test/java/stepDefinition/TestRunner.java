package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/AddCustomer.feature",strict=true,dryRun=false, glue="stepDefinition",monochrome=true,plugin= {"html:target","json:target/cucumberReport.json"})
public class TestRunner {
	}


