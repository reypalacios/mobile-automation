package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

/**
 * Created by rpalacios on 11/25/15.
 */
public class LaunchAppEmulator {

    AndroidDriver Adriver;

    @Test
    public void LaunchAppEmulator() throws MalformedURLException, SQLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");

        File file = new File("com.freerange360.mpp.businessinsider-120150427.apk");
        cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());

        Adriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub/"), cap);
        Thread.sleep(5000);

        Adriver.findElement(By.xpath("//div[@class='hamburger']")).click();

    }

    @AfterTest
    public void CloseAppEmulator(){
        Adriver.quit();
    }
}
