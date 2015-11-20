package features;

import core.AutomationSetUp;
import core.commands.screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

/**
 * Created by rpalacios on 11/13/15.
 */
public class StepsDefinitions extends AutomationSetUp{

    @Given("^There are (\\d+) cucumbers$")
    public void there_are_cucumbers(int arg1) throws Throwable {
//        new screenshot().fullScreenshot(driver);
//      new screenshot().elementScreenshot(driver.findElement(By.xpath("//div[@class='span3 span3-mh']/a[@class='sprites logo']")),driver);
        new screenshot().partialScreenshot(driver.findElement(By.xpath("//div[@class='span3 span3-mh']/a[@class='sprites logo']")),driver);
    }

    @When("^I eat (\\d+) cucumbers$")
    public void i_eat_cucumbers(int arg1) throws Throwable {
        System.out.println("");
    }

    @Then("^I should have (\\d+) cucumbers$")
    public void i_should_have_cucumbers(int arg1) throws Throwable {
        driverCloseUp();
    }
}
