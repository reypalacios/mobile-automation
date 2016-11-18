package stepDefinitions.ios;

import commands.Window;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.MastHeadObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class MastheadSectionTitles {

    @Given("^I am on the home vertical$")
    public void i_am_on_the_home_vertical() throws Throwable {
        String startVertical = new MastHeadObject().verticalLabel.getText();
        if(!startVertical.equals("HOME")) {
            new AppMenu().hamburger_menu_is_open();
            new AppMenu().i_click_vertical("HOME");
        }
    }

    @When("^User swipes to the left$")
    public void user_swipes_to_the_left() throws Throwable {
        String initialVertical = new MastHeadObject().verticalLabel.getText();
        while(initialVertical.equals(new MastHeadObject().verticalLabel.getText())){
            Window.swipingHorizontal(App.SWIPE_RIGHT_TO_LEFT);
        }
    }

    @When("^User swipes to the right$")
    public void user_swipes_to_the_right() throws Throwable {
        String initialVertical = new MastHeadObject().verticalLabel.getText();
        while(initialVertical.equals(new MastHeadObject().verticalLabel.getText())){
            Window.swipingHorizontal(App.SWIPE_LEFT_TO_RIGHT);
        }
    }
}