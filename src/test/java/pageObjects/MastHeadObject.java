package pageObjects;

import commands.window;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

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
    public static WebElement title;

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
    @iOSFindBy(accessibility = "navBookmarkButton")
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

    public void isCurrentTitle(String expectedTitle){
        String title = null;

        try{
            MastHeadObject.title.isDisplayed();
            title= MastHeadObject.title.getText().toLowerCase();
            if(title.equals("home"))
                title = "business insider";
        }catch (Exception e){
            title = "business insider";
        }
        window.assertChar(title,expectedTitle.toLowerCase());
    }
}


