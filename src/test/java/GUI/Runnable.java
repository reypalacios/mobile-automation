package GUI;

/*
*
 * Created by rpalacios on 11/24/15.
*/


import Appium.LaunchAppEmulator;
import features.CucumberRunner;
import org.junit.runner.JUnitCore;

public class Runnable extends Thread {

    public void run(){

        if (GUIForm.launchOn.equals("Android") || GUIForm.launchOn.equals("iOS"))
            new JUnitCore().run(LaunchAppEmulator.class);
        if (GUIForm.launchOn.equals("Desktop"))
            new JUnitCore().run(CucumberRunner.class);

    }

}
