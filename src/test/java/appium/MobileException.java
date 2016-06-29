package appium;

import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by rpalacios on 4/11/16.
 */
public class MobileException extends Throwable {
    Logger logger = Logger.getLogger(this.getClass());

    public MobileException(String message) {
        takeScreenshot(message);
        //logger.error(message);
    }

    public void takeScreenshot(String message)
    {
        try {
//            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//            File screenShotFile = App.driver.getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(screenShotFile, new File("screenshots/ERROR." + stackTraceElements[4] + ".png"));
//            System.out.println(stackTraceElements[4] + ".png");
            App.scenario.write("Error: "+message);
            App.embedScreenshot();

        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }
}
