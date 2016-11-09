package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import setUpClasses.App;

import java.io.IOException;
import java.util.Date;

@CucumberOptions(features = "src/test/resources/features/android"
        ,format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"}
        ,glue = {"stepDefinitions.android"}
        //,tags = {"@recommended"
        //,"~@iosbug" }
        //,"~@androidbug"}
        //,tags = {"~@androidbug"}
        ,tags = {"@river", "@android"}
)

public class runCukesTest extends AbstractTestNGCucumberTests{
    @BeforeSuite
    public static void SetUp() throws IOException, InterruptedException {
        new App().launch(true);
        System.out.println(new Date()+" - MOBILE test has started");
    }

//    I had to move this method into each platform folder; stepDefinitions.ios.setUp and stepDefinitions.android.setUp
//
// /**
//     * This method runs before each scenario.
//     * This makes possible embedding images into the json report
//     * @param scenario
//     */
//    @Before
//    public static void before(Scenario scenario){
//        System.out.println("Scenario: "+scenario.getName());
//        App.scenario = scenario;
//    }
    /**
     * This method runs after each suite of features
     * It closes the web driver
     */
    @AfterSuite
    public static void testDown() throws IOException, InterruptedException {
        //new App().close();
        System.out.println(new Date()+" - MOBILE test has finished");
    }
}
