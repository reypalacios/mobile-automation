package runner;

import appium.App;
import appium.BISlack;
import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.util.Date;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber-mobile.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        toPDF = true,
        outputFolder = "target")
@CucumberOptions (features = "classpath:cucumber/",
        format = {"pretty", "html:target/cucumber-mobile", "json:target/cucumber-mobile.json"},
        glue={"steps"})
public class mobileCucumberRunnerTest {
    @BeforeSuite
    public static void SetUp() throws IOException {
        new App().launch();
        BISlack.sendMessage(new Date()+" - MOBILE has started");
    }

    @AfterSuite
    public static void testDown() throws IOException {
        new App().close();
        BISlack.sendMessage(new Date()+" - MOBILE has finished");
    }

}
