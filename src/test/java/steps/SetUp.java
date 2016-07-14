package steps;

import appium.App;
import appium.BISlack;
import commands.command;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by rpalacios on 11/13/15.
 */
public class SetUp {

    @Before
    public void before(Scenario scenario) throws IOException {
        App.scenario = scenario;
        BISlack.sendMessage("Scenario: "+scenario.getName());
    }

    @After
    public void after(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            scenario.write("Current Page URL is " + App.driver.getCurrentUrl());
            BISlack.sendMessage("Failed Scenario");
            command.embedScreenshot();
        }
    }
}