package mobileScripts;

import appium.App;
import objectModels.KebabSettingsObject;
import objectModels.MastHeadObject;
import objectModels.PostResultsObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
            Thread.sleep(2000);
            PostResults.clickTopPost();

            takeScreenshot();

            kebabSettings.clickKebabMenu();
            //Thread.sleep(2000);
            kebabSettings.clickSettings();
            //Thread.sleep(2000);
            kebabSettings.clickFontSize();
            //Thread.sleep(2000);
            kebabSettings.clickSmallFont();

            Masthead.clickHamburgerMenu();
            PostResults.clickTopPost();

            takeScreenshot();

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
