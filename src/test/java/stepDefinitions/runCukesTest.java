package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import setUpClasses.App;

import java.io.IOException;
import java.util.Date;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/mobile"
        ,format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"}
        ,tags = {"@save"
        ,"~@iosbug" }
        //,"~@androidbug"}
)
public class runCukesTest extends AbstractTestNGCucumberTests{
    @BeforeSuite
    public static void SetUp() throws IOException, InterruptedException {
        //new Logger().setLogger();
        new App().launch(true);
//        try {
//            new PushPermissionRequestObject().clicklMayberLater();
//        }catch(NoSuchElementException e){
//            System.out.println("No push permission notification screen");
//        }
        System.out.println(new Date()+" - MOBILE test has started");
    }
    /**
     * This method runs before each scenario.
     * This makes possible embedding images into the json report
     * @param scenario
     */
    @Before
    public void before(Scenario scenario){
        System.out.println("Scenario: "+scenario.getName());
        App.scenario = scenario;
    }
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
