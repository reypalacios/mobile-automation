package pageObjects;

import commands.command;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

import java.io.IOException;
import java.util.List;

import static commands.command.embedScreenshot;


public class RecommendedForYouObject {

    private static String posttitle;

    @iOSFindBy(xpath = "//*[@label='Recommended For You']")
    public WebElement module;

    @iOSFindBy(xpath = "//*[@name='recommended']")
    public List<WebElement> recommendations;

    public RecommendedForYouObject() {
        PageFactory.initElements(App.driver, this);
    }

    public static String getPosttitle() {
        return posttitle;
    }

    public static void setPosttitle(String posttitle) {
        RecommendedForYouObject.posttitle = posttitle;
    }

    public void isDisplayed() throws IOException, InterruptedException {
        //App.driver.scrollTo("Recommended");
        //new command().scrolldown(App.driver.findElementByXPath("//UIAStaticText[@name='Recommended For You']"));

        App.driver.findElementByXPath("//*[@name='Recommended For You']").click(); //this puts elements in view
        //command.assertDisplay(App.driver.findElementByXPath("//UIAStaticText[@name='Recommended For You']"));
        //App.driver.findElementByXPath("//UIAStaticText[@name='Recommended For You']").click();



        //module.click();
        embedScreenshot(module);
        command.assertDisplay(module);
    }
}
