package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import setUpClasses.App;

import java.io.IOException;
import java.util.Date;

@CucumberOptions(features = "src/test/resources/features/ios"
        ,format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"}
        ,glue = {"stepDefinitions.ios"}
        //,tags = {"@recommended"
        //,"~@iosbug" }
        //,"~@androidbug"}
        //,tags = {"~@androidbug"}
        ,tags = {"@river","~@iosbug"}
)

public class RunCukesTest1 extends AbstractTestNGCucumberTests{
    @BeforeSuite
    public static void SetUp() throws IOException, InterruptedException {
        new App().launch(true);
        System.out.println(new Date()+" - MOBILE test has started");
    }

    /**
     * This method runs after each suite of features
     * It closes the web driver
     */
    @AfterSuite
    public static void testDown() throws IOException, InterruptedException {
        //new App().close();
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("networksetup -setairportpower en0 on");
            System.out.println("Wifi OFF Successfully");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(new Date()+" - MOBILE test has finished");
    }
}
