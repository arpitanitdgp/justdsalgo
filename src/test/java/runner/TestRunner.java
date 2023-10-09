
package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/ghosh.html",}, // reporting purpose
		monochrome = true, // console output color
		tags = "@invalidlogintest", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files - folder name
		glue = "stepDefinitions") // location of step definition files - package name

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}