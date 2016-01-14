package GUI;

/*
*
 * Created by rpalacios on 11/24/15.
*/


import cucumberRunners.CucumberRunnerFeature1Test;
import cucumberRunners.CucumberRunnerFeature2;
import org.junit.runner.JUnitCore;

public class Runnable extends Thread {

    public void run(){
        //try {
            if (GUIForm.launchOn.equals("Android") || GUIForm.launchOn.equals("iOS")) {

                //new JUnitCore().run(Class.forName("mobileScripts."+GUIForm.script.replaceAll(" ","")));

                if (GUIForm.script.equals("Hamburger Menu"))
                    new JUnitCore().run(CucumberRunnerFeature1Test.class);

                if (GUIForm.script.equals("Settings Menu"))
                    new JUnitCore().run(CucumberRunnerFeature2.class);

            }
            if (GUIForm.launchOn.equals("Desktop"))
                new JUnitCore().run(CucumberRunnerFeature1Test.class);
       /* } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }

}
