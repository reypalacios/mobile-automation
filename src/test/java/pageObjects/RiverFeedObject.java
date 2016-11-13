package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;
import java.lang.annotation.Repeatable;

import java.util.ArrayList;
import java.util.List;

import static commands.Window.elementHasText;

/**
 * Created by rpalacios on 12/11/15.
 */

public class RiverFeedObject {

    int i=0;

    @AndroidFindBy(id = "associated_post_list")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[1]")
    public static WebElement topPost;

    @AndroidFindBy(id = "recommended_cell_headline")
    @iOSFindBys({@iOSFindBy(uiAutomator = ".scrollViews()[0].tableViews()[0].visibleCells()"), @iOSFindBy(accessibility = "cellHeadlineTextView")})
    public static List<WebElement> postHeadline;

    @iOSFindBy(accessibility = "cellImageView")
    public static List<WebElement> images;

    @iOSFindBy(accessibility = "cellAuthorView")
    public static List<WebElement> authors;

    @iOSFindBy(accessibility = "cellTimeAgedView")
    public static List<WebElement> timeageds;

    @iOSFindBy(accessibility = "brandingColorView")
    public static List<WebElement> brandingcolors;

    @iOSFindBy(accessibility = "cellFlameView")
    public static List<WebElement> flames;

    @iOSFindBy(accessibility = "cellNumOfViews")
    public static List<WebElement> numofviews;

    @iOSFindBy(accessibility = "cellTimeViewsContainer")
    public static List<WebElement> timeviewscontainers;

    @iOSFindBy(accessibility = "cellTimeIcon")
    public static List<WebElement> timeicons;

    @iOSFindBy(accessibility = "cellAging")
    public static List<WebElement> agings;

    @iOSFindBy(accessibility = "cellCommentsIcon")
    public static List<WebElement> commentsicons;

    @iOSFindBy(accessibility = "cellNumOfComments")
    public static List<WebElement> numofcomments;

    @iOSFindBy(accessibility = "cellSearchSnippet")
    public static List<WebElement> searchsnippets;

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
