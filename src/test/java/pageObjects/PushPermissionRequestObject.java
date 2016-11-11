package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

/**
 * Created by rpalacios on 6/27/16.
 */
public class PushPermissionRequestObject{

    @AndroidFindBy(id = "news_alerts_headlines_text")
    @iOSFindBy (accessibility = "pa_Logo6.png")
    public static WebElement headline;

    @AndroidFindBy(id = "news_alerts_main_text")
    @iOSFindBy (accessibility = "News Alerts")
    public static WebElement mainText;

    @AndroidFindBy(id = "news_alerts_byline_text")
    @iOSFindBy (accessibility = "We‘ll send you alerts when there are  important updates.")
    public static WebElement byline;

    @AndroidFindBy(id = "news_alerts_enable_alerts_button")
    @iOSFindBy (accessibility = "ENABLE ALERTS")
    public static WebElement enableAlerts;

    @AndroidFindBy(id = "maybe_later_text")
    @iOSFindBy (accessibility = "Maybe Later")
    public static WebElement maybeLater;

    public PushPermissionRequestObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickEnableAlerts() {
        try {
            enableAlerts.click();
            if(App.launchOn.equals("iOS"))
                App.driver.switchTo().alert().accept();
        }catch(Exception e){
            if(e.getMessage().contains("Can't locate an element by this strategy")){
                try {
                    Thread.sleep(3000);
                    enableAlerts.click();
                    if(App.launchOn.equals("iOS"))
                        App.driver.switchTo().alert().accept();
                } catch (InterruptedException i) {
                    i.printStackTrace();
                } catch (NoSuchElementException n){
                    n.printStackTrace();
                }
            }else{
                e.printStackTrace();
            }
        }
    }
}
