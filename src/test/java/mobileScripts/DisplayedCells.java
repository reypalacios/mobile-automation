package mobileScripts;//package mobileScripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import setUpClasses.App;
import setUpClasses.MobileException;

import java.util.List;

public class DisplayedCells extends App{


    @Before
    public void setUp() throws InterruptedException {
        new App().launch(false);
    }


    @Test
    public void testVerticals() throws Exception, MobileException {

        List<WebElement> cells = App.driver.findElementsByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[@visible='true']");

        //System.out.println("Visible Cells:" +new RiverFeedObject().visiblePosts.size());
       // System.out.println("Not visible Cells:" +new RiverFeedObject().notVisiblePosts.size());

        for (int i=0; i<2;i++){
            System.out.println("Cell "+ i +cells.get(i).getText());
        }
        Thread.sleep(2000);

    }

    @After
    public void CloseAppEmulator() throws Exception {
        new App().close();
    }
}


