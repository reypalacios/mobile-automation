package setUpClasses;

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
                App.apppackage = properties.getProperty("package");
                App.appactivity = properties.getProperty("activity");
                App.apk = properties.getProperty("APK");
                App.currentapp = App.apk;
                App.oldapk = properties.getProperty("oldAPK");

            }else {
                properties.load(new FileInputStream("src/iOS.properties"));
                App.bundleid = properties.getProperty("bundleid");
                App.app = properties.getProperty("APP");
                App.currentapp = App.app;
                App.oldapp = properties.getProperty("oldAPP");
            }

            App.VD = properties.getProperty("VD");
            App.platformVersion = properties.getProperty("platformVersion");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}
