package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium_Workspace\\FreeCrmBDDFramework\\src\\main\\java\\features\\login.feature", //Path of feature file available.
		glue={"stepDefinition"}, //Which package/path of step definition file is available.
		format= {"pretty","html:test-output", "json:json-output/cucumber.json", "junit: junit-output/cucumber.xml"}, //To generate different reporting formats, html, json, xml.
		monochrome = true, //To display console output in more readable format.
		strict = false, //It will check if any step is not defined in step definition file.
		dryRun = false, //To check if we have written all the step definitions for every feature. When everything is fine, make it false.
		tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}
		)
// OR : tags = {"@SmokeTest, @RegressionTest"}, execute either Smoke or Regression cases
// AND: tags = {"@SmokeTest", "@RegressionTest"} execute both Smoke or Regression cases
//To Ignore a particular test case use ~ before @, e.g. ~@SmokeTest

public class TestRunnerClass {

	
	
}
