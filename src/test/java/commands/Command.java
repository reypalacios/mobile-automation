package commands;

import appium.App;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by rpalacios on 7/1/16.
 */
public class command extends App {

//    public static void takeScreenshot()
//    {
//        try {
//            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//            File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(screenShotFile, new File("screenshots/" + stackTraceElements[2] + ".png"));
//            System.out.println("Screenshot saved as: "+screenShotFile.getName());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

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

        // java
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "up");
        js.executeScript("mobile: scroll", scrollObject);

        if(swipe.equals(SWIPE_RIGHT_TO_LEFT)){
            //Swipe from Right to Left.
            //new TouchAction(App.driver.press(startx, starty).waitAction(500).moveTo(endx - startx, starty - starty).release().perform();
            App.driver.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(2000);
        }
        if(swipe.equals(SWIPE_LEFT_TO_RIGHT)){
            //Swipe from Left to Right.
            App.driver.swipe(endx, starty, startx, starty, 500);
            Thread.sleep(2000);
        }
    }

    public static void scrolldown(WebElement element) throws InterruptedException {
        //System.out.println("Scrolling down");
        /*JavascriptExecutor js = (JavascriptExecutor) App.wd;
        HashMap<String, String> scrollObject = new HashMap<String, String>();scrollObject.put("direction", "down");
        scrollObject.put("element", ((RemoteWebElement) life).getId());
        js.executeScript("mobile: scroll", scrollObject);*/
        /*for (int t = 0; t < 5; t++)*/
        //App.wd.scrollTo("Volkswagen");

        swipingVertical(element);
        //swipingHorizontal();
    }
    public static void swipingVertical(WebElement element) throws InterruptedException {
        //Get the size of screen.
        Dimension size;
        size = App.driver.manage().window().getSize();
        System.out.println("Screen size is "+size);
        //Find swipe start and end point from screen's with and height.
        // Find starty point which is at bottom side of screen.

        int starty = element.getLocation().getY(); //(int) (size.height * 0.80);

        // Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.15);
        // Find horizontal point where you want to swipe. It is in middle of screen width.
        int startx = size.width / 2;

        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        // Swipe from Bottom to Top.
        App.driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
 /*       // Swipe from Top to Bottom.
        App.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
 */   }



    /**
     * Embeds a screenshot to the cucumber report
     * @throws IOException
     */
    public static void embedScreenshot() throws IOException {
        System.out.println("Embedding screenshot...");
        //byte[] screenshot = App.driver.getScreenshotAs(OutputType.BYTES);
        byte[] screenshot = new Screenshot().fullScreenshot();
        scenario.embed(screenshot, "image/png");
    }

    /**
     * Puts app in the background for x seconds
     * @param seconds
     */
    public static void runAppinBackground(int seconds) throws InterruptedException {
        System.out.println("Run App in the background for "+seconds +" seconds");
        driver.runAppInBackground(seconds);
        try {
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("news_alerts_headlines_text")));
            System.out.println("Push permission request screen was displayed");
        }catch(TimeoutException e){
            System.out.println("Push permission request screen wasn't displayed");
        }
    }

    public static void upgradeApp(String app) {
        System.out.println("Upgrade App to "+app);
        App.apk=app;
        new App().launch();
    }

    public static void closeApp() {
        System.out.println("Close App");
        driver.closeApp();
    }

    public static void launchApp() {
        System.out.println("Launch App");
        driver.launchApp();
    }

    public static void resetApp() {
        System.out.println("Reset App");
        driver.resetApp();
        while(driver.findElementsById("news_alerts_headlines_text").isEmpty()){  }
    }
}
