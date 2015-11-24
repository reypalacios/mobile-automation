package core;

import database.Database;
import database.tables.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;


/**
 * Created by rpalacios on 11/13/15.
 */
public class AutomationSetUp{

    public static WebDriver driver;
    public static Logger logger;
    public static String browser;
    public static Environment environment;

    public void driverSetUp() {

        // Set up a simple configuration that logs on a file.
        // logger = Logger.getLogger(this.getClass());
        //BasicConfigurator.configure();
        logger = Logger.getLogger(this.getClass());
        logger.info("\n ---------------------------------------------------- Starting Test ----------------------------------------------------");
        // System.setProperty("logfile.name","Logs/dev.log");

        environmentSetUp();
        openBrowser();

    }

    private void openBrowser() {
        try {
            if (browser.equals("Firefox"))
                driver = new FirefoxDriver();
            if (browser.equals("Chrome")) {
                //driver = new RemoteWebDr
                System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
                driver = new ChromeDriver();
            }
            if (browser.equals("Safari"))
                driver = new SafariDriver();

            driver.get(environment.getUrl());
        }catch(UnreachableBrowserException e){
            logger.error(e.getMessage());
            e.printStackTrace();
        }

    }

    public void environmentSetUp() {

        try {
            environment = (Environment) new Database().get(Environment.class, 1);

            //logger.info("Open page "+environment.getUrl());

            Properties properties = new Properties();
            properties.load(this.getClass().getResourceAsStream("/config.properties"));
            browser = properties.getProperty("browser");

            logger.info("------------ Environmental Configurations ------------");
            logger.info("browser="+browser);
            logger.info("URL="+environment.getUrl());
            logger.info("------------------------------------------------------");

        } catch (SQLException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public void driverCloseUp() throws java.sql.SQLException {
        driver.close();
    }

}
