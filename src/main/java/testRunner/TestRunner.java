package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\CucumberDemo\\cucumberdemo\\src\\main\\java\\features\\create_product.feature",
//		features="src/main/java/features",
		glue= {"stepDefination"},
		format= {"pretty","html:test-output"},
		dryRun = false,
		monochrome = true
		
		
		)

public class TestRunner {
	
	
	

}
