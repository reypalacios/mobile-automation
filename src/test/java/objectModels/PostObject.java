package objectModels;

import setUpClasses.App;
import setUpClasses.MobileException;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static commands.command.embedScreenshot;

/**
 * Created by rpalacios on 12/11/15.
 */
public class PostObject {

    @iOSFindBy(xpath = "//UIAWebView/UIAStaticText[1]")
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

    public void isTitle(String expectedTitle) throws InterruptedException, MobileException, IOException {
        if (!title.getText().equalsIgnoreCase(expectedTitle))
            throw new MobileException("Titles do not match: Current title is "+title.getText() + " and Expected title is "+expectedTitle);
        else {
            System.out.println("Current title is " + expectedTitle);
            embedScreenshot();
        }
    }
}
