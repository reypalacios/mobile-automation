package stepDefinitions.ios;

import commands.Window;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pageObjects.DeviceSettingsObject;
import pageObjects.PushPermissionRequestObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class PushPermissionRequest {

    @When("^I open the app for the first time$")
    public void i_open_the_app_for_the_first_time() throws Throwable {
        App.driver.removeApp(App.bundleid);
        new App().launch(true);
    }

    @Then("^I see the push permission request screen$")
    public void i_see_the_push_permission_request_screen() throws Throwable {
        Thread.sleep(5000);
        Window.assertDisplay(new PushPermissionRequestObject().headline);
        Window.assertDisplay(new PushPermissionRequestObject().mainText);
        Window.assertDisplay(new PushPermissionRequestObject().byline);
        Window.assertDisplay(new PushPermissionRequestObject().enableAlerts);
        Window.assertDisplay(new PushPermissionRequestObject().maybeLater);
        //command.embedScreenshot();
    }

    @Then("^Two call to actions are available, to opt-in \"([^\"]*)\" and to opt-out \"([^\"]*)\"$")
    public void two_call_to_actions_are_available_to_opt_in_and_to_opt_out(String arg1, String arg2) throws Throwable {
        Window.assertDisplay(new PushPermissionRequestObject().enableAlerts);
        Window.assertDisplay(new PushPermissionRequestObject().maybeLater);
    }

    @When("^I tap on \"([^\"]*)\"$")
    public void i_tap_on(String arg) throws Throwable {
        if(arg.equals("Enable alerts"))
            new PushPermissionRequestObject().clickEnableAlerts();
        else
            new PushPermissionRequestObject().maybeLater.click();
    }

    @Then("^The 'Push Notifications' Setting in the app is set to ON$")
    public void the_Push_Notifications_Setting_in_the_app_is_set_to_ON() throws Throwable {
        App.launchDeviceSettings();
        //Window.scrolldown(new DeviceSettingsObject().gameCenter);
        new DeviceSettingsObject().BI.click();
        new DeviceSettingsObject().notifications.click();
        Window.assertSelected((WebElement) new DeviceSettingsObject().allowNotificaitons.get(2));
    }

    @Then("^The 'Push Notifications' Setting in the app is set to OFF$")
    public void the_Push_Notifications_Setting_in_the_app_is_set_to_OFF() throws Throwable {
        App.launchDeviceSettings();
        Window.scrolldown(new DeviceSettingsObject().gameCenter);
        new DeviceSettingsObject().BI.click();
        Window.assertNotDisplay(new DeviceSettingsObject().notifications);
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
        Window.upgradeApp();
    }

    @Then("^I do not see the push permission request screen again$")
    public void i_do_not_see_the_push_permission_request_screen_again() throws Throwable {
        Thread.sleep(7000);
        Window.assertNotDisplay(new PushPermissionRequestObject().headline);
        Window.assertNotDisplay(new PushPermissionRequestObject().mainText);
        Window.assertNotDisplay(new PushPermissionRequestObject().byline);
        Window.assertNotDisplay(new PushPermissionRequestObject().enableAlerts);
        Window.assertNotDisplay(new PushPermissionRequestObject().maybeLater);
       // command.embedScreenshot();
    }
    @When("^I put the app in the background and re-open it again$")
    public void i_put_the_app_in_the_background_and_re_open_it_again() throws Throwable {
        Window.runAppinBackground(2);
    }

    @When("^I close the app and re-open it$")
    public void i_close_the_app_and_re_open_it() throws Throwable {
        Window.closeApp();
        Window.launchApp();
    }
}