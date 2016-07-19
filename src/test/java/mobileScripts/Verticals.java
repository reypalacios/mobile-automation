package mobileScripts;

import appium.App;
import appium.MobileException;
import commands.command;
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

        //new App().launch();
    }


    @Test
    public void testVerticals() throws Exception, MobileException {
        MastHeadObject mastHead = new MastHeadObject();
        VerticalObject vertical = new VerticalObject();


        /*mastHead.clickHamburgerMenu();
        vertical.clickFavorites();
        vertical.isCurrentVertical("Favorites");
        driver.navigate().back();

        mastHead.clickHamburgerMenu();
        vertical.clickLatest();
        vertical.isCurrentVertical("Latest");

        mastHead.clickHamburgerMenu();
        vertical.clickhome();
        vertical.isCurrentVertical("HOME");

        mastHead.clickHamburgerMenu();
        vertical.clicktech();
        vertical.isCurrentVertical("TECH");

        mastHead.clickHamburgerMenu();
        vertical.clickenterprise();
        vertical.isCurrentVertical("Enterprise");

        mastHead.clickHamburgerMenu();
        vertical.clickScience();
        vertical.isCurrentVertical("Science");

        mastHead.clickHamburgerMenu();
        vertical.clickfinance();
        vertical.isCurrentVertical("FINANCE");

        mastHead.clickHamburgerMenu();
        vertical.clickMarkets();
        vertical.isCurrentVertical("Markets");

        mastHead.clickHamburgerMenu();
        vertical.clickYourMoney();
        vertical.isCurrentVertical("Your Money");

        mastHead.clickHamburgerMenu();
        vertical.clickWealthAdvisor();
        vertical.isCurrentVertical("Wealth Advisor");*/

        mastHead.clickHamburgerMenu();
        command.scrolldown(VerticalObject.wealthadvisor);
        vertical.clickpolitics();
        vertical.isCurrentVertical("POLITICS");

        /*mastHead.clickHamburgerMenu();
        vertical.clickmilitarydefense();
        vertical.isCurrentVertical("Military & Defense");

        mastHead.clickHamburgerMenu();
        vertical.clicklaworder();
        vertical.isCurrentVertical("Law & Order");

        mastHead.clickHamburgerMenu();
        vertical.clickstrategy();
        vertical.isCurrentVertical("STRATEGY");

        mastHead.clickHamburgerMenu();
        vertical.clickCarrers();
        vertical.isCurrentVertical("Careers");

        mastHead.clickHamburgerMenu();
        vertical.clickAdvertising();
        vertical.isCurrentVertical("Advertising");

        mastHead.clickHamburgerMenu();
        vertical.clickRetail();
        vertical.isCurrentVertical("Retails");

        mastHead.clickHamburgerMenu();
        vertical.clickSmallBusiness();
        vertical.isCurrentVertical("Small Business");

        mastHead.clickHamburgerMenu();
        vertical.clickLife();
        vertical.isCurrentVertical("LIFE");

        mastHead.clickHamburgerMenu();
        vertical.clickTransportation();
        vertical.isCurrentVertical("Transportation");

        mastHead.clickHamburgerMenu();
        vertical.scrolldown(vertical.transportation);
        vertical.clickEducation();
        vertical.isCurrentVertical("Education");

        mastHead.clickHamburgerMenu();
        vertical.clickEntertainment();
        vertical.isCurrentVertical("ENTERTAINMENT");

        mastHead.clickHamburgerMenu();
        vertical.clickSports();
        vertical.isCurrentVertical("Sports");*/

    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}


