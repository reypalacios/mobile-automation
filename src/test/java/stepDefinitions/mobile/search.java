package stepDefinitions.mobile;

import commands.command;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pageObjects.MastHeadObject;
import pageObjects.PostObject;
import pageObjects.SearchObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class search extends App {
    MastHeadObject Masthead = new MastHeadObject();
    SearchObject Search = new SearchObject();
    PostObject Post = new PostObject();

    @When("^I search for (.*)$")
    public void i_search_for_text(String arg) throws Throwable {
        Masthead.Search.click();
        Search.search(arg);
    }

    @Then("^I see post with title (.*) in the search results$")
    public void i_see_post_with_title_in_the_search_results(String arg) throws Throwable {
        try {
            command.assertEnabled((WebElement) App.driver.findElementsByAccessibilityId(arg).get(1));
        } catch (Exception e) {
            if (e.getMessage().contains("IndexOutOfBoundsException"))
                command.assertEnabled((WebElement) App.driver.findElementsByAccessibilityId(arg).get(0));
            //Search.scrollintoview(arg);
        }
    }

    @When("^I click post with title, (.*)$")
    public void i_click_the_post_with_title(String arg) throws Throwable {
        //First click focus, second click actually clicks
//        try{
//            ((WebElement)(App.driver.findElementsByAccessibilityId(arg).get(1))).click();
//        }catch(WebDriverException e){
//            if (e.getMessage().contains("could not be tapped"))
//                ((WebElement)(App.driver.findElementsByAccessibilityId(arg).get(0))).click();
//            else
//                e.printStackTrace();
//        }
//        Thread.sleep(1000);
//        ((WebElement)(App.driver.findElementsByAccessibilityId(arg).get(0))).click();
        Search.clickPost(arg);
    }

    @Then("^Verify post loads and title is (.*)$")
    public void verify_post_loads_and_title_is_post_title(String arg) throws Throwable {
        Post.assertTitle(arg);
    }
}