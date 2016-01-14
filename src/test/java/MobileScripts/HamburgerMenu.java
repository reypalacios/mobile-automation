package mobileScripts;

import appium.App;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rpalacios on 12/15/15.
 */
public class HamburgerMenu extends App {

    Logger logger = Logger.getLogger(this.getClass());

    @Before
    public void setUp() {
        new App().launch();
    }

    @Test
    public void testHamburgerOptions(){
        try {
            objectModels.HamburgerMenu hm = new objectModels.HamburgerMenu(wd);
            hm.clickHamburger();
            Thread.sleep(3000);
            hm.clickHamburger();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }

    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}
