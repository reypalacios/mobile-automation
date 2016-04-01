package MobileScripts;

import Appium.App;
import ObjectModels.HeaderNavObject;
import ObjectModels.VerticalObject;
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
    public void testVerticals() {
        try {HeaderNavObject hm = new HeaderNavObject(wd);
            VerticalObject vo = new VerticalObject(wd);

            hm.clickHamburger();
            Thread.sleep(5000);



 //           vo.Clickhome();
 //           Thread.sleep(3000);
  /*         vo.ClickLatest();
            Thread.sleep(3000);
            hm.clickHamburger();
            vo.Clicktech();
            Thread.sleep(3000);
            hm.clickHamburger();
            Thread.sleep(1000);

           vo.Clickenterprise();
            Thread.sleep(1000);
            hm.clickHamburger();
            Thread.sleep(1000);

            vo.ClickScience();
            Thread.sleep(1000);
            hm.clickHamburger();*/
            vo.Clickfinance();
            Thread.sleep(1000);
            hm.clickHamburger();
            vo.ClickYourMoney();
            Thread.sleep(1000);
            hm.clickHamburger();
            vo.ClickWealthAdvisor();
            Thread.sleep(1000);
            hm.clickHamburger();
            vo.Clickpolitics();
            Thread.sleep(1000);
            hm.clickHamburger();
            vo.Clickmilitarydefense();
            Thread.sleep(1000);
            hm.clickHamburger();
            vo.Clicklaworder();
            Thread.sleep(1000);
            hm.clickHamburger();
            vo.Clickstrategy();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

}


    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}


