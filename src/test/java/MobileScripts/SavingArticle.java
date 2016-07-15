package mobileScripts;

import appium.App;
import objectModels.MastHeadObject;
import objectModels.SearchObject;
import objectModels.VerticalObject;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by khadijaislam on 6/28/16.
 */


    public class SavingArticle extends App{

    Logger logger = Logger.getLogger(this.getClass());


    @Before
    public void setUp() {
        new App().launch();
    }

    @Test
    public void SavingArticle() throws InterruptedException {


        SearchObject searchObject = new SearchObject();

        MastHeadObject mastHeadObject = new MastHeadObject();
        VerticalObject verticalObject = new VerticalObject();


        searchObject.OpenSearch();
        searchObject.search("Hilary");
        searchObject.clickSearchResult("16 Easter-egg");



        mastHeadObject.saveIcon();
        mastHeadObject.backIcon();
        mastHeadObject.clickHamburgerMenu();
        verticalObject.savedArticle();


    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}
