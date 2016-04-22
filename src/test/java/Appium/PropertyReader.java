package appium;

import GUI.GUIForm;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader extends App {

    Properties properties = new Properties();

    public PropertyReader() {
        loadProperties();
    }

    private void loadProperties() {

        try {
            properties.load(this.getClass().getResourceAsStream("/config.properties"));
            GUIForm.launchOn = properties.getProperty("OS");
            if(GUIForm.launchOn.equals("Android")){
                properties.load(this.getClass().getResourceAsStream("/Android.properties"));
            }else
                properties.load(this.getClass().getResourceAsStream("/iOS.properties"));

            GUIForm.VD = properties.getProperty("VD");
            GUIForm.platformVersion = properties.getProperty("platformVersion");
            GUIForm.app = properties.getProperty("app");
            GUIForm.apk = properties.getProperty("apk");

        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }

    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}
