package setUpClasses;

import commands.command;

import java.io.IOException;

/**
 * Created by rpalacios on 4/11/16.
 */
public class MobileException extends Throwable {

    public MobileException(String message) {
        takeScreenshot(message);
        //logger.error(message);
    }

    public MobileException(Exception e) {
        takeScreenshot(e.getMessage());
        e.printStackTrace();
    }

    public void takeScreenshot(String message)
    {
        try {
//            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//            File screenShotFile = App.driver.getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(screenShotFile, new File("screenshots/ERROR." + stackTraceElements[4] + ".png"));
//            System.out.println(stackTraceElements[4] + ".png");
            App.scenario.write("Error: "+message);
            command.embedScreenshot();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
