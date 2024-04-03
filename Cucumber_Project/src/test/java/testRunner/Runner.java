package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},monochrome = true, glue = {"stepDefinition"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/Bookin.html","pretty","html:target/cucumber-reports"})

public class Runner {

}
