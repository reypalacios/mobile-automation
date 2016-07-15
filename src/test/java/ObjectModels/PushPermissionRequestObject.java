package objectModels;
import appium.App;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



/**
 * Created by khadijaislam on 6/30/16.
 */
public class PushPermissionRequestObject {
    @AndroidFindBy(id = "news_alerts_headlines_text")
    @iOSFindBy()
    public static WebElement headline;

    @AndroidFindBy(id = "news_alerts_main_text")
    public static WebElement maintext;

    @AndroidFindBy(id = "news_alerts_byline_text")
    public static WebElement byline;

    @AndroidFindBy(id = "news_alerts_enable_alerts_button")
    public static WebElement enablealerts;

    @AndroidFindBy(id = "maybe_later_text")
    public static WebElement maybelatertext;

    public PushPermissionRequestObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clicklMayberLater() {
        System.out.println("Click Maybe Later");
        maybelatertext.click();
    }

    public void isDisplayed() {

    }
}


