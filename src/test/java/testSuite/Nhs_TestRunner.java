package testSuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/testSuite/eligibility_adult.feature","src/test/java/testSuite/eligibility_child.feature"},
        glue= {"testSuite"},
        tags= "@nhstesting"
        
)
@RunWith(Cucumber.class)
public class Nhs_TestRunner extends  AbstractTestNGCucumberTests
{

}
