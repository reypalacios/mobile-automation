package commands;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import pageObjects.MastHeadObject;
import pageObjects.RiverFeedObject;
import setUpClasses.App;

import static commands.Window.verticalSwipe;


/**
 * Created by rpalacios on 11/23/16.
 */
public class Save100Articles extends App {

    @Test
    public void test() throws Throwable {
        if(driver==null)
            new App().launch(false);
        System.out.println(new RiverFeedObject().postHeadlines.size());
        try{
            for (int i=0;i<100;i++) {
                try{
                    new RiverFeedObject().postHeadlines.get(i).click();
                    if(new MastHeadObject().savePost.isEnabled()) {
                        new MastHeadObject().savePost.click();
                        new MastHeadObject().back.click();
                    }
                    verticalSwipe(0.90, 0.30);
                }catch(NoSuchElementException n){
                    new MastHeadObject().back.click();
                    verticalSwipe(0.90, 0.30);
                }
            }
        }catch (NoSuchElementException n){
            n.printStackTrace();
        }catch (IndexOutOfBoundsException i){
            verticalSwipe(0.90, 0.30);
            test();
        }
    }

    @After
    public void after(){

    }
}
