package objectModels;

import appium.App;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

/**
 * Created by rpalacios on 12/11/15.
 */
public class SearchObject {

    Logger logger = Logger.getLogger(this.getClass());

    @AndroidFindBy(id = "primary_search_field")
    public static WebElement textfield;

    public SearchObject() {
        PageFactory.initElements(new AppiumFieldDecorator(App.driver), this);
    }

    public void type(String keys) {
        logger.info("Typing "+keys);
        textfield.sendKeys(keys);


        /*textfield.sendKeys(Keys.ENTER);
        App.driver.getKeyboard().pressKey(Keys.RETURN);
        //App.driver.pressKeyCode(AndroidKeyCode.ENTER);*/
        /*Actions action=new Actions(App.driver);
        action.sendKeys("Some text").sendKeys(Keys.ENTER).build().perform();*/

        //action.sendKeys(textfield, Keys.ENTER).build().perform();
        /*Keyboard keyboard=((HasInputDevices) App.driver).getKeyboard();
        keyboard.pressKey(Keys.ENTER);
        App.driver.pressKeyCode(AndroidKeyCode.ENTER);*/
        //App.driver.sendKeyEvent(AndroidKeyCode.ENTER);
        //App.driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH);

        /*String KEYBOARD_SEARCH = "UIATarget.localTarget().frontMostApp().keyboard().buttons()['Search'].tap();";
        JavascriptExecutor jse = (JavascriptExecutor) App.driver;
        jse.executeScript(KEYBOARD_SEARCH);*/

    }

    public void type(Keys key) {
        logger.info("Typing "+key.toString());
        textfield.sendKeys(key);
    }

    public void clickSearch() throws InterruptedException {
        App.driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 663); put("y", (double) 1120); }});
        Thread.sleep(22000);
    }
}


