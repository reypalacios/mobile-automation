package mobileScripts;

import appium.App;
import objectModels.MastHeadObject;
import objectModels.VerticalObject;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class Verticals extends App{

    Logger logger = Logger.getLogger(this.getClass());

    @Before
    public void setUp() {
        new App().launch();
    }


    @Test
    public void testVerticals() throws InterruptedException {
        MastHeadObject mastHead = new MastHeadObject(wd);
        VerticalObject vertical = new VerticalObject(wd);

        mastHead.clickHamburgerMenu();
        vertical.clickFavorites();
        wd.navigate().back();

   /*     mastHead.clickHamburgerMenu();
        vertical.clickLatest();
        //Thread.sleep(4000);

        mastHead.clickHamburgerMenu();
        vertical.clickhome();
        //Thread.sleep(4000);*/

        mastHead.clickHamburgerMenu();
        vertical.clicktech();
        Thread.sleep(4000);

      /*  mastHead.clickHamburgerMenu();
        vertical.clickenterprise();

        mastHead.clickHamburgerMenu();
        vertical.clickScience();

        mastHead.clickHamburgerMenu();
        vertical.clickfinance();

        mastHead.clickHamburgerMenu();
        vertical.clickMarkets();

        mastHead.clickHamburgerMenu();
        vertical.clickYourMoney();

        mastHead.clickHamburgerMenu();
        vertical.clickWealthAdvisor();

        mastHead.clickHamburgerMenu();
        vertical.clickpolitics();

        mastHead.clickHamburgerMenu();
        vertical.clickmilitarydefense();

        mastHead.clickHamburgerMenu();
        vertical.clicklaworder();

        mastHead.clickHamburgerMenu();
        vertical.clickstrategy();

        mastHead.clickHamburgerMenu();
        vertical.clickCarrers();

        mastHead.clickHamburgerMenu();
        vertical.clickAdvertising();

        mastHead.clickHamburgerMenu();
        vertical.clickRetail();

        mastHead.clickHamburgerMenu();
        vertical.clickSmallBusiness();

        mastHead.clickHamburgerMenu();
        vertical.clickLife();

        mastHead.clickHamburgerMenu();
        vertical.clickTransportation();

        mastHead.clickHamburgerMenu();
        vertical.clickEducation();

        mastHead.clickHamburgerMenu();
        vertical.clickEntertainment();

        mastHead.clickHamburgerMenu();
        vertical.clickSports();*/


    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}


