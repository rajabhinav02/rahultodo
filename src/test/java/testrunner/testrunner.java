package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\resources\\java\\features\\login.feature"},
					dryRun = false,
					glue = {"stepdefinitions", "apphooks"})
public class testrunner extends AbstractTestNGCucumberTests {

	@DataProvider
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
