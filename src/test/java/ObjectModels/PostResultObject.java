package objectModels;

import appium.App;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSFindBy;


/**
 * Created by khadijaislam on 6/30/16.
 */
public class PostResultObject {


        Logger logger = Logger.getLogger(this.getClass());

        @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]")
        @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]")
        public static WebElement topPost;


        @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIAWebView[1]/UIAStaticText[1]")
        public static WebElement postTitle;


    public PostResultObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.IOSdriver), this);
    }

        public void clickTopPost() throws InterruptedException {
            topPost.click();
            Thread.sleep(4000);
            System.out.println("Click Kebab menu icon");
        }

    public void isArticle(String title) {
       if( postTitle.getText().equals(title)){
           System.out.println("Titles match: "+ title);
       }else{
           System.err.println("Titles don't match: "+ title + " - " + postTitle.getText());
       }


    }
}

