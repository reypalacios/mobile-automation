package setUpClasses;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import pageObjects.PushPermissionRequestObject;
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
//    private AndroidDriver Androiddriver;
//    private IOSDriver IOSdriver;
    public static String launchOn;
    public static String VD;
    public static String apppackage;
    public static String appactivity;
    public static String bundleid;
    public static String currentapp;
    public static String app;
    public static String oldapp;
    public static String apk;
    public static String oldapk;
    public static String script;
    public static String platformName;
    public static String platformVersion;
    public static Scenario scenario;
    public static AppiumServer as;
    public static AppiumDriverLocalService appiumDriverLocalService;
    public static String posttitle;
    ServerArguments serverArguments = new ServerArguments();
    public static DesiredCapabilities capabilities;

    public static String SWIPE_RIGHT_TO_LEFT = "Swipe Right to Left";
    public static String SWIPE_LEFT_TO_RIGHT = "Swipe Left to Right";
    private static AppiumServiceBuilder builder;

//    public App (){
//        if(driver==null)
//            try {
//                launch(true);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//    }

    public void launch(Boolean reset) throws InterruptedException {
        try {
            //logger = Logger.getLogger();
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


            startAppiumServer(reset);
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("newCommandTimeout",250);
            //capabilities.setCapability("nativeWebTap", true);

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
                capabilities.setCapability("appPackage", App.apppackage);
                //capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");
                capabilities.setCapability("appActivity", App.appactivity);



//                driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {
//                    @Override
//                    public WebElement scrollTo(String s) {
//                        return null;
//                    }
//
//                    @Override
//                    public WebElement scrollToExact(String s) {
//                        return null;
//                    }
//                };

            }
            if (App.launchOn.equals("iOS")) {

                capabilities.setCapability("deviceName", App.VD.split(" \\(")[0]);
                capabilities.setCapability("platformVersion", App.VD.split("\\(")[1].replaceAll("\\)", "").replace(")",""));
                //capabilities.setCapability("udid", App.VD.split(" \\(")[0]);
                //capabilities.setCapability("autoAcceptAlerts", "false");
                //capabilities.setCapability("browserName", "safari");

                //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
                //File file = new File("/Users/rpalacios/Downloads/Debug-iphonesimulator/iPhoneBI.app");

                //if (App.app.equals("Business Insider") || App.app.equals("Business_Insider")) {
                //File file = new File("iOSApps/"+App.app);
                File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/iPhoneBI-cujhzgeypvptwgcnxpynvnbdlmld/Build/Products/Debug-iphonesimulator/iPhoneBI.app");
                    //file = new File("/Users/rpalacios/IdeaProjects/mobile-automation/iOSApps/iPhoneBI.app");
                //}
//                if (App.app.equals("Tech Insider") || App.app.equals("Tech_Insider")) {
//                    file = new File("iOSApps/iPhoneTI.app");
//                }
               capabilities.setCapability("app", file.getAbsolutePath());

//               driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {
//                    @Override
//                    public WebElement scrollTo(String s) {
//                        return null;
//                    }
//
//                    @Override
//                    public WebElement scrollToExact(String s) {
//                        return null;
//                    }
//                };
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
            try {
                if (App.scenario!=null && !App.scenario.getName().contains("notification")) {
                    WebDriverWait wait = new WebDriverWait(driver, 3);
                    wait.until(ExpectedConditions.visibilityOf(new PushPermissionRequestObject().enablealerts));
                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("news_alerts_headlines_text")));
                    new PushPermissionRequestObject().enablealerts.click();
                }
            }catch(TimeoutException e){
                System.out.println("Push permission request screen wasn't displayed");
            }catch(NoSuchElementException ce){
                System.out.println("Push permission request screen wasn't displayed");
            }
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            new MobileException(e);
        } catch (UnreachableBrowserException e){
            new MobileException(e);
        } catch (SessionNotCreatedException e) {
            new MobileException(e);
        }
    }

    public static void startAppiumServer(Boolean reset) {
        builder = new AppiumServiceBuilder()
                .withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "info")
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.DEBUG_LOG_SPACING)
                .withArgument(AndroidServerFlag.SUPPRESS_ADB_KILL_SERVER);
                //.withLogFile(new File(System.getProperty("user.dir") + "/logs/appium.log"));
        if(reset){
            builder.withArgument(GeneralServerFlag.NO_RESET);
        }

        appiumDriverLocalService = builder.build();

        if (!appiumDriverLocalService.isRunning()) {
            System.out.println("Starting Appium Server...");
            Thread.currentThread().setName("AppiumServer");
            //as.stopServer();
            //System.out.println($APPIUM_BINARY_PATH);
            appiumDriverLocalService.start();
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
                driver.quit();
            }
        } catch (WebDriverException wd){
            wd.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Test Done");
    }

    public void launchDeviceSettings() {
        try{
            capabilities.setCapability("app", "settings");
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

             driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            new MobileException(e);
        } catch (UnreachableBrowserException e){
            new MobileException(e);
        } catch (SessionNotCreatedException e) {
            new MobileException(e);
        }
    }
}
