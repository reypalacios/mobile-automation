package objectModels;

import appium.App;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rpalacios on 12/11/15.
 */
public class MastHeadObject {

    Logger logger = Logger.getLogger(this.getClass());

    @AndroidFindBy(id = "android:id/up")
    @iOSFindBy(name = "EasyMenu Icon")
    public static WebElement HamburgerMenu;

    @AndroidFindBy(id = "android:id/home")
    public static WebElement BI;

    @AndroidFindBy(id = "com.businessinsider.app.debug:id/search_articles_option")
   // @iOSFindBy(name = "")
    public static WebElement Search;

    @AndroidFindBy(id = "com.businessinsider.app.debug:id/search_close_button")
   // @iOSFindBy(name = "")
    public static WebElement CloseSearch;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.ImageButton[1]")
    public static WebElement KebabMenu;

    @iOSFindBy(id = "EasySaveOn")
    public static WebElement saveIconOn;

    @iOSFindBy(id = "EasySave Icon")
    public static WebElement saveIcon;

    @iOSFindBy(id = "Back")
    public static WebElement backIcon;





    public MastHeadObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.IOSdriver), this);
    }

    public void clickHamburgerMenu() throws InterruptedException {
        HamburgerMenu.click();
        try {
            WebElement menu = App.driver.findElementById("com.freerange360.mpp.businessinsider:id/menuDrawer");
            /*if (menu.getSize().getWidth() < 400 )
                HamburgerMenu.click();*/
        }catch (NoSuchElementException e){
            HamburgerMenu.click();
            Thread.sleep(2500);
        }
        logger.info("Menu is open");
    }

        public void clickBI() {
        BI.click();
        logger.info("Click BI");
    }

        public void saveIconOn(){
         saveIconOn.click();

    }

        public void backIcon() {
        backIcon.click();
        logger.info("click Back");
    }


        public void clickSearch() {
        Search.click();
        logger.info("Click Search");
    }

        public void clickCloseSearch() {
            CloseSearch.click();
            logger.info("Click Close Search");
        }

    public void saveIcon() {
        saveIcon.click();
        logger.info("Save Icon");
    }

    public void clickKebabMenu() {
        KebabMenu.click();
        logger.info("Click Kebab Menu");
    }

    public void clicksavedArticle() {
        App.IOSdriver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[2]/UIATableCell[1]/UIAStaticText[1](@name, 'Saved Articles')]").click();
    }

    }
