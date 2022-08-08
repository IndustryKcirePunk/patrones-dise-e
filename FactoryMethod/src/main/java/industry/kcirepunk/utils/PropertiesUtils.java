package industry.kcirepunk.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    public static Properties loadProperty(String propertiesURL) {
        try {
            Properties properties = new Properties();
            InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream(propertiesURL);
            properties.load(inputStream);
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
