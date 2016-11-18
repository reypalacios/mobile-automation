package pageObjects;

import conditions.ElementPresent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import setUpClasses.App;

import java.util.ArrayList;
import java.util.List;

import static commands.Window.elementHasText;
import static setUpClasses.App.driver;

/**
 * Created by rpalacios on 12/11/15.
 */

public class RiverFeedObject {

    int i=0;

    @AndroidFindBy(id = "recommended_cell_headline")
    @iOSFindBys({@iOSFindBy(uiAutomator = ".scrollViews()[0].tableViews()[0].visibleCells()"), @iOSFindBy(accessibility = "cellHeadlineTextView")})
    public static List<WebElement> postHeadlines;

    @iOSFindBy(accessibility = "cellImageView")
    public static List<WebElement> images;

    @iOSFindBy(accessibility = "cellAuthorView")
    public static List<WebElement> authors;

    @iOSFindBy(accessibility = "cellTimeAgedView")
    public static List<WebElement> timeAgeds;

    @iOSFindBy(accessibility = "brandingColorView")
    public static List<WebElement> brandingColors;

    @iOSFindBy(accessibility = "cellFlameView")
    public static List<WebElement> flames;

    @iOSFindBy(accessibility = "cellNumOfViews")
    public static List<WebElement> numOfViews;

    @iOSFindBy(accessibility = "cellTimeViewsContainer")
    public static List<WebElement> timeViewsContainers;

    @iOSFindBy(accessibility = "cellTimeIcon")
    public static List<WebElement> timeIcons;

    @iOSFindBy(accessibility = "cellAging")
    public static List<WebElement> agings;

    @iOSFindBy(accessibility = "cellCommentsIcon")
    public static List<WebElement> commentsIcons;

    @iOSFindBy(accessibility = "cellNumOfComments")
    public static List<WebElement> numOfComments;

    @iOSFindBy(accessibility = "cellSearchSnippet")
    public static List<WebElement> searchSnippets;

    @AndroidFindBy(id = "post_list_loader")
    public static WebElement spinner;

    public RiverFeedObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickTopPost() throws InterruptedException {
        try {
            new WebDriverWait(driver, 30).until(new ElementPresent(postHeadlines.get(0)));
            postHeadlines.get(0).click();
        }catch (WebDriverException we){
            if(i>10){
                we.printStackTrace();
            }else {
                System.out.println("i="+i);
                i++;
                clickTopPost();
            }
        }catch(IndexOutOfBoundsException o){
            o.printStackTrace();
        }
        Thread.sleep(1000);
    }

    public static ArrayList<String> getVerticalPostTitles() {
        ArrayList<String> postTitleArray = new ArrayList<String>();

        for (WebElement post: postHeadlines) {
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

    public void clickPost(String posttitle) throws InterruptedException {
        try{
            App.driver.findElementByAccessibilityId(posttitle).click();
            Thread.sleep(3000);
            try {
                if (App.driver.findElementByAccessibilityId(posttitle).isEnabled()) {
                    System.out.println("Retrying click on post(1)...");
                    clickPost(posttitle);
                }
            }catch(NoSuchElementException n){
                System.out.println("User is in the post");
            }
        }catch(Exception e){
            try{
                if (e.getMessage().contains("could not be tapped") || e.getMessage().contains("server-side error") || e.getMessage().contains("could not be located")) {
                    App.driver.findElementByAccessibilityId(posttitle).click();
                    Thread.sleep(3000);
                    try {
                        if (App.driver.findElementByAccessibilityId(posttitle).isEnabled()) {
                            System.out.println("Retrying click on post(2)");
                            clickPost(posttitle);
                        }
                    }catch(NoSuchElementException n){
                        System.out.println("User is in the post");
                    }
                }else {
                    e.printStackTrace();
                }
            }catch(Exception e1){
                if (e1.getMessage().contains("could not be tapped") || e.getMessage().contains("server-side error") || e.getMessage().contains("could not be located")) {
                    if (App.driver.findElementByAccessibilityId(posttitle).isEnabled()) {
                        System.out.println("Retrying click on post(3)");
                        clickPost(posttitle);
                    }else{
                        e1.printStackTrace();
                    }
                }
            }
        }
        Thread.sleep(3000);
    }
}
