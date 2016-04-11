package appium;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

/**
 * Created by rpalacios on 4/11/16.
 */
public class MobileException extends Throwable {
    Logger logger = Logger.getLogger(this.getClass());

    public MobileException(String message) {
        takeScreenshot(message);
        logger.error(message);
    }

    public void takeScreenshot(String message)
    {
        try {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            File screenShotFile = ((TakesScreenshot)App.wd).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotFile, new File("screenshots/ERROR." + stackTraceElements[4] + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
