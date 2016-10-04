package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

import java.util.List;

/**
 * Created by rpalacios on 12/11/15.
 */
public class SavedArticlesObject {

    @AndroidFindBys(@AndroidFindBy(id = "recommended_cell_frame"))
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell")
    public static List<WebElement> posts;

    @AndroidFindBys(@AndroidFindBy(id = "recommended_cell_headline"))
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText")
    public static List<WebElement> postsheadlines;

    public SavedArticlesObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickTopPost() throws InterruptedException {
        try {
            posts.get(0).click();
        }catch (WebDriverException we){
            clickTopPost();
        }
        Thread.sleep(1000);
    }
}
