package GUI;

import core.AutomationSetUp;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Created by rpalacios on 11/20/15.
 */
public class GUIMain extends AutomationSetUp{

    Logger logger = Logger.getLogger(this.getClass());

    public static void main(String [] args){
        //Logger logger = Logger.getLogger(GUIMain.class);

        BasicConfigurator.configure();
        new GUIForm();
    }


}
