package stepDefinitions.mobile;

import commands.command;
import cucumber.api.java.en.When;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class mastheadSectionTitles extends App {

    @When("^User swipes to the left$")
    public void user_swipes_to_the_left() throws Throwable {
        command.swipingHorizontal(SWIPE_RIGHT_TO_LEFT);
    }

    @When("^User swipes to the right$")
    public void user_swipes_to_the_right() throws Throwable {
        command.swipingHorizontal(SWIPE_LEFT_TO_RIGHT);
    }

}