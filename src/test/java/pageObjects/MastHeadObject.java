package pageObjects;

import commands.Window;
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
    @iOSFindBy (accessibility = "VerticalPickerTableView")
    public static WebElement menu;

    @AndroidFindBy(xpath = "//*[@content-desc='Open Drawer']")
    @iOSFindBy(accessibility = "EasyMenu Icon")
    public static WebElement hamburgerMenu;

    @AndroidFindBy(xpath = "//*[@content-desc='Close Drawer']")
    @iOSFindBy(accessibility = "EasyClose Icon")
    public static WebElement closeMenu;

    @AndroidFindBy(id = "toolbar_image")
    @iOSFindBy(accessibility = "titleLabel")
    public static WebElement title;

    @AndroidFindBy(id = "toolbar_brand_text")
    @iOSFindBy(accessibility = "verticalLabel")
    public static WebElement vertical;

    @AndroidFindBy(id = "search_articles_option")
    @iOSFindBy(accessibility = "EasySearch Icon")
    public static WebElement search;

    @AndroidFindBy(id = "search_close_button")
    @iOSFindBy(accessibility = "EasyClose Icon")
    public static WebElement closeSearch;

    @AndroidFindBy(xpath = "//*[@content-desc='More options']")
    public static WebElement kebabMenu;

    @AndroidFindBy(id = "favorite_option")
    @iOSFindBy(accessibility = "navBookmarkButton")
    public static WebElement save;

    @iOSFindBy(accessibility = "navShareButton")
    public static WebElement share;

    @AndroidFindBy(id = "favorite_option")
    @iOSFindBy(id = "EasySaveOn")
    public static WebElement saveOn;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
    @iOSFindBy(accessibility = "Back")
    public static WebElement back;

    public MastHeadObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void clickHamburgerMenu() throws InterruptedException {
        try {
            menu.isDisplayed();
        }catch(NoSuchElementException e){
            hamburgerMenu.click();
            Thread.sleep(2000);
        }
    }

    public void isCurrentTitle(String expectedTitle){
        String title = null;

        try{
            MastHeadObject.vertical.isDisplayed();
            title= MastHeadObject.vertical.getText().toLowerCase();
            if(title.equals("home"))
                title = "business insider";
        }catch (Exception e){
            title = "business insider";
        }
        Window.assertChar(title,expectedTitle.toLowerCase());
    }
}


