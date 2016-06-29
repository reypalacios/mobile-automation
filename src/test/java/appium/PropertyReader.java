package appium;

import GUI.GUIForm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyReader {

    Properties properties = new Properties();

    public PropertyReader() {
        loadProperties();
    }

    private void loadProperties() {

        try {
            properties.load(new FileInputStream("src/config.properties"));
            GUIForm.launchOn = properties.getProperty("OS");
            if(GUIForm.launchOn.equals("Android")){
                properties.load(new FileInputStream("src/Android.properties"));
            }else
                properties.load(new FileInputStream("src/iOS.properties"));

            GUIForm.VD = properties.getProperty("VD");
            GUIForm.platformVersion = properties.getProperty("platformVersion");
            GUIForm.app = properties.getProperty("app");
            GUIForm.apk = properties.getProperty("APK");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}
