package pageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

import java.util.List;

/**
 * Created by rpalacios on 12/11/15.
 */
public class DeviceSettingsObject {


    @iOSFindBy(accessibility = "Game Center")
    public static WebElement gameCenter;

    @iOSFindBy(accessibility = "BI")
    public static WebElement BI;

    @iOSFindBy(accessibility = "Notifications")
    public static WebElement notifications;

    @iOSFindBy(accessibility = "Allow Notifications")
    public static List<WebElement> allowNotificaitons;

    public DeviceSettingsObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

}
