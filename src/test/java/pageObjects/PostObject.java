package pageObjects;

import commands.Window;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setUpClasses.App;

import java.io.IOException;

/**
 * Created by rpalacios on 12/11/15.
 */
public class PostObject{

    @AndroidFindBy(id = "post_headline_text")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]")
    public static WebElement title;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[2]")
    public static WebElement author;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[3]")
    public static WebElement postedDate;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[4]")
    public static WebElement postedTime;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[5]")
    public static WebElement views;

    @iOSFindBy(xpath = "//UIAWebView/UIALink[1]")
    public static WebElement comments;

    @iOSFindBy(xpath = "//UIAWebView/UIAImage[1]")
    public static WebElement image;

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[6]")
    public static WebElement imageCaption;

    public PostObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void assertTitle(String expectedTitle) throws InterruptedException, IOException {
        Window.assertChar(title.getText(), expectedTitle);
    }

    public boolean isAPost() {
        try {
            Assert.assertEquals(title.isEnabled(),true);
            Assert.assertEquals(author.isEnabled(),true);
            return true;
        }catch(AssertionError e){
            return false;
        }catch(NoSuchElementException n){
            return false;
        }
    }
}
