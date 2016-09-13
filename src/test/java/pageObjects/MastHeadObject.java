package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setUpClasses.App;
import setUpClasses.MobileException;

import java.io.IOException;

/**
 * Created by rpalacios on 12/11/15.
 */
public class MastHeadObject{

    @AndroidFindBy(id = "drawer_vertical_list")
    @iOSFindBy (name = "EasyClose Icon")
    public static WebElement Menu;

    @AndroidFindBy(xpath = "//*[@content-desc='Open Drawer']")
    @iOSFindBy(xpath = "//UIAButton[@name='EasyMenu Icon']")
    public static WebElement HamburgerMenu;

    @AndroidFindBy(xpath = "//*[@content-desc='Close Drawer']")
    @iOSFindBy(xpath = "//*[@name='EasyClose Icon']")
    public static WebElement closeMenu;

    @AndroidFindBy(id = "toolbar_image")
    public static WebElement BI;

    @AndroidFindBy(id = "toolbar_brand_text")
    @iOSFindBy (xpath = "//UIANavigationBar[1]/UIAStaticText/UIAStaticText[3]")
    public static WebElement Title;

    @AndroidFindBy(id = "search_articles_option")
    @iOSFindBy(xpath = "//UIAButton[@name='EasySearch Icon']")
    public static WebElement Search;

    @AndroidFindBy(id = "search_close_button")
    @iOSFindBy(name = "EasyClose Icon")
    public static WebElement closeSearch;

    @AndroidFindBy(xpath = "//*[@content-desc='More options']")
    public static WebElement KebabMenu;

    @AndroidFindBy(id = "favorite_option")
    @iOSFindBy(id = "EasySaveOn")
    public static WebElement saveOn;

    @AndroidFindBy(id = "favorite_option")
    @iOSFindBy(id = "EasySave Icon")
    public static WebElement save;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
    @iOSFindBy(xpath = "//*[@name='EasyBack Icon']")
    public static WebElement back;

    public MastHeadObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickHamburgerMenu() throws InterruptedException {
        try {
            Menu.isDisplayed();
        }catch(NoSuchElementException e){
            HamburgerMenu.click();
            Thread.sleep(2000);
        }
    }

    public void isCurrentTitle(String expectedTitle) throws MobileException, IOException {
        String title = null;

        try{
            Title.isDisplayed();
            title=Title.getText();
            if(title.equals("HOME"))
                title = "BUSINESS INSIDER";
        }catch (Exception e){
            title = "BUSINESS INSIDER";
        }

        try{
            Assert.assertEquals(title, expectedTitle);
        }catch(Exception e){
            new MobileException(e);
        }

    }

//    public void verfitySavedArticleNotification(){
//        try{
//            Assert.assertEquals(saveArticleNTF.isDisplayed(),true);
//        }catch (Exception e){
//            new MobileException(e);
//        }
//    }
}


