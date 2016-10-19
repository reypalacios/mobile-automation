package setUpClasses;

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
import pageObjects.PushPermissionRequestObject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by rpalacios on 12/15/15.
 */
public class App {
    public static AppiumDriver driver;
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

    public void launch(Boolean reset) throws InterruptedException {
        try {
            startAppiumServer(reset);
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("newCommandTimeout",250);
            //capabilities.setCapability("automationName", "XCUITest");
            //capabilities.setCapability("nativeWebTap", true);

            if(App.launchOn == null) {
                App.launchOn = System.getProperty("launchOn");
                if(App.launchOn == null) {
                    new PropertyReader();
                }

                System.out.println("------------ Environmental Configurations ------------");
                System.out.println("OS = " + App.launchOn);
                if (App.launchOn.equals("Android")) {
                    System.out.println("AVD = " + App.VD);
                }if (App.launchOn.equals("iOS")){
                    System.out.println("Simulator = " + App.VD);
                    System.out.println("App = " + App.app);
                }
                System.out.println("------------------------------------------------------");
            }

            capabilities.setCapability("platformName", App.launchOn);
            if (App.launchOn.equals("Android")) {
                capabilities.setCapability("platformVersion", App.platformVersion);
                capabilities.setCapability("avd", App.VD);
                capabilities.setCapability("deviceName", "Android Emulator");
                File file = new File("AndroidApps/"+App.apk);
                capabilities.setCapability("app", file.getAbsolutePath());
                capabilities.setCapability("appPackage", App.apppackage);
                //capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");
                capabilities.setCapability("appActivity", App.appactivity);

            }
            if (App.launchOn.equals("iOS")) {

                capabilities.setCapability("deviceName", App.VD.split(" \\(")[0]);
                capabilities.setCapability("platformVersion", App.VD.split("\\(")[1].replaceAll("\\)", "").replace(")",""));
                //These capabilities will make it run in real device
                //capabilities.setCapability("deviceName", "bi's iPhone");
                //capabilities.setCapability("platformVersion", "9.2");
                //capabilities.setCapability("udid", "d70d5498f3cba8bd30993ffacac90cbb1bcc9919");
                capabilities.setCapability("bundleId", App.bundleid);

                File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/iPhoneBI-cujhzgeypvptwgcnxpynvnbdlmld/Build/Products/Debug-iphonesimulator/iPhoneBI.app");
                //file = new File("/Users/rpalacios/IdeaProjects/mobile-automation/iOSApps/iPhoneBI.app");
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
            try {
                if (App.scenario==null || !App.scenario.getName().contains("notification")) {
                    WebDriverWait wait = new WebDriverWait(App.driver, 3);
                    wait.until(ExpectedConditions.visibilityOf(new PushPermissionRequestObject().enablealerts));
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
