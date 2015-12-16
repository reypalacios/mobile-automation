package GUI;

/*
*
 * Created by rpalacios on 11/24/15.
*/


import features.CucumberRunner;
import org.junit.runner.JUnitCore;

public class Runnable extends Thread {

    public void run(){
        try {
            if (GUIForm.launchOn.equals("Android") || GUIForm.launchOn.equals("iOS"))

                    new JUnitCore().run(Class.forName("mobileScripts."+GUIForm.script.replaceAll(" ","")));

            if (GUIForm.launchOn.equals("Desktop"))
                new JUnitCore().run(CucumberRunner.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
