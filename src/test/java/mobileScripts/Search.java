package mobileScripts;

import appium.App;
import appium.MobileException;
import objectModels.MastHeadObject;
import objectModels.SearchObject;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by khadijaislam on 3/17/16.
 */
public class Search extends App{

    Logger logger = Logger.getLogger(this.getClass());

    @Before
    public void setUp() {
        new App().launch();
    }


    @Test
    public void testVerticals() throws Exception, MobileException {
        MastHeadObject mastHead = new MastHeadObject();
        SearchObject search = new SearchObject();

        mastHead.clickSearch();
        search.type("The two apples");
        search.clickSearch();


       /* Thread.sleep(4000);*/



    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}


