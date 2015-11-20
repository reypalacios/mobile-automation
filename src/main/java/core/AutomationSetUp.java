package core;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;


/**
 * Created by rpalacios on 11/13/15.
 */
public class AutomationSetUp {

    public WebDriver driver;
    public Logger logger;
    public static String screenshotsPath;
    public static String browser;

    /*public void driverSetUp() throws java.sql.SQLException, IOException {

        // Set up a simple configuration that logs on a file.
        logger = Logger.getLogger(this.getClass());
        BasicConfigurator.configure();

        logger.info("\n ---------------------------------------------------- Starting Test ----------------------------------------------------");
        // System.setProperty("logfile.name","Logs/dev.log");

        EnvironmentSetUp();

        Environment environment = (Environment) new Database().get(Environment.class, 1);
        logger.info("Open page "+environment.getUrl());
        driver = new FirefoxDriver();
        driver.get(environment.getUrl());
}*/

    public void EnvironmentSetUp() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getResourceAsStream("/config.properties"));
        screenshotsPath = properties.getProperty("screenshotsPath");
        browser = properties.getProperty("browser");
        logger.info("------------ Environmental Configurations ------------");
        logger.info("screenshotsPath = "+screenshotsPath);
        logger.info("browser="+browser);
        logger.info("------------------------------------------------------");
    }


    public void driverCloseUp() throws java.sql.SQLException {
        driver.close();
    }
}
