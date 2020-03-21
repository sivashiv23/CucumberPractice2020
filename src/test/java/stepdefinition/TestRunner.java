package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sivas\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature\\Login.feature", glue = {
		"stepdefinition" }, plugin = { "html:target" }, strict = true)
public class TestRunner {

}
