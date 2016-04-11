package objectModels;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
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


    public MastHeadObject(AppiumDriver<WebElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
    }

    public void clickHamburgerMenu() throws InterruptedException {
        HamburgerMenu.click();
        Thread.sleep(1000);
        logger.info("Click Hamburger menu");
    }

    public void clickBI() {
        BI.click();
        logger.info("Click BI");
    }

    public void clickSearch() {
        Search.click();
        logger.info("Click Search");
    }

    public void clickCloseSearch() {
        CloseSearch.click();
        logger.info("Click Close Search");
    }

    public void clickKebabMenu() {
        KebabMenu.click();
        logger.info("Click Kebab Menu");
    }
}


