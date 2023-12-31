

package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/ArpitaGhosh.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  }, // reporting
																														// purpose
monochrome = true, // console output color
//tags = "@Arpita", // tags from feature file
features = { "src/test/resources/features" }, // location of feature files - folder name
glue = "stepDefinitions") // location of step definition files - package name


public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}