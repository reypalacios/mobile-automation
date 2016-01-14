package stepDefinitions;

import appium.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

/**
 * Created by rpalacios on 11/13/15.
 */
public class StepsDefinitions2 {
    Logger logger = Logger.getLogger(this.getClass());

    @Given("^There are (\\d+) drinks$")
    public void there_are_drinks(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       logger.info("Feature2");
        new App().launch();
    }

    @When("^I drank (\\d+) cucumbers$")
    public void i_drank_cucumbers(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Feature2");
        new App().close();

    }
}
