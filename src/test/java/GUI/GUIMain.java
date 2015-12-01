package GUI;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Created by rpalacios on 11/20/15.
 */
public class GUIMain extends Thread{

    Logger logger = Logger.getLogger(this.getClass());

    public static void main(String [] args){

        //BasicConfigurator.configure();
        //new GUIForm();
        (new GUIMain()).start();

    }

    public void run(){
        BasicConfigurator.configure();
        new GUIForm();
    }


}
