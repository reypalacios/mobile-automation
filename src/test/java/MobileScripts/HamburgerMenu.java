package mobileScripts;

import appium.App;
import objectModels.MastHeadObject;
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

        MastHeadObject HeaderNav = new MastHeadObject(wd);

        HeaderNav.clickHamburgerMenu();
        HeaderNav.clickHamburgerMenu();
        HeaderNav.clickBI();
        HeaderNav.clickSearch();
        HeaderNav.clickCloseSearch();
        HeaderNav.clickKebabMenu();

    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}
