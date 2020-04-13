package hellocucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/html","json:target/json","pretty:target/pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber"})
public class RunCucumberTest {

}
