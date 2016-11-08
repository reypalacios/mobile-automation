package stepDefinitions.android;

import commands.Window;
import cucumber.api.java.en.When;
import pageObjects.MastHeadObject;
import setUpClasses.App;
import stepDefinitions.ios.AppMenu;

/**
 * Created by rpalacios on 11/13/15.
 */
public class MastheadSectionTitles extends App {

    @When("^User swipes to the left$")
    public void user_swipes_to_the_left() throws Throwable {
        String startVertical = new MastHeadObject().title.getText();
        if(!startVertical.toLowerCase().equals("business insider")) {
            new AppMenu().hamburger_menu_is_open();
            new AppMenu().i_click_vertical("HOME");
        }
        Window.swipingHorizontal(SWIPE_RIGHT_TO_LEFT);
    }

    @When("^User swipes to the right$")
    public void user_swipes_to_the_right() throws Throwable {
        Window.swipingHorizontal(SWIPE_LEFT_TO_RIGHT);
    }
}