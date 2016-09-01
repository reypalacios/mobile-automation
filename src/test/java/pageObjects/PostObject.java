package pageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setUpClasses.App;
import setUpClasses.MobileException;

import java.io.IOException;

/**
 * Created by rpalacios on 12/11/15.
 */
public class PostObject{

    @iOSFindBy(xpath = "//UIAScrollView[1]/UIAScrollView[2]/UIAWebView[1]/UIAStaticText[1]")
    public static WebElement title;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[2]")
    public static WebElement author;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[3]")
    public static WebElement posteddate;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[4]")
    public static WebElement postedtime;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[5]")
    public static WebElement views;

    @iOSFindBy(xpath = "//UIAWebView/UIALink[1]")
    public static WebElement comments;

    @iOSFindBy(xpath = "//UIAWebView/UIAImage[1]")
    public static WebElement image;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[6]")
    public static WebElement imagecaption;

    public PostObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void assertTitle(String expectedTitle) throws InterruptedException, MobileException, IOException {

        try {
            Assert.assertEquals(title.getText().toLowerCase(), expectedTitle.toLowerCase());
        }catch(Exception e){
            new MobileException(e);
        }
    }
}
