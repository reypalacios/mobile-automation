package pageObjects;

import commands.Window;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

import java.io.IOException;
import java.util.List;


public class RecommendedForYouObject {

    private static String posttitle;

    @AndroidFindBy(id = "post_recommended_separator_text")
    @iOSFindBy(xpath = "//*[@name='Recommended For You']")
    public WebElement module;

    //@AndroidFindBy(xpath = "//*[@resource-id='com.freerange360.mpp.businessinsider:id/post_recommended_list']//@[]")
    @AndroidFindBy(id = "recommended_cell_headline")
    @iOSFindBy(xpath = "//*[@name='recommended']/UIALink")
    public List<WebElement> recommendations;

    public RecommendedForYouObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public static String getPosttitle() {
        return posttitle;
    }

    public static void setPosttitle(String posttitle) {
        RecommendedForYouObject.posttitle = posttitle;
    }

    public void isDisplayed() throws IOException, InterruptedException {
        if(App.launchOn.equals("Android")) {
            Window.scrollIntoView(module);
            Window.assertDisplay(module);
        }else {
            module.click();
            Window.assertDisplay(module);
        }
    }
}
