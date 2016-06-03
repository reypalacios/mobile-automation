package appium;

import org.apache.log4j.PropertyConfigurator;

/**
 * Created by rpalacios on 5/17/16.
 */

public class Logger {

    public Logger(){
        setLogger();
    }
    private static org.apache.log4j.Logger logger;

    public static org.apache.log4j.Logger getLogger() {
        return logger;
    }

    public static void setLogger(org.apache.log4j.Logger logger) {
        Logger.logger = logger;
        System.setOut(new PrintStreamInterceptor(System.out));
        System.setErr(new PrintStreamInterceptor(System.err));
    }

    public void setLogger() {
        String log4jConfPath = "src/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        setLogger(org.apache.log4j.Logger.getLogger(this.getClass()));
    }
}
