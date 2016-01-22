package appium;

import GUI.GUIForm;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by rpalacios on 11/25/15.
 */
public class LaunchApps {

    //AndroidDriver Adriver;
    Logger logger = Logger.getLogger(this.getClass());
    private AppiumDriver wd;

    @Test
    public void LaunchApp() throws MalformedURLException, SQLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", GUIForm.launchOn);
        //capabilities.setCapability("avd", GUIForm.AVD);
        capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("deviceName", "SM-G900T");
        capabilities.setCapability("app", "com.freerange360.mpp.businessinsider-120150427.apk");
        capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
        capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");

        /*File file = new File("com.freerange360.mpp.businessinsider-120150427.apk");
        capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
*/
        wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities) {
            @Override
            public WebElement scrollTo(String s) {
                return null;
            }

            @Override
            public WebElement scrollToExact(String s) {
                return null;
            }
        };
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();


    }

    @After
    public void CloseApp() {
        wd.closeApp();
        wd.quit();
        logger.info("Test Done");
    }
}
