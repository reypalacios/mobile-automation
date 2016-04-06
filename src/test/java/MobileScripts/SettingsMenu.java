package mobileScripts;

import appium.App;
import objectModels.KebabSettingsObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rpalacios on 12/15/15.
 */
public class SettingsMenu extends App {

    @Before
    public void setUp() throws InterruptedException {
        new App().launch();
    }

    @Test
    public void testSettingsMenu(){
        try {

            KebabSettingsObject hm = new KebabSettingsObject(wd);
            hm.clickSettings();
            Thread.sleep(2000);
            hm.clickSettings();
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
