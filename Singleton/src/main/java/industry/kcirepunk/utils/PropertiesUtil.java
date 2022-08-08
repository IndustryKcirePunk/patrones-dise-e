package industry.kcirepunk.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {

    private static String defaultProperties = "Configuration.properties";

    public static Properties loadProperty() {
        return loadProperty(defaultProperties);
    }
    public static Properties loadProperty(String URL) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(URL)));
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
