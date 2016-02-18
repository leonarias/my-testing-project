package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "step_definitions",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                }//,
        //tags = "@negative_test" 
        )

public class RunCukesTest {

}

