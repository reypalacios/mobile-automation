package steps;

import appium.App;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectModels.PushPermissionRequestObject;

/**
 * Created by rpalacios on 11/13/15.
 */
public class pushPermissionRequest extends App {

    PushPermissionRequestObject PushPermissionRequest = new PushPermissionRequestObject();

    @When("^I open the app for the first time$")
    public void i_open_the_app_for_the_first_time() throws Throwable {
        driver.resetApp();
        while(driver.findElementsById("news_alerts_headlines_text").isEmpty()){
            //Thread.sleep(1000);
        }
        //Thread.sleep(4000);
    }

    @Then("^I see the push permission request screen$")
    public void i_see_the_push_permission_request_screen() throws Throwable {
        PushPermissionRequest.isDisplayed();
        
    }

    @Then("^with two call to actions, to opt-in \"([^\"]*)\" and to opt-out \"([^\"]*)\"$")
    public void with_two_call_to_actions_to_opt_in_and_to_opt_out(String arg1, String arg2) throws Throwable {
        
        
    }

    @When("^I tap on \"([^\"]*)\"$")
    public void i_tap_on(String arg1) throws Throwable {
        
        
    }

    @Then("^The 'Push Notifications' Setting in the app is set to ON$")
    public void the_Push_Notifications_Setting_in_the_app_is_set_to_ON() throws Throwable {
        
        
    }

    @Then("^The 'Push Notifications' Setting in the app is set to OFF$")
    public void the_Push_Notifications_Setting_in_the_app_is_set_to_OFF() throws Throwable {
        
        
    }

    @When("^I upgrade my app$")
    public void i_upgrade_my_app() throws Throwable {
        
        
    }

    @Then("^I do not see the push permission request screen again$")
    public void i_do_not_see_the_push_permission_request_screen_again() throws Throwable {
        
        
    }




}