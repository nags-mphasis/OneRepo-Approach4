import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// @CucumberOptions(features="src/test/resources",
@CucumberOptions(features="src/test/resources",
monochrome = true,
plugin = {"pretty", "json:target/Reports/ChildModule1.json"})

public class Child1Runner {

}
