package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;
import setUpClasses.MobileException;

/**
 * Created by rpalacios on 6/27/16.
 */
public class PushPermissionRequestObject{

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

//    public void isDisplayed() throws IOException {
//        try{
//            headline.isDisplayed();
//            maintext.isDisplayed();
//            byline.isDisplayed();
//            enablealerts.isDisplayed();
//            maybelaterlink.isDisplayed();
//            command.embedScreenshot();
//        }catch(Exception e) {
//            new MobileException(e);
//        }
//    }

//    public void isEnableAlertsButtonDisplayed() {
//        try{
//            enablealerts.isDisplayed();
//        }catch(Exception e){
//            new MobileException(e);
//        }
//    }

//    public void isMaybleLaterLinkDisplayed() {
//        try{
//            maybelaterlink.isDisplayed();
//        }catch(Exception e){
//            new MobileException(e);
//        }
//    }

    public void clickEnableAlerts() {
        try {
            enablealerts.click();
            if(App.launchOn.equals("iOS"))
                App.driver.switchTo().alert().accept();
        }catch(Exception e){
            if(e.getMessage().contains("Can't locate an element by this strategy")){
                try {
                    Thread.sleep(3000);
                    enablealerts.click();
                    if(App.launchOn.equals("iOS"))
                        App.driver.switchTo().alert().accept();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }else{
                new MobileException(e);
            }
        }
    }
}
