package pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.App;

/**
 * Created by rpalacios on 12/11/15.
 */
public class SearchObject {

    int i=0;

    @AndroidFindBy(id = "primary_search_field")
    @iOSFindBy(xpath = "//UIATextView[@value=' Search']")
    public static WebElement searchfield;

    @iOSFindBy(xpath = "//UIAKeyboard/UIAButton[@name='Search']")
    public static WebElement searchbutton;

    public SearchObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void search(String keys) throws InterruptedException {
        searchfield.sendKeys(keys);
        searchbutton.click();
        Thread.sleep(5000);
    }
}


