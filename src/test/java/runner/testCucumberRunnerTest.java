package runner;

import appium.*;
import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import objectModels.PushPermissionRequestObject;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Date;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber-test.json",
        retryCount = 0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        toPDF = true,
        outputFolder = "target/cucumber-test")
@CucumberOptions (features = "classpath:test/",
        format = {"pretty", "html:target/cucumber-test", "json:target/cucumber-test.json"},
        glue={"steps"})
public class testCucumberRunnerTest {

    @BeforeSuite
    public static void SetUp() throws IOException, InterruptedException {
        new Logger().setLogger();
        new App().launch();
        //Thread.sleep(5000);
        new PushPermissionRequestObject().clicklMayberLater();
        BISlack.sendMessage(new Date()+" - MOBILE test has started");
    }

    @AfterSuite
    public static void testDown() throws IOException {
        new App().close();
        BISlack.sendMessage(new Date()+" - MOBILE test has finished");
    }


}
