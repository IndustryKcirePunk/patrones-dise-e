package industry.kcirepunk.singleton;

import industry.kcirepunk.utils.PropertiesUtil;

import java.util.Properties;

public class ConfiguracionSingleton {

    private static ConfiguracionSingleton singleton;

    private static final String APP_NAME_PROPS = "appName";
    private static final String APP_VERSION_PROP = "appVersion";

    private String appName;
    private String appVersion;

    private ConfiguracionSingleton() {
        Properties prop = PropertiesUtil.loadProperty();
        this.appName = (String) prop.get(APP_NAME_PROPS);
        this.appVersion = (String) prop.get(APP_VERSION_PROP);
    }

    private static synchronized void createInstance() {
        if (singleton == null) {
            singleton = new ConfiguracionSingleton();
        }
    }

    public static ConfiguracionSingleton getInstance() {
        if (singleton == null) {
            createInstance();
        }
        return singleton;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
