package stepDefinitions.ios;

import commands.Window;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pageObjects.MastHeadObject;
import pageObjects.PostObject;
import pageObjects.RiverFeedObject;
import pageObjects.SearchObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class Search {
    MastHeadObject Masthead = new MastHeadObject();
    SearchObject Search = new SearchObject();
    PostObject Post = new PostObject();
    RiverFeedObject RiverFeed = new RiverFeedObject();

    @When("^I search for (.*)$")
    public void i_search_for_text(String arg) throws Throwable {
        Masthead.Search.click();
        Search.search(arg);
    }

    @Then("^I see post with title (.*) in the search results$")
    public void i_see_post_with_title_in_the_search_results(String arg) throws Throwable {
        try {
            Window.assertEnabled((WebElement) App.driver.findElementsByAccessibilityId(arg).get(1));
        } catch (Exception e) {
            if (e.getMessage().contains("IndexOutOfBoundsException"))
                Window.assertEnabled((WebElement) App.driver.findElementsByAccessibilityId(arg).get(0));
        }
    }

    @When("^I click post with title, (.*)$")
    public void i_click_the_post_with_title(String arg) throws Throwable {
        RiverFeed.clickPost(arg);
    }

    @Then("^Verify post loads and title is (.*)$")
    public void verify_post_loads_and_title_is_post_title(String arg) throws Throwable {
        Post.assertTitle(arg);
    }
}