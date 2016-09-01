package stepDefinitions.mobile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MastHeadObject;
import pageObjects.MenuObject;
import pageObjects.PostObject;
import pageObjects.RiverFeedObject;
import setUpClasses.App;

import static commands.command.assertChar;
import static commands.command.assertDisplay;

/**
 * Created by rpalacios on 11/13/15.
 */
public class savedArticles extends App{

    String posttitle;

    @Then("^I save the post$")
    public void i_save_the_post() throws Throwable {
        new MastHeadObject().save.click();
        posttitle = new PostObject().title.getText();
        new MastHeadObject().back.click();
    }

    @When("^I go the the Saved Articles section$")
    public void i_go_the_the_Saved_Articles_section() throws Throwable {
        new MastHeadObject().clickHamburgerMenu();
        new MenuObject().clickVertical("Saved Articles");
    }

    @Then("^Saved post is available$")
    public void saved_post_is_available() throws Throwable {
        assertChar(new RiverFeedObject().topPost.getAttribute("name"),posttitle);
    }

    @When("^I am on a saved post$")
    public void i_am_on_a_saved_post() throws Throwable {
        RiverFeedObject.topPost.click();
    }

    @Then("^I unsave the post$")
    public void i_unsave_the_post() throws Throwable {
        new MastHeadObject().saveOn.click();
        assertDisplay(new MenuObject().home);
        assertDisplay(new MastHeadObject().closeMenu);
        new MastHeadObject().isCurrentTitle("BUSINESS INSIDER");
    }
}