package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // will help to execute as junit
@CucumberOptions(features = { "src/test/resources/org/feature" }, 
glue = {
		"stepDefinitions" }, 
monochrome = true, 
dryRun = false,
plugin = { "pretty",
				"html: target/html_report/htmlReport.html", "json: target/json_report/jsonReport.json",
				"junit: target/junit_report/junitReport.xml"

}

)
public class Runner {

}
