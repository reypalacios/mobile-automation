package appium;

import GUI.GUIForm;
import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by rpalacios on 12/15/15.
 */
public class App {

    public static AppiumDriver wd;
    Logger logger = Logger.getLogger(this.getClass());
    ServerArguments serverArguments = new ServerArguments();
    public static AppiumServer as;
    int i =1;

    public void launch() {
        try {

            //new AppiumServer().startAppiumonMac();

            logger.info("Working Directory = " +
                    System.getProperty("user.dir"));

            serverArguments.setArgument("--address", "127.0.0.1");
            serverArguments.setArgument("--no-reset", true);
            serverArguments.setArgument("--local-timezone", true);
            //serverArguments.setArgument("--log", "/Users/rpalacios/IdeaProjects/mobile-automation/logs/appium.log");
            //serverArguments.setArgument("--log", System.getProperty("user.dir")+"/src/logs/appium.log");

            serverArguments.setArgument("--command-timeout","7200");
            serverArguments.setArgument("--debug-log-spacing", true);
            serverArguments.setArgument("--port", "4723");
            serverArguments.setArgument("--native-instruments-lib", true);
            serverArguments.setArgument("--show-ios-log", true);
            serverArguments.setArgument("--launch-timeout","110000");
            as = new AppiumServer(serverArguments);

            if (!as.isServerRunning()) {
                logger.info("Starting Appium Server...");
                Thread.currentThread().setName("AppiumServer");
                as.startServer();

            }
            /*if(as.isServerRunning()) {
                logger.info("Stopping Appium Server...");
                as.stopServer();
                logger.info("Starting Appium Server...");
                as.startServer();
            }else{
                logger.info("Starting Appium Server...");
                as.startServer();
            }*/

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");

            if(GUIForm.launchOn == null) {
                GUIForm.launchOn = System.getProperty("launchOn");
                GUIForm.VD = System.getProperty("VD");
                GUIForm.app = System.getProperty("app");

                logger.info("------------ Environmental Configurations ------------");
                logger.info("OS = " + GUIForm.launchOn);
                if (GUIForm.launchOn.equals("Android"))
                    logger.info("AVD = " + GUIForm.VD);
                if (GUIForm.launchOn.equals("iOS")){
                    logger.info("Simulator = " + GUIForm.VD);
                    logger.info("App = " + GUIForm.app);
                }
                //logger.info("Script = "+  this.getClass().geco . script);
                logger.info("------------------------------------------------------");
            }

            capabilities.setCapability("platformName", GUIForm.launchOn);
            if (GUIForm.launchOn.equals("Android")) {
                capabilities.setCapability("platformVersion", "4.4");
                capabilities.setCapability("avd", GUIForm.VD);
                capabilities.setCapability("deviceName", "Android Emulator");

                File file = new File("AndroidApps/com.freerange360.mpp.businessinsider-120150427.apk");
                capabilities.setCapability("app", file.getAbsolutePath());
                capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
                capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");

            }
            if (GUIForm.launchOn.equals("iOS")) {

                capabilities.setCapability("deviceName", GUIForm.VD.split(" \\(")[0]);
                capabilities.setCapability("platformVersion", GUIForm.VD.split("\\(")[1].replaceAll("\\)", ""));
                //capabilities.setCapability("udid", GUIForm.VD.split(" \\(")[0]);
                //capabilities.setCapability("autoAcceptAlerts", "false");
                //capabilities.setCapability("browserName", "safari");

                //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
                //File file = new File("/Users/rpalacios/Downloads/Debug-iphonesimulator/iPhoneBI.app");
                File file = null;
                if (GUIForm.app.equals("Business Insider") || GUIForm.app.equals("Business_Insider")) {
                    file = new File("iOSApps/iPhoneBI.app");
                }
                if (GUIForm.app.equals("Tech Insider") || GUIForm.app.equals("Tech_Insider")) {
                    file = new File("iOSApps/iPhoneTI.app");
                }
                capabilities.setCapability("app", file.getAbsolutePath());
            }

            if(!as.isServerRunning()) {
                logger.info("Starting Appium Server....");
                as.startServer();
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
            Thread.sleep(3000);

            logger.info("App has launched");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnreachableBrowserException e){
            /*if(e.getMessage().contains("server or browser start-up failure")){

                while (i < 4){
                    logger.info("Starting Appium Server - Try "+i);
                    i++;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    this.launch();
                }
                throw e;
            }
            else {*/
                logger.error("Unable to launch device");
                e.printStackTrace();
            //}

        } catch (InterruptedException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } catch (SessionNotCreatedException s) {
            logger.error(s.getMessage());
            s.printStackTrace();
        }

    }

    public void close()
    {

        try {
            if(wd != null) {
                wd.closeApp();
                //wd.close();
                wd.quit();
                //as.stopServer();
            }
            //as.stopServer();
            //new AppiumServer().stopAppium();
        } catch (WebDriverException wd){
            logger.error(wd.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("Test Done");
    }
}
