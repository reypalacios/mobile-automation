package appium;

import GUI.GUIForm;
import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by rpalacios on 12/15/15.
 */
public class App {

    public static AppiumDriver driver;
    public static String SWIPE_RIGHT_TO_LEFT = "Swipe Right to Left";
    public static org.apache.log4j.Logger logger;
    public static Scenario scenario;
    public static AppiumServer as;

    ServerArguments serverArguments = new ServerArguments();
    DesiredCapabilities capabilities = new DesiredCapabilities();

    static String SWIPE_LEFT_TO_RIGHT = "Swipe Left to Right";

    public void launch() {
        try {

            logger = Logger.getLogger();
            screenshotCleanup();

            System.out.println("Working Directory = " + System.getProperty("user.dir"));

            serverArguments.setArgument("--address", "127.0.0.1");
            //serverArguments.setArgument("--no-reset", true);
            serverArguments.setArgument("--local-timezone", true);
            serverArguments.setArgument("--log", System.getProperty("user.dir")+"/logs/appium.log");
            serverArguments.setArgument("--command-timeout","7200");
            serverArguments.setArgument("--debug-log-spacing", true);
            serverArguments.setArgument("--port", "4723");
            serverArguments.setArgument("--native-instruments-lib", true);
            serverArguments.setArgument("--show-ios-log", true);
            serverArguments.setArgument("--launch-timeout","100000");
            serverArguments.setArgument("--session-override", true);

            as = new AppiumServer(serverArguments);

            if (!as.isServerRunning()) {
                System.out.println("Starting Appium Server...");
                Thread.currentThread().setName("AppiumServer");
                //as.stopServer();
                as.startServer();
            }

            capabilities.setCapability("appium-version", "1.0");

            if(GUIForm.launchOn == null) {
                GUIForm.launchOn = System.getProperty("launchOn");
                if(GUIForm.launchOn == null) {
                    new PropertyReader();
                }
                //GUIForm.VD = System.getProperty("VD");
                //GUIForm.app = System.getProperty("app");

                System.out.println("------------ Environmental Configurations ------------");
                System.out.println("OS = " + GUIForm.launchOn);
                if (GUIForm.launchOn.equals("Android"))
                    System.out.println("AVD = " + GUIForm.VD);
                if (GUIForm.launchOn.equals("iOS")){
                    System.out.println("Simulator = " + GUIForm.VD);
                    System.out.println("App = " + GUIForm.app);
                }
                //System.out.println("Script = "+  this.getClass().geco . script);
                System.out.println("------------------------------------------------------");
            }

            capabilities.setCapability("platformName", GUIForm.launchOn);
            if (GUIForm.launchOn.equals("Android")) {
                capabilities.setCapability("platformVersion", GUIForm.platformVersion);
                capabilities.setCapability("avd", GUIForm.VD);
                capabilities.setCapability("deviceName", "Android Emulator");

                /*if (GUIForm.apk==null){
                    GUIForm.apk="com.freerange360.mpp.businessinsider-120150427.apk";
                }*/
                File file = new File("AndroidApps/"+GUIForm.apk);
                capabilities.setCapability("app", file.getAbsolutePath());
                //capabilities.setCapability("appPackage", "com.freerange360.mpp.businessinsider");
                //capabilities.setCapability("appActivity", "com.businessinsider.app.MainActivity");

            }
            if (GUIForm.launchOn.equals("iOS")) {

                capabilities.setCapability("deviceName", GUIForm.VD.split(" \\(")[0]);
                capabilities.setCapability("platformVersion", GUIForm.VD.split("\\(")[1].replaceAll("\\)", "").replace(")",""));
                //capabilities.setCapability("udid", GUIForm.VD.split(" \\(")[0]);
                //capabilities.setCapability("autoAcceptAlerts", "false");
                //capabilities.setCapability("browserName", "safari");

                //File file = new File("/Users/rpalacios/Library/Developer/Xcode/DerivedData/bi-gyuliygdywwmomgyzfymhpymfueq/Build/Products/Debug-iphonesimulator/bi.app");
                //File file = new File("/Users/rpalacios/Downloads/Debug-iphonesimulator/iPhoneBI.app");
                File file = null;
                if (GUIForm.app.equals("Business Insider") || GUIForm.app.equals("Business_Insider")) {
                    file = new File("iOSApps/iPhoneBI.app");
                    //file = new File("/Users/rpalacios/IdeaProjects/mobile-automation/iOSApps/iPhoneBI.app");
                }
                if (GUIForm.app.equals("Tech Insider") || GUIForm.app.equals("Tech_Insider")) {
                    file = new File("iOSApps/iPhoneTI.app");
                }
                capabilities.setCapability("app", file.getAbsolutePath());
            }

            if(!as.isServerRunning()) {
                System.out.println("Starting Appium Server....");
                as.startServer();
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

            driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
            //wd.get("http://www.businessinsider.com/");
            //wd.switchTo().alert().dismiss();
            Thread.sleep(7000);

            System.out.println("App has launched");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnreachableBrowserException e){
            /*if(e.getMessage().contains("server or browser start-up failure")){

                while (i < 4){
                    System.out.println("Starting Appium Server - Try "+i);
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
/*            as.stopServer();
            as.startServer();
            try {
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

    public void takeScreenshot()
    {
        try {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotFile, new File("screenshots/" + stackTraceElements[2] + ".png"));
            System.out.println("Screenshot saved as: "+screenShotFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void swipingHorizontal(String swipe) throws InterruptedException {
        System.out.println("Swiping Horizontal: "+swipe);
        //Get the size of screen.
        Dimension size;
        size = App.driver.manage().window().getSize();
        System.out.println("Screen Resolution: "+size);
        //Find swipe start and end point from screen's with and height.
        // Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.80);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.10);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
        if(swipe.equals(SWIPE_RIGHT_TO_LEFT)){
            //Swipe from Right to Left.
            App.driver.swipe(startx, starty, endx, starty, 3000);
            Thread.sleep(2000);
        }
        if(swipe.equals(SWIPE_LEFT_TO_RIGHT)){
            //Swipe from Left to Right.
            App.driver.swipe(endx, starty, startx, starty, 3000);
            Thread.sleep(2000);
        }
    }

    public static void embedScreenshot() throws IOException {
        System.out.println("Embedding screenshot...");
        byte[] screenshot = ((TakesScreenshot) App.driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
}
