package stepDefinitions.android;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/3/16.
 */
public class SetUp {
    @Before
    public static void before(Scenario scenario) throws Throwable {
        System.out.println("Scenario: "+scenario.getName());
        App.scenario = scenario;

        //I added this because when I start Save Articles test, there should be NO saved articles already.
        if (scenario.getName().equals("I save a post")) {
            PushPermissionRequest.i_open_the_app_for_the_first_time();
        }
    }
}
