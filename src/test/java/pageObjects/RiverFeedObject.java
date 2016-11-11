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

import static commands.Window.elementHasText;

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
            postHeadlines.get(0).click();
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
            if (App.driver.findElementByXPath("//*[@label='" + posttitle + "']").isEnabled()) {
                App.driver.findElementByXPath("//*[@label='"+posttitle+"']").click();
                Thread.sleep(5000);
                try{
                    if (App.driver.findElementByXPath("//*[@label='" + posttitle + "']").isEnabled()) {
                        System.out.println("Retrying 1...");
                        clickPost(posttitle);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("Post not enabled");
            }
        }catch(Exception e){
            if (e.getMessage().contains("could not be tapped") || e.getMessage().contains("server-side error") || e.getMessage().contains("could not be located")) {
                try {
                    if (App.driver.findElementByXPath("//*[@label='" + posttitle + "']").isDisplayed()) {
                        App.driver.findElementByXPath("//*[@label='" + posttitle + "']").click();
                        Thread.sleep(3000);
                    } else {
                        if (App.driver.findElementByXPath("//*[@label='" + posttitle + "']").isEnabled()) {
                            System.out.println("Retrying 2...");
                            clickPost(posttitle);
                        }
                    }
                }catch(Exception e1){
                    try {
                        if (App.driver.findElementByXPath("//*[@label='" + posttitle + "']").isEnabled()) {
                            System.out.println("Retrying 3...");
                            clickPost(posttitle);
                        }
                    }catch (Exception e3){
                        if(!new PostObject().isAPost()){
                            System.out.println("Retrying 4...");
                            clickPost(posttitle);
                        }
                    }
                }
            }else {
                e.printStackTrace();
            }
        }
        Thread.sleep(3000);
    }
}
