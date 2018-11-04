package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "I:\\All Eclipse Code6\\CucumberNew\\Features\\MyTest.feature", glue = {
		"stepDefination" }, format = { "pretty", "html:test_output", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, dryRun = false ,monochrome = true, strict=true)

public class TestRunner {

}
