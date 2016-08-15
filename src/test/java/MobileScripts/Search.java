package mobileScripts;

import appium.App;
import objectModels.MastHeadObject;
import objectModels.PostResultObject;
import objectModels.SearchObject;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kislam on 04/29/16.
 */
public class Search extends App {

    Logger logger = Logger.getLogger(this.getClass());

    @Before
    public void setUp() {
        new App().launch();
    }

    @Test
    public void search() throws InterruptedException {

        SearchObject searchObject = new SearchObject();
        searchObject.OpenSearch();
        searchObject.search("The two apples");
        searchObject.clickSearchResult();
        new PostResultObject().isArticle("The Two Apples");

    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}