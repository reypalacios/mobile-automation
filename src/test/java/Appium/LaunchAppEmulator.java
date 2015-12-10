package Appium;

import GUI.GUIForm;
import core.AutomationSetUp;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by rpalacios on 11/25/15.
 */
public class LaunchAppEmulator extends AutomationSetUp {

    //AndroidDriver Adriver;
    Logger logger = Logger.getLogger(this.getClass());
    public static AppiumDriver wd;

    @Test
    public void LaunchAppEmulator() throws Exception {

        //new AppiumServer().stopAppium();
        new AppiumServer().startAppiumonMac();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", GUIForm.launchOn);
        if(GUIForm.launchOn.equals("Android")){
            capabilities.setCapability("platformVersion", "4.4");
            capabilities.setCapability("avd", GUIForm.AVD);

            capabilities.setCapability("deviceName", "Android Emulator");
            File file = new File("com.freerange360.mpp.businessinsider-120150427.apk");
            capabilities.setCapability("app", file.getAbsolutePath());
            //capabilities.setCapability("app", "com.freerange360.mpp.businessinsider-120150427.apk");
            capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
            capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");
        }
        if(GUIForm.launchOn.equals("iOS")) {
            capabilities.setCapability("platformVersion", "9.1");
            capabilities.setCapability("deviceName", "iPhone 6");
            capabilities.setCapability("waitForAppScript", true);


            //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
            File file = new File("/Users/rpalacios/Downloads/Debug-iphonesimulator/iPhoneBI.app");
            capabilities.setCapability("app", file.getAbsolutePath());
        }

        //capabilities.setCapability("browserName", "safari");
        /*capabilities.setCapability("app", "/Users/rpalacios/Library/Developer/Xcode/DerivedData/iOS_First_Project-gegfarscctnlduhitlzjffmzyhjh/Build/Products/Debug-iphoneos/iOS_First_Project.app");
        capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
        capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");
*/
        //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
        //File file = new File("BI_4.1.ipa");
        //capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
        //if (GUIForm.AVD.equals("Nexus_S_API_19"))
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
        /*else
            wd = new AppiumDriver(new URL("http://127.0.0.1:4722/wd/hub"), capabilities) {
                @Override
                public WebElement scrollTo(String s) {
                    return null;
                }

                @Override
                public WebElement scrollToExact(String s) {
                    return null;
                }
            };
*/

            wd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


            Thread.sleep(3000);
            wd.switchTo().alert().dismiss();
            //wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[1]")).click();
            Thread.sleep(3000);

            wd.findElement(By.name("EasyMenu Icon")).click();

//        wd.get("http://www.businessinsider.com/");
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
