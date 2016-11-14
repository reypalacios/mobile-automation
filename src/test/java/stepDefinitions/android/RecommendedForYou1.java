package stepDefinitions.android;

import commands.Window;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;
import setUpClasses.App;

/**
 * Created by rpalacios on 6/6/16.
 */
public class RecommendedForYou1 extends App {
    RecommendedForYouObject recommendedForYou = new RecommendedForYouObject();
    RiverFeedObject RiverFeed = new RiverFeedObject();

    @Given("^I am on the post page$")
    public void I_am_on_the_post_page() throws Throwable {
        new PushPermissionRequestObject().clickEnableAlerts();
        RiverFeed.clickTopPost();
    }

    @Then("^River post recommended for you module is displayed$")
    public void river_post_recommended_for_you_module_is_displayed() throws Throwable {
        recommendedForYou.isDisplayed();
    }

    @When("^I click the first river-post recommendation$")
    public void i_click_the_first_river_post_recommendation() throws Throwable {
        Window.scrollIntoView(recommendedForYou.recommendations,0);
        posttitle=recommendedForYou.recommendations.get(0).getText();
        recommendedForYou.recommendations.get(0).click();
    }

    @When("^I click the second river-post recommendation$")
    public void i_click_the_second_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        Window.scrollIntoView(recommendedForYou.recommendations,1);
        posttitle=recommendedForYou.recommendations.get(1).getText();
        recommendedForYou.recommendations.get(1).click();
    }

    @When("^I click the third river-post recommendation$")
    public void i_click_the_third_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        Window.scrollIntoView(recommendedForYou.recommendations,2);
        posttitle = recommendedForYou.recommendations.get(2).getText();
        recommendedForYou.recommendations.get(2).click(); //Focus
    }

    @When("^I click the fourth river-post recommendation$")
    public void i_click_the_fourth_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        Window.scrollIntoView(recommendedForYou.recommendations,3);
        posttitle = recommendedForYou.recommendations.get(3).getText();
        recommendedForYou.recommendations.get(3).click(); //Focus
    }

    @When("^I click the fifth river-post recommendation$")
    public void i_click_the_fifth_river_post_recommendation() throws Throwable {
        RiverFeed.clickTopPost();
        Window.scrollIntoView(recommendedForYou.recommendations,3);
        posttitle=recommendedForYou.recommendations.get(3).getText();
        recommendedForYou.recommendations.get(3).click(); //Focus
    }

    @Then("^I am redirected to the post$")
    public void i_am_redirected_to_the_post() throws Throwable {
        new PostObject().assertTitle(posttitle);
        new MastHeadObject().back.click();
    }
}
