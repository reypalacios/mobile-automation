package commands;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.RecommendedForYouObject;
import setUpClasses.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static setUpClasses.App.driver;

/**
 * Created by rpalacios on 7/1/16.
 */
public class Window {

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
        //System.out.println("Swiping Horizontal: "+swipe);
        //Get the size of screen.
        Dimension size;
        size = driver.manage().window().getSize();
        //System.out.println("Screen Resolution: "+size);
        //Find swipe start and end point from screen's with and height.
        // Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.7);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.3);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        //System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        if(swipe.equals(App.SWIPE_RIGHT_TO_LEFT)){
            //Swipe from Right to Left.
            //new TouchAction(App.driver.press(startx, starty).waitAction(500).moveTo(endx - startx, starty - starty).release().perform();
            if(App.launchOn.equals("Android"))
                driver.swipe(startx, starty, endx, starty, 500);
            else
                driver.swipe(startx/2, starty/2, -startx/2, 0, 1);
                //App.driver.swipe(100, 650, -100, 0, 100)
                //App.driver.swipe(100, 100, -100, 0, 1/2)
            Thread.sleep(3000);
        }
        if(swipe.equals(App.SWIPE_LEFT_TO_RIGHT)){
            //Swipe from Left to Right.
            if(App.launchOn.equals("Android"))
                driver.swipe(endx, starty, startx, starty, 500);
            else
                driver.swipe(startx/2, starty/2, startx/2, 0, 1);
            Thread.sleep(3000);
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
        size = driver.manage().window().getSize();
        System.out.println("Screen size is "+size);
        //Find swipe start and end point from screen's with and height.
        // Find starty point which is at bottom side of screen.

        int starty = element.getLocation().getY(); //(int) (size.height * 0.80);

        // Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.15);
        // Find horizontal point where you want to swipe. It is in middle of screen width.
        int startx = size.width / 2;

        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        if(App.launchOn.equals("Android"))
            // Swipe from Bottom to Top.
            driver.swipe(startx, starty, startx, endy, 3000);
        else
            driver.swipe(startx, starty, startx, -endy, 3000);
        Thread.sleep(2000);
 /*       // Swipe from Top to Bottom.
        App.driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
 */   }

    public static void verticalSwipe() {
        verticalSwipe(0.90, 0.30);
    }

    public static void verticalSwipe(double start, double end) {
        Dimension size = driver.manage().window().getSize();
        if (App.launchOn.equals("iOS")) {
            end = end * -1;
        }

        int startY = (int) (size.height * start);
        int endY = (int) (size.height * end);
        int startX = size.width / 2;

        System.out.println(size);
        System.out.println("startX=" + startX + ", startY=" + startY + ", endX=" + startX + ", endY=" + endY);

        driver.swipe(startX, startY, startX, endY, 100);
    }

    /**
     * Embeds a screenshot to the cucumber report
     * @throws IOException
     *//*
    public static void embedScreenshot() throws IOException {
        System.out.println("Embedding screenshot...");
        //byte[] screenshot = App.driver.getScreenshotAs(OutputType.BYTES);
        byte[] screenshot = new screenshot().fullScreenshot();
        App.scenario.embed(screenshot, "image/png");
    }*/

//    public static void embedScreenshot(WebElement webelement) throws IOException {
//        byte[] screenshot = new commands.screenshot().webElementScreenshot(webelement);
//        App.scenario.embed(screenshot, "image/png");
//    }

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

    public static void upgradeApp() throws InterruptedException {
        if(App.launchOn.equals("Android")) {
            App.apk=App.currentapp;
            //Install app without clearing data
            executecommandline("adb install -r AndroidApps/"+App.apk);
            //Launches app
            executecommandline("adb shell am start -n "+App.apppackage+"/"+App.appactivity);
            Thread.sleep(11000);
        }else{
            App.app=App.currentapp;
            //https://github.com/phonegap/ios-sim
            executecommandline("ios-sim install iOSApps/"+App.app+" --devicetypeid iPhone-6, 9.2 --exit");
            new App().launch(true);
        }
    }

    private static void executecommandline(String command) {
        String s = null;
        try {

            // run the Unix "ps -ef" command
            // using the Runtime exec method:

            Process p = Runtime.getRuntime().exec(command);
            //Process p = Runtime.getRuntime().exec("pwd");

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            //System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void closeApp() {
        System.out.println("Close App");
        driver.closeApp();
    }

    public static void launchApp() {
        System.out.println("Launch App");
        driver.launchApp();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void resetApp() {
        System.out.println("Reset App");
        driver.resetApp();
        //while(driver.findElementsById("news_alerts_headlines_text").isEmpty()){  }
    }

    public static void scrollIntoView(WebElement element) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int y_start = (int) (size.height * 0.60);
        int y_end = (int) (size.height * 0.30);
        int x = size.width / 2;
        try{
            element.isDisplayed();
        }catch(NoSuchElementException n) {
            driver.swipe(x, y_start, x, y_end, 100);
            scrollIntoView(element);
        }
    }

    public static void scrollIntoView(List<WebElement> recommendations, int index) throws InterruptedException {
        try{
            recommendations.get(index);
        }catch(IndexOutOfBoundsException i){
            scrollDown();
            scrollIntoView(new RecommendedForYouObject().recommendations, index);
        }
    }

    public static void scrollDown() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int y_start = (int) (size.height * 0.60);
        int y_end = (int) (size.height * 0.30);
        int x = size.width / 2;
        driver.swipe(x, y_start, x, y_end, 100);
    }

    public static void assertDisplay(WebElement element) {
        try{
            Assert.assertEquals(element.isDisplayed(), true);
            scrollIntoView(element);
            //embedScreenshot(element);
        }catch (AssertionError e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void assertEnabled(WebElement element) {
        try{
            Assert.assertEquals(element.isEnabled(), true);
        }catch (AssertionError e){
            e.printStackTrace();
        }
    }

    public static void assertSelected(WebElement element) {
        try{
            Assert.assertEquals(element.isSelected(), true);
            //embedScreenshot(element);
        }catch (AssertionError e){
            e.printStackTrace();
        }
    }
    public static void assertNotSelected(WebElement element) {
        try{
            Assert.assertEquals(element.isDisplayed(), false);
            //embedScreenshot(element);
        }catch (AssertionError e){
            e.printStackTrace();
        }
    }

    public static void assertChar(String actual, String expected) {
        try{
            Assert.assertEquals(actual,expected);
        }catch (AssertionError e){
            e.printStackTrace();
        }
    }

    public static void assertNotDisplay(WebElement element) {
        try{
            Assert.assertEquals(element.isDisplayed(), false);
        }catch (NoSuchElementException n){
            System.out.println("Assertion has passed");
        }catch (AssertionError e){
            e.printStackTrace();
        }
    }

    public static Boolean elementHasText(WebElement element) {
        try {
            element.getText();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
