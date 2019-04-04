package Runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Feature\\facebook.feature",
		glue= {"StepDefinition"}, format = { "pretty" , "html:target/cucumber"}, tags = {"@P1"}
		)
 

public class Scrumrunner {

	
}
