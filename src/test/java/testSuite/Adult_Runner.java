package testSuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/testSuite/eligibility_adult.feature"},
        glue= {"testSuite"},
        tags= "@adult"
        
)
@RunWith(Cucumber.class)
public class Adult_Runner extends AbstractTestNGCucumberTests
{

}
