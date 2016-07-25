package objectModels;

import setUpClasses.App;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rpalacios on 12/11/15.
 */
public class PostResultsObject {

    Logger logger = Logger.getLogger(this.getClass());

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]")
    public static WebElement topPost;

    public PostResultsObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickTopPost() throws InterruptedException {
        topPost.click();
        Thread.sleep(4000);
        System.out.println("Click Kebab menu icon");
    }
}
