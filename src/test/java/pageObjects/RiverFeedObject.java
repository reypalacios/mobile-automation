package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

import java.util.ArrayList;
import java.util.List;

import static commands.window.elementHasText;

/**
 * Created by rpalacios on 12/11/15.
 */

public class RiverFeedObject {

    int i=0;

    @AndroidFindBy(id = "associated_post_list")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]")
    public static WebElement topPost;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell/UIAStaticText[@visible='true']")
    public static List<WebElement> visiblePosts;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[@visible='false']")
    public static List<WebElement> notVisiblePosts;

    @AndroidFindBy(id = "recommended_cell_headline")
    @iOSFindBys({@iOSFindBy(uiAutomator = ".scrollViews()[0].tableViews()[0].visibleCells()"), @iOSFindBy(accessibility = "cellHeadlineTextView")})
    public static List<WebElement> postHeadline;

    @AndroidFindBy(id = "post_list_loader")
    public static WebElement spinner;

    public RiverFeedObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickTopPost() throws InterruptedException {
        try {
            topPost.click();
        }catch (WebDriverException we){
            if(i>10){
                we.printStackTrace();
            }else {
                System.out.println("i="+i);
                i++;
                clickTopPost();
            }
        }
        Thread.sleep(1000);
    }

    public static ArrayList<String> getVerticalPostTitles() {
        ArrayList<String> postTitleArray = new ArrayList<String>();

        for (WebElement post: postHeadline) {
            if (elementHasText(post)) {
                String postTitle = post.getText();
                // Need to include empty Sponsor Content string in conditional to prevent blank titles
                // iOS only
                if (!postTitle.equals("SPONSOR CONTENT") && !postTitle.equals("")) {
                    postTitleArray.add(postTitle);
                } else {
                    System.out.println("AD CELL");
                }
            }
        }
        return postTitleArray;
    }
}
