package objectModels;

import appium.App;
import appium.MobileException;
import commands.command;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rpalacios on 6/27/16.
 */
public class PushPermissionRequestObject {

    @AndroidFindBy(id = "news_alerts_headlines_text")
    @iOSFindBy (xpath = "//UIAImage[@name='pa_Logo6.png']")
    public static WebElement headline;

    @AndroidFindBy(id = "news_alerts_main_text")
    @iOSFindBy (xpath = "//UIAStaticText[@name='News Alerts']")
    public static WebElement maintext;

    @AndroidFindBy(id = "news_alerts_byline_text")
    @iOSFindBy (xpath = "//UIAStaticText[@name='We‘ll send you alerts when there are  important updates.']")
    public static WebElement byline;

    @AndroidFindBy(id = "news_alerts_enable_alerts_button")
    @iOSFindBy (xpath = "//UIAButton[@name='ENABLE ALERTS']")
    public static WebElement enablealerts;

    @AndroidFindBy(id = "maybe_later_text")
    @iOSFindBy (xpath = "//UIAButton[@name='Maybe Later']")
    public static WebElement maybelaterlink;

    public PushPermissionRequestObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clicklMayberLater() {
        System.out.println("Click Maybe Later");
        maybelaterlink.click();
    }

    public void isDisplayed() throws IOException {
        try{
            headline.isDisplayed();
            maintext.isDisplayed();
            byline.isDisplayed();
            enablealerts.isDisplayed();
            maybelaterlink.isDisplayed();
            command.embedScreenshot();
        }catch(NoSuchElementException e) {
            System.err.println("Push Permission Request Screen is missing an element: " + e.getMessage());
            new MobileException(e);
        }
    }

    public void isEnableAlertsButtonDisplayed() {
        try{
            enablealerts.isDisplayed();
            System.out.println("Enable Alerts button is displayed");
        }catch(NoSuchElementException e){
            System.err.println("Enable Alerts button is not displayed");
            new MobileException(e);
        }
    }

    public void isMaybleLaterLinkDisplayed() {
        try{
            maybelaterlink.isDisplayed();
            System.out.println("Maybe-later link is displayed");
        }catch(NoSuchElementException e){
            System.err.println("Maybe-later link is not displayed");
            new MobileException(e);
        }
    }

    public void clickEnableAlerts() {
        System.out.println("Click Enable Alerts");
        enablealerts.click();
    }
}
