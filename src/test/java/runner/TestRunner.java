package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features" , // features tell cucumber options where feature files are located
		glue = {"stepDefinitions"}, // glue tells cucumber options where all step definitions are located
		tags = {"@smoke"}, // tags tells cucumber options which scenario, scenario outline, or feature to run
		dryRun = false,
		monochrome = true,
		strict = false ,
		format = {"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
		},
		plugin="json:target/cucumber-report/CucumberTestReport.json"
		)
public class TestRunner {

}
