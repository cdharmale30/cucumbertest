package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "I:\\All Eclipse Code6\\CucumberNew\\Features\\MyTest.feature"
, glue = { "stepDefination" })
public class TestRunner {

}
