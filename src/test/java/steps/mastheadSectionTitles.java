package steps;

import commands.command;
import cucumber.api.java.en.When;

import static appium.App.SWIPE_LEFT_TO_RIGHT;
import static appium.App.SWIPE_RIGHT_TO_LEFT;

/**
 * Created by rpalacios on 11/13/15.
 */
public class mastheadSectionTitles {

    @When("^User swipes to the left$")
    public void user_swipes_to_the_left() throws Throwable {
        command.swipingHorizontal(SWIPE_RIGHT_TO_LEFT);
    }

    @When("^User swipes to the right$")
    public void user_swipes_to_the_right() throws Throwable {
        command.swipingHorizontal(SWIPE_LEFT_TO_RIGHT);
    }

}