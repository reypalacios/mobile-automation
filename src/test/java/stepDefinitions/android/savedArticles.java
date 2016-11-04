package stepDefinitions.android;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MastHeadObject;
import pageObjects.MenuObject;
import pageObjects.PostObject;
import pageObjects.SavedArticlesObject;
import setUpClasses.App;

import static commands.window.assertChar;
import static commands.window.assertDisplay;

/**
 * Created by rpalacios on 11/13/15.
 */
public class savedArticles extends App{

    String posttitle;
    SavedArticlesObject SavedArticles = new SavedArticlesObject();
    MenuObject Menu = new MenuObject();
    MastHeadObject Masthead = new MastHeadObject();
    PostObject Post =new PostObject();

    @Then("^I save the post$")
    public void i_save_the_post() throws Throwable {
        Masthead.save.click();
        posttitle = Post.title.getText();
        Masthead.back.click();
    }

    @When("^I go the the Saved Articles section$")
    public void i_go_the_the_Saved_Articles_section() throws Throwable {
        Masthead.clickHamburgerMenu();
        Menu.clickVertical("Saved Articles");
    }

    @Then("^Saved post is available$")
    public void saved_post_is_available() throws Throwable {
        assertChar(SavedArticles.postsheadlines.get(0).getText(),posttitle);
    }

    @When("^I am on a saved post$")
    public void i_am_on_a_saved_post() throws Throwable {
        SavedArticles.posts.get(0).click();
    }

    @Then("^I unsave the post$")
    public void i_unsave_the_post() throws Throwable {
        new MastHeadObject().saveOn.click();
        assertDisplay(Menu.home);
        assertDisplay(Masthead.closeMenu);
        Masthead.isCurrentTitle("BUSINESS INSIDER");
    }

    @When("^I unsave the post via saved articles$")
    public void i_unsave_the_post_via_saved_articles() throws Throwable {
    
    }
}