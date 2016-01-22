package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by rpalacios on 11/19/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(//monochrome = true,
                 //format = { "pretty", "html:target/cucumber" },
                 //features="src/test/resources/feature1",
                 plugin = { "html:target/cucumber-html-reports",
                        "json:target/cucumber.json",
                        //"pretty:target/cucumber-pretty.txt",
                        //"usage:target/cucumber-usage.json",
                        //"junit:target/cucumber-results.xml"
                 },
                 features="classpath:cucumber/myfeature2.feature",
                 glue={"steps"}   )
public class CucumberRunnerFeature2Tes {

}
