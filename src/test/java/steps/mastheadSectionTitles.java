package steps;

import appium.App;
import cucumber.api.java.en.When;
import static appium.App.SWIPE_RIGHT_TO_LEFT;

/**
 * Created by rpalacios on 11/13/15.
 */
public class mastheadSectionTitles {

    @When("^User swipes to the left$")
    public void user_swipes_to_the_left() throws Throwable {
        App.swipingHorizontal(SWIPE_RIGHT_TO_LEFT);
    }



}