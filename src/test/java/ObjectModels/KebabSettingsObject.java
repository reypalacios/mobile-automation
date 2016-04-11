package objectModels;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rpalacios on 12/11/15.
 */
public class KebabSettingsObject {

    Logger logger = Logger.getLogger(this.getClass());

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.ImageButton[1]")
    @iOSFindBy(name = "EasyMenu Icon")
    public static WebElement kebabMenu;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public static WebElement shareApp;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public static WebElement sendFeedback;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public static WebElement settings;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    public static WebElement fontSize;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ListView[1]/android.widget.CheckedTextView[1]")
    public static WebElement smallFont;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ListView[1]/android.widget.CheckedTextView[2]")
    public static WebElement regularFont;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ListView[1]/android.widget.CheckedTextView[3]")
    public static WebElement largeFont;

    public KebabSettingsObject(AppiumDriver<WebElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
    }

    public void clickKebabMenu(){
        kebabMenu.click();
        logger.info("Click Kebab menu icon");
    }
    public void clickShareApp(){
        shareApp.click();
        logger.info("Click Share App");
    }
    public void clickSendFeedback(){
        sendFeedback.click();
        logger.info("Click Send Feedback");
    }
    public void clickSettings(){
        settings.click();
        logger.info("Click Settings");
    }
    public void clickFontSize(){
        fontSize.click();
        logger.info("Click Font Size");
    }
    public void clickSmallFont(){
        smallFont.click();
        logger.info("Click Font Size");
    }
    public void clickRegularFont(){
        regularFont.click();
        logger.info("Click Font Size");
    }
    public void clickLargeFont(){
        largeFont.click();
        logger.info("Click Font Size");
    }

}
