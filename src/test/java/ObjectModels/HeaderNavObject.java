package ObjectModels;

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
public class HeaderNavObject {

    Logger logger = Logger.getLogger(this.getClass());

    @AndroidFindBy(id = "android:id/up")
    @iOSFindBy(name = "EasyMenu Icon")
    public static WebElement HamburgerMenu;
    @iOSFindBy(name = "EasySearch Icon")
    public static WebElement Search;


    public HeaderNavObject(AppiumDriver<WebElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
    }

    public void clickHamburger() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

        HamburgerMenu.click();
        logger.info("Click Hamburger Icon");


    }

    public void ClickSearch() {
        //wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

      Search.click();
        logger.info("Click Search Icon");


    }
}


