package pageObjects;

import commands.command;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;
import setUpClasses.MobileException;

import java.io.IOException;

import static commands.command.embedScreenshot;
import static commands.command.scrollIntoView;


public class RecommendedForYouObject {

    private static String posttitle;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIAWebView[1]")
    public WebElement module;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIAWebView[1]/UIALink[18]/UIALink[1]/UIAStaticText[1]")
    //@iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIAWebView[1]/UIALink[@label='recommended'][1]/UIALink/UIAStaticText")
    //@iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIAWebView[1]/UIALink[20]")
    public WebElement firstrecommendation;

    @iOSFindBy(xpath = "//section[@class='recommended wide']//li[@class='recommended-listitem'][2]//img[@class='recommended-image']")
    public WebElement secondrecommendation;

    @iOSFindBy(xpath = "//section[@class='recommended wide']//li[@class='recommended-listitem'][3]//img[@class='recommended-image']")
    public WebElement thirdrecommendation;

    @iOSFindBy(xpath = "//section[@class='recommended wide']//li[@class='recommended-listitem'][4]//img[@class='recommended-image']")
    public WebElement fourthrecommendation;

    @iOSFindBy(xpath = "//section[@class='recommended wide']//li[@class='recommended-listitem'][5]//img[@class='recommended-image']")
    public WebElement fifthrecommendation;

    @iOSFindBy(xpath = "//section[@class='recommended wide']//li[@class='recommended-listitem'][5]//img[@class='recommended-image']")
    public WebElement fr;

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
        new command().scrolldown(App.driver.findElementByXPath("//UIAStaticText[@name='Recommended']"));
        App.driver.findElementByXPath("//UIAStaticText[@name='Recommended']").click();



        if(module.isDisplayed()) {
            embedScreenshot(module);
            scrollIntoView(module);
            System.out.println("River Post: Recommended For You module is displayed");
        }else
            new MobileException("River Post: Recommended For You module is not displayed");
    }

    public void clickFirstRecommendation() throws InterruptedException {
        setPosttitle(firstrecommendation.getText());
        firstrecommendation.click();
        //waitForPageToLoad();
        System.out.println("Click first recommendation");
    }

    public void clickSecondRecommendation() throws InterruptedException {
        setPosttitle(secondrecommendation.getText());
        secondrecommendation.click();
        //waitForPageToLoad();
        System.out.println("Click second recommendation");
    }

    public void clickThirdRecommendation() throws InterruptedException {
        setPosttitle(thirdrecommendation.getText());
        thirdrecommendation.click();
        //waitForPageToLoad();
        System.out.println("Click third recommendation");
    }

    public void clickFourthRecommendation() throws InterruptedException {
        setPosttitle(fourthrecommendation.getText());
        fourthrecommendation.click();
        //waitForPageToLoad();
        System.out.println("Click forth recommendation");
    }

    public void clickFifthRecommendation() throws InterruptedException {
        setPosttitle(fifthrecommendation.getText());
        fifthrecommendation.click();
        //waitForPageToLoad();
        System.out.println("Click fifth recommendation image");
    }

    public void isCorrectPostTitle(String title) {
        if (title.equals(posttitle)){
            System.out.println("Good title");
        }else{
            new MobileException("Titles do not matched: \n Title is: "+title+" and Expected one is: "+posttitle);
        }
    }
}
