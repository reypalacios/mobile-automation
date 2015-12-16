/*
package appium;

import GUI.GUIForm;
import core.AutomationSetUp;
import io.appium.java_client.AppiumDriver;
import mobileScripts.HamburgerMenu;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

*/
/**
 * Created by rpalacios on 11/25/15.
 *//*

public class LaunchAppEmulator extends AutomationSetUp {

    //AndroidDriver Adriver;
    Logger logger = Logger.getLogger(this.getClass());

    @Test
    public void LaunchAppEmulator() throws Exception {

        //new AppiumServer().stopAppium();
        new AppiumServer().startAppiumonMac();


       */
/* DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", GUIForm.launchOn);
        if(GUIForm.launchOn.equals("Android")) {
            capabilities.setCapability("platformVersion", "4.4");
            capabilities.setCapability("avd", GUIForm.VD);
            capabilities.setCapability("deviceName", "Android Emulator");

            File file = new File("AndroidApps/com.freerange360.mpp.businessinsider-120150427.apk");
            capabilities.setCapability("app", file.getAbsolutePath());
            capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
            capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");

        }
        if(GUIForm.launchOn.equals("iOS")) {

            capabilities.setCapability("deviceName", GUIForm.VD.split(" \\(")[0]);
            capabilities.setCapability("platformVersion", GUIForm.VD.split("\\(")[1].replaceAll("\\)",""));
            //capabilities.setCapability("udid", GUIForm.VD.split(" \\(")[0]);
            //capabilities.setCapability("autoAcceptAlerts", "false");
            //capabilities.setCapability("browserName", "safari");

            //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
            //File file = new File("/Users/rpalacios/Downloads/Debug-iphonesimulator/iPhoneBI.app");
            File file = null;
            if (GUIForm.app.equals("Business Insider")) {
                file = new File("iOSApps/iPhoneBI.app");
            }
            if (GUIForm.app.equals("Tech Insider")) {
                file = new File("iOSApps/iPhoneTI.app");
            }
            capabilities.setCapability("app", file.getAbsolutePath());
        }

           wd = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {
               @Override
               public WebElement scrollTo(String s) {
                    return null;
                }
                @Override
               public WebElement scrollToExact(String s) {
                    return null;
                }
            };

            wd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            //wd.get("http://www.businessinsider.com/");
            //wd.switchTo().alert().dismiss();
            Thread.sleep(2000);
*//*

            new JUnitCore().run(HamburgerMenu.class);

            Thread.sleep(2000);

//        Thread.sleep(4000);
      //  wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();



    }

    @After
    public void CloseAppEmulator() throws Exception {
        //Adriver.close();
        wd.closeApp();
        wd.quit();
        new AppiumServer().stopAppium();
        logger.info("Test Done");
    }

}
*/
