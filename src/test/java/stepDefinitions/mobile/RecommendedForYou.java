package stepDefinitions.mobile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectModels.RecommendedForYouObject;
import objectModels.RiverFeedObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 6/6/16.
 */
public class recommendedForYou extends App {
    RecommendedForYouObject RecommendedForYou = new RecommendedForYouObject();
    RiverFeedObject RiverFeed = new RiverFeedObject();

    @Given("^I am on the post page$")
    public void I_am_on_the_post_page() throws Throwable {
        RiverFeed.clickTopPost();
    }

    @Then("^River post recommended for you module is displayed$")
    public void river_post_recommended_for_you_module_is_displayed() throws Throwable {
        RecommendedForYou.isDisplayed();
    }

    @When("^I click the first river-post recommendation$")
    public void i_click_the_first_river_post_recommendation() throws Throwable {
        RecommendedForYou.clickFirstRecommendation();
    }

    @When("^I click the second river-post recommendation$")
    public void i_click_the_second_river_post_recommendation() throws Throwable {
        RecommendedForYou.clickSecondRecommendation();
    }

    @When("^I click the third river-post recommendation$")
    public void i_click_the_third_river_post_recommendation() throws Throwable {
        RecommendedForYou.clickThirdRecommendation();
    }

    @When("^I click the fourth river-post recommendation$")
    public void i_click_the_fourth_river_post_recommendation() throws Throwable {
        RecommendedForYou.clickFourthRecommendation();
    }

    @When("^I click the fifth river-post recommendation$")
    public void i_click_the_fifth_river_post_recommendation() throws Throwable {
        RecommendedForYou.clickFifthRecommendation();
    }

}
