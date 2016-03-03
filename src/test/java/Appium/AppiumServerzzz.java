package appium;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.log4j.Logger;

import java.io.IOException;

public class AppiumServerzzz {

    Logger logger = Logger.getLogger(this.getClass());

    //Appium Launch on Mac

    public void startAppiumonMac(){

        //node appium
        //node appium.js

        CommandLine command = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");
        command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js", false);
        //command.addArgument("lib/server/main.js --command-timeout \"7200\"  --debug-log-spacing --log appium.log");
        command.addArgument("--command-timeout",false);
        command.addArgument("7200");
        //command.addArgument("--session-override", true);
        command.addArgument("--log", false);
        command.addArgument("/Users/rpalacios/IdeaProjects/mobile-automation/logs/appium.log");
        command.addArgument("--debug-log-spacing");
        command.addArgument("--address", false);
        command.addArgument("127.0.0.1");
        command.addArgument("--port", false);
        //if (GUIForm.AVD.equals("Nexus_S_API_19"))
            command.addArgument("4723");
        /*else
            command.addArgument("4722");
        */command.addArgument("--native-instruments-lib", true);
        command.addArgument("--show-ios-log", true);
        command.addArgument("--launch-timeout",false);
        command.addArgument("110000");
        command.addArgument("--no-reset", true);


        try{



            DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
            DefaultExecutor executor = new DefaultExecutor();
            executor.setExitValue(1);
            executor.execute(command, resultHandler);
            Thread.sleep(3000);

            logger.info("Starting Appium server...");
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }

    }

    public void stopAppium() throws Exception {
        String[] command = { "/usr/bin/killall", "-KILL", "node" };
        try {
            Runtime.getRuntime().exec(command);
            logger.info("Appium server stopped.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}