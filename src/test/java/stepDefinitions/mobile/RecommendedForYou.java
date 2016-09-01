package stepDefinitions.mobile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import pageObjects.MastHeadObject;
import pageObjects.PostObject;
import pageObjects.RecommendedForYouObject;
import pageObjects.RiverFeedObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 6/6/16.
 */
public class recommendedForYou extends App {
    RiverFeedObject RiverFeed = new RiverFeedObject();
    Boolean checkPostTitle = true;

    @Given("^I am on the post page$")
    public void I_am_on_the_post_page() throws Throwable {
        RiverFeed.clickTopPost();
    }

    @Then("^River post recommended for you module is displayed$")
    public void river_post_recommended_for_you_module_is_displayed() throws Throwable {
        new RecommendedForYouObject().isDisplayed();
    }

    @When("^I click the first river-post recommendation$")
    public void i_click_the_first_river_post_recommendation() throws Throwable {
        posttitle=driver.findElementByXPath("//*[@label='recommended'][1]/UIALink").getText();
        driver.findElementByXPath("//*[@label='recommended'][1]").click();

    }

    @When("^I click the second river-post recommendation$")
    public void i_click_the_second_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        posttitle=driver.findElementByXPath("//*[@label='recommended'][2]/UIALink").getText();
        driver.findElementByXPath("//*[@label='recommended'][2]").click();
        //new MastHeadObject().back.click();
    }

    @When("^I click the third river-post recommendation$")
    public void i_click_the_third_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        try {
            posttitle = driver.findElementByXPath("//*[@label='recommended'][3]/UIALink").getText();
            driver.findElementByXPath("//*[@label='recommended'][3]").click();
        }catch (NoSuchElementException e) {
            if (driver.findElementsByXPath("//*[@label='recommended']").size()<3) checkPostTitle=false;
            else e.printStackTrace();
        }
    }

    @When("^I click the fourth river-post recommendation$")
    public void i_click_the_fourth_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        try {
            posttitle = driver.findElementByXPath("//*[@label='recommended'][4]/UIALink").getText();
            driver.findElementByXPath("//*[@label='recommended'][4]").click();
        }catch (NoSuchElementException e){
            if (driver.findElementsByXPath("//*[@label='recommended']").size()<4) checkPostTitle=false;
            else e.printStackTrace();
        }
    }

    @When("^I click the fifth river-post recommendation$")
    public void i_click_the_fifth_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        try{
            posttitle=driver.findElementByXPath("//*[@label='recommended'][5]/UIALink").getText();
            driver.findElementByXPath("//*[@label='recommended'][5]").click();
        }catch (NoSuchElementException e){
            if (driver.findElementsByXPath("//*[@label='recommended']").size()<5) checkPostTitle=false;
            else e.printStackTrace();
        }
    }

    @Then("^I am redirected to the post$")
    public void i_am_redirected_to_the_post() throws Throwable {
        if(checkPostTitle)
            new PostObject().assertTitle(posttitle);
        new MastHeadObject().back.click();
    }

}
