package appium;

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
            App.launchOn = properties.getProperty("OS");
            if(App.launchOn.equals("Android")){
                properties.load(new FileInputStream("src/Android.properties"));
            }else
                properties.load(new FileInputStream("src/iOS.properties"));

            App.VD = properties.getProperty("VD");
            App.platformVersion = properties.getProperty("platformVersion");
            App.app = properties.getProperty("app");
            App.apk = properties.getProperty("APK");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}
