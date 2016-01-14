package stepDefinitions;

import appium.App;
import core.AutomationSetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by rpalacios on 11/13/15.
 */
public class StepsDefinitions1 extends AutomationSetUp{
        @Given("^There are (\\d+) cucumbers$")
        public void there_are_cucumbers ( int arg1) throws Throwable {
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
            try {

                objectModels.HamburgerMenu hm = new objectModels.HamburgerMenu(App.wd);
                hm.clickHamburger();
                Thread.sleep(3000);
                hm.clickHamburger();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new App().close();

    }

        @When("^I eat (\\d+) cucumbers$")
        public void i_eat_cucumbers ( int arg1)throws Throwable {
        System.out.println("");
    }

        @Then("^I should have (\\d+) cucumbers$")
        public void i_should_have_cucumbers ( int arg1)throws Throwable {
        //driverCloseUp();
    }
}
