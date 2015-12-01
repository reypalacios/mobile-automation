package GUI;

/*
*
 * Created by rpalacios on 11/24/15.
*/


import features.CucumberRunner;
import org.junit.runner.JUnitCore;

public class Runnable extends Thread {

    public void run(){
        new JUnitCore().run(CucumberRunner.class);
    }

}
