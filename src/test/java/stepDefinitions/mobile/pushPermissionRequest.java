package stepDefinitions.mobile;

import commands.command;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PushPermissionRequestObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class pushPermissionRequest extends App {

    PushPermissionRequestObject PushPermissionRequest = new PushPermissionRequestObject();

    @When("^I open the app for the first time$")
    public void i_open_the_app_for_the_first_time() throws Throwable {
        if (App.launchOn.equals("Android")){
            command.resetApp();
            Thread.sleep(4000);
        }else {
            App.driver.removeApp(App.bundleid);
            new App().launch(true);
        }

    }

    @Then("^I see the push permission request screen$")
    public void i_see_the_push_permission_request_screen() throws Throwable {
        Thread.sleep(5000);
        command.assertDisplay(new PushPermissionRequestObject().headline);
        command.assertDisplay(new PushPermissionRequestObject().maintext);
        command.assertDisplay(new PushPermissionRequestObject().byline);
        command.assertDisplay(new PushPermissionRequestObject().enablealerts);
        command.assertDisplay(new PushPermissionRequestObject().maybelaterlink);
        command.embedScreenshot();

//        new PushPermissionRequestObject().isDisplayed();
    }

    @Then("^Two call to actions are available, to opt-in \"([^\"]*)\" and to opt-out \"([^\"]*)\"$")
    public void two_call_to_actions_are_available_to_opt_in_and_to_opt_out(String arg1, String arg2) throws Throwable {
        command.assertDisplay(new PushPermissionRequestObject().enablealerts);
        //PushPermissionRequest.isEnableAlertsButtonDisplayed();
        command.assertDisplay(new PushPermissionRequestObject().maybelaterlink);
        //PushPermissionRequest.isMaybleLaterLinkDisplayed();
    }

    @When("^I tap on \"([^\"]*)\"$")
    public void i_tap_on(String arg1) throws Throwable {
        new PushPermissionRequestObject().clickEnableAlerts();
    }

    @Then("^The 'Push Notifications' Setting in the app is set to ON$")
    public void the_Push_Notifications_Setting_in_the_app_is_set_to_ON() throws Throwable {

    }

    @Then("^The 'Push Notifications' Setting in the app is set to OFF$")
    public void the_Push_Notifications_Setting_in_the_app_is_set_to_OFF() throws Throwable {

    }

    @When("^I open previous app version for first time$")
    public void i_open_previous_app_version_for_first_time() throws Throwable {
        System.out.println("Remove current APP ");
        if(App.launchOn.equals("Android")) {
            App.driver.removeApp(App.apppackage);
            System.out.println("Install previous APP version:" + App.oldapk);
            App.apk = App.oldapk;
        }else {
            App.driver.removeApp(App.bundleid);
            System.out.println("Install previous APP version:" + App.oldapp);
            App.app = App.oldapp;
        }
        new App().launch(true);
        Thread.sleep(3000);
    }

    @When("^I upgrade my app$")
    public void i_upgrade_my_app() throws Throwable {
        command.upgradeApp();
    }

    @Then("^I do not see the push permission request screen again$")
    public void i_do_not_see_the_push_permission_request_screen_again() throws Throwable {
        Thread.sleep(7000);
        command.embedScreenshot();
    }
    @When("^I put the app in the background and re-open it again$")
    public void i_put_the_app_in_the_background_and_re_open_it_again() throws Throwable {
        //command.upgradeApp();
        command.runAppinBackground(2);
        //Thread.sleep(2000);
    }

    @When("^I close the app and re-open it$")
    public void i_close_the_app_and_re_open_it() throws Throwable {
        command.closeApp();
        command.launchApp();

    }
}