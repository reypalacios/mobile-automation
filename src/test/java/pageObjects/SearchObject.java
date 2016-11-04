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

    public void clickPost(String posttitle) throws InterruptedException {
        try{
            ((WebElement)(App.driver.findElementsByAccessibilityId(posttitle).get(1))).click();
            Thread.sleep(2000);
            while (!new PostObject().isAPost()) {
                System.out.println("Trying to click post again...");
                clickPost(posttitle);
            }

        }catch(Exception e){
            if (e.getMessage().contains("could not be tapped") || e.getMessage().contains("Index:")) {
                try {
                    ((WebElement) (App.driver.findElementsByAccessibilityId(posttitle).get(0))).click();
                    Thread.sleep(2000);
                    while (!new PostObject().isAPost()) {
                        System.out.println("Trying to click post again...");
                        clickPost(posttitle);
                    }
                } catch (Exception e1) {
                    i++;
                    while (i < 3)
                        clickPost(posttitle);
                    if (!new PostObject().isAPost())
                        e1.printStackTrace();
                }
            }else {
                e.printStackTrace();
            }
        }
    }
}


