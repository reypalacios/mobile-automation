package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectModels.MastHeadObject;
import objectModels.PostObject;
import objectModels.SearchObject;

/**
 * Created by rpalacios on 11/13/15.
 */
public class search {
    MastHeadObject Masthead = new MastHeadObject();
    SearchObject Search = new SearchObject();
    PostObject Post = new PostObject();

    @When("^I search for (.*)$")
    public void i_search_for_text(String arg) throws Throwable {
        Masthead.clickSearch();
        Search.search(arg);
    }

    @Then("^I see post with title (.*) in the search results$")
    public void i_see_post_with_title_in_the_search_results(String arg) throws Throwable {
        Search.scrollintoview(arg);
    }

    @When("^I click post with title, (.*)$")
    public void i_click_the_post_with_title(String arg) throws Throwable {
        Search.clickPost(arg);
    }

    @Then("^Verify post loads and title is (.*)$")
    public void verify_post_loads_and_title_is_post_title(String arg) throws Throwable {
        Post.isTitle(arg);
    }
}