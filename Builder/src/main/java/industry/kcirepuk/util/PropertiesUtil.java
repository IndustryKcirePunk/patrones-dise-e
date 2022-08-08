package industry.kcirepuk.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties loadProperty() {
        String URL = "Configuration.properties";
        return loadProperty(URL);
    }

    public static Properties loadProperty(String URL) {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(new File(URL)));
            return props;
        } catch (Exception e) {
            return null;
        }
    }

}
