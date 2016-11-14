package stepDefinitions.android;

import conditions.ElementNotVisible;
import conditions.ElementPresent;
import conditions.ElementsPresent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.RiverFeedObject;

import java.util.Iterator;
import java.util.LinkedHashSet;

import static commands.Window.verticalSwipe;
import static pageObjects.RiverFeedObject.getVerticalPostTitles;
import static pageObjects.RiverFeedObject.spinner;
import static pageObjects.RiverFeedObject.*;
import static setUpClasses.App.driver;


public class PostsLoadWhenScrollingDownVertical {

    private RiverFeedObject riverFeed;
    private LinkedHashSet<String> verticalPostTitles = new LinkedHashSet<>();

    @Given("^the first payload of posts display in a vertical$")
    public void theFirstPayloadOfPostsDisplayInAVertical() throws Throwable {
        System.out.println("I AM ON A VERTICAL");
        riverFeed = new RiverFeedObject();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(new ElementPresent(postHeadlines.get(0)));
    }

    @When("^I scroll down (\\w+) posts$")
    public void iScrollDownToTheLastPostInTheFirstPayload(int totalPosts) throws Throwable {
        System.out.println("I SCROLL DOWN A VERTICAL");
        riverFeed = new RiverFeedObject();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        while (verticalPostTitles.size() < totalPosts) {
            int totalTitlesBeforeSwipe = verticalPostTitles.size();
            wait.until(new ElementsPresent(postHeadlines));
            verticalPostTitles.addAll(getVerticalPostTitles());
            verticalSwipe(0.90, 0.30);
            wait.until(new ElementNotVisible(spinner));
            int totalTitlesAfterSwipe = verticalPostTitles.size();

            Boolean areMorePostsPresent = totalTitlesAfterSwipe > totalTitlesBeforeSwipe;
            // Verify that more posts are displayed
            Assert.assertTrue(areMorePostsPresent, "ERROR: MORE POSTS DID NOT LOAD");

            System.out.println("TOTAL TITLES: " + verticalPostTitles.size());
        }

        // Get total posts
        int totalPostsFirstPayload = verticalPostTitles.size();

        // Log posts displayed on each scroll
        System.out.println("TOTAL TITLES: " + totalPostsFirstPayload);

        Iterator<String> itr = verticalPostTitles.iterator();
        while (itr.hasNext()) {
            System.out.println("POST TITLE: " + itr.next());
        }
    }

    @Then("^more than (\\w+) posts are displayed$")
    public void theNextPayloadOfPostsDisplay(int totalPosts) throws Throwable {
        System.out.println("MORE POSTS LOAD");
        riverFeed = new RiverFeedObject();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(new ElementsPresent(postHeadlines));
        verticalSwipe(0.90, 0.30);
        verticalPostTitles.addAll(getVerticalPostTitles());

        int totalPostsNextPayload = verticalPostTitles.size();

        // Log posts displayed
        System.out.println("TOTAL TITLES: " + totalPostsNextPayload);

        Iterator<String> itr = verticalPostTitles.iterator();
        while (itr.hasNext()) {
            System.out.println("POST TITLE: " + itr.next());
        }

        // Compare total posts displayed before load to total posts displayed after load
        //iOS=19 Android=9
        Boolean areMorePostsPresent = totalPostsNextPayload > totalPosts;
        // Verify that more posts are displayed
        Assert.assertTrue(areMorePostsPresent, "ERROR: MORE POSTS DID NOT LOAD");
    }
}
