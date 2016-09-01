package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;
import setUpClasses.MobileException;

import java.io.IOException;

import static commands.command.embedScreenshot;

/**
 * Created by rpalacios on 12/11/15.
 */
public class SearchObject {

    @AndroidFindBy(id = "primary_search_field")
    @iOSFindBy(xpath = "//UIATextView[@value=' Search']")
    public static WebElement searchfield;

    @iOSFindBy(xpath = "//UIAKeyboard/UIAButton[@name='Search']")
    public static WebElement searchbutton;

    public static String postresultprefix = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell";
    public SearchObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void search(String keys) throws InterruptedException {
        searchfield.sendKeys(keys);
        searchbutton.click();
        Thread.sleep(4000);
    }

//    public void search(Keys key) {
//        System.out.println("Typing "+key.toString());
//        searchfield.sendKeys(key);
//    }

//    public void clickSearch() throws InterruptedException {
//        App.driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 663); put("y", (double) 1120); }});
//        Thread.sleep(22000);
//    }

    public void clickPost(String posttitle) throws InterruptedException {
        Thread.sleep(1000);
        try {
            App.driver.findElement(By.xpath(postresultprefix + "/UIAStaticText[@label='" + posttitle + "']")).click();
        }catch(Exception e){
            new MobileException(e);
        }
    }

    public void scrollintoview(String posttitle) throws IOException {
        try {
            App.driver.findElement(By.xpath(postresultprefix + "/UIAStaticText[@label='" + posttitle + "']")).click();
        }catch(Exception e){
            new MobileException(e);
        }
        embedScreenshot();
    }
}


