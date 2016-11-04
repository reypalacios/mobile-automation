package stepDefinitions.ios;

import commands.window;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.MastHeadObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class mastheadSectionTitles extends App {

    @Given("^I am on the home vertical$")
    public void i_am_on_the_home_vertical() throws Throwable {
        String startVertical = new MastHeadObject().title.getText();
        if(!startVertical.equals("HOME")) {
            new appMenu().hamburger_menu_is_open();
            new appMenu().i_click_vertical("HOME");
        }
    }

    @When("^User swipes to the left$")
    public void user_swipes_to_the_left() throws Throwable {
        String startVertical = new MastHeadObject().title.getText();
        window.swipingHorizontal(SWIPE_RIGHT_TO_LEFT);
        if(startVertical.equals(new MastHeadObject().title.getText()))
            window.swipingHorizontal(SWIPE_RIGHT_TO_LEFT);
    }

    @When("^User swipes to the right$")
    public void user_swipes_to_the_right() throws Throwable {
        String startVertical = new MastHeadObject().title.getText();
        window.swipingHorizontal(SWIPE_LEFT_TO_RIGHT);
        if(startVertical.equals(new MastHeadObject().title.getText()))
            window.swipingHorizontal(SWIPE_LEFT_TO_RIGHT);
    }
}