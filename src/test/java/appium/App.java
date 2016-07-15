package appium;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by rpalacios on 12/15/15.
 */
public class App {

    public static AppiumDriver driver;
    //public static IOSDriver driver;
    public static String launchOn;
    public static String VD;
    public static String app;
    public static String apk;
    public static String script;
    public static String platformName;
    public static String platformVersion;

    public static org.apache.log4j.Logger logger;
    public static Scenario scenario;
    public static AppiumServer as;

    ServerArguments serverArguments = new ServerArguments();
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public static String SWIPE_RIGHT_TO_LEFT = "Swipe Right to Left";
    public static String SWIPE_LEFT_TO_RIGHT = "Swipe Left to Right";

    public void launch() {
        try {
            logger = Logger.getLogger();
            screenshotCleanup();

            System.out.println("Working Directory = " + System.getProperty("user.dir"));
//            serverArguments.setArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js",false);
//            serverArguments.setArgument("--address", "127.0.0.1");
//            //serverArguments.setArgument("--no-reset", true);
//            serverArguments.setArgument("--local-timezone", true);
//            serverArguments.setArgument("--log", System.getProperty("user.dir")+"/logs/appium.log");
//            serverArguments.setArgument("--command-timeout","7200");
//            serverArguments.setArgument("--debug-log-spacing", true);
//            serverArguments.setArgument("--port", "4723");
//            serverArguments.setArgument("--native-instruments-lib", true);
//            serverArguments.setArgument("--show-ios-log", true);
//            serverArguments.setArgument("--launch-timeout","100000");
//            serverArguments.setArgument("--session-override", true);
//
//           // as = new AppiumServer(new File("/Applications/Appium.app/Contents/Resources/"), serverArguments);
//            as = new AppiumServer(serverArguments);


            AppiumServiceBuilder builder = new AppiumServiceBuilder()
                    .withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js"))
                    .withIPAddress("127.0.0.1")
                    .usingPort(4723)
                    .withArgument(GeneralServerFlag.LOG_LEVEL, "info")
                    .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                    .withArgument(GeneralServerFlag.DEBUG_LOG_SPACING)
                    .withArgument(AndroidServerFlag.SUPPRESS_ADB_KILL_SERVER)
                    .withLogFile(new File(System.getProperty("user.dir") + "/logs/appium.log"));
            AppiumDriverLocalService appiumDriverLocalService = builder.build();

            if (!appiumDriverLocalService.isRunning()) {
                System.out.println("Starting Appium Server...");
                Thread.currentThread().setName("AppiumServer");
                //as.stopServer();
                //System.out.println($APPIUM_BINARY_PATH);
                appiumDriverLocalService.start();
            }

            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("newCommandTimeout",240);

            if(App.launchOn == null) {
                App.launchOn = System.getProperty("launchOn");
                if(App.launchOn == null) {
                    new PropertyReader();
                }
                //App.VD = System.getProperty("VD");
                //App.app = System.getProperty("app");

                System.out.println("------------ Environmental Configurations ------------");
                System.out.println("OS = " + App.launchOn);
                if (App.launchOn.equals("Android")) {
                    System.out.println("AVD = " + App.VD);
                }if (App.launchOn.equals("iOS")){
                    System.out.println("Simulator = " + App.VD);
                    System.out.println("App = " + App.app);
                }
                //System.out.println("Script = "+  this.getClass().geco . script);
                System.out.println("------------------------------------------------------");
            }

            capabilities.setCapability("platformName", App.launchOn);
            if (App.launchOn.equals("Android")) {
                capabilities.setCapability("platformVersion", App.platformVersion);
                capabilities.setCapability("avd", App.VD);
                capabilities.setCapability("deviceName", "Android Emulator");

                /*if (App.apk==null){
                    App.apk="com.freerange360.mpp.businessinsider-120150427.apk";
                }*/
                File file = new File("AndroidApps/"+App.apk);
                capabilities.setCapability("app", file.getAbsolutePath());
                //capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
                //capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");

            }
            if (App.launchOn.equals("iOS")) {

                capabilities.setCapability("deviceName", App.VD.split(" \\(")[0]);
                capabilities.setCapability("platformVersion", App.VD.split("\\(")[1].replaceAll("\\)", "").replace(")",""));
                //capabilities.setCapability("udid", App.VD.split(" \\(")[0]);
                //capabilities.setCapability("autoAcceptAlerts", "false");
                //capabilities.setCapability("browserName", "safari");

                //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
                //File file = new File("/Users/rpalacios/Downloads/Debug-iphonesimulator/iPhoneBI.app");
                File file = null;
                //if (App.app.equals("Business Insider") || App.app.equals("Business_Insider")) {
                    file = new File("iOSApps/"+App.app);
                    //file = new File("/Users/rpalacios/IdeaProjects/mobile-automation/iOSApps/iPhoneBI.app");
                //}
//                if (App.app.equals("Tech Insider") || App.app.equals("Tech_Insider")) {
//                    file = new File("iOSApps/iPhoneTI.app");
//                }
               capabilities.setCapability("app", file.getAbsolutePath());
            }

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {
                @Override
                public WebElement scrollTo(String s) {
                    return null;
                }

                @Override
                public WebElement scrollToExact(String s) {
                    return null;
                }
            };



//            WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                    .until(ExpectedConditions.presenceOfElementLocated(By.id("news_alerts_headlines_text")));

//            long initTime = new Date().getTime();
//            boolean timeElapsed = true;
//           while(driver.findElementsById("news_alerts_headlines_text").isEmpty() && timeElapsed){
//                if(new Date().getTime() - initTime > 15000 ){
//                    timeElapsed = false;
//                }
//            }
            //Thread.sleep(10000);

            try {
                WebDriverWait wait = new WebDriverWait(driver, 6);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("news_alerts_headlines_text")));
                System.out.println("Push permission request screen was displayed");
            }catch(TimeoutException e){
                System.out.println("Push permission request screen wasn't displayed");
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("App has launched");

        } catch (MalformedURLException e) {
            logger.error(e);
        } catch (UnreachableBrowserException e){
            logger.error(e);
        } catch (SessionNotCreatedException e) {
            logger.error(e);
/*            as.stopServer();
            as.startServer();
            try {
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
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            wd.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            //wd.get("http://www.businessinsider.com/");
            //wd.switchTo().alert().dismiss();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("App has launched");*/
        }

    }

    private void screenshotCleanup() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        File file = new File("screenshots/");
        File[] listOfFiles = file.listFiles();
        if(listOfFiles!=null)
        for (File f:listOfFiles){
            if(f.getName().contains(stackTraceElements[3].getClassName()))
                f.delete();
        }
    }

    public void close()
    {

        try {
            if(driver != null) {
                driver.closeApp();
                //wd.close();
                driver.quit();
                //as.stopServer();
            }
            //as.stopServer();
            //new AppiumServer().stopAppium();
        } catch (WebDriverException wd){
            logger.error(wd.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Test Done");
    }


}
