package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
    (
    	features = "src/test/java/Features",
    	//tags= {"@sanity","@regression"}, //to run multiple tags using And
    // tags = {"@sanity,@regression"}, //	to run multiple tags using  OR
    			tags = {"@sanity"},
    	//tags = {"@sanity or (@regression and @rapid)"},
    	//tags= {"not @sanity"},
    	glue = {"StepDefinitions"},
    	plugin = {"pretty","html:test-output","json:test-output/cucumber.jason"}
    	
    		
		)
public class TestRunner {

}
