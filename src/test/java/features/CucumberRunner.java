package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by rpalacios on 11/19/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"}
)
public class CucumberRunner {
}
