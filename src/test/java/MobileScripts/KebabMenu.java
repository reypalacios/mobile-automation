package mobileScripts;

import appium.App;
import objectModels.KebabSettingsObject;
import objectModels.MastHeadObject;
import objectModels.PostResultsObject;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

/**
 * Created by rpalacios on 12/15/15.
 */
public class KebabMenu extends App {

    @Before
    public void setUp() throws InterruptedException {
        new App().launch();
    }

    @Test
    public void testSettingsMenu(){
        try {

            KebabSettingsObject kebabSettings = new KebabSettingsObject(wd);
            MastHeadObject Masthead = new MastHeadObject(wd);
            PostResultsObject PostResults = new PostResultsObject(wd);

            kebabSettings.clickKebabMenu();
            //Thread.sleep(2000);
            kebabSettings.clickSettings();
            //Thread.sleep(2000);
            kebabSettings.clickFontSize();
            //Thread.sleep(2000);
            kebabSettings.clickLargeFont();
            //Thread.sleep(2000);

            Masthead.clickHamburgerMenu();
            PostResults.clickTopPost();

            File screenShotFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenShotFile, new File("/screenshots/" + "appImage" + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            //
            kebabSettings.clickKebabMenu();
            //Thread.sleep(2000);
            kebabSettings.clickSettings();
            //Thread.sleep(2000);
            kebabSettings.clickFontSize();
            //Thread.sleep(2000);
            kebabSettings.clickSmallFont();

            Masthead.clickHamburgerMenu();
            PostResults.clickTopPost();

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}
