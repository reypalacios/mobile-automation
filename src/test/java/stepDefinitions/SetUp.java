package stepDefinitions.ios;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/3/16.
 */
public class SetUp {
    @Before
    public static void before(Scenario scenario){
        System.out.println("Scenario: "+scenario.getName());
        App.scenario = scenario;
    }
}
