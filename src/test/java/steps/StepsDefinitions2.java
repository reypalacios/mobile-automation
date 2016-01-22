package steps;

import appium.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
         /* try {
                driverSetUp();
                //        new screenshot().fullScreenshot(driver);
                //      new screenshot().elementScreenshot(driver.findElement(By.xpath("//div[@class='span3 span3-mh']/a[@class='sprites logo']")),driver);
                //new screenshot().partialScreenshot(driver.findElement(By.xpath("//div[@class='span3 span3-mh']/a[@class='sprites logo']")), driver);
                driver.findElement(By.xpath("//div[@class='hamburger']")).click();
                Thread.sleep(10000);
            }catch (SeleniumException e){
                logger.error(e.getMessage());
                e.printStackTrace();
            }*/
        new App().launch();
        //App.wd.findElement(By.id("test")).click();
        /*try {

            objectModels.HamburgerMenu hm = new objectModels.HamburgerMenu(App.wd);
            hm.clickHamburger();
            Thread.sleep(3000);
            hm.clickHamburger();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        // new App().close();
    }

    @When("^I drank (\\d+) drink")
    public void i_drank_cucumbers(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Feature2 @When");
        //new App().close();

    }

    @Then("^I should have (\\d+) drink")
    public void i_should_have_cucumbers ( int arg1) throws Throwable {
        //driverCloseUp();
        new App().close();
    }
}
